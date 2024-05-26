package su.terrafirmagreg.core.objects.data.recipes.builders.tfc;

import com.google.gson.JsonArray;
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

//public final class TFGHeatingRecipeBuilder extends TFGAbstractRecipeBuilder {
//
//    private Ingredient input;
//    private ItemStackProviderJS outputStack;
//    private FluidStack outputFluidStack;
//    private int temperature;
//    private boolean useDurablility = false;
//    private double chance = 1f;
//
//    public TFGHeatingRecipeBuilder(String id) {
//        super(id);
//    }
//
//    public TFGHeatingRecipeBuilder input(final TagKey<Item> itemStack) {
//        return input(Ingredient.of(itemStack));
//    }
//
//    public TFGHeatingRecipeBuilder input(final ItemStack itemStack) {
//        if (itemStack.hasTag() || itemStack.getDamageValue() > 0) {
//            input = NBTIngredient.createNBTIngredient(itemStack);
//        } else {
//            input = Ingredient.of(itemStack);
//        }
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder input(final ItemLike itemLike) {
//        return input(Ingredient.of(itemLike));
//    }
//
//    public TFGHeatingRecipeBuilder input(final Ingredient ingredient) {
//        input = ingredient;
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder output(final ItemStackProviderJS stackProvider) {
//        this.outputStack = stackProvider.copy();
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder output(final ItemStack stack) {
//        this.outputStack = new ItemStackProviderJS(stack, new JsonArray());
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder output(final Fluid fluid, final int amount) {
//        this.outputFluidStack = new FluidStack(fluid, amount);
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder useDurability() {
//        this.useDurablility = true;
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder temperature(final int temperature) {
//        this.temperature = temperature;
//        return this;
//    }
//
//    public TFGHeatingRecipeBuilder chance(final double chance) {
//        this.chance = chance;
//        return this;
//    }
//
//    public void save(final Consumer<FinishedRecipe> consumer) {
//        consumer.accept(new FinishedRecipe() {
//
//            @Override
//            public void serializeRecipeData(@NotNull JsonObject pJson) {
//                if (input == null)
//                    throw new IllegalArgumentException("Heating recipe must have at least one input: " + id);
//
//                pJson.add("ingredient", input.toJson());
//
//                if (outputStack != null) {
//                    pJson.add("result_item", outputStack.toJson());
//                }
//
//                if (outputFluidStack != null) {
//                    pJson.add("result_fluid", fluidStackToJson(outputFluidStack));
//                }
//
//                pJson.addProperty("temperature", temperature);
//                pJson.addProperty("use_durability", useDurablility);
//                pJson.addProperty("chance", chance);
//            }
//
//            @NotNull
//            @Override
//            public ResourceLocation getId() {
//                return new ResourceLocation(id.getNamespace(), "heating/" + id.getPath());
//            }
//
//            @NotNull
//            @Override
//            public RecipeSerializer<?> getType() {
//                return TFCRecipeSerializers.HEATING.get();
//            }
//
//            @Nullable
//            @Override
//            public JsonObject serializeAdvancement() {
//                return null;
//            }
//
//            @Nullable
//            @Override
//            public ResourceLocation getAdvancementId() {
//                return null;
//            }
//        });
//    }
//
//}
