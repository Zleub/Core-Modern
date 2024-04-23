package su.terrafirmagreg.core.mixins.common.create;

import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.TerraFirmaGreg;

import java.util.Objects;

@Mixin(value = ProcessingRecipe.class, remap = false)
public abstract class ProcessingRecipeMixin {

    @Shadow private RecipeType<?> type;
    @Unique private static boolean tfg$hasAnnounced = false;

    @Redirect(method = "validate", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;)V", ordinal = 2), remap = false)
    private void tfg$validate(Logger instance, String s) {
        if (Objects.equals(type.toString(), "rolling") && !tfg$hasAnnounced) {
            tfg$hasAnnounced = true;
            TerraFirmaGreg.LOGGER.info("Supressed CreateAddions rolling recipe log spam! Enjoy!");
        }

    }

}
