package exception.terrafirmagreg.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.integration.GTOreProcessingWidget;
import com.lowdragmc.lowdraglib.gui.widget.WidgetGroup;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;

@Mixin(value = GTOreProcessingWidget.class, remap = false)
public class GTOreProcessingWidgetMixin extends WidgetGroup {

    @Redirect(method = "setupMainProducts", at = @At(value = "INVOKE", target = "Ljava/util/Collections;singletonList(Ljava/lang/Object;)Ljava/util/List;"), remap = false)
    private <T> List<?> onFuckGTCEu(T o)
    {
        // Как же я рот ебал грегтеха, почему я сука не
        // могу получить материал из ChemicalHelper.getMaterial, это просто магическая хуйня
        var stack = (ItemStack) o;
        var splitName = stack.getItem().toString().split("_");

        var stringBuilder = new StringBuilder();

        for (var i = 0; i < splitName.length - 1; i++)
        {
            stringBuilder.append(splitName[i]);

            if (i != splitName.length - 2)
            {
                stringBuilder.append("_");
            }
        }

        var material = GTMaterials.get(stringBuilder.toString());

        var oreTag = TagUtil.optionalTag(BuiltInRegistries.ITEM, new ResourceLocation(String.format("forge:ores/%s", material.getName())));
        return BuiltInRegistries.ITEM.getOrCreateTag(oreTag).stream().map(Holder::value).map(ItemStack::new).toList();
    }
}
