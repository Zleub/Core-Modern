package su.terrafirmagreg.core.mixins.common.ftbxmodcompat;

import dev.ftb.mods.ftbxmodcompat.FTBXModCompat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = FTBXModCompat.class, remap = false)
public class FTBXModCompatMixin {

    // TODO: Возможно стоит удалить позже

    @Inject(method = "detectLoadedMods", at = @At(value = "INVOKE", target = "Ldev/architectury/platform/Platform;isModLoaded(Ljava/lang/String;)Z", ordinal = 8), remap = false)
    private static void loadedJEIFalse(CallbackInfo ci) {}

    @Inject(method = "detectLoadedMods", at = @At(value = "INVOKE", target = "Ldev/architectury/platform/Platform;isModLoaded(Ljava/lang/String;)Z", ordinal = 9), remap = false)
    private static void loadedREIFalse(CallbackInfo ci) {}
}
