package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
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
import su.terrafirmagreg.core.TerraFirmaGreg;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.oreTagPrefix;

public class TFGTagPrefixes {

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

        var defaultToolHeadPredicate = (hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));
        var defaultToolPredicateAndStone = (hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood && mat != GTMaterials.Stone));

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

        TagPrefix.plate.defaultTagPath("sheets/%s");
        TagPrefix.plateDouble.defaultTagPath("double_sheets/%s");

        TagPrefix.rawOre.unformattedTagPath("raw_materials");

        TagPrefix.block.unformattedTagPath("material_blocks");
        TagPrefix.rawOreBlock.unformattedTagPath("raw_blocks");
        TagPrefix.frameGt.unformattedTagPath("frame_blocks");

        TagPrefix.wireGtSingle.defaultTagPath("wires/single/%s");
        TagPrefix.wireGtSingle.unformattedTagPath("wires/single");
        TagPrefix.wireGtDouble.defaultTagPath("wires/double/%s");
        TagPrefix.wireGtDouble.unformattedTagPath("wires/double");
        TagPrefix.wireGtQuadruple.defaultTagPath("wires/quadruple/%s");
        TagPrefix.wireGtQuadruple.unformattedTagPath("wires/quadruple");
        TagPrefix.wireGtOctal.defaultTagPath("wires/octal/%s");
        TagPrefix.wireGtOctal.unformattedTagPath("wires/octal");
        TagPrefix.wireGtHex.defaultTagPath("wires/hex/%s");
        TagPrefix.wireGtHex.unformattedTagPath("wires/hex");

        TagPrefix.cableGtSingle.defaultTagPath("cables/single/%s");
        TagPrefix.cableGtSingle.unformattedTagPath("cables/single");
        TagPrefix.cableGtDouble.defaultTagPath("cables/double/%s");
        TagPrefix.cableGtDouble.unformattedTagPath("cables/double");
        TagPrefix.cableGtQuadruple.defaultTagPath("cables/double/%s");
        TagPrefix.cableGtQuadruple.unformattedTagPath("cables/quadruple");
        TagPrefix.cableGtOctal.defaultTagPath("cables/double/%s");
        TagPrefix.cableGtOctal.unformattedTagPath("cables/octal");
        TagPrefix.cableGtHex.defaultTagPath("cables/double/%s");
        TagPrefix.cableGtHex.unformattedTagPath("cables/hex");

        TagPrefix.pipeTinyFluid.defaultTagPath("fluid_pipes/tiny/%s");
        TagPrefix.pipeTinyFluid.unformattedTagPath("fluid_pipes/tiny");
        TagPrefix.pipeSmallFluid.defaultTagPath("fluid_pipes/small/%s");
        TagPrefix.pipeSmallFluid.unformattedTagPath("fluid_pipes/small");
        TagPrefix.pipeNormalFluid.defaultTagPath("fluid_pipes/normal/%s");
        TagPrefix.pipeNormalFluid.unformattedTagPath("fluid_pipes/normal");
        TagPrefix.pipeLargeFluid.defaultTagPath("fluid_pipes/large/%s");
        TagPrefix.pipeLargeFluid.unformattedTagPath("fluid_pipes/large");
        TagPrefix.pipeHugeFluid.defaultTagPath("fluid_pipes/huge/%s");
        TagPrefix.pipeHugeFluid.unformattedTagPath("fluid_pipes/huge");
        TagPrefix.pipeQuadrupleFluid.defaultTagPath("fluid_pipes/quadruple/%s");
        TagPrefix.pipeQuadrupleFluid.unformattedTagPath("fluid_pipes/quadruple");
        TagPrefix.pipeNonupleFluid.defaultTagPath("fluid_pipes/nonuple/%s");
        TagPrefix.pipeNonupleFluid.unformattedTagPath("fluid_pipes/nonuple");

        TagPrefix.pipeSmallItem.defaultTagPath("item_pipes/small/%s");
        TagPrefix.pipeSmallItem.unformattedTagPath("item_pipes/small");
        TagPrefix.pipeNormalItem.defaultTagPath("item_pipes/normal/%s");
        TagPrefix.pipeNormalItem.unformattedTagPath("item_pipes/normal");
        TagPrefix.pipeLargeItem.defaultTagPath("item_pipes/large/%s");
        TagPrefix.pipeLargeItem.unformattedTagPath("item_pipes/large");
        TagPrefix.pipeHugeItem.defaultTagPath("item_pipes/huge/%s");
        TagPrefix.pipeHugeItem.unformattedTagPath("item_pipes/huge");

        TagPrefix.pipeSmallRestrictive.defaultTagPath("restrictive_pipes/small/%s");
        TagPrefix.pipeSmallRestrictive.unformattedTagPath("restrictive_pipes/small");
        TagPrefix.pipeNormalRestrictive.defaultTagPath("restrictive_pipes/normal/%s");
        TagPrefix.pipeNormalRestrictive.unformattedTagPath("restrictive_pipes/normal");
        TagPrefix.pipeLargeRestrictive.defaultTagPath("restrictive_pipes/large/%s");
        TagPrefix.pipeLargeRestrictive.unformattedTagPath("restrictive_pipes/large");
        TagPrefix.pipeHugeRestrictive.defaultTagPath("restrictive_pipes/huge/%s");
        TagPrefix.pipeHugeRestrictive.unformattedTagPath("restrictive_pipes/huge");

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
