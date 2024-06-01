//package su.terrafirmagreg.core.old_remove_after_1_21_release.recipes;
//
//import com.google.gson.JsonObject;
//import com.gregtechceu.gtceu.data.pack.GTDynamicDataPack;
//import net.minecraft.resources.ResourceLocation;
//import su.terrafirmagreg.core.TerraFirmaGreg;
//
//import java.nio.charset.StandardCharsets;
//import java.util.List;
//
//public final class TFGDynamicDataPack extends GTDynamicDataPack {
//    public TFGDynamicDataPack(String name) {
//        super(name, List.of("create"));
//    }
//
//    public static void addData(String dataId, JsonObject json) {
//        var rl = new ResourceLocation(dataId + ".json"); //
//
//        if (DATA.containsKey(rl)) {
//            TerraFirmaGreg.LOGGER.error("Duplicated data: {}", rl);
//        }
//
//        DATA.put(rl, json.toString().getBytes(StandardCharsets.UTF_8));
//    }
//
//}
