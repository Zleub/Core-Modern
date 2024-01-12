package su.terrafirmagreg.core.compat.gtceu;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTElements;
import net.dries007.tfc.common.items.TFCItems;
import net.dries007.tfc.util.Metal;
import su.terrafirmagreg.core.compat.gtceu.properties.TFCProperty;

import java.util.Arrays;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.CERTUS;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.ROUGH;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags.*;

public class TFGMaterials {

    /* Кастомные материалы */

    public static final Material Latex = new Material.Builder("latex")
            .fluid()
            .color(0xFBB982)
            .buildAndRegister();

    public static final Material Fluix = new Material.Builder("fluix")
            .fluid()
            .gem(1)
            .color(0xD2D2E6).iconSet(CERTUS)
            .flags(GENERATE_PLATE, NO_SMELTING, CRYSTALLIZABLE, DISABLE_DECOMPOSITION, FORCE_GENERATE_BLOCK)
            .components(Silicon, 1, Oxygen, 2)
            .color(0x57448d)
            .buildAndRegister();

    /* Материалы типов камня */

    public static final Material Gabbro = new Material.Builder("gabbro")
            .dust(2)
            .color(0x7F8081).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Shale = new Material.Builder("shale")
            .dust(2)
            .color(0x686567).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Claystone = new Material.Builder("claystone")
            .dust(2)
            .color(0xAF9377).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();
    public static final Material Limestone = new Material.Builder("limestone")
            .dust(2)
            .color(0xA09885).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Conglomerate = new Material.Builder("conglomerate")
            .dust(2)
            .color(0xA3977F).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Dolomite = new Material.Builder("dolomite")
            .dust(2)
            .color(0x515155).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Chert = new Material.Builder("chert")
            .dust(2)
            .color(0x7A6756).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Chalk = new Material.Builder("chalk")
            .dust(2)
            .color(0xA4A39F).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Rhyolite = new Material.Builder("rhyolite")
            .dust(2)
            .color(0x726D69).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Dacite = new Material.Builder("dacite")
            .dust(2)
            .color(0x979797).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Slate = new Material.Builder("slate")
            .dust(2)
            .color(0x989287).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Phyllite = new Material.Builder("phyllite")
            .dust(2)
            .color(0x706B61).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Schist = new Material.Builder("schist")
            .dust(2)
            .color(0x6E735C).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    public static final Material Gneiss = new Material.Builder("gneiss")
            .dust(2)
            .color(0x6A6D60).secondaryColor(0x898989).iconSet(ROUGH)
            .flags(MORTAR_GRINDABLE, NO_SMASHING, NO_SMELTING)
            .buildAndRegister();

    /* Материалы металлов TFC */

    /* TFC Metals */

    public static Material Unknown = new Material.Builder("unknown")
            .ingot()
            .fluid()
            .color(0x2F2B27)
            .buildAndRegister();

    public static Material PigIron = new Material.Builder("pig_iron")
            .ingot()
            .fluid()
            .color(0x6A595C)
            .buildAndRegister();

    public static Material HighCarbonSteel = new Material.Builder("high_carbon_steel")
            .ingot()
            .fluid()
            .color(0x5F5F5F)
            .buildAndRegister();
    public static Material HighCarbonBlackSteel = new Material.Builder("high_carbon_black_steel")
            .ingot()
            .fluid()
            .color(0x111111)
            .buildAndRegister();

    public static Material HighCarbonRedSteel = new Material.Builder("high_carbon_red_steel")
            .ingot()
            .fluid()
            .color(0x700503)
            .buildAndRegister();

    public static Material HighCarbonBlueSteel = new Material.Builder("high_carbon_blue_steel")
            .ingot()
            .fluid()
            .color(0x2D5596)
            .buildAndRegister();

    public static Material WeakSteel = new Material.Builder("weak_steel")
            .ingot()
            .fluid()
            .color(0x111111)
            .buildAndRegister();

    public static Material WeakRedSteel = new Material.Builder("weak_red_steel")
            .ingot()
            .fluid()
            .color(0x700503)
            .buildAndRegister();

    public static Material WeakBlueSteel = new Material.Builder("weak_blue_steel")
            .ingot()
            .fluid()
            .color(0x2D5596)
            .buildAndRegister();

    /* Dead */

    public static Material Limonite = new Material.Builder("limonite").buildAndRegister();

    public static Material Bismuthinite = new Material.Builder("bismuthinite").buildAndRegister();

    public static void init() {
        /* TFC Проперти для материалов */
        Copper.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(648, 864, 1080, 1));
        BismuthBronze.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(591, 788, 985, 2));
        Bronze.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(570, 760, 950, 2));
        BlackBronze.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(642, 856, 1070, 2));
        WroughtIron.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, Iron, 3));
        Steel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1232, 1540, 4));
        BlackSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(891, 1188, 1485, 5));
        BlueSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1232, 1540, 6));
        RedSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1232, 1540, 6));

        PigIron.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, 3));
        HighCarbonSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1540, 1232, 3));
        HighCarbonBlackSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1540, 1232, 5));
        HighCarbonRedSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1540, 1232, 5));
        HighCarbonBlueSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1540, 1232, 5));
        WeakSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1540, 1232, 4));
        WeakBlueSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1540, 1232, 5));
        WeakRedSteel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(924, 1540, 1232, 5));
        Unknown.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(240, 320, 400, 1));

        Gold.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(636, 848, 1060, 1));
        Bismuth.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(162, 216, 270, 1));
        Brass.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(558, 744, 930, 2));
        Nickel.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(872, 1162, 1453, 1));
        RoseGold.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(576, 768, 960, 1));
        Silver.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(577, 769, 961, 1));
        Tin.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(138, 184, 230, 1));
        Zinc.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(252, 336, 420, 1));
        SterlingSilver.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(570, 760, 950, 1));
        Iron.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, 3));

        Hematite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, Iron, 3, 90));
        YellowLimonite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, Iron, 3, 90));
        Magnetite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, Iron, 3, 90));
        Pyrite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, Iron, 3, 90));
        Goethite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, Iron, 3, 85));
        Malachite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(138, 184, 1080, Copper, 1, 90));
        Tetrahedrite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(138, 184, 1080, Copper, 1, 90));
        Chalcopyrite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(138, 184, 1080, Copper, 1, 90));
        Cassiterite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(648, 864, 230, Tin, 1, 200));
        CassiteriteSand.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(138, 184, 230, Tin, 1, 150));
        Sphalerite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(138, 184, 420, Zinc, 1, 90));
        Garnierite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(138, 184, 1453, Nickel, 1, 90));

        Redstone.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(240, 320, 460, 1));
        RedAlloy.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(570, 650, 740, 2));
        TinAlloy.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(1000, 1100, 1250, 3));

        Bismuthinite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(162, 216, 270, Bismuth, 1));
        Limonite.setProperty(TFGPropertyKeys.TFC_PROPERTY, new TFCProperty(921, 1228, 1535, Iron, 3, 90));

        /* Игнорирование для некоторых металлов */
        var list = Arrays.asList(PigIron, HighCarbonSteel, HighCarbonBlackSteel, HighCarbonRedSteel, HighCarbonBlueSteel, WeakSteel, WeakBlueSteel, WeakRedSteel);

        for (var item : list) {
            nugget.setIgnored(item);
            dustTiny.setIgnored(item);
            dustSmall.setIgnored(item);
            dust.setIgnored(item);
            block.setIgnored(item);
        }

        ingot.setIgnored(PigIron, () -> TFCItems.METAL_ITEMS.get(Metal.Default.PIG_IRON).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(HighCarbonSteel, () -> TFCItems.METAL_ITEMS.get(Metal.Default.HIGH_CARBON_STEEL).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(HighCarbonBlackSteel, () -> TFCItems.METAL_ITEMS.get(Metal.Default.HIGH_CARBON_BLACK_STEEL).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(HighCarbonRedSteel, () -> TFCItems.METAL_ITEMS.get(Metal.Default.HIGH_CARBON_RED_STEEL).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(HighCarbonBlueSteel, () -> TFCItems.METAL_ITEMS.get(Metal.Default.HIGH_CARBON_BLUE_STEEL).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(WeakSteel, () -> TFCItems.METAL_ITEMS.get(Metal.Default.WEAK_STEEL).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(WeakBlueSteel, () -> TFCItems.METAL_ITEMS.get(Metal.Default.WEAK_BLUE_STEEL).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(WeakRedSteel, () -> TFCItems.METAL_ITEMS.get(Metal.Default.WEAK_RED_STEEL).get(Metal.ItemType.INGOT).get());
        ingot.setIgnored(Unknown, () -> TFCItems.METAL_ITEMS.get(Metal.Default.UNKNOWN).get(Metal.ItemType.INGOT).get());

        /* Имеют двойные слитки */
        Copper.addFlags(GENERATE_DOUBLE_INGOTS);
        BismuthBronze.addFlags(GENERATE_DOUBLE_INGOTS);
        Bronze.addFlags(GENERATE_DOUBLE_INGOTS);
        BlackBronze.addFlags(GENERATE_DOUBLE_INGOTS);
        WroughtIron.addFlags(GENERATE_DOUBLE_INGOTS);
        Steel.addFlags(GENERATE_DOUBLE_INGOTS);
        BlackSteel.addFlags(GENERATE_DOUBLE_INGOTS);
        BlueSteel.addFlags(GENERATE_DOUBLE_INGOTS);
        RedSteel.addFlags(GENERATE_DOUBLE_INGOTS);

        Gold.addFlags(GENERATE_DOUBLE_INGOTS);
        Bismuth.addFlags(GENERATE_DOUBLE_INGOTS);
        Brass.addFlags(GENERATE_DOUBLE_INGOTS);
        Nickel.addFlags(GENERATE_DOUBLE_INGOTS);
        RoseGold.addFlags(GENERATE_DOUBLE_INGOTS);
        Silver.addFlags(GENERATE_DOUBLE_INGOTS);
        Tin.addFlags(GENERATE_DOUBLE_INGOTS);
        Zinc.addFlags(GENERATE_DOUBLE_INGOTS);
        SterlingSilver.addFlags(GENERATE_DOUBLE_INGOTS);

        /* Имеют инструменты и броню TFC */
        Copper.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY, CAN_BE_UNMOLDED);
        BismuthBronze.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY, CAN_BE_UNMOLDED);
        Bronze.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY, CAN_BE_UNMOLDED);
        BlackBronze.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY, CAN_BE_UNMOLDED);
        WroughtIron.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY);
        BlackSteel.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY);
        RedSteel.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY);
        BlueSteel.addFlags(HAS_TFC_TOOL, HAS_TFC_ARMOR, HAS_TFC_UTILITY);

        /* Имеют маленькие куски руды TFC */
        Bismuthinite.addFlags(HAS_SMALL_TFC_ORE);
        Cassiterite.addFlags(HAS_SMALL_TFC_ORE);
        Garnierite.addFlags(HAS_SMALL_TFC_ORE);
        Hematite.addFlags(HAS_SMALL_TFC_ORE);
        Limonite.addFlags(HAS_SMALL_TFC_ORE);
        Magnetite.addFlags(HAS_SMALL_TFC_ORE);
        Malachite.addFlags(HAS_SMALL_TFC_ORE);
        Sphalerite.addFlags(HAS_SMALL_TFC_ORE);
        Tetrahedrite.addFlags(HAS_SMALL_TFC_ORE);

        /* Имеют маленькие чистые куски руды TFC */
        Copper.addFlags(HAS_SMALL_NATIVE_TFC_ORE);
        Gold.addFlags(HAS_SMALL_NATIVE_TFC_ORE);
        Silver.addFlags(HAS_SMALL_NATIVE_TFC_ORE);

        /* Другое */

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

        for (var material : GTRegistries.MATERIALS.values()) {
            var toolProperty = material.getProperty(PropertyKey.TOOL);
            if (toolProperty == null) continue;

            toolProperty.setDurability(toolProperty.getDurability() * 6);
        }

        block.setIgnored(Fluix, AEBlocks.FLUIX_BLOCK);
        dust.setIgnored(Fluix, AEItems.FLUIX_DUST);
        gem.setIgnored(Fluix, AEItems.FLUIX_CRYSTAL);

        block.setIgnored(CertusQuartz, AEBlocks.QUARTZ_BLOCK);
        dust.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_DUST);
        gem.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_CRYSTAL);

        dust.setIgnored(EnderPearl, AEItems.ENDER_DUST);
    }
}
