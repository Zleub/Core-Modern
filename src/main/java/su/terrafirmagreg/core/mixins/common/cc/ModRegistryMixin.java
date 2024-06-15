//package su.terrafirmagreg.core.mixins.common.cc;
//
//import dan200.computercraft.shared.platform.RegistrationHelper;
//import dan200.computercraft.shared.platform.RegistryEntry;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Redirect;
//
//import java.util.function.Supplier;
//
//@Mixin(targets = "dan200.computercraft.shared.ModRegistry$CreativeTabs", remap = false)
//public abstract class ModRegistryMixin {
//
//    @Redirect(method = "<clinit>", at = @At(value = "INVOKE", target = "Ldan200/computercraft/shared/platform/RegistrationHelper;register(Ljava/lang/String;Ljava/util/function/Supplier;)Ldan200/computercraft/shared/platform/RegistryEntry;"), remap = false)
//    private static RegistryEntry<?> tfg$clinit$registrationHelper$register(RegistrationHelper<?> instance, String s, Supplier<?> uSupplier) {
//        return null;
//    }
//}
