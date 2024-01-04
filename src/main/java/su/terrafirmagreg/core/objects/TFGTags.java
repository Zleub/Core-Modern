package su.terrafirmagreg.core.objects;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TFGTags {
    public static final TagKey<Block> AllRockRawBlocks = TagUtil.optionalTag(BuiltInRegistries.BLOCK, new ResourceLocation("tfc:rock/raw"));
    public static final TagKey<Item> AllWoodenSticks = TagUtil.optionalTag(BuiltInRegistries.ITEM, new ResourceLocation("forge:rods/wooden"));
}
