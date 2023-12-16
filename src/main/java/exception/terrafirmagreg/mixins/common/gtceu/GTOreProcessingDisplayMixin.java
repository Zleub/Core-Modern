package exception.terrafirmagreg.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.integration.rei.oreprocessing.GTOreProcessingDisplay;
import com.lowdragmc.lowdraglib.gui.widget.WidgetGroup;
import com.lowdragmc.lowdraglib.rei.ModularDisplay;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Supplier;

@Mixin(value = GTOreProcessingDisplay.class, remap = false)
public class GTOreProcessingDisplayMixin extends ModularDisplay<WidgetGroup> {

    public GTOreProcessingDisplayMixin(Supplier<WidgetGroup> widget, CategoryIdentifier<?> category) {
        super(widget, category);
    }

    @Redirect(method = "getInputEntries", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/data/chemical/ChemicalHelper;getTag(Lcom/gregtechceu/gtceu/api/data/tag/TagPrefix;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;)Lnet/minecraft/tags/TagKey;", ordinal = 0), remap = false)
    private TagKey<Item> onFuckGTCEu(TagPrefix orePrefix, Material material) {
        return TagUtil.optionalTag(BuiltInRegistries.ITEM, new ResourceLocation(String.format("forge:ores/%s", material.getName())));
    }
}
