package exception.terrafirmagreg.compat.gregtech;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.CERTUS;
import static com.gregtechceu.gtceu.api.item.tool.GTToolType.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

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

        TagPrefix.block.setIgnored(TFGMaterials.Fluix, AEBlocks.FLUIX_BLOCK);
        TagPrefix.dust.setIgnored(TFGMaterials.Fluix, AEItems.FLUIX_DUST);
        TagPrefix.gem.setIgnored(TFGMaterials.Fluix, AEItems.FLUIX_CRYSTAL);

        TagPrefix.block.setIgnored(GTMaterials.CertusQuartz, AEBlocks.QUARTZ_BLOCK);
        TagPrefix.dust.setIgnored(GTMaterials.CertusQuartz, AEItems.CERTUS_QUARTZ_DUST);
        TagPrefix.gem.setIgnored(GTMaterials.CertusQuartz, AEItems.CERTUS_QUARTZ_CRYSTAL);

        TagPrefix.dust.setIgnored(EnderPearl, AEItems.ENDER_DUST);
    }

    public static Material Latex = new Material.Builder("latex")
            .fluid()
            .color(0xFBB982)
            .buildAndRegister();

    public static Material Fluix = new Material.Builder("fluix")
            .fluid()
            .gem(1)
            .color(0xD2D2E6).iconSet(CERTUS)
            .flags(GENERATE_PLATE, NO_SMELTING, CRYSTALLIZABLE, DISABLE_DECOMPOSITION, FORCE_GENERATE_BLOCK)
            .components(Silicon, 1, Oxygen, 2)
            .color(0x57448d)
            .buildAndRegister();
}