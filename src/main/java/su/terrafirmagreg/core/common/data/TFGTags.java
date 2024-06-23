package su.terrafirmagreg.core.common.data;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public final class TFGTags {

    public static final class Items {

        // public static final TagKey<Item> Tongs = createItemTag("tfchotornot:tongs");
        public static final TagKey<Item> Strings = createItemTag("forge:string");
        public static final TagKey<Item> WoodenSticks = createItemTag("forge:rods/wooden");
        public static final TagKey<Item> RawRockBlocks = createItemTag("tfc:rock/raw");
        public static final TagKey<Item> NormalRawOre = createItemTag("forge:raw_materials");
        public static final TagKey<Item> Lumbers = createItemTag("tfc:lumber");
        public static final TagKey<Item> HighQualityCloth = createItemTag("tfc:high_quality_cloth");
        public static final TagKey<Item> Screws = createItemTag("forge:screws");

        public static TagKey<Item> createItemTag(String path) {
            return TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation(path));
        }
    }

    public static final class Blocks {
        public static final TagKey<Block> RawRockBlocks = createBlockTag("tfc:rock/raw");

        public static TagKey<Block> createBlockTag(String path) {
            return TagKey.create(ForgeRegistries.BLOCKS.getRegistryKey(), new ResourceLocation(path));
        }
    }

    public static final class Biomes {
        public static final TagKey<Biome> IsTFCOverworld = createBiomeTag("tfg:is_tfc_overworld");

        public static TagKey<Biome> createBiomeTag(String path) {
            return TagKey.create(ForgeRegistries.BIOMES.getRegistryKey(), new ResourceLocation(path));
        }
    }
}
