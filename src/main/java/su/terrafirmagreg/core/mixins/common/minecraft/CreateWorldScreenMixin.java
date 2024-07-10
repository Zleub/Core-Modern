package su.terrafirmagreg.core.mixins.common.minecraft;

import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(CreateWorldScreen.class)
public abstract class CreateWorldScreenMixin {

    /**
     * Избавляет от надобности ставить мод YetusExperimentus
     * */
    @ModifyVariable(method = "tryApplyNewDataPacks", at = @At("HEAD"), argsOnly = true)
    public boolean dontShowWarning(boolean showWarning) {
        return false;
    }
}
