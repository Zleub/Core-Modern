package su.terrafirmagreg.core.compat.gtceu;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.CERTUS;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.ROUGH;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags.HAS_TFC_TOOL;

public class TFGMaterials {

    public static void init()
    {
        // Имеют инструменты TFC
        Copper.addFlags(HAS_TFC_TOOL);
        BismuthBronze.addFlags(HAS_TFC_TOOL);
        Bronze.addFlags(HAS_TFC_TOOL);
        BlackBronze.addFlags(HAS_TFC_TOOL);
        WroughtIron.addFlags(HAS_TFC_TOOL);
        BlackSteel.addFlags(HAS_TFC_TOOL);
        RedSteel.addFlags(HAS_TFC_TOOL);
        BlueSteel.addFlags(HAS_TFC_TOOL);

        // Другое
        Bismuth.setProperty(PropertyKey.ORE, new OreProperty());
        Bismuth.addFlags(EXT2_METAL.toArray(new MaterialFlag[0]));

        Borax.setProperty(PropertyKey.ORE, new OreProperty());

        CertusQuartz.addFlags(GENERATE_ROD);
        NetherQuartz.addFlags(GENERATE_ROD);

        Nickel.addFlags(GENERATE_ROD, GENERATE_LONG_ROD);
        BlackSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        BlueSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        RedSteel.addFlags(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW);
        WroughtIron.addFlags(GENERATE_ROTOR);

        Copper.addFlags(GENERATE_BOLT_SCREW);
        DamascusSteel.addFlags(GENERATE_BOLT_SCREW);
        Duranium.addFlags(GENERATE_BOLT_SCREW);

        Stone.setProperty(PropertyKey.TOOL, ToolProperty.Builder.of(1.0F, 1.0F, 8, 1, new GTToolType[]{
                GTToolType.AXE,
                GTToolType.HARD_HAMMER,
                GTToolType.HOE,
                GTToolType.KNIFE,
                GTToolType.SHOVEL
        }).build());
        Copper.setProperty(PropertyKey.TOOL, ToolProperty.Builder.of(1.0F, 1.0F, 128, 2).build());
        BismuthBronze.setProperty(PropertyKey.TOOL, ToolProperty.Builder.of(1.2F, 2.0F, 178, 2).build());
        Bronze.getProperty(PropertyKey.TOOL).setHarvestSpeed(1.3F);
        BlackBronze.setProperty(PropertyKey.TOOL, ToolProperty.Builder.of(1.4F, 2.0F, 228, 2).build());
        BlackSteel.setProperty(PropertyKey.TOOL, ToolProperty.Builder.of(3.0F, 7.0F, 1000, 3).build());

        for (var material : GTRegistries.MATERIALS.values())
        {
            var toolProperty = material.getProperty(PropertyKey.TOOL);
            if (toolProperty == null) continue;

            toolProperty.setDurability(toolProperty.getDurability() * 6);
        }

        TagPrefix.block.setIgnored(Fluix, AEBlocks.FLUIX_BLOCK);
        TagPrefix.dust.setIgnored(Fluix, AEItems.FLUIX_DUST);
        TagPrefix.gem.setIgnored(Fluix, AEItems.FLUIX_CRYSTAL);

        TagPrefix.block.setIgnored(CertusQuartz, AEBlocks.QUARTZ_BLOCK);
        TagPrefix.dust.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_DUST);
        TagPrefix.gem.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_CRYSTAL);

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

    /* Stone Type Materials */
    public static Material Gabbro = new Material.Builder("gabbro")
            .dust(2)
            .color(0x7F8081).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Shale = new Material.Builder("shale")
            .dust(2)
            .color(0x686567).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Claystone = new Material.Builder("claystone")
            .dust(2)
            .color(0xAF9377).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();
    public static Material Limestone = new Material.Builder("limestone")
            .dust(2)
            .color(0xA09885).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Conglomerate = new Material.Builder("conglomerate")
            .dust(2)
            .color(0xA3977F).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Dolomite = new Material.Builder("dolomite")
            .dust(2)
            .color(0x515155).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Chert = new Material.Builder("chert")
            .dust(2)
            .color(0x7A6756).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Chalk = new Material.Builder("chalk")
            .dust(2)
            .color(0xA4A39F).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Rhyolite = new Material.Builder("rhyolite")
            .dust(2)
            .color(0x726D69).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Dacite = new Material.Builder("dacite")
            .dust(2)
            .color(0x979797).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Slate = new Material.Builder("slate")
            .dust(2)
            .color(0x989287).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Phyllite = new Material.Builder("phyllite")
            .dust(2)
            .color(0x706B61).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Schist = new Material.Builder("schist")
            .dust(2)
            .color(0x6E735C).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static Material Gneiss = new Material.Builder("gneiss")
            .dust(2)
            .color(0x6A6D60).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

}
