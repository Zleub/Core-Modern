package su.terrafirmagreg.core;

import com.mojang.logging.LogUtils;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import su.terrafirmagreg.core.compat.create.CreateCompat;
import su.terrafirmagreg.core.compat.tfcambiental.TFCAmbientalCompat;
import xaero.common.minimap.render.MinimapRenderer;
import xaero.common.minimap.render.MinimapRendererHelper;

@Mod(TerraFirmaGreg.MOD_ID)
public class TerraFirmaGreg {

    public static final String MOD_ID = "tfg";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static TFGConfig CONFIG;

    public TerraFirmaGreg() {
        CONFIG = Configuration.registerConfig(TFGConfig.class, ConfigFormats.json()).getConfigInstance();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(TerraFirmaGreg::init);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            TFCAmbientalCompat.register();
            CreateCompat.register();
        });
    }
}
