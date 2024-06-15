package su.terrafirmagreg.core.common.data.recipes.builders.tfc;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.terrafirmagreg.core.TFGCore;
import su.terrafirmagreg.core.common.data.TFGTags;
import su.terrafirmagreg.core.common.data.recipes.builders.TFGAbstractRecipeBuilder;

import java.util.function.Consumer;

public final class TFGAdvancedShapedToolRecipeBuilder extends TFGAbstractRecipeBuilder {

    private Ingredient input;
    private Ingredient output;

    public TFGAdvancedShapedToolRecipeBuilder(String namespace, String id) {
        super(String.join("", namespace, ":", id));
    }

    public TFGAdvancedShapedToolRecipeBuilder(String id) {
        super(String.join("", TFGCore.MOD_ID, ":", id));
    }

    public TFGAdvancedShapedToolRecipeBuilder input(final TagKey<Item> itemStack) {
        return input(Ingredient.of(itemStack));
    }

    public TFGAdvancedShapedToolRecipeBuilder input(final ItemStack itemStack) {
        if (itemStack.hasTag() || itemStack.getDamageValue() > 0) {
            input = NBTIngredient.createNBTIngredient(itemStack);
        } else {
            input = Ingredient.of(itemStack);
        }
        return this;
    }

    public TFGAdvancedShapedToolRecipeBuilder input(final ItemLike itemLike) {
        return input(Ingredient.of(itemLike));
    }

    public TFGAdvancedShapedToolRecipeBuilder input(final Ingredient ingredient) {
        input = ingredient;
        return this;
    }

    public TFGAdvancedShapedToolRecipeBuilder output(final Ingredient ingredient) {
        output = ingredient;
        return this;
    }

    public TFGAdvancedShapedToolRecipeBuilder output(final ItemStack stack) {
        output(Ingredient.of(stack));
        return this;
    }

    public TFGAdvancedShapedToolRecipeBuilder output(final ItemLike itemLike) {
        output(Ingredient.of(itemLike));
        return this;
    }

    public void save(final Consumer<FinishedRecipe> consumer) {
        consumer.accept(new FinishedRecipe() {

            @Override
            public void serializeRecipeData(@NotNull JsonObject pJson) {
                var arrayObj = new JsonArray();

                arrayObj.add("X");
                arrayObj.add("Y");

                pJson.add("pattern", arrayObj);

                if (input == null)
                    throw new IllegalArgumentException("Recipe must have item input: " + id);

                if (output == null)
                    throw new IllegalArgumentException("Casting recipe must have item result: " + id);

                var keyObj = new JsonObject();

                keyObj.add("X", input.toJson());
                keyObj.add("Y", Ingredient.of(TFGTags.Items.WoodenSticks).toJson());

                pJson.add("key", keyObj);

                var resultObj = new JsonObject();

                resultObj.add("stack", output.toJson());

                var modifiersObj = new JsonArray();
                modifiersObj.add("tfc:copy_forging_bonus");

                resultObj.add("modifiers", modifiersObj);

                pJson.add("result", resultObj);

                pJson.addProperty("input_row", 0);
                pJson.addProperty("input_column", 0);
            }

            @NotNull
            @Override
            public ResourceLocation getId() {
                return new ResourceLocation(id.getNamespace(), "crafting/" + id.getPath());
            }

            @NotNull
            @Override
            public RecipeSerializer<?> getType() {
                return TFCRecipeSerializers.ADVANCED_SHAPED_CRAFTING.get();
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
