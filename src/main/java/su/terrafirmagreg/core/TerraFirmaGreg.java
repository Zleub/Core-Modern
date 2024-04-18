package su.terrafirmagreg.core;

import com.mojang.logging.LogUtils;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.slf4j.Logger;
import su.terrafirmagreg.core.config.TFGConfig;

@Mod(TerraFirmaGreg.MOD_ID)
public final class TerraFirmaGreg {

    public static final String MOD_ID = "tfg";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TerraFirmaGreg() {
        TFGConfig.init();

        CommonEventHandler.init();
        if (FMLEnvironment.dist == Dist.CLIENT) ClientEventHandler.init();
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
