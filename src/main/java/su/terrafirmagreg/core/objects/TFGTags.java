package su.terrafirmagreg.core.objects;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public final class TFGTags {

    public static final class Items {
        public static final TagKey<Item> WoodenSticks = createItemTag("forge:rods/wooden");
        public static final TagKey<Item> RawRockBlocks = createItemTag("tfc:rock/raw");

        public static final TagKey<Item> Ores = createItemTag("forge:ores");
        public static final TagKey<Item> RichRawOres = createItemTag("forge:rich_raw_materials");
        public static final TagKey<Item> NormalRawOres = createItemTag("forge:raw_materials");
        public static final TagKey<Item> PoorRawOres = createItemTag("forge:poor_raw_materials");
        public static final TagKey<Item> CrushedOres = createItemTag("forge:crushed_ores");
        public static final TagKey<Item> PurifiedOres = createItemTag("forge:purified_ores");
        public static final TagKey<Item> RefinedOres = createItemTag("forge:refined_ores");

        public static final TagKey<Item> Nuggets = createItemTag("forge:nuggets");

        public static final TagKey<Item> TinyDusts = createItemTag("forge:tiny_dusts");
        public static final TagKey<Item> SmallDusts = createItemTag("forge:small_dusts");
        public static final TagKey<Item> Dusts = createItemTag("forge:dusts");
        public static final TagKey<Item> PureDusts = createItemTag("forge:pure_dusts");
        public static final TagKey<Item> ImpureDusts = createItemTag("forge:impure_dusts");

        public static final TagKey<Item> Ingots = createItemTag("forge:ingots");
        public static final TagKey<Item> HotIngots = createItemTag("forge:hot_ingots");
        public static final TagKey<Item> DoubleIngots = createItemTag("forge:double_ingots");

        public static final TagKey<Item> Plates = createItemTag("forge:plates");
        public static final TagKey<Item> DoublePlates = createItemTag("forge:double_plates");
        public static final TagKey<Item> DensePlates = createItemTag("forge:dense_plates");

        public static final TagKey<Item> Gears = createItemTag("forge:gears");
        public static final TagKey<Item> SmallGears = createItemTag("forge:small_gears");

        public static final TagKey<Item> Rods = createItemTag("forge:rods");
        public static final TagKey<Item> LongRods = createItemTag("forge:rods/long");

        public static final TagKey<Item> Springs = createItemTag("forge:springs");
        public static final TagKey<Item> SmallSprings = createItemTag("forge:small_springs");

        public static final TagKey<Item> GemsExquisite = createItemTag("forge:exquisite_gems");
        public static final TagKey<Item> GemsFlawless = createItemTag("forge:flawless_gems");
        public static final TagKey<Item> GemsNormal = createItemTag("forge:gems");
        public static final TagKey<Item> GemsFlawed = createItemTag("forge:flawed_gems");
        public static final TagKey<Item> GemsChipped = createItemTag("forge:chipped_gems");

        public static final TagKey<Item> Frames = createItemTag("forge:frames");
        public static final TagKey<Item> StorageBlocks = createItemTag("forge:storage_blocks");

        public static final TagKey<Item> SwordHeads = createItemTag("forge:sword_heads");
        public static final TagKey<Item> PickaxeHeads = createItemTag("forge:pickaxe_heads");
        public static final TagKey<Item> AxeHeads = createItemTag("forge:axe_heads");
        public static final TagKey<Item> ShovelHeads = createItemTag("forge:shovel_heads");
        public static final TagKey<Item> HoeHeads = createItemTag("forge:hoe_heads");
        public static final TagKey<Item> SawHeads = createItemTag("forge:saw_heads");
        public static final TagKey<Item> ScytheHeads = createItemTag("forge:scythe_heads");
        public static final TagKey<Item> HammerHeads = createItemTag("forge:hammer_heads");
        public static final TagKey<Item> KnifeHeads = createItemTag("forge:knife_heads");
        public static final TagKey<Item> FileHeads = createItemTag("forge:file_heads");
        public static final TagKey<Item> ButcheryKnifeHeads = createItemTag("forge:butchery_knife_heads");
        public static final TagKey<Item> MiningHammerHeads = createItemTag("forge:mining_hammer_heads");
        public static final TagKey<Item> SpadeHeads = createItemTag("forge:spade_heads");
        public static final TagKey<Item> MaceHeads = createItemTag("forge:mace_heads");
        public static final TagKey<Item> PropickHeads = createItemTag("forge:propick_heads");
        public static final TagKey<Item> ChiselHeads = createItemTag("forge:chisel_heads");
        public static final TagKey<Item> JavelinHeads = createItemTag("forge:javelin_heads");

        public static final TagKey<Item> DrillHeads = createItemTag("forge:drill_heads");
        public static final TagKey<Item> ChainsawHeads = createItemTag("forge:chainsaw_heads");
        public static final TagKey<Item> BuzzSawHeads = createItemTag("forge:buzz_saw_heads");

        public static final TagKey<Item> WrenchTips = createItemTag("forge:screwdriver_tips");
        public static final TagKey<Item> ScrewdriverTips = createItemTag("forge:wrench_tips");

        public static final TagKey<Item> TurbineBlades = createItemTag("forge:turbine_blades");
        public static final TagKey<Item> Lenses = createItemTag("forge:lenses");
        public static final TagKey<Item> Rounds = createItemTag("forge:rounds");
        public static final TagKey<Item> Rings = createItemTag("forge:rings");
        public static final TagKey<Item> Bolts = createItemTag("forge:bolts");
        public static final TagKey<Item> Screws = createItemTag("forge:screws");
        public static final TagKey<Item> Foils = createItemTag("forge:foils");
        public static final TagKey<Item> Rotors = createItemTag("forge:rotors");
        public static final TagKey<Item> FineWires = createItemTag("forge:fine_wires");

        public static final TagKey<Item> SingleWires = createItemTag("forge:single_wires");
        public static final TagKey<Item> DoubleWires = createItemTag("forge:double_wires");
        public static final TagKey<Item> QuadrupleWires = createItemTag("forge:quadruple_wires");
        public static final TagKey<Item> OctalWires = createItemTag("forge:octal_wires");
        public static final TagKey<Item> HexWires = createItemTag("forge:hex_wires");

        public static final TagKey<Item> SingleCables = createItemTag("forge:single_cables");
        public static final TagKey<Item> DoubleCables = createItemTag("forge:double_cables");
        public static final TagKey<Item> QuadrupleCables = createItemTag("forge:quadruple_cables");
        public static final TagKey<Item> OctalCables = createItemTag("forge:octal_cables");
        public static final TagKey<Item> HexCables = createItemTag("forge:hex_cables");

        public static final TagKey<Item> TinyFluidPipes = createItemTag("forge:tiny_fluid_pipes");
        public static final TagKey<Item> SmallFluidPipes = createItemTag("forge:small_fluid_pipes");
        public static final TagKey<Item> NormalFluidPipes = createItemTag("forge:normal_fluid_pipes");
        public static final TagKey<Item> LargeFluidPipes = createItemTag("forge:large_fluid_pipes");
        public static final TagKey<Item> HugeFluidPipes = createItemTag("forge:huge_fluid_pipes");
        public static final TagKey<Item> QuadrupleFluidPipes = createItemTag("forge:quadruple_fluid_pipes");
        public static final TagKey<Item> NonupleFluidPipes = createItemTag("forge:nonuple_fluid_pipes");

        public static final TagKey<Item> SmallItemPipes = createItemTag("forge:small_item_pipes");
        public static final TagKey<Item> NormalItemPipes = createItemTag("forge:normal_item_pipes");
        public static final TagKey<Item> LargeItemPipes = createItemTag("forge:large_item_pipes");
        public static final TagKey<Item> HugeItemPipes = createItemTag("forge:huge_item_pipes");

        public static final TagKey<Item> SmallRestrictivePipes = createItemTag("forge:small_restrictive_pipes");
        public static final TagKey<Item> NormalRestrictivePipes = createItemTag("forge:normal_restrictive_pipes");
        public static final TagKey<Item> LargeRestrictivePipes = createItemTag("forge:large_restrictive_pipes");
        public static final TagKey<Item> HugeRestrictivePipes = createItemTag("forge:huge_restrictive_pipes");

        public static final TagKey<Item> CopperBolt = createItemTag("forge:bolts/copper");

        private static TagKey<Item> createItemTag(String path) {
            return TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation(path));
        }
    }

    public static final class Blocks {
        private static TagKey<Block> createBlockTag(String path) {
            return TagKey.create(ForgeRegistries.BLOCKS.getRegistryKey(), new ResourceLocation(path));
        }
    }
}
