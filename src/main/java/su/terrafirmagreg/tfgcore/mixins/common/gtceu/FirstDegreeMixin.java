package su.terrafirmagreg.tfgcore.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.common.data.materials.ElementMaterials;
import com.gregtechceu.gtceu.common.data.materials.FirstDegreeMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = FirstDegreeMaterials.class, remap = false)
public class FirstDegreeMixin {

    /**
     * Отключение инстурментов из серебра стерлинга GTCEu.
     * */
    @Redirect(method = "register", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/data/chemical/material/Material$Builder;toolStats(Lcom/gregtechceu/gtceu/api/data/chemical/material/properties/ToolProperty;)Lcom/gregtechceu/gtceu/api/data/chemical/material/Material$Builder;", ordinal = 3), remap = false)
    private static Material.Builder disableSterlingSilverTools(Material.Builder instance, ToolProperty toolProperty) {
        return instance;
    }

    /**
     * Отключение инстурментов из розового золота GTCEu.
     * */
    @Redirect(method = "register", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/data/chemical/material/Material$Builder;toolStats(Lcom/gregtechceu/gtceu/api/data/chemical/material/properties/ToolProperty;)Lcom/gregtechceu/gtceu/api/data/chemical/material/Material$Builder;", ordinal = 3), remap = false)
    private static Material.Builder disableRoseGoldTools(Material.Builder instance, ToolProperty toolProperty) {
        return instance;
    }
}
