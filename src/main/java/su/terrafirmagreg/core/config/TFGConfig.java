package su.terrafirmagreg.core.config;

import net.dries007.tfc.config.CommonConfig;
import net.dries007.tfc.config.ConfigBuilder;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

import java.util.function.Function;


public final class TFGConfig {

    public static final TFGCommonConfig COMMON = register(ModConfig.Type.COMMON, TFGCommonConfig::new, "common").getKey();

    public static void init() {}

    private static <C> Pair<C, ForgeConfigSpec> register(ModConfig.Type type, Function<ConfigBuilder, C> factory, String prefix) {
        final Pair<C, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(builder -> factory.apply(new ConfigBuilder(builder, prefix)));
        ModLoadingContext.get().registerConfig(type, specPair.getRight()); // Будет крашиться если запускается в GameTest
        return specPair;
    }
}
