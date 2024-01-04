package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GTRecipeTypes.class, remap = false)
public class GTRecipeTypesMixin {

    @Shadow
    @Final
    public static GTRecipeType CUTTER_RECIPES;

    @Inject(method = "init", at = @At(value = "TAIL"), remap = false)
    private static void init(CallbackInfo ci) {
        CUTTER_RECIPES.setMaxIOSize(2, 2, 1, 0);
        CUTTER_RECIPES.setSlotOverlay(false, false, true, GuiTextures.CIRCUIT_OVERLAY);
    }

}
