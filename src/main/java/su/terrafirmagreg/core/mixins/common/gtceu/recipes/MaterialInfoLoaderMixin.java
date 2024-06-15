package su.terrafirmagreg.core.mixins.common.gtceu.recipes;

import com.gregtechceu.gtceu.data.recipe.MaterialInfoLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MaterialInfoLoader.class, remap = false)
public abstract class MaterialInfoLoaderMixin {

    /**
     * Запускает событие KJS для регистрации информации о предеметах в системе GTM.
     * */
    @Inject(method = "init", at = @At(value = "TAIL"), remap = false)
    private static void tfg$init(CallbackInfo ci) {
        // TFGStartupEvents.MATERIAL_INFO_MODIFICATION.post(ScriptType.STARTUP, new TFGMaterialInfoModification());
        // TODO
        // TFGMaterialInfoLoader.init();
    }
}
