package su.terrafirmagreg.core.objects.data;

import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.data.pack.GTDynamicDataPack;
import net.minecraft.resources.ResourceLocation;
import su.terrafirmagreg.core.TerraFirmaGreg;

import java.nio.charset.StandardCharsets;

public final class TFGDynamicDataPack extends GTDynamicDataPack {
    public TFGDynamicDataPack(String name) {
        super(name);
    }

    public static void addData(String dataId, JsonObject json) {
        var rl = new ResourceLocation(dataId + ".json"); //

        if (DATA.containsKey(rl)) {
            TerraFirmaGreg.LOGGER.error("Duplicated data: {}", rl);
        }

        DATA.put(rl, json.toString().getBytes(StandardCharsets.UTF_8));
    }

}
