package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.item.tool.GTToolType.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.EXT2_METAL;

public class TFGMaterials {

    private static final GTToolType[] GT_TOOL_TYPES = new GTToolType[]{
            SWORD,
            PICKAXE,
            SHOVEL,
            AXE,
            HOE,
            MINING_HAMMER,
            SAW,
            HARD_HAMMER,
            // SOFT_MALLET,
            WRENCH,
            FILE,
            CROWBAR,
            SCREWDRIVER,
            // MORTAR,
            WIRE_CUTTER,
            SCYTHE,
            KNIFE,
            BUTCHERY_KNIFE,
            PLUNGER
    };

    public static void init()
    {
        GTMaterials.Bismuth.setProperty(PropertyKey.ORE, new OreProperty());
        GTMaterials.Bismuth.addFlags(EXT2_METAL.toArray(new MaterialFlag[0]));

        GTMaterials.Borax.setProperty(PropertyKey.ORE, new OreProperty());

        GTMaterials.CertusQuartz.addFlags(GENERATE_ROD);
        GTMaterials.NetherQuartz.addFlags(GENERATE_ROD);

        GTMaterials.Nickel.addFlags(GENERATE_ROD, GENERATE_LONG_ROD);
        GTMaterials.BlackSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        GTMaterials.BlueSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        GTMaterials.RedSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        GTMaterials.WroughtIron.addFlags(GENERATE_ROTOR);

        GTMaterials.Copper.addFlags(GENERATE_BOLT_SCREW);
        GTMaterials.DamascusSteel.addFlags(GENERATE_BOLT_SCREW);
        GTMaterials.Duranium.addFlags(GENERATE_BOLT_SCREW);

        GTMaterials.Copper.setProperty(PropertyKey.TOOL, new ToolProperty(1.0F, 1.0F, 128, 2, GT_TOOL_TYPES));
        GTMaterials.BismuthBronze.setProperty(PropertyKey.TOOL, new ToolProperty(1.2F, 2.0F, 178, 2, GT_TOOL_TYPES));
        GTMaterials.Bronze.getProperty(PropertyKey.TOOL).setHarvestSpeed(1.3F);
        GTMaterials.BlackBronze.setProperty(PropertyKey.TOOL, new ToolProperty(1.4F, 2.0F, 228, 2, GT_TOOL_TYPES));
        GTMaterials.BlackSteel.setProperty(PropertyKey.TOOL, new ToolProperty(3.0F, 7.0F, 1000, 3, GT_TOOL_TYPES));

        for (var material : GTRegistries.MATERIALS.values())
        {
            var toolProperty = material.getProperty(PropertyKey.TOOL);
            if (toolProperty == null) continue;

            toolProperty.setDurability(toolProperty.getDurability() * 6);
            toolProperty.setHarvestSpeed(toolProperty.getHarvestSpeed() * 5);
        }
    }

    public static Material Latex = new Material.Builder("latex")
            .fluid()
            .color(0xFBB982)
            .buildAndRegister();

    public static Material Fluix = new Material.Builder("fluix")
            .fluid()
            .color(0xFBB982)
            .buildAndRegister();
}