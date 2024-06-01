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
        var value = ChemicalHelper.ITEM_MATERIAL_INFO.keySet().stream().filter(el -> el.asItem().kjs$getId().equals(itemLike.asItem().kjs$getId())).findFirst().get();
        var removedValue = ChemicalHelper.ITEM_MATERIAL_INFO.remove(value);
        if (removedValue == null) TerraFirmaGreg.LOGGER.warn("No unification info for: {}", itemLike.asItem());
    }
}
