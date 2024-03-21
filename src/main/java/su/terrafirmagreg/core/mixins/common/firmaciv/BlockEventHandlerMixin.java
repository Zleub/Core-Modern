package su.terrafirmagreg.core.mixins.common.firmaciv;

import com.alekiponi.firmaciv.events.BlockEventHandler;
import net.minecraftforge.event.level.BlockEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = BlockEventHandler.class, remap = false)
public class BlockEventHandlerMixin {

    @Inject(method = "registerToolModificationEvents", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private static void onRegisterToolModificationEvents(BlockEvent.BlockToolModificationEvent event, CallbackInfo ci)
    {
        if (event.getPlayer() == null) ci.cancel();
    }

}
