package su.terrafirmagreg.core.old_remove_after_1_21_release;//package su.terrafirmagreg.core.old_remove_after_1_21_release.recipes;
//
//import com.gregtechceu.gtceu.data.pack.GTDynamicDataPack;
//import org.spongepowered.asm.mixin.Mixin;
//
//@Mixin(value = GTDynamicDataPack.class, remap = false)
//public abstract class GTDynamicDataPackMixin {
//
////    /**
////     * Позволяет удалять data файлы из любых модов.
////     * */
////    @Inject(method = "lambda$getMetadataSection$3", at = @At(value = "HEAD"), remap = false, cancellable = true)
////    private static void tfg$getMetadataSection$lambda3(JsonArray block, ResourceLocation id, CallbackInfo ci) {
////        if (id.getPath().startsWith("data/")) {
////            JsonObject entry = new JsonObject();
////            entry.addProperty("namespace", "^" + id.getNamespace().replaceAll("[\\W]", "\\\\$0") + "$");
////            entry.addProperty("path", "^data/" + id.getPath().replaceAll("[\\W]", "\\\\$0") + "\\.json" + "$");
////            block.add(entry);
////
////            ci.cancel();
////        }
////    }
//}
