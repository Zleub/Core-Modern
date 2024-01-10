package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.common.data.GTBedrockFluids;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.terrafirmagreg.core.compat.gtceu.TFGFluidVeins;

@Mixin(value = GTBedrockFluids.class, remap = false)
public class GTBedrockFluidsMixin {

    @Inject(method = "init", at = @At(value = "HEAD"), remap = false)
    private static void onInit(CallbackInfo ci) {
        TFGFluidVeins.register();
    }

}
