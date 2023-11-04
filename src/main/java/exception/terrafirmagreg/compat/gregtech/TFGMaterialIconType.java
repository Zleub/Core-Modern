package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;

public record TFGMaterialIconType(String name) {
    public static final MaterialIconType poorRawOre = new MaterialIconType("poorRawOre");
    public static final MaterialIconType richRawOre = new MaterialIconType("richRawOre");
}
