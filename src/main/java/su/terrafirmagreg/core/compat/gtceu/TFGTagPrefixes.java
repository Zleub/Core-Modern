package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.rock.Rock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.LoaderType.FORGE;
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

        /* Stone Types */
        oreGabbro = oreTagPrefix("gabbro")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.GABBRO).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreShale = oreTagPrefix("shale")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.SHALE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreClaystone = oreTagPrefix("claystone")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.CLAYSTONE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreLimestone = oreTagPrefix("limestone")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.LIMESTONE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreConglomerate = oreTagPrefix("conglomerate")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.CONGLOMERATE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreDolomite = oreTagPrefix("dolomite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.DOLOMITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreChert = oreTagPrefix("chert")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.CHERT).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreRhyolite = oreTagPrefix("rhyolite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.RHYOLITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreDacite = oreTagPrefix("dacite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.DACITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreQuartzite = oreTagPrefix("quartzite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.QUARTZITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreSlate = oreTagPrefix("slate")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.SLATE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        orePhyllite = oreTagPrefix("phyllite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.PHYLLITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreSchist = oreTagPrefix("schist")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.SCHIST).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreGneiss = oreTagPrefix("gneiss")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.GNEISS).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreMarble = oreTagPrefix("marble")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.MARBLE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreBasalt = oreTagPrefix("basalt")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.BASALT).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreDiorite = oreTagPrefix("diorite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.DIORITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreAndesite = oreTagPrefix("andesite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.ANDESITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreGranite = oreTagPrefix("granite")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.GRANITE).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        oreChalk = oreTagPrefix("chalk")
                .materialIconType(MaterialIconType.ore)
                .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .unificationEnabled(true)
                .generationCondition(hasOreProperty)
                .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.CHALK).get(Rock.BlockType.RAW).orElse(Blocks.STONE).defaultBlockState());

        /* Tool Heads */

        var withoutPolymerAndWood = (hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));
        var withoutPolymerAndWoodStone = (hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood && mat != GTMaterials.Stone));

        toolHeadSword = new TagPrefix("swordHead")
                .defaultTagPath(FORGE, "sword_heads/%s")
                .unformattedTagPath(FORGE, "sword_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadSword)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadPickaxe = new TagPrefix("pickaxeHead")
                .defaultTagPath(FORGE, "pickaxe_heads/%s")
                .unformattedTagPath(FORGE, "pickaxe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadPickaxe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadShovel = new TagPrefix("shovelHead")
                .defaultTagPath(FORGE, "shovel_heads/%s")
                .unformattedTagPath(FORGE, "shovel_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadShovel)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWood);

        toolHeadAxe = new TagPrefix("axeHead")
                .defaultTagPath(FORGE, "axe_heads/%s")
                .unformattedTagPath(FORGE, "axe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadAxe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWood);

        toolHeadHoe = new TagPrefix("hoeHead")
                .defaultTagPath(FORGE, "hoe_heads/%s")
                .unformattedTagPath(FORGE, "hoe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadHoe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWood);

        toolHeadScythe = new TagPrefix("scytheHead")
                .defaultTagPath(FORGE, "scythe_heads/%s")
                .unformattedTagPath(FORGE, "scythe_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadScythe)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadFile = new TagPrefix("fileHead")
                .defaultTagPath(FORGE, "file_heads/%s")
                .unformattedTagPath(FORGE, "file_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadFile)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadHammer = new TagPrefix("hammerHead")
                .defaultTagPath(FORGE, "hammer_heads/%s")
                .unformattedTagPath(FORGE, "hammer_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadHammer)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWood);

        toolHeadSaw = new TagPrefix("sawHead")
                .defaultTagPath(FORGE, "saw_heads/%s")
                .unformattedTagPath(FORGE, "saw_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(MaterialIconType.toolHeadSaw)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadKnife = new TagPrefix("knifeHead")
                .defaultTagPath(FORGE, "knife_heads/%s")
                .unformattedTagPath(FORGE, "knife_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadKnife)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWood);

        toolHeadButcheryKnife = new TagPrefix("butcheryKnifeHead")
                .defaultTagPath(FORGE, "butchery_knife_heads/%s")
                .unformattedTagPath(FORGE, "butchery_knife_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadButcheryKnife)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadMiningHammer = new TagPrefix("miningHammerHead")
                .defaultTagPath(FORGE, "mining_hammer_heads/%s")
                .unformattedTagPath(FORGE, "mining_hammer_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadMiningHammer)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadSpade = new TagPrefix("spadeHead")
                .defaultTagPath(FORGE, "spade_heads/%s")
                .unformattedTagPath(FORGE, "spade_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadSpade)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(withoutPolymerAndWoodStone);

        toolHeadPropick = new TagPrefix("propickHead")
                .defaultTagPath(FORGE, "propick_heads/%s")
                .unformattedTagPath(FORGE, "propick_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadPropick)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        toolHeadJavelin = new TagPrefix("javelinHead")
                .defaultTagPath(FORGE, "javelin_heads/%s")
                .unformattedTagPath(FORGE, "javelin_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadJavelin)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        toolHeadChisel = new TagPrefix("chiselHead")
                .defaultTagPath(FORGE, "chisel_heads/%s")
                .unformattedTagPath(FORGE, "chisel_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadChisel)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        toolHeadMace = new TagPrefix("maceHead")
                .defaultTagPath(FORGE, "mace_heads/%s")
                .unformattedTagPath(FORGE, "mace_heads")
                .itemTable(() -> GTItems.MATERIAL_ITEMS)
                .materialAmount(GTValues.M * 2)
                .maxStackSize(16)
                .materialIconType(TFGMaterialIconType.toolHeadMace)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL));

        /* Other */

        ingotDouble = new TagPrefix("doubleIngot")
                .defaultTagPath(FORGE, "double_ingots/%s")
                .unformattedTagPath(FORGE, "double_ingots")
                .materialAmount(GTValues.M)
                .materialIconType(MaterialIconType.ingotDouble)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(mat -> mat.hasFlag(TFGMaterialFlags.GENERATE_DOUBLE_INGOTS));

        /* Other */
        poorRawOre = new TagPrefix("poor_raw", true)
                .defaultTagPath(FORGE, "poor_raw_materials/%s")
                .unformattedTagPath(FORGE, "poor_raw_materials")
                .materialIconType(TFGMaterialIconType.poorRawOre)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(hasOreProperty);

        richRawOre = new TagPrefix("rich_raw", true)
                .defaultTagPath(FORGE, "rich_raw_materials/%s")
                .unformattedTagPath(FORGE, "rich_raw_materials")
                .materialIconType(TFGMaterialIconType.richRawOre)
                .unificationEnabled(true)
                .generateItem(true)
                .generationCondition(hasOreProperty);

        /* Tag Fixes */

        TagPrefix.plate.defaultTagPath(FORGE, "sheets/%s");
        TagPrefix.plateDouble.defaultTagPath(FORGE, "double_sheets/%s");

        TagPrefix.rawOre.unformattedTagPath(FORGE, "raw_materials");

        TagPrefix.block.unformattedTagPath(FORGE, "material_blocks");
        TagPrefix.rawOreBlock.unformattedTagPath(FORGE, "raw_blocks");
        TagPrefix.frameGt.unformattedTagPath(FORGE, "frame_blocks");

        TagPrefix.wireGtSingle.defaultTagPath(FORGE, "wires/single/%s");
        TagPrefix.wireGtSingle.unformattedTagPath(FORGE, "wires/single");
        TagPrefix.wireGtDouble.defaultTagPath(FORGE, "wires/double/%s");
        TagPrefix.wireGtDouble.unformattedTagPath(FORGE, "wires/double");
        TagPrefix.wireGtQuadruple.defaultTagPath(FORGE, "wires/quadruple/%s");
        TagPrefix.wireGtQuadruple.unformattedTagPath(FORGE, "wires/quadruple");
        TagPrefix.wireGtOctal.defaultTagPath(FORGE, "wires/octal/%s");
        TagPrefix.wireGtOctal.unformattedTagPath(FORGE, "wires/octal");
        TagPrefix.wireGtHex.defaultTagPath(FORGE, "wires/hex/%s");
        TagPrefix.wireGtHex.unformattedTagPath(FORGE, "wires/hex");

        TagPrefix.cableGtSingle.defaultTagPath(FORGE, "cables/single/%s");
        TagPrefix.cableGtSingle.unformattedTagPath(FORGE, "cables/single");
        TagPrefix.cableGtDouble.defaultTagPath(FORGE, "cables/double/%s");
        TagPrefix.cableGtDouble.unformattedTagPath(FORGE, "cables/double");
        TagPrefix.cableGtQuadruple.defaultTagPath(FORGE, "cables/double/%s");
        TagPrefix.cableGtQuadruple.unformattedTagPath(FORGE, "cables/quadruple");
        TagPrefix.cableGtOctal.defaultTagPath(FORGE, "cables/double/%s");
        TagPrefix.cableGtOctal.unformattedTagPath(FORGE, "cables/octal");
        TagPrefix.cableGtHex.defaultTagPath(FORGE, "cables/double/%s");
        TagPrefix.cableGtHex.unformattedTagPath(FORGE, "cables/hex");

        TagPrefix.pipeTinyFluid.defaultTagPath(FORGE, "fluid_pipes/tiny/%s");
        TagPrefix.pipeTinyFluid.unformattedTagPath(FORGE, "fluid_pipes/tiny");
        TagPrefix.pipeSmallFluid.defaultTagPath(FORGE, "fluid_pipes/small/%s");
        TagPrefix.pipeSmallFluid.unformattedTagPath(FORGE, "fluid_pipes/small");
        TagPrefix.pipeNormalFluid.defaultTagPath(FORGE, "fluid_pipes/normal/%s");
        TagPrefix.pipeNormalFluid.unformattedTagPath(FORGE, "fluid_pipes/normal");
        TagPrefix.pipeLargeFluid.defaultTagPath(FORGE, "fluid_pipes/large/%s");
        TagPrefix.pipeLargeFluid.unformattedTagPath(FORGE, "fluid_pipes/large");
        TagPrefix.pipeHugeFluid.defaultTagPath(FORGE, "fluid_pipes/huge/%s");
        TagPrefix.pipeHugeFluid.unformattedTagPath(FORGE, "fluid_pipes/huge");
        TagPrefix.pipeQuadrupleFluid.defaultTagPath(FORGE, "fluid_pipes/quadruple/%s");
        TagPrefix.pipeQuadrupleFluid.unformattedTagPath(FORGE, "fluid_pipes/quadruple");
        TagPrefix.pipeNonupleFluid.defaultTagPath(FORGE, "fluid_pipes/nonuple/%s");
        TagPrefix.pipeNonupleFluid.unformattedTagPath(FORGE, "fluid_pipes/nonuple");

        TagPrefix.pipeSmallItem.defaultTagPath(FORGE, "item_pipes/small/%s");
        TagPrefix.pipeSmallItem.unformattedTagPath(FORGE, "item_pipes/small");
        TagPrefix.pipeNormalItem.defaultTagPath(FORGE, "item_pipes/normal/%s");
        TagPrefix.pipeNormalItem.unformattedTagPath(FORGE, "item_pipes/normal");
        TagPrefix.pipeLargeItem.defaultTagPath(FORGE, "item_pipes/large/%s");
        TagPrefix.pipeLargeItem.unformattedTagPath(FORGE, "item_pipes/large");
        TagPrefix.pipeHugeItem.defaultTagPath(FORGE, "item_pipes/huge/%s");
        TagPrefix.pipeHugeItem.unformattedTagPath(FORGE, "item_pipes/huge");

        TagPrefix.pipeSmallRestrictive.defaultTagPath(FORGE, "restrictive_pipes/small/%s");
        TagPrefix.pipeSmallRestrictive.unformattedTagPath(FORGE, "restrictive_pipes/small");
        TagPrefix.pipeNormalRestrictive.defaultTagPath(FORGE, "restrictive_pipes/normal/%s");
        TagPrefix.pipeNormalRestrictive.unformattedTagPath(FORGE, "restrictive_pipes/normal");
        TagPrefix.pipeLargeRestrictive.defaultTagPath(FORGE, "restrictive_pipes/large/%s");
        TagPrefix.pipeLargeRestrictive.unformattedTagPath(FORGE, "restrictive_pipes/large");
        TagPrefix.pipeHugeRestrictive.defaultTagPath(FORGE, "restrictive_pipes/huge/%s");
        TagPrefix.pipeHugeRestrictive.unformattedTagPath(FORGE, "restrictive_pipes/huge");

        TagPrefix.toolHeadDrill.defaultTagPath(FORGE, "drill_heads/%s");
        TagPrefix.toolHeadDrill.unformattedTagPath(FORGE, "drill_heads");

        TagPrefix.toolHeadChainsaw.defaultTagPath(FORGE, "chainsaw_heads/%s");
        TagPrefix.toolHeadChainsaw.unformattedTagPath(FORGE, "chainsaw_heads");

        TagPrefix.toolHeadBuzzSaw.defaultTagPath(FORGE, "buzz_saw_heads/%s");
        TagPrefix.toolHeadBuzzSaw.unformattedTagPath(FORGE, "buzz_saw_heads");

        TagPrefix.toolHeadWrench.defaultTagPath(FORGE, "wrench_tips/%s");
        TagPrefix.toolHeadWrench.unformattedTagPath(FORGE, "wrench_tips");

        TagPrefix.toolHeadScrewdriver.defaultTagPath(FORGE, "screwdriver_tips/%s");
        TagPrefix.toolHeadScrewdriver.unformattedTagPath(FORGE, "screwdriver_tips");

        TagPrefix.turbineBlade.defaultTagPath(FORGE, "turbine_blades/%s");
        TagPrefix.turbineBlade.unformattedTagPath(FORGE, "turbine_blades");
    }

    public static void init() {
    }

}
