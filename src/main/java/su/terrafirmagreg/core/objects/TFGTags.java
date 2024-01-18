package su.terrafirmagreg.core.objects;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public final class TFGTags {

    public static final TagKey<Block> AllRockRawBlocks = createBlockTag("tfc:rock/raw");
    public static final TagKey<Item> AllWoodenSticks = createItemTag("forge:rods/wooden");

    public static final TagKey<Item> Ores = createItemTag("forge:ores");
    public static final TagKey<Item> RichRawOres = createItemTag("forge:rich_raw_materials");
    public static final TagKey<Item> NormalRawOres = createItemTag("forge:raw_materials");
    public static final TagKey<Item> PoorRawOres = createItemTag("forge:poor_materials");
    public static final TagKey<Item> CrushedOres = createItemTag("forge:crushed_ores");
    public static final TagKey<Item> PurifiedOres = createItemTag("forge:purified_ores");
    public static final TagKey<Item> RefinedOres = createItemTag("forge:refined_ores");

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
    public static final TagKey<Item> LongRods = createItemTag("forge:long_rods");

    public static final TagKey<Item> Springs = createItemTag("forge:springs");
    public static final TagKey<Item> SmallSprings = createItemTag("forge:small_springs");

    public static final TagKey<Item> GemsExquisite = createItemTag("forge:exquisite_gems");
    public static final TagKey<Item> GemsFlawless = createItemTag("forge:gems");
    public static final TagKey<Item> GemsNormal = createItemTag("forge:flawless_gems");
    public static final TagKey<Item> GemsFlawed = createItemTag("forge:flawed_gems");
    public static final TagKey<Item> GemChipped = createItemTag("forge:chipped_gems");

    // Block Raw
    // Block Normal
    // Frame Block

    public static final TagKey<Item> SwordHeads = createItemTag("forge:sword_heads");
    public static final TagKey<Item> PickaxeHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> AxeHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> ShovelHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> HoeHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> SawHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> ScytheHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> HammerHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> KnifeHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> FileHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> ButcheryKnifeHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> MiningHammerHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> SpadeHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> MaceHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> PropickHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> ChiselHeads = createItemTag("forge:_heads");
    public static final TagKey<Item> JavelinHeads = createItemTag("forge:_heads");



    private static TagKey<Item> createItemTag(String path) {
        return new TagKey<>(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation(path));
    }

    private static TagKey<Block> createBlockTag(String path) {
        return new TagKey<>(ForgeRegistries.BLOCKS.getRegistryKey(), new ResourceLocation(path));
    }
}
