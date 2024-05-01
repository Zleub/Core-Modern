package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.common.machine.multiblock.primitive.PrimitivePumpMachine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PrimitivePumpMachine.class)
public abstract class PrimitivePumpMachineMixin {

    @Inject(method = "produceWater", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private void produceWater(final CallbackInfo ci) {
        ci.cancel();
    }

}
