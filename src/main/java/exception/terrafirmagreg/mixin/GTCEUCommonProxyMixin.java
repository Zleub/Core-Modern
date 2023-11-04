package exception.terrafirmagreg.mixin;

import com.gregtechceu.gtceu.common.CommonProxy;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = CommonProxy.class, remap = false)
public class GTCEUCommonProxyMixin {

    @Inject(method = "init", at = @At(value = "TAIL"), remap = false)
    private static void onInitTail(CallbackInfo ci)
    {

    }
}
