package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.hasOreProperty;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.LoaderType.FABRIC;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.LoaderType.FORGE;

public class TFGTagPrefixes {
    public static void init() {}

    public static final TagPrefix poorRawOre = new TagPrefix("poor_raw", true)
            .defaultTagPath(FORGE, "poor_raw_materials/%s")
            .defaultTagPath(FABRIC, "poor_raw_%s_ores")
            .langValue("Poor Raw %s")
            .materialIconType(MaterialIconType.rawOre)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasOreProperty);

    public static final TagPrefix richRawOre = new TagPrefix("rich_raw", true)
            .defaultTagPath(FORGE, "rich_raw_materials/%s")
            .defaultTagPath(FABRIC, "rich_raw_%s_ores")
            .langValue("Rich Raw %s")
            .materialIconType(MaterialIconType.rawOre)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasOreProperty);

    public static final TagPrefix oreBasalt = new TagPrefix("tfc_basalt")
            .langValue("Basalt %s Ore")
            .materialIconType(MaterialIconType.ore)
            .miningToolTag(BlockTags.MINEABLE_WITH_PICKAXE)
            .unificationEnabled(true)
            .generationCondition(hasOreProperty)
            .prefixTagPath(FORGE, "ores/%s/%s")
            .defaultTagPath(FORGE, "ores/%s")
            .prefixOnlyTagPath(FORGE, "ores_in_ground/%s")
            .unformattedTagPath(FORGE, "ores")
            .registerOre(Blocks.BASALT::defaultBlockState, false, MapColor.COLOR_BLACK, SoundType.STONE, false);
}
