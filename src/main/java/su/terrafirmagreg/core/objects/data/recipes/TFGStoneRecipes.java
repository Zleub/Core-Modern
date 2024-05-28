package su.terrafirmagreg.core.objects.data.recipes;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public final class TFGStoneRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {

    }

    public static void remove(Consumer<ResourceLocation> consumer) {

    }

    private static ResourceLocation id(String id) {
        return new ResourceLocation(id);
    }

}
