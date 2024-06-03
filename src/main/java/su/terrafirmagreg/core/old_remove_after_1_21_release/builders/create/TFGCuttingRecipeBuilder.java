//package su.terrafirmagreg.core.old_remove_after_1_21_release.recipes.builders.create;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.simibubi.create.AllRecipeTypes;
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
//
//import java.util.function.Consumer;
//
//@SuppressWarnings("unused")
//public final class TFGCuttingRecipeBuilder {
//
//    private final ResourceLocation id;
//
//    private Ingredient input;
//    private Ingredient output;
//    private int duration;
//
//    public TFGCuttingRecipeBuilder(String id) {
//        this.id = new ResourceLocation(id);
//    }
//
//    public TFGCuttingRecipeBuilder(ResourceLocation id) {
//        this.id = id;
//    }
//
//    public TFGCuttingRecipeBuilder input(TagKey<Item> input) {
//        input(Ingredient.of(input));
//        return this;
//    }
//
//    public TFGCuttingRecipeBuilder input(ItemLike input) {
//        input(Ingredient.of(input));
//        return this;
//    }
//
//    public TFGCuttingRecipeBuilder input(ItemStack input) {
//        input(Ingredient.of(input));
//        return this;
//    }
//
//    public TFGCuttingRecipeBuilder input(Ingredient ingredient) {
//        this.input = ingredient;
//        return this;
//    }
//
//    public TFGCuttingRecipeBuilder output(ItemLike input) {
//        output(Ingredient.of(input));
//        return this;
//    }
//
//    public TFGCuttingRecipeBuilder output(ItemStack input) {
//        output(Ingredient.of(input));
//        return this;
//    }
//
//    public TFGCuttingRecipeBuilder output(Ingredient ingredient) {
//        this.output = ingredient;
//        return this;
//    }
//
//    public TFGCuttingRecipeBuilder duration(int duration) {
//        this.duration = duration;
//        return this;
//    }
//
//    public void save(Consumer<FinishedRecipe> consumer) {
//        consumer.accept(new FinishedRecipe() {
//
//            @Override
//            public void serializeRecipeData(@NotNull JsonObject recipeJson) {
//                if (input == null)
//                    throw new IllegalArgumentException("Cutting recipe must have item input: " + id);
//
//                var inputJsonArray = new JsonArray();
//                inputJsonArray.add(input.toJson());
//
//                recipeJson.add("ingredients", inputJsonArray);
//
//                if (duration <= 0)
//                    throw new IllegalArgumentException("Cutting recipe must have duration > 0: " + id);
//
//                recipeJson.addProperty("processingTime", duration);
//
//                if (output == null)
//                    throw new IllegalArgumentException("Anvil recipe must have item result: " + id);
//
//                var outputJsonArray = new JsonArray();
//                outputJsonArray.add(output.toJson());
//
//                recipeJson.add("results", outputJsonArray);
//            }
//
//            @NotNull
//            @Override
//            public ResourceLocation getId() {
//                return new ResourceLocation(id.getNamespace(), "cutting/" + id.getPath());
//            }
//
//            @NotNull
//            @Override
//            public RecipeSerializer<?> getType() {
//                return AllRecipeTypes.CUTTING.getSerializer();
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
//}
