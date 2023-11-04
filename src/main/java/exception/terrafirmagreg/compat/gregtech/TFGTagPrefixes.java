package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.rock.Rock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.hasOreProperty;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.LoaderType.FABRIC;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.LoaderType.FORGE;

public class TFGTagPrefixes {
    public static void init() {}

    public static final TagPrefix poorRawOre = new TagPrefix("poor_raw", true)
            .defaultTagPath(FORGE, "poor_raw_materials/%s")
            .langValue("Poor Raw %s")
            .materialIconType(TFGMaterialIconType.poorRawOre)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasOreProperty);

    public static final TagPrefix richRawOre = new TagPrefix("rich_raw", true)
            .defaultTagPath(FORGE, "rich_raw_materials/%s")
            .langValue("Rich Raw %s")
            .materialIconType(TFGMaterialIconType.richRawOre)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasOreProperty);

    public static final TagPrefix oreGabbro = new TagPrefix("tfc_gabbro")
            .langValue("Gabbro %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.GABBRO).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);


    public static final TagPrefix oreShale = new TagPrefix("tfc_shale")
            .langValue("Shale %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.SHALE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreClaystone = new TagPrefix("tfc_claystone")
            .langValue("Claystone %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.CLAYSTONE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreLimestone = new TagPrefix("tfc_limestone")
            .langValue("Limestone %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.LIMESTONE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreConglomerate = new TagPrefix("tfc_conglomerate")
            .langValue("Conglomerate %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.CONGLOMERATE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreDolomite = new TagPrefix("tfc_dolomite")
            .langValue("Dolomite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.DOLOMITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreChert = new TagPrefix("tfc_chert")
            .langValue("Chert %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.CHERT).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreRhyolite = new TagPrefix("tfc_rhyolite")
            .langValue("Rhyolite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.RHYOLITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreDacite = new TagPrefix("tfc_dacite")
            .langValue("Dacite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.DACITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreQuartzite = new TagPrefix("tfc_quartzite")
            .langValue("Quartzite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.QUARTZITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreSlate = new TagPrefix("tfc_slate")
            .langValue("Slate %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.SLATE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix orePhyllite = new TagPrefix("tfc_phyllite")
            .langValue("Phyllite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.PHYLLITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreSchist = new TagPrefix("tfc_schist")
            .langValue("Schist %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.SCHIST).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreGneiss = new TagPrefix("tfc_gneiss")
            .langValue("Gneiss %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.GNEISS).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreMarble = new TagPrefix("tfc_marble")
            .langValue("Marble %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.MARBLE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreBasalt = new TagPrefix("tfc_basalt")
            .langValue("Basalt %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.BASALT).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreDiorite = new TagPrefix("tfc_diorite")
            .langValue("Diorite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.DIORITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreAndesite = new TagPrefix("tfc_andesite")
            .langValue("Andesite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.ANDESITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);

    public static final TagPrefix oreGranite = new TagPrefix("tfc_granite")
            .langValue("Granite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> TFCBlocks.ROCK_BLOCKS.get(Rock.GRANITE).get(Rock.BlockType.RAW).get().defaultBlockState(),
                    false, MapColor.STONE, SoundType.STONE, false);
}

