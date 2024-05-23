package su.terrafirmagreg.core.objects;

import com.google.gson.JsonObject;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public final class TFGData {

    public static void init() {
        addItemStackHeat(TFCItems.BRASS_MECHANISMS.get(), 0.5F, 200, 200);
    }


    private static void addItemStackHeat(@NotNull final Item item, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
        var rl = ForgeRegistries.ITEMS.getKey(item);
        if (rl == null) return;

        var json = Helpers.getItemHeatJson(item, heatCapacity, forgingTemp, weldingTemp);
        TFGDynamicDataPack.addData("tfc:tfc/item_heats/" + rl.getPath(), json);
    }

    private static final class Helpers {

        @NotNull
        private static JsonObject getItemHeatJson(@NotNull final ItemStack stack, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
            var json = new JsonObject();

            json.add("ingredient", Ingredient.of(stack).toJson());
            json.addProperty("heat_capacity", heatCapacity);

            if (forgingTemp != null) json.addProperty("forging_temperature", forgingTemp);
            if (weldingTemp != null) json.addProperty("welding_temperature", weldingTemp);

            return json;
        }

        @NotNull
        private static JsonObject getItemHeatJson(@NotNull final Item item, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
            return getItemHeatJson(new ItemStack(item), heatCapacity, forgingTemp, weldingTemp);
        }

    }
}
