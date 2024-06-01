//package su.terrafirmagreg.core.old_remove_after_1_21_release.recipes.builders.tfc;
//
//import com.google.gson.JsonObject;
//import com.gregtechceu.gtceu.api.recipe.ingredient.NBTIngredient;
//import net.dries007.tfc.common.recipes.TFCRecipeSerializers;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.tags.TagKey;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraft.world.level.ItemLike;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//import su.terrafirmagreg.core.old_remove_after_1_21_release.recipes.builders.TFGAbstractRecipeBuilder;
//
//import java.util.function.Consumer;
//
//public final class TFGWeldingRecipeBuilder extends TFGAbstractRecipeBuilder {
//
//    private Ingredient firstInputStack;
//    private Ingredient secondInputStack;
//    private ItemStack outputStack;
//    private int tier = -1;
//
//    public TFGWeldingRecipeBuilder(String id) {
//        super(id);
//    }
//
//    @SafeVarargs
//    public final TFGWeldingRecipeBuilder inputs(final TagKey<Item>... itemStacks) {
//        return inputs(Ingredient.of(itemStacks[0]), Ingredient.of(itemStacks[1]));
//    }
//
//    public TFGWeldingRecipeBuilder inputs(final ItemStack... itemStacks) {
//        if (itemStacks.length != 2) {
//            throw new IllegalArgumentException("Expected 2 ingredients: " + id);
//        }
//
//        if (itemStacks[0].hasTag() || itemStacks[0].getDamageValue() > 0) {
//            firstInputStack = NBTIngredient.createNBTIngredient(itemStacks[0]);
//        } else {
//            firstInputStack = Ingredient.of(itemStacks[0]);
//        }
//
//        if (itemStacks[1].hasTag() || itemStacks[1].getDamageValue() > 0) {
//            secondInputStack = NBTIngredient.createNBTIngredient(itemStacks[1]);
//        } else {
//            secondInputStack = Ingredient.of(itemStacks[1]);
//        }
//        return this;
//    }
//
//    public TFGWeldingRecipeBuilder inputs(final ItemLike... itemLikes) {
//        return inputs(Ingredient.of(itemLikes[0], itemLikes[1]));
//    }
//
//    public TFGWeldingRecipeBuilder inputs(final Ingredient... ingredients) {
//        if (ingredients.length != 2) {
//            throw new IllegalArgumentException("Expected 2 ingredients: " + id);
//        }
//
//        firstInputStack = ingredients[0];
//        secondInputStack = ingredients[1];
//        return this;
//    }
//
//    public TFGWeldingRecipeBuilder output(final ItemStack stack) {
//        this.outputStack = stack.copy();
//        return this;
//    }
//
//    public TFGWeldingRecipeBuilder output(final ItemLike itemLike) {
//        return output(new ItemStack(itemLike));
//    }
//
//    public TFGWeldingRecipeBuilder tier(int tier) {
//        this.tier = tier;
//        return this;
//    }
//
//    public void save(Consumer<FinishedRecipe> consumer) {
//        consumer.accept(new FinishedRecipe() {
//
//            @Override
//            public void serializeRecipeData(@NotNull JsonObject pJson) {
//                if (firstInputStack == null || secondInputStack == null)
//                    throw new IllegalArgumentException("Welding recipe must have two inputs: " + id);
//
//                pJson.add("first_input", firstInputStack.toJson());
//                pJson.add("second_input", secondInputStack.toJson());
//
//                if (outputStack == null)
//                    throw new IllegalArgumentException("Welding recipe must have ouput: " + id);
//
//                pJson.add("result", Ingredient.of(outputStack).toJson());
//
//                if (tier == -1)
//                    throw new IllegalArgumentException("Welding recipe must have tier value (0 - 6): " + id);
//
//                pJson.addProperty("tier", tier);
//            }
//
//            @NotNull
//            @Override
//            public ResourceLocation getId() {
//                return new ResourceLocation(id.getNamespace(), "welding/" + id.getPath());
//            }
//
//            @NotNull
//            @Override
//            public RecipeSerializer<?> getType() {
//                return TFCRecipeSerializers.WELDING.get();
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