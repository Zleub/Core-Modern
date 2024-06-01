package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.data.worldgen.IWorldGenLayer;
import com.gregtechceu.gtceu.integration.kjs.builders.WorldGenLayerBuilder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.TFGTags;

public final class TFGWorldGenLayers {

    public static final RuleTest ALL_STONETYPES_EARTH = new TagMatchTest(TFGTags.Blocks.RawRockBlocks);

    public static final IWorldGenLayer EARTH_GEN_LAYER = new WorldGenLayerBuilder(TerraFirmaGreg.id("earth"))
            .dimensions(Level.OVERWORLD.location())
            .targets(() -> ALL_STONETYPES_EARTH)
            .register();

    public static void init() {

    }

}
