package su.terrafirmagreg.core.mixins.common.gtceu;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.data.pack.GTDynamicDataPack;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.terrafirmagreg.core.TerraFirmaGreg;

@Mixin(value = GTDynamicDataPack.class, remap = false)
public class GTDynamicDataPackMixin {

    @Inject(method = "lambda$getMetadataSection$3", at = @At(value = "HEAD"), remap = true, cancellable = true)
    private static void getMetadataSection(JsonArray block, ResourceLocation id, CallbackInfo ci) {
        if (id.getPath().startsWith("data/")) {
            JsonObject entry = new JsonObject();
            entry.addProperty("namespace", "^" + id.getNamespace().replaceAll("[\\W]", "\\\\$0") + "$");
            entry.addProperty("path", "^data/" + id.getPath().replaceAll("[\\W]", "\\\\$0") + "\\.json" + "$");
            block.add(entry);

            TerraFirmaGreg.LOGGER.info("dead");

            ci.cancel();
        }


    }
}
