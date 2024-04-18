package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.integration.kjs.builders.WorldGenLayerBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.TFGTags;

public final class TFGWorldGenLayers {

    public static final RuleTest EARTH_ORE_REPLACEABLES = new TagMatchTest(TFGTags.Blocks.RawRockBlocks);

    public static void init() {
        new WorldGenLayerBuilder(new ResourceLocation(TerraFirmaGreg.MOD_ID, "earth"))
            .dimensions(Level.OVERWORLD.location())
            .targets(() -> EARTH_ORE_REPLACEABLES)
            .register();
    }

}
