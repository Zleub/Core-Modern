package su.terrafirmagreg.core.common.data;

import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.data.pack.GTDynamicDataPack;
import net.minecraft.resources.ResourceLocation;
import su.terrafirmagreg.core.TFGCore;

import java.nio.charset.StandardCharsets;
import java.util.List;

public final class TFGDynamicDataPack extends GTDynamicDataPack {
    public TFGDynamicDataPack(String name) {
        super(name, List.of());
    }

    public static void addData(String dataId, JsonObject json) {
        var rl = getDataLocation(dataId);

        if (DATA.containsKey(rl)) {
            TFGCore.LOGGER.error("Duplicated data: {}", rl);
        }

        DATA.put(rl, json.toString().getBytes(StandardCharsets.UTF_8));
    }

    public static ResourceLocation getDataLocation(String dataId) {
        return new ResourceLocation(TFGCore.MOD_ID, String.join("", "data/", dataId, ".json"));
    }
}
