package su.terrafirmagreg.core.mixins.common.firmaciv;

//import com.alekiponi.firmaciv.events.BlockEventHandler;
//import net.minecraftforge.event.level.BlockEvent;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Pseudo;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//@Pseudo
//@Mixin(value = BlockEventHandler.class, remap = false)
//public abstract class BlockEventHandlerMixin {
//
//    @Inject(method = "registerToolModificationEvents", at = @At(value = "HEAD"), remap = false, cancellable = true)
//    private static void tfg$registerToolModificationEvents(BlockEvent.BlockToolModificationEvent event, CallbackInfo ci) {
//        if (event.getPlayer() == null) ci.cancel();
//    }
//
//}
