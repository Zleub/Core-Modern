package su.terrafirmagreg.core.mixins.common.gtceu.recipes;

import com.gregtechceu.gtceu.data.recipe.configurable.RecipeAddition;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(value = RecipeAddition.class, remap = false)
public abstract class RecipeAdditionsMixin {

    @Inject(method = "addBedRecipe", at = @At("HEAD"), remap = false, cancellable = true)
    private static void tfg$addBedRecipe(Consumer<FinishedRecipe> provider, DyeColor color, CallbackInfo ci) {
//        ci.cancel();
    }

}
