package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.hasOreProperty;
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

    public static final TagPrefix oreGabbro = TagPrefix.oreTagPrefix("tfc_gabbro")
            .langValue("Gabbro %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/dacite")).defaultBlockState());

    /*
    public static final TagPrefix oreShale = TagPrefix.oreTagPrefix("tfc_shale")
            .langValue("Shale %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/shale")).defaultBlockState());
    public static final TagPrefix oreClaystone = TagPrefix.oreTagPrefix("tfc_claystone")
            .langValue("Claystone %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/claystone")).defaultBlockState());

    public static final TagPrefix oreLimestone = TagPrefix.oreTagPrefix("tfc_limestone")
            .langValue("Limestone %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/limestone")).defaultBlockState());

    public static final TagPrefix oreConglomerate = TagPrefix.oreTagPrefix("tfc_conglomerate")
            .langValue("Conglomerate %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/conglomerate")).defaultBlockState());

    public static final TagPrefix oreDolomite = TagPrefix.oreTagPrefix("tfc_dolomite")
            .langValue("Dolomite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/dolomite")).defaultBlockState());

    public static final TagPrefix oreChert = TagPrefix.oreTagPrefix("tfc_chert")
            .langValue("Chert %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/chert")).defaultBlockState());

    public static final TagPrefix oreRhyolite = TagPrefix.oreTagPrefix("tfc_rhyolite")
            .langValue("Rhyolite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/rhyolite")).defaultBlockState());

    public static final TagPrefix oreDacite = TagPrefix.oreTagPrefix("tfc_dacite")
            .langValue("Dacite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/dacite")).defaultBlockState());

    public static final TagPrefix oreQuartzite = TagPrefix.oreTagPrefix("tfc_quartzite")
            .langValue("Quartzite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/quartzite")).defaultBlockState());

    public static final TagPrefix oreSlate = TagPrefix.oreTagPrefix("tfc_slate")
            .langValue("Slate %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/slate")).defaultBlockState());

    public static final TagPrefix orePhyllite = TagPrefix.oreTagPrefix("tfc_phyllite")
            .langValue("Phyllite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/phyllite")).defaultBlockState());

    public static final TagPrefix oreSchist = TagPrefix.oreTagPrefix("tfc_schist")
            .langValue("Schist %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/schist")).defaultBlockState());

    public static final TagPrefix oreGneiss = TagPrefix.oreTagPrefix("tfc_gneiss")
            .langValue("Gneiss %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/gneiss")).defaultBlockState());

    public static final TagPrefix oreMarble = TagPrefix.oreTagPrefix("tfc_marble")
            .langValue("Marble %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/marble")).defaultBlockState());

    public static final TagPrefix oreBasalt = TagPrefix.oreTagPrefix("tfc_basalt")
            .langValue("Basalt %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/basalt")).defaultBlockState());

    public static final TagPrefix oreDiorite = TagPrefix.oreTagPrefix("tfc_diorite")
            .langValue("Diorite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/diorite")).defaultBlockState());

    public static final TagPrefix oreAndesite = TagPrefix.oreTagPrefix("tfc_andesite")
            .langValue("Andesite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/andesite")).defaultBlockState());

    public static final TagPrefix oreGranite = TagPrefix.oreTagPrefix("tfc_granite")
            .langValue("Granite %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/granite")).defaultBlockState());

    public static final TagPrefix oreChalk = TagPrefix.oreTagPrefix("tfc_chalk")
            .langValue("Chalk %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "raw/rock/chalk")).defaultBlockState());*/
}

