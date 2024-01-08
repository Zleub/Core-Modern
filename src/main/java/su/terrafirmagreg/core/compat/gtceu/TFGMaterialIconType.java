package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;

public record TFGMaterialIconType() {
    public static final MaterialIconType poorRawOre = new MaterialIconType("poorRawOre");
    public static final MaterialIconType richRawOre = new MaterialIconType("richRawOre");

    public static final MaterialIconType toolHeadMiningHammer = new MaterialIconType("toolHeadMiningHammer");
    public static final MaterialIconType toolHeadKnife = new MaterialIconType("toolHeadKnife");
    public static final MaterialIconType toolHeadButcheryKnife = new MaterialIconType("toolHeadButcheryKnife");
    public static final MaterialIconType toolHeadSpade = new MaterialIconType("toolHeadSpade");
}