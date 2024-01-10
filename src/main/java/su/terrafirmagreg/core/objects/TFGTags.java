package su.terrafirmagreg.core.objects;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class TFGTags {
    public static final TagKey<Block> AllRockRawBlocks = TagUtil.optionalTag(ForgeRegistries.BLOCKS.getRegistryKey(), new ResourceLocation("tfc:rock/raw"));
    public static final TagKey<Item> AllWoodenSticks = TagUtil.optionalTag(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation("forge:rods/wooden"));
}
