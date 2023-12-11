package exception.terrafirmagreg.objects;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class TFGTags {
    public static final TagKey<Block> AllRockRaw = TagUtil.createPlatformUnprefixedTag(BuiltInRegistries.BLOCK, "tfc:rock/raw", "");
    public static final TagKey<Item> AllSticks = TagUtil.createPlatformUnprefixedTag(BuiltInRegistries.ITEM, "forge:rods/wooden", "");
}
