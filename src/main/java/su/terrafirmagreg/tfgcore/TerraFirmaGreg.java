package su.terrafirmagreg.tfgcore;

import com.mojang.logging.LogUtils;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(TerraFirmaGreg.MOD_ID)
public class TerraFirmaGreg {

    public static final String MOD_ID = "terrafirmagreg";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static TFGConfig CONFIG;

    public TerraFirmaGreg() {
        CONFIG = Configuration.registerConfig(TFGConfig.class, ConfigFormats.json()).getConfigInstance();
    }
}
