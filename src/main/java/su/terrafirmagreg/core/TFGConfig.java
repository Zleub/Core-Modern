package su.terrafirmagreg.core;

import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;

@Config(id = TerraFirmaGreg.MOD_ID)
public final class TFGConfig {

    @Configurable
    @Configurable.Synchronized
    @Configurable.Comment("Is TFC Compat Enabbled? Requied restart!")
    public boolean enableTFCAmbientCompat = true;
}
