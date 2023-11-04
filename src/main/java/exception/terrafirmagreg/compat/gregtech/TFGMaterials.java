package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.common.data.GTMaterials;

public class TFGMaterials {
    public static void init()
    {
        GTMaterials.Bismuth.setProperty(PropertyKey.ORE, new OreProperty());
        GTMaterials.Borax.setProperty(PropertyKey.ORE, new OreProperty());
    }

    public static Material Sylvite = new Material.Builder("sylvite")
            .dust()
            .color(0xFFFFFF)
            .buildAndRegister();

    public static Material Gabbro = new Material.Builder("gabbro")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Shale = new Material.Builder("shale")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Claystone = new Material.Builder("claystone")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Limestone = new Material.Builder("limestone")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Conglomerate = new Material.Builder("conglomerate")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Dolomite = new Material.Builder("dolomite")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Chert = new Material.Builder("chert")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Chalk = new Material.Builder("chalk")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Rhyolite = new Material.Builder("rhyolite")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Dacite = new Material.Builder("dacite")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Slate = new Material.Builder("slate")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Phyllite = new Material.Builder("phyllite")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Schist = new Material.Builder("schist")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();

    public static Material Gneiss = new Material.Builder("gneiss")
            .dust()
            .color(0xFFFFFF)
            .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
            // .components()
            .buildAndRegister();
}