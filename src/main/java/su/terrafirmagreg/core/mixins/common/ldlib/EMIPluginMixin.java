package su.terrafirmagreg.core.mixins.common.ldlib;

import com.lowdragmc.lowdraglib.emi.EMIPlugin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EMIPlugin.class, remap = false)
public abstract class EMIPluginMixin {

    // TODO: Перепроверить, мб исправилось
//    @Inject(method = "isEmiEnabled", at = @At("HEAD"), remap = false, cancellable = true)
//    private static void tfg$isEmiEnabled(final CallbackInfoReturnable<Boolean> cir) {
//        cir.setReturnValue(true);
//    }

}
