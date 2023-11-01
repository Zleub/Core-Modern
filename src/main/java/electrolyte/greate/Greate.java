package electrolyte.greate;

import com.mojang.logging.LogUtils;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(Greate.MOD_ID)
public class Greate {

    public static final String MOD_ID = "greate";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static GreateConfig CONFIG;
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Greate.MOD_ID);

    public Greate() {
        CONFIG = Configuration.registerConfig(GreateConfig.class, ConfigFormats.yaml()).getConfigInstance();
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        CREATIVE_TABS.register(eventBus);

    }
}
