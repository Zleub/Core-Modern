package su.terrafirmagreg.core.mixins.client.sl;

/*
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.ReceivingLevelScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ScreenEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.seraphjack.simplelogin.client.EventHandler;

@OnlyIn(Dist.CLIENT)
@Mixin(value = EventHandler.class)
public class EventHandlerMixin {

	@Inject(method = "onGuiOpen", at = @At(value = "INVOKE", target = "Ltop/seraphjack/simplelogin/client/PasswordHolder;initialized()Z"), remap = false, cancellable = true)
	private static void onGuiOpen(ScreenEvent.Opening event, CallbackInfo ci) {
		if (!(event.getScreen() instanceof JoinMultiplayerScreen || event.getScreen() instanceof ConnectScreen)) {
			ci.cancel();
		}
	}
}
*/