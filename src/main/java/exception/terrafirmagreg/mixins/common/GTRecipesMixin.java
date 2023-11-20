package exception.terrafirmagreg.mixins.common;

import com.gregtechceu.gtceu.common.data.GTRecipes;
import exception.terrafirmagreg.objects.TFGRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(value = GTRecipes.class, remap = false)
public class GTRecipesMixin {

    @Inject(method = "recipeAddition", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/configurable/RecipeAddition;init(Ljava/util/function/Consumer;)V"), remap = false)
    private static void onRecipeAddition(Consumer<FinishedRecipe> consumer, CallbackInfo ci) {
        TFGRecipes.init(consumer);
    }
}
