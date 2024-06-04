package su.terrafirmagreg.core.compat.kjs.events;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import dev.latvian.mods.kubejs.event.EventJS;
import net.minecraft.world.level.ItemLike;
import su.terrafirmagreg.core.TerraFirmaGreg;

public class TFGMaterialInfoModification extends EventJS {

    public void add(ItemLike itemLike, ItemMaterialInfo itemMaterialInfo) {
        ChemicalHelper.registerMaterialInfo(itemLike, itemMaterialInfo);
    }

    public void remove(ItemLike itemLike) {
        var value = ChemicalHelper.ITEM_MATERIAL_INFO.keySet().stream().filter(
                el -> el.asItem().kjs$getId().equals(itemLike.asItem().kjs$getId())).findFirst();

        var itemName = itemLike.asItem().kjs$getId();

        if (value.isPresent()) {
            var removedValue = ChemicalHelper.ITEM_MATERIAL_INFO.remove(value.get());
            if (removedValue == null) TerraFirmaGreg.LOGGER.warn("Item has not been deleted from unification data: {}", itemName);
        }
        else {
            TerraFirmaGreg.LOGGER.warn("No unification info for: {}", itemName);
        }

    }
}
