package su.terrafirmagreg.core.compat.kjs.events;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import dev.latvian.mods.kubejs.event.EventJS;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import su.terrafirmagreg.core.TFGCore;

public class TFGMaterialInfoModification extends EventJS {

    public void add(ItemLike itemLike, ItemMaterialInfo itemMaterialInfo) {
        ChemicalHelper.registerMaterialInfo(itemLike, itemMaterialInfo);
    }

    public boolean remove(ItemLike itemLike) {
        var itemResourceLocation = ForgeRegistries.ITEMS.getKey(itemLike.asItem());

        if (itemResourceLocation == null) {
            TFGCore.LOGGER.warn("Item not founded in item registry: {}", itemLike.asItem());
            return false;
        }

        var item = ChemicalHelper.ITEM_MATERIAL_INFO.keySet().stream().filter(
                el -> {
                    var elementResourceLocation = ForgeRegistries.ITEMS.getKey(el.asItem());

                    if (elementResourceLocation == null) {
                        return false;
                    }

                    return elementResourceLocation.equals(itemResourceLocation);
                }).findFirst();



        if (item.isPresent()) {
            var removedValue = ChemicalHelper.ITEM_MATERIAL_INFO.remove(item.get());
            if (removedValue != null) {
                return true;
            }

            TFGCore.LOGGER.warn("Item has not been deleted from unification data: {}", itemResourceLocation);
            return false;
        }

        TFGCore.LOGGER.warn("No unification info for: {}", itemResourceLocation);
        return false;
    }
}
