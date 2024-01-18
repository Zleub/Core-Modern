package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.material.MarkerMaterial;
import com.gregtechceu.gtceu.data.recipe.configurable.RecipeRemoval;
import com.llamalad7.mixinextras.sugar.Local;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = RecipeRemoval.class, remap = false)
public class RecipeRemovalMixin {

    @Redirect(method = "hardDyeRecipes", at = @At(value = "INVOKE", target = "Ljava/lang/String;format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;"), remap = false)
    private static String onStringFormat(String format, Object[] args, @Local MarkerMaterial markerMaterial) {
        return String.format(format, markerMaterial.getName());
    }

}
