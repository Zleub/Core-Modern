package su.terrafirmagreg.core.objects.data.recipes.builders.tfc;

import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.api.recipe.ingredient.NBTIngredient;
import net.dries007.tfc.common.recipes.TFCRecipeSerializers;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.terrafirmagreg.core.objects.data.recipes.builders.TFGAbstractRecipeBuilder;

import java.util.function.Consumer;

public final class TFGCastingRecipeBuilder extends TFGAbstractRecipeBuilder {

    private Ingredient input;
    private FluidStack inputFluidStack;
    private ItemStack outputStack;
    private double breakChance = 0;

    public TFGCastingRecipeBuilder(String id) {
        super(id);
    }

    public TFGCastingRecipeBuilder input(final TagKey<Item> itemStack) {
        return input(Ingredient.of(itemStack));
    }

    public TFGCastingRecipeBuilder input(final ItemStack itemStack) {
        if (itemStack.hasTag() || itemStack.getDamageValue() > 0) {
            input = NBTIngredient.createNBTIngredient(itemStack);
        } else {
            input = Ingredient.of(itemStack);
        }
        return this;
    }

    public TFGCastingRecipeBuilder input(final ItemLike itemLike) {
        return input(Ingredient.of(itemLike));
    }

    public TFGCastingRecipeBuilder input(final Ingredient ingredient) {
        input = ingredient;
        return this;
    }

    public TFGCastingRecipeBuilder input(final Fluid fluid, final int amount) {
        inputFluidStack = new FluidStack(fluid, amount);
        return this;
    }

    public TFGCastingRecipeBuilder output(final ItemStack stack) {
        outputStack = stack.copy();
        return this;
    }

    public TFGCastingRecipeBuilder output(final ItemLike itemLike) {
        return output(new ItemStack(itemLike));
    }

    public TFGCastingRecipeBuilder breakChance(final double value) {
        breakChance = value;
        return this;
    }

    public void save(final Consumer<FinishedRecipe> consumer) {
        consumer.accept(new FinishedRecipe() {

            @Override
            public void serializeRecipeData(@NotNull JsonObject pJson) {
                if (input == null)
                    throw new IllegalArgumentException("Casting recipe must have item input: " + id);

                pJson.add("mold", input.toJson());

                if (inputFluidStack == null)
                    throw new IllegalArgumentException("Casting recipe must have fluid inpit: " + id);

                if (outputStack == null)
                    throw new IllegalArgumentException("Casting recipe must have item result: " + id);

                pJson.add("fluid", fluidStackToJson(inputFluidStack, "ingredient"));
                pJson.add("result", Ingredient.of(outputStack).toJson());

                pJson.addProperty("break_chance", breakChance);
            }

            @NotNull
            @Override
            public ResourceLocation getId() {
                return new ResourceLocation(id.getNamespace(), "casting/" + id.getPath());
            }

            @NotNull
            @Override
            public RecipeSerializer<?> getType() {
                return TFCRecipeSerializers.CASTING.get();
            }

            @Nullable
            @Override
            public JsonObject serializeAdvancement() {
                return null;
            }

            @Nullable
            @Override
            public ResourceLocation getAdvancementId() {
                return null;
            }
        });
    }

}
