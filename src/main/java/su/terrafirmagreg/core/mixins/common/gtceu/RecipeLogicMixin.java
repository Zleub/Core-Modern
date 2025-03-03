package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.capability.recipe.ItemRecipeCapability;
import com.gregtechceu.gtceu.api.capability.recipe.RecipeCapability;
import com.gregtechceu.gtceu.api.machine.feature.IRecipeLogicMachine;
import com.gregtechceu.gtceu.api.machine.trait.NotifiableItemStackHandler;
import com.gregtechceu.gtceu.api.machine.trait.NotifiableRecipeHandlerTrait;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.content.Content;
import com.gregtechceu.gtceu.api.recipe.ingredient.NBTIngredient;
import net.dries007.tfc.common.capabilities.food.FoodCapability;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.TerraFirmaGreg;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Stream;

import static su.terrafirmagreg.core.TerraFirmaGreg.LOGGER;

@Mixin(value = RecipeLogic.class)
public class RecipeLogicMixin {
    @Redirect(method = "checkMatchedRecipeAvailable(Lcom/gregtechceu/gtceu/api/recipe/GTRecipe;)Z",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/gregtechceu/gtceu/api/machine/feature/IRecipeLogicMachine;fullModifyRecipe(Lcom/gregtechceu/gtceu/api/recipe/GTRecipe;)Lcom/gregtechceu/gtceu/api/recipe/GTRecipe;"),
            remap = false)
    GTRecipe fullModifyRecipe(IRecipeLogicMachine instance, GTRecipe recipe) {
        List<ItemStack> itemStacks = instance.getCapabilitiesProxy().row(IO.IN).get(ItemRecipeCapability.CAP).stream().flatMap(e -> {
            return e.getContents().stream()
                    .peek(el -> LOGGER.info("el {}", el.getClass()))
                    .filter(elem -> elem instanceof ItemStack && FoodCapability.has((ItemStack)elem))
                    .map(elem -> (ItemStack)elem);
        }).toList();

        Map<RecipeCapability<?>, List<Content>> recipeCapabilityListMap = recipe.copyContents(recipe.outputs, null);

        List<Content> contents = recipe.outputs.get(ItemRecipeCapability.CAP);
        Stream<Content> contentStream = contents.stream().map(e -> {
            Ingredient ingredient = (Ingredient) e.content;
            ItemStack itemstack = ingredient.getItems()[0];

            if (FoodCapability.has(itemstack)) {
                if (itemStacks.isEmpty())
                    FoodCapability.updateFoodDecayOnCreate(itemstack);
                else
                    FoodCapability.updateFoodFromAllPrevious(itemStacks, itemstack);
            }

            return new Content(NBTIngredient.createNBTIngredient(itemstack), e.chance, e.tierChanceBoost, e.slotName, e.uiName);
        });

        recipeCapabilityListMap.replace(ItemRecipeCapability.CAP, contentStream.toList());

        return new GTRecipe(
                recipe.recipeType,
                recipe.id,
                recipe.copyContents(recipe.inputs, null),
                recipeCapabilityListMap,
                recipe.copyContents(recipe.tickInputs, null),
                recipe.copyContents(recipe.tickOutputs, null),
                new ArrayList<>(recipe.conditions),
                new ArrayList<>(recipe.ingredientActions),
                recipe.data,
                recipe.duration,
                recipe.isFuel
        );
    }
}
