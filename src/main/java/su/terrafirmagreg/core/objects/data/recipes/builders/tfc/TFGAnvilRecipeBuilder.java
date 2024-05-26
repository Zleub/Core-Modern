package su.terrafirmagreg.core.objects.data.recipes.builders.tfc;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.api.recipe.ingredient.NBTIngredient;
import net.dries007.tfc.common.capabilities.forge.ForgeRule;
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
import su.terrafirmagreg.core.objects.data.recipes.builders.TFGAbstractRecipeBuilder;

import java.util.function.Consumer;

public final class TFGAnvilRecipeBuilder extends TFGAbstractRecipeBuilder {

    private Ingredient input;
    private ItemStack outputStack;
    private int tier = -1;
    private ForgeRule[] rules;
    private boolean applyForgingBonus;

    public TFGAnvilRecipeBuilder(String id) {
        super(id);
    }

    public TFGAnvilRecipeBuilder input(TagKey<Item> itemStack) {
        return input(Ingredient.of(itemStack));
    }

    public TFGAnvilRecipeBuilder input(ItemStack itemStack) {
        if (itemStack.hasTag() || itemStack.getDamageValue() > 0) {
            input = NBTIngredient.createNBTIngredient(itemStack);
        } else {
            input = Ingredient.of(itemStack);
        }
        return this;
    }

    public TFGAnvilRecipeBuilder input(ItemLike itemLike) {
        return input(Ingredient.of(itemLike));
    }

    public TFGAnvilRecipeBuilder input(Ingredient ingredient) {
        input = ingredient;
        return this;
    }

    public TFGAnvilRecipeBuilder output(final ItemStack stack) {
        this.outputStack = stack.copy();
        return this;
    }

    public TFGAnvilRecipeBuilder output(final ItemLike itemLike) {
        return output(new ItemStack(itemLike));
    }

    public TFGAnvilRecipeBuilder tier(final int tier) {
        this.tier = tier;
        return this;
    }

    public TFGAnvilRecipeBuilder rules(final ForgeRule... rules) {
        this.rules = rules;
        return this;
    }

    public boolean applyForgingBonus() {
        this.applyForgingBonus = true;
        return true;
    }

    public void save(Consumer<FinishedRecipe> consumer) {
        consumer.accept(new FinishedRecipe() {

            @Override
            public void serializeRecipeData(@NotNull JsonObject pJson) {
                if (input == null)
                    throw new IllegalArgumentException("Anvil recipe must have item input: " + id);

                pJson.add("input", input.toJson());

                if (outputStack == null)
                    throw new IllegalArgumentException("Anvil recipe must have item result: " + id);

                pJson.add("result", Ingredient.of(outputStack).toJson());

                if (tier == -1)
                    throw new IllegalArgumentException("Anvil recipe must have tier value (0 - 6): " + id);

                pJson.addProperty("tier", tier);

                if (rules == null || rules.length == 0)
                    throw new IllegalArgumentException("Anvil recipe must have forge rules: " + id);

                var jsonArray = new JsonArray();

                for (final var rule : rules) {
                    jsonArray.add(rule.name());
                }

                pJson.add("rules", jsonArray);
                pJson.addProperty("apply_forging_bonus", applyForgingBonus);
            }

            @NotNull
            @Override
            public ResourceLocation getId() {
                return new ResourceLocation(id.getNamespace(), "anvil/" + id.getPath());
            }

            @NotNull
            @Override
            public RecipeSerializer<?> getType() {
                return TFCRecipeSerializers.ANVIL.get();
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
