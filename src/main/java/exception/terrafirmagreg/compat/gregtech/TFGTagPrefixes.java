package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.hasOreProperty;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.hasToolProperty;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.LoaderType.FORGE;

public class TFGTagPrefixes {
    public static void init() {}

    /* Raw Ores */

    public static final TagPrefix poorRawOre = new TagPrefix("poor_raw", true)
            .defaultTagPath(FORGE, "poor_raw_materials/%s")
            .unformattedTagPath(FORGE, "poor_raw_materials")
            .langValue("Poor Raw %s")
            .materialIconType(TFGMaterialIconType.poorRawOre)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasOreProperty);

    public static final TagPrefix richRawOre = new TagPrefix("rich_raw", true)
            .defaultTagPath(FORGE, "rich_raw_materials/%s")
            .unformattedTagPath(FORGE, "rich_raw_materials")
            .langValue("Rich Raw %s")
            .materialIconType(TFGMaterialIconType.richRawOre)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasOreProperty);

    /* Tool Heads */

    public static final TagPrefix toolHeadMiningHammer = new TagPrefix("miningHammerHead")
            .defaultTagPath(FORGE, "mining_hammer_heads/%s")
            .unformattedTagPath(FORGE, "mining_hammer_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Mining Hammer Head")
            .materialAmount(GTValues.M * 6)
            .maxStackSize(16)
            .materialIconType(TFGMaterialIconType.toolHeadMiningHammer)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadSword = new TagPrefix("swordHead")
            .defaultTagPath(FORGE, "sword_heads/%s")
            .unformattedTagPath(FORGE, "sword_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Sword Head")
            .materialAmount(GTValues.M * 2)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadSword)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadPickaxe = new TagPrefix("pickaxeHead")
            .defaultTagPath(FORGE, "pickaxe_heads/%s")
            .unformattedTagPath(FORGE, "pickaxe_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Pickaxe Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadPickaxe)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadShovel = new TagPrefix("shovelHead")
            .defaultTagPath(FORGE, "shovel_heads/%s")
            .unformattedTagPath(FORGE, "shovel_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Shovel Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadShovel)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadAxe = new TagPrefix("axeHead")
            .defaultTagPath(FORGE, "axe_heads/%s")
            .unformattedTagPath(FORGE, "axe_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Axe Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadAxe)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadHoe = new TagPrefix("hoeHead")
            .defaultTagPath(FORGE, "hoe_heads/%s")
            .unformattedTagPath(FORGE, "hoe_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Hoe Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadHoe)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadScythe = new TagPrefix("scytheHead")
            .defaultTagPath(FORGE, "scythe_heads/%s")
            .unformattedTagPath(FORGE, "scythe_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Scythe Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadScythe)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadFile = new TagPrefix("fileHead")
            .defaultTagPath(FORGE, "file_heads/%s")
            .unformattedTagPath(FORGE, "file_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s File Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadFile)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadHammer = new TagPrefix("hammerHead")
            .defaultTagPath(FORGE, "hammer_heads/%s")
            .unformattedTagPath(FORGE, "hammer_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Hammer Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadHammer)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadSaw = new TagPrefix("sawHead")
            .defaultTagPath(FORGE, "saw_heads/%s")
            .unformattedTagPath(FORGE, "saw_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Saw Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(MaterialIconType.toolHeadSaw)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadKnife = new TagPrefix("knifeHead")
            .defaultTagPath(FORGE, "knife_heads/%s")
            .unformattedTagPath(FORGE, "knife_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Knife Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(TFGMaterialIconType.toolHeadKnife)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    public static final TagPrefix toolHeadButcheryKnife = new TagPrefix("knifeButcheryHead")
            .defaultTagPath(FORGE, "butchery_knife_heads/%s")
            .unformattedTagPath(FORGE, "butchery_knife_heads")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Butchery Knife Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(TFGMaterialIconType.toolHeadButcheryKnife)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER)));

    // Возможно включим если сделаем свои инструменты
    // похожие на тфкшные (с функционалом тфк инструментов, а пока без надобности)
    /*
    public static final TagPrefix toolHeadPropick = new TagPrefix("propickHead")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Propick Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(TFGMaterialIconType.toolHeadPropick)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE)));

    public static final TagPrefix toolHeadChisel = new TagPrefix("chiselHead")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Chisel Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(TFGMaterialIconType.toolHeadChisel)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE)));

    public static final TagPrefix toolHeadJavelin = new TagPrefix("javelinHead")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Javelin Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(TFGMaterialIconType.toolHeadChisel)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE)));

    public static final TagPrefix toolHeadMace = new TagPrefix("maceHead")
            .itemTable(() -> GTItems.MATERIAL_ITEMS)
            .langValue("%s Mace Head")
            .materialAmount(GTValues.M)
            .maxStackSize(16)
            .materialIconType(TFGMaterialIconType.toolHeadMace)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE)));

        */

    /* Stone Types */

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

