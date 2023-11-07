package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import java.util.Arrays;

import static com.gregtechceu.gtceu.common.data.GTMaterials.EXT2_METAL;

public class TFGMaterials {
    public static void init()
    {
        GTMaterials.Bismuth.setProperty(PropertyKey.ORE, new OreProperty());
        GTMaterials.Bismuth.addFlags(EXT2_METAL.toArray(new MaterialFlag[0]));

        GTMaterials.Borax.setProperty(PropertyKey.ORE, new OreProperty());
    }

    public static Material Sylvite = new Material.Builder("sylvite")
            .dust()
            .ore()
            .color(0x6B3D12)
            .buildAndRegister();

    public static Material Gabbro = new Material.Builder("gabbro")
            .dust()
            .color(0x7F8081)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Shale = new Material.Builder("shale")
            .dust()
            .color(0x686567)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Claystone = new Material.Builder("claystone")
            .dust()
            .color(0xAF9377)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Limestone = new Material.Builder("limestone")
            .dust()
            .color(0xA09885)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Conglomerate = new Material.Builder("conglomerate")
            .dust()
            .color(0xA3977F)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Dolomite = new Material.Builder("dolomite")
            .dust()
            .color(0x515155)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Chert = new Material.Builder("chert")
            .dust()
            .color(0x7A6756)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Chalk = new Material.Builder("chalk")
            .dust()
            .color(0xA4A39F)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Rhyolite = new Material.Builder("rhyolite")
            .dust()
            .color(0x726D69)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Dacite = new Material.Builder("dacite")
            .dust()
            .color(0x979797)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Slate = new Material.Builder("slate")
            .dust()
            .color(0x989287)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Phyllite = new Material.Builder("phyllite")
            .dust()
            .color(0x706B61)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Schist = new Material.Builder("schist")
            .dust()
            .color(0x6E735C)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Gneiss = new Material.Builder("gneiss")
            .dust()
            .color(0x6A6D60)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();
}