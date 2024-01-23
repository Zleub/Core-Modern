package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.dries007.tfc.TerraFirmaCraft;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.rock.Rock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Predicate;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.oreTagPrefix;

public class TFGTagPrefixes {

    public static final Predicate<Material> defaultToolHeadPredicate = (hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));
    public static final Predicate<Material> defaultToolPredicateAndStone = (hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood && mat != GTMaterials.Stone));

    /* Stone Types */
    public static final TagPrefix oreGabbro;
    public static final TagPrefix oreShale;
    public static final TagPrefix oreClaystone;
    public static final TagPrefix oreLimestone;
    public static final TagPrefix oreConglomerate;
    public static final TagPrefix oreDolomite;
    public static final TagPrefix oreChert;
    public static final TagPrefix oreRhyolite;
    public static final TagPrefix oreDacite;
    public static final TagPrefix oreQuartzite;
    public static final TagPrefix oreSlate;
    public static final TagPrefix orePhyllite;
    public static final TagPrefix oreSchist;
    public static final TagPrefix oreGneiss;
    public static final TagPrefix oreMarble;
    public static final TagPrefix oreBasalt;
    public static final TagPrefix oreDiorite;
    public static final TagPrefix oreAndesite;
    public static final TagPrefix oreGranite;
    public static final TagPrefix oreChalk;

    /* Tool Heads */
    public static final TagPrefix toolHeadSword;

    public static final TagPrefix toolHeadPickaxe;

    public static final TagPrefix toolHeadShovel;

    public static final TagPrefix toolHeadAxe;

    public static final TagPrefix toolHeadHoe;

    public static final TagPrefix toolHeadScythe;

    public static final TagPrefix toolHeadFile;

    public static final TagPrefix toolHeadHammer;

    public static final TagPrefix toolHeadSaw;

    public static final TagPrefix toolHeadKnife;

    public static final TagPrefix toolHeadMiningHammer;

    public static final TagPrefix toolHeadButcheryKnife;

    public static final TagPrefix toolHeadSpade;

    public static final TagPrefix toolHeadPropick;

    public static final TagPrefix toolHeadJavelin;

    public static final TagPrefix toolHeadChisel;
    public static final TagPrefix toolHeadMace;

    /* Other */

    public static final TagPrefix ingotDouble;

    public static final TagPrefix poorRawOre;

    public static final TagPrefix richRawOre;


    static {
        // Делаем все в статическом конструкторе
        // Для начала удаляем греговское дерьмо
        // После добавляем наши вкусные стоунтайпы

        TagPrefix.ORES.remove(TagPrefix.ore);
        TagPrefix.ORES.remove(TagPrefix.oreDeepslate);
        TagPrefix.ORES.remove(TagPrefix.oreTuff);
        TagPrefix.ORES.remove(TagPrefix.oreSand);
        TagPrefix.ORES.remove(TagPrefix.oreRedSand);
        TagPrefix.ORES.remove(TagPrefix.oreGravel);
        TagPrefix.ORES.remove(TagPrefix.oreEndstone);

        TagPrefix.ORES.remove(TagPrefix.oreBasalt);
        TagPrefix.ORES.remove(TagPrefix.oreAndesite);
        TagPrefix.ORES.remove(TagPrefix.oreDiorite);
        TagPrefix.ORES.remove(TagPrefix.oreGranite);

        // Другое
        TagPrefix.PREFIXES.remove("rawOreBlock");

        /* Stone Types */

        oreGabbro = registerOreTagPrefix(Rock.GABBRO);
        oreShale = registerOreTagPrefix(Rock.SHALE);
        oreClaystone = registerOreTagPrefix(Rock.CLAYSTONE);
        oreLimestone = registerOreTagPrefix(Rock.LIMESTONE);
        oreConglomerate = registerOreTagPrefix(Rock.CONGLOMERATE);
        oreDolomite = registerOreTagPrefix(Rock.DOLOMITE);
        oreChert = registerOreTagPrefix(Rock.CHERT);
        oreRhyolite = registerOreTagPrefix(Rock.RHYOLITE);
        oreDacite = registerOreTagPrefix(Rock.DACITE);
        oreQuartzite = registerOreTagPrefix(Rock.QUARTZITE);
        oreSlate = registerOreTagPrefix(Rock.SLATE);
        orePhyllite = registerOreTagPrefix(Rock.PHYLLITE);
        oreSchist = registerOreTagPrefix(Rock.SCHIST);
        oreGneiss = registerOreTagPrefix(Rock.GNEISS);
        oreMarble = registerOreTagPrefix(Rock.MARBLE);
        oreBasalt = registerOreTagPrefix(Rock.BASALT);
        oreDiorite = registerOreTagPrefix(Rock.DIORITE);
        oreAndesite = registerOreTagPrefix(Rock.ANDESITE);
        oreGranite = registerOreTagPrefix(Rock.GRANITE);
        oreChalk = registerOreTagPrefix(Rock.CHALK);

        /* Tool Heads */

        toolHeadSword = new TagPrefix("swordHead")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .defaultTagPath("sword_heads/%s")
                .unformattedTagPath("sword_heads")
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadSword)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadPickaxe = new TagPrefix("pickaxeHead")
                .defaultTagPath("pickaxe_heads/%s")
                .unformattedTagPath("pickaxe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadPickaxe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadShovel = new TagPrefix("shovelHead")
                .defaultTagPath("shovel_heads/%s")
                .unformattedTagPath("shovel_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadShovel)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolHeadPredicate);

        toolHeadAxe = new TagPrefix("axeHead")
                .defaultTagPath("axe_heads/%s")
                .unformattedTagPath("axe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadAxe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolHeadPredicate);

        toolHeadHoe = new TagPrefix("hoeHead")
                .defaultTagPath("hoe_heads/%s")
                .unformattedTagPath("hoe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadHoe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolHeadPredicate);

        toolHeadScythe = new TagPrefix("scytheHead")
                .defaultTagPath("scythe_heads/%s")
                .unformattedTagPath("scythe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadScythe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadFile = new TagPrefix("fileHead")
                .defaultTagPath("file_heads/%s")
                .unformattedTagPath("file_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadFile)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadHammer = new TagPrefix("hammerHead")
                .defaultTagPath("hammer_heads/%s")
                .unformattedTagPath("hammer_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadHammer)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolHeadPredicate);

        toolHeadSaw = new TagPrefix("sawHead")
                .defaultTagPath("saw_heads/%s")
                .unformattedTagPath("saw_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadSaw)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadKnife = new TagPrefix("knifeHead")
                .defaultTagPath("knife_heads/%s")
                .unformattedTagPath("knife_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadKnife)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolHeadPredicate);

        toolHeadButcheryKnife = new TagPrefix("butcheryKnifeHead")
                .defaultTagPath("butchery_knife_heads/%s")
                .unformattedTagPath("butchery_knife_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadButcheryKnife)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadMiningHammer = new TagPrefix("miningHammerHead")
                .defaultTagPath("mining_hammer_heads/%s")
                .unformattedTagPath("mining_hammer_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadMiningHammer)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadSpade = new TagPrefix("spadeHead")
                .defaultTagPath("spade_heads/%s")
                .unformattedTagPath("spade_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadSpade)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(defaultToolPredicateAndStone);

        toolHeadPropick = new TagPrefix("propickHead")
                .defaultTagPath("propick_heads/%s")
                .unformattedTagPath("propick_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadPropick)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        toolHeadJavelin = new TagPrefix("javelinHead")
                .defaultTagPath("javelin_heads/%s")
                .unformattedTagPath("javelin_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadJavelin)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        toolHeadChisel = new TagPrefix("chiselHead")
                .defaultTagPath("chisel_heads/%s")
                .unformattedTagPath("chisel_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadChisel)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        toolHeadMace = new TagPrefix("maceHead")
                .defaultTagPath("mace_heads/%s")
                .unformattedTagPath("mace_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadMace)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        /* Other */

        ingotDouble = new TagPrefix("doubleIngot")
                .defaultTagPath("double_ingots/%s")
                .unformattedTagPath("double_ingots")
                .materialAmount(GTValues.M)
                .materialIconType(MaterialIconType.ingotDouble)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.GENERATE_DOUBLE_INGOTS));

        /* Other */
        poorRawOre = new TagPrefix("poor_raw", true)
                .idPattern("poor_raw_%s")
                .defaultTagPath("poor_raw_materials/%s")
                .unformattedTagPath("poor_raw_materials")
                .materialIconType(TFGMaterialIconType.poorRawOre)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(hasOreProperty);

        richRawOre = new TagPrefix("rich_raw", true)
                .idPattern("rich_raw_%s")
                .defaultTagPath("rich_raw_materials/%s")
                .unformattedTagPath("rich_raw_materials")
                .materialIconType(TFGMaterialIconType.richRawOre)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(hasOreProperty);

        /* Tag Fixes */
        TagPrefix.toolHeadBuzzSaw.generationCondition(hasNoCraftingToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Stone && mat != GTMaterials.Wood));
        TagPrefix.toolHeadScrewdriver.generationCondition(hasNoCraftingToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_LONG_ROD) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Stone && mat != GTMaterials.Wood));
        TagPrefix.toolHeadDrill.generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Stone && mat != GTMaterials.Wood));
        TagPrefix.toolHeadChainsaw.generationCondition(hasNoCraftingToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Stone && mat != GTMaterials.Wood));
        TagPrefix.toolHeadWrench.generationCondition(hasNoCraftingToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Stone && mat != GTMaterials.Wood));

        TagPrefix.plate.defaultTagPath("sheets/%s");
        TagPrefix.plateDouble.defaultTagPath("double_sheets/%s");

        TagPrefix.frameGt.unformattedTagPath("frames");

        TagPrefix.wireGtSingle.defaultTagPath("single_wires/%s");
        TagPrefix.wireGtSingle.unformattedTagPath("single_wires");
        TagPrefix.wireGtDouble.defaultTagPath("double_wires/%s");
        TagPrefix.wireGtDouble.unformattedTagPath("double_wires");
        TagPrefix.wireGtQuadruple.defaultTagPath("quadruple_wires/%s");
        TagPrefix.wireGtQuadruple.unformattedTagPath("quadruple_wires");
        TagPrefix.wireGtOctal.defaultTagPath("octal_wires/%s");
        TagPrefix.wireGtOctal.unformattedTagPath("octal_wires");
        TagPrefix.wireGtHex.defaultTagPath("hex_wires/%s");
        TagPrefix.wireGtHex.unformattedTagPath("hex_wires");

        TagPrefix.cableGtSingle.defaultTagPath("single_cables/%s");
        TagPrefix.cableGtSingle.unformattedTagPath("single_cables");
        TagPrefix.cableGtDouble.defaultTagPath("double_cables/%s");
        TagPrefix.cableGtDouble.unformattedTagPath("double_cables");
        TagPrefix.cableGtQuadruple.defaultTagPath("quadruple_cables/%s");
        TagPrefix.cableGtQuadruple.unformattedTagPath("quadruple_cables");
        TagPrefix.cableGtOctal.defaultTagPath("octal_cables/%s");
        TagPrefix.cableGtOctal.unformattedTagPath("octal_cables");
        TagPrefix.cableGtHex.defaultTagPath("hex_cables/%s");
        TagPrefix.cableGtHex.unformattedTagPath("hex_cables");

        TagPrefix.pipeTinyFluid.defaultTagPath("tiny_fluid_pipes/%s");
        TagPrefix.pipeTinyFluid.unformattedTagPath("tiny_fluid_pipes");
        TagPrefix.pipeSmallFluid.defaultTagPath("small_fluid_pipes/%s");
        TagPrefix.pipeSmallFluid.unformattedTagPath("small_fluid_pipes");
        TagPrefix.pipeNormalFluid.defaultTagPath("normal_fluid_pipes/%s");
        TagPrefix.pipeNormalFluid.unformattedTagPath("normal_fluid_pipes");
        TagPrefix.pipeLargeFluid.defaultTagPath("large_fluid_pipes/%s");
        TagPrefix.pipeLargeFluid.unformattedTagPath("large_fluid_pipes");
        TagPrefix.pipeHugeFluid.defaultTagPath("huge_fluid_pipes/%s");
        TagPrefix.pipeHugeFluid.unformattedTagPath("huge_fluid_pipes");
        TagPrefix.pipeQuadrupleFluid.defaultTagPath("quadruple_fluid_pipes/%s");
        TagPrefix.pipeQuadrupleFluid.unformattedTagPath("quadruple_fluid_pipes");
        TagPrefix.pipeNonupleFluid.defaultTagPath("nonuple_fluid_pipes/%s");
        TagPrefix.pipeNonupleFluid.unformattedTagPath("nonuple_fluid_pipes");

        TagPrefix.pipeSmallItem.defaultTagPath("small_item_pipes/%s");
        TagPrefix.pipeSmallItem.unformattedTagPath("small_item_pipes");
        TagPrefix.pipeNormalItem.defaultTagPath("normal_item_pipes/%s");
        TagPrefix.pipeNormalItem.unformattedTagPath("normal_item_pipes");
        TagPrefix.pipeLargeItem.defaultTagPath("large_item_pipes/%s");
        TagPrefix.pipeLargeItem.unformattedTagPath("large_item_pipes");
        TagPrefix.pipeHugeItem.defaultTagPath("huge_item_pipes/%s");
        TagPrefix.pipeHugeItem.unformattedTagPath("huge_item_pipes");

        TagPrefix.pipeSmallRestrictive.defaultTagPath("small_restrictive_pipes/%s");
        TagPrefix.pipeSmallRestrictive.unformattedTagPath("small_restrictive_pipes");
        TagPrefix.pipeNormalRestrictive.defaultTagPath("normal_restrictive_pipes/%s");
        TagPrefix.pipeNormalRestrictive.unformattedTagPath("normal_restrictive_pipes");
        TagPrefix.pipeLargeRestrictive.defaultTagPath("large_restrictive_pipes/%s");
        TagPrefix.pipeLargeRestrictive.unformattedTagPath("large_restrictive_pipes");
        TagPrefix.pipeHugeRestrictive.defaultTagPath("huge_restrictive_pipes/%s");
        TagPrefix.pipeHugeRestrictive.unformattedTagPath("huge_restrictive_pipes");

        TagPrefix.toolHeadDrill.defaultTagPath("drill_heads/%s");
        TagPrefix.toolHeadDrill.unformattedTagPath("drill_heads");

        TagPrefix.toolHeadChainsaw.defaultTagPath("chainsaw_heads/%s");
        TagPrefix.toolHeadChainsaw.unformattedTagPath("chainsaw_heads");

        TagPrefix.toolHeadBuzzSaw.defaultTagPath("buzz_saw_heads/%s");
        TagPrefix.toolHeadBuzzSaw.unformattedTagPath("buzz_saw_heads");

        TagPrefix.toolHeadWrench.defaultTagPath("wrench_tips/%s");
        TagPrefix.toolHeadWrench.unformattedTagPath("wrench_tips");

        TagPrefix.toolHeadScrewdriver.defaultTagPath("screwdriver_tips/%s");
        TagPrefix.toolHeadScrewdriver.unformattedTagPath("screwdriver_tips");

        TagPrefix.turbineBlade.defaultTagPath("turbine_blades/%s");
        TagPrefix.turbineBlade.unformattedTagPath("turbine_blades");
    }

    public static void init() {}

    private static TagPrefix registerOreTagPrefix(Rock rockType) {
        return oreTagPrefix(rockType.getSerializedName(), BlockTags.MINEABLE_WITH_PICKAXE)
                .registerOre(
                        () -> TFCBlocks.ROCK_BLOCKS.get(rockType).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState(),
                        () -> GTCEuAPI.materialManager.getMaterial(rockType.getSerializedName()),
                        BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F),
                        new ResourceLocation(TerraFirmaCraft.MOD_ID, "block/rock/raw/" + rockType.getSerializedName())
                );
    }

}
