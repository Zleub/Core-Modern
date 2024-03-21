package su.terrafirmagreg.core.mixins.common.create;

import com.simibubi.create.content.kinetics.belt.transport.TransportedItemStack;
import com.simibubi.create.content.logistics.depot.DepotBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = DepotBehaviour.class, remap = false)
public class DepotBehaviorMixin {

    @Shadow TransportedItemStack heldItem;

    @Inject(method = "tick()V", at = @At(value = "FIELD", target = "Lcom/simibubi/create/content/logistics/depot/DepotBehaviour;heldItem:Lcom/simibubi/create/content/kinetics/belt/transport/TransportedItemStack;", ordinal = 12), cancellable = true, remap = false)
    public void onTick(CallbackInfo ci) {
        if (heldItem == null) ci.cancel();
    }

}
