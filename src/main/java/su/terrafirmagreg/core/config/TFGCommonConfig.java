package su.terrafirmagreg.core.config;

import net.dries007.tfc.config.ConfigBuilder;
import net.minecraftforge.common.ForgeConfigSpec;

public final class TFGCommonConfig
{
    // General
    public final ForgeConfigSpec.BooleanValue enableCreateCompat;
    public final ForgeConfigSpec.BooleanValue enableTFCAmbientalCompat;

    TFGCommonConfig(ConfigBuilder builder)
    {
        builder.push("general");

        enableCreateCompat = builder.comment("Should be create compat enabled?")
                .define("createCompat", true);

        enableTFCAmbientalCompat = builder.comment("Should be tfc ambiental compat enabled?")
                .define("tfcAmbiental", true);
    }
}