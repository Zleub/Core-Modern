package exception.terrafirmagreg.mixins.common;

import com.gregtechceu.gtceu.common.data.GTItems;
import exception.terrafirmagreg.objects.TFGItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GTItems.class, remap = false)
public class TFGItemsMixin {

    @Inject(method = "<clinit>", at = @At(value = "TAIL"), remap = false)
    private static void onStaticCtor(CallbackInfo ci) {
        TFGItems.init();
    }
}
