package su.terrafirmagreg.core.objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.data.pack.GTDynamicDataPack;
import net.minecraft.resources.ResourceLocation;
import su.terrafirmagreg.core.TerraFirmaGreg;

import java.nio.charset.StandardCharsets;

public class TFGDynamicDataPack extends GTDynamicDataPack {
    public TFGDynamicDataPack(String name) {
        super(name);
    }

    /**
     *
     * */
    public static void addData(String dataId, JsonObject json) {
        var rl = new ResourceLocation(dataId + ".json");

        if (DATA.containsKey(rl)) {
            TerraFirmaGreg.LOGGER.error("Duplicated data: {}", rl);
        }

        DATA.put(rl, json.toString().getBytes(StandardCharsets.UTF_8));
    }

    /**
     *
     * */
    public static void removeData(String recipeId) {
        addData(recipeId, getBlankData());
    }

    public static JsonObject getBlankData() {
        var outerJson = new JsonObject();

        var jsonArray = new JsonArray();

        var innerJson = new JsonObject();
        innerJson.addProperty("type", "forge:false");

        jsonArray.add(innerJson);

        outerJson.add("conditions", jsonArray);

        return outerJson;
    }
}
