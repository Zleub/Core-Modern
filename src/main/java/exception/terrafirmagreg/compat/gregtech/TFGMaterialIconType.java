package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;

public record TFGMaterialIconType(String name) {
    public static final MaterialIconType poorRawOre = new MaterialIconType("poorRawOre");
    public static final MaterialIconType richRawOre = new MaterialIconType("richRawOre");

    public static final MaterialIconType toolHeadMiningHammer = new MaterialIconType("toolHeadMiningHammer");
    public static final MaterialIconType toolHeadKnife = new MaterialIconType("toolHeadKnife");
    public static final MaterialIconType toolHeadButcheryKnife = new MaterialIconType("toolHeadButcheryKnife");
    public static final MaterialIconType toolHeadPropick = new MaterialIconType("toolheadPropick");
    public static final MaterialIconType toolHeadChisel = new MaterialIconType("toolHeadChisel");
}
