package su.terrafirmagreg.core;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.event.config.ModConfigEvent;


public final class TFGConfig {

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue ENABLE_CREATE_COMPAT = BUILDER
            .comment("Should be create compat enabled?")
            .define("createCompat", true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_TFC_AMBIENTAL_COMPAT = BUILDER
            .comment("Should be tfc ambiental compat enabled?")
            .define("tfcAmbientalCompat", true);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean enableCreateCompat;
    public static boolean enableTFCAmbientalCompat;

    public static void onLoad(final ModConfigEvent event)
    {
        enableCreateCompat = ENABLE_CREATE_COMPAT.get();
        enableTFCAmbientalCompat = ENABLE_TFC_AMBIENTAL_COMPAT.get();
    }
}
