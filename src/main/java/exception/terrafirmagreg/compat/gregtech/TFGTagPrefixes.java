package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.hasOreProperty;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.hasToolProperty;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.LoaderType.FORGE;

public class TFGTagPrefixes {
    public static void init() {
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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .generationCondition(hasToolProperty.and(mat -> mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasProperty(PropertyKey.POLYMER) && mat != GTMaterials.Wood));

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
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/gabbro")).defaultBlockState());

    public static final TagPrefix oreShale = TagPrefix.oreTagPrefix("tfc_shale")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/shale")).defaultBlockState());

    public static final TagPrefix oreClaystone = TagPrefix.oreTagPrefix("tfc_claystone")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/claystone")).defaultBlockState());

    public static final TagPrefix oreLimestone = TagPrefix.oreTagPrefix("tfc_limestone")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/limestone")).defaultBlockState());

    public static final TagPrefix oreConglomerate = TagPrefix.oreTagPrefix("tfc_conglomerate")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/conglomerate")).defaultBlockState());

    public static final TagPrefix oreDolomite = TagPrefix.oreTagPrefix("tfc_dolomite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/dolomite")).defaultBlockState());

    public static final TagPrefix oreChert = TagPrefix.oreTagPrefix("tfc_chert")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/chert")).defaultBlockState());

    public static final TagPrefix oreRhyolite = TagPrefix.oreTagPrefix("tfc_rhyolite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/rhyolite")).defaultBlockState());

    public static final TagPrefix oreDacite = TagPrefix.oreTagPrefix("tfc_dacite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/dacite")).defaultBlockState());

    public static final TagPrefix oreQuartzite = TagPrefix.oreTagPrefix("tfc_quartzite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/quartzite")).defaultBlockState());

    public static final TagPrefix oreSlate = TagPrefix.oreTagPrefix("tfc_slate")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/slate")).defaultBlockState());

    public static final TagPrefix orePhyllite = TagPrefix.oreTagPrefix("tfc_phyllite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/phyllite")).defaultBlockState());

    public static final TagPrefix oreSchist = TagPrefix.oreTagPrefix("tfc_schist")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/schist")).defaultBlockState());

    public static final TagPrefix oreGneiss = TagPrefix.oreTagPrefix("tfc_gneiss")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/gneiss")).defaultBlockState());

    public static final TagPrefix oreMarble = TagPrefix.oreTagPrefix("tfc_marble")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/marble")).defaultBlockState());

    public static final TagPrefix oreBasalt = TagPrefix.oreTagPrefix("tfc_basalt")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/basalt")).defaultBlockState());

    public static final TagPrefix oreDiorite = TagPrefix.oreTagPrefix("tfc_diorite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/diorite")).defaultBlockState());

    public static final TagPrefix oreAndesite = TagPrefix.oreTagPrefix("tfc_andesite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/andesite")).defaultBlockState());

    public static final TagPrefix oreGranite = TagPrefix.oreTagPrefix("tfc_granite")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/granite")).defaultBlockState());

    public static final TagPrefix oreChalk = TagPrefix.oreTagPrefix("tfc_chalk")
            .unformattedTagPath(FORGE, "tfc_stonetype_ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .registerOre(() -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("tfc", "rock/raw/chalk")).defaultBlockState());
}

