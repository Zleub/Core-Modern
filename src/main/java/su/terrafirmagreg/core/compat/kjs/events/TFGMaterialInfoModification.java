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

    public boolean remove(ItemLike itemLike) {
        var item = ChemicalHelper.ITEM_MATERIAL_INFO.keySet().stream().filter(
                el -> el.asItem().kjs$getId().equals(itemLike.asItem().kjs$getId())).findFirst();

        var itemName = itemLike.asItem().kjs$getId();

        if (item.isPresent()) {
            var removedValue = ChemicalHelper.ITEM_MATERIAL_INFO.remove(item.get());
            if (removedValue != null) {
                return true;
            }

            TerraFirmaGreg.LOGGER.warn("Item has not been deleted from unification data: {}", itemName);
            return false;
        }

        TerraFirmaGreg.LOGGER.warn("No unification info for: {}", itemName);
        return false;
    }
}
