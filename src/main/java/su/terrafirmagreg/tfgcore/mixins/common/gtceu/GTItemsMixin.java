package su.terrafirmagreg.tfgcore.mixins.common.gtceu;

import com.gregtechceu.gtceu.common.data.GTItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.terrafirmagreg.tfgcore.objects.TFGItems;

@Mixin(value = GTItems.class, remap = false)
public class GTItemsMixin {

    @Inject(method = "<clinit>", at = @At(value = "TAIL"), remap = false)
    private static void onStaticCtor(CallbackInfo ci) {
        TFGItems.init();
    }

}
