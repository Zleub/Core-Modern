package su.terrafirmagreg.core.common;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.terrafirmagreg.core.TFGCore;
import su.terrafirmagreg.core.mixins.common.tfc.IIngotPileBlockEntityEntryAccessor;

import java.util.List;
import java.util.Random;

public final class TFGHelpers {

    public static final Random RANDOM = new Random();

    @Nullable
    public static Material getMaterial(@NotNull String materialName) {
        var material = GTCEuAPI.materialManager.getMaterial(materialName);
        if (material == null) {
            material = GTCEuAPI.materialManager.getMaterial(TFGCore.MOD_ID + ":" + materialName);
        }

        return material;
    }

    /**
     * Метод получает стак из списка стаков с доп проверками.
     * */
    public static ItemStack getStackFromIngotPileTileEntityByIndex(List<?> entries, int index) {
        try
        {
            return  ((IIngotPileBlockEntityEntryAccessor) (Object) entries.get(index)).getStack();
        }
        catch (IndexOutOfBoundsException e)
        {
            return ItemStack.EMPTY;
        }
    }
}
