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
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/gabbro")).defaultBlockState());

    public static final TagPrefix oreShale = TagPrefix.oreTagPrefix("tfc_shale")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/shale")).defaultBlockState());

    public static final TagPrefix oreClaystone = TagPrefix.oreTagPrefix("tfc_claystone")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/claystone")).defaultBlockState());

    public static final TagPrefix oreLimestone = TagPrefix.oreTagPrefix("tfc_limestone")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/limestone")).defaultBlockState());

    public static final TagPrefix oreConglomerate = TagPrefix.oreTagPrefix("tfc_conglomerate")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/conglomerate")).defaultBlockState());

    public static final TagPrefix oreDolomite = TagPrefix.oreTagPrefix("tfc_dolomite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/dolomite")).defaultBlockState());

    public static final TagPrefix oreChert = TagPrefix.oreTagPrefix("tfc_chert")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/chert")).defaultBlockState());

    public static final TagPrefix oreRhyolite = TagPrefix.oreTagPrefix("tfc_rhyolite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/rhyolite")).defaultBlockState());

    public static final TagPrefix oreDacite = TagPrefix.oreTagPrefix("tfc_dacite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/dacite")).defaultBlockState());

    public static final TagPrefix oreQuartzite = TagPrefix.oreTagPrefix("tfc_quartzite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/quartzite")).defaultBlockState());

    public static final TagPrefix oreSlate = TagPrefix.oreTagPrefix("tfc_slate")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/slate")).defaultBlockState());

    public static final TagPrefix orePhyllite = TagPrefix.oreTagPrefix("tfc_phyllite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/phyllite")).defaultBlockState());

    public static final TagPrefix oreSchist = TagPrefix.oreTagPrefix("tfc_schist")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/schist")).defaultBlockState());

    public static final TagPrefix oreGneiss = TagPrefix.oreTagPrefix("tfc_gneiss")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/gneiss")).defaultBlockState());

    public static final TagPrefix oreMarble = TagPrefix.oreTagPrefix("tfc_marble")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/marble")).defaultBlockState());

    public static final TagPrefix oreBasalt = TagPrefix.oreTagPrefix("tfc_basalt")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/basalt")).defaultBlockState());

    public static final TagPrefix oreDiorite = TagPrefix.oreTagPrefix("tfc_diorite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/diorite")).defaultBlockState());

    public static final TagPrefix oreAndesite = TagPrefix.oreTagPrefix("tfc_andesite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/andesite")).defaultBlockState());

    public static final TagPrefix oreGranite = TagPrefix.oreTagPrefix("tfc_granite")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/granite")).defaultBlockState());

    public static final TagPrefix oreChalk = TagPrefix.oreTagPrefix("tfc_chalk")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/chalk")).defaultBlockState());
}

