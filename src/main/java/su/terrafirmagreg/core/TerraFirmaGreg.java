package su.terrafirmagreg.core;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.mojang.logging.LogUtils;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import su.terrafirmagreg.core.compat.create.CreateCompat;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterials;
import su.terrafirmagreg.core.compat.tfcambiental.TFCAmbientalCompat;

@Mod(TerraFirmaGreg.MOD_ID)
public class TerraFirmaGreg {

    public static final String MOD_ID = "tfg";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static TFGConfig CONFIG;

    public TerraFirmaGreg() {
        CONFIG = Configuration.registerConfig(TFGConfig.class, ConfigFormats.json()).getConfigInstance();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(TerraFirmaGreg::onCommonSetup);
        eventBus.addListener(TerraFirmaGreg::onRegisterMaterials);
        eventBus.addListener(TerraFirmaGreg::onPostRegisterMaterials);

        // MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    private static void onRegisterMaterials(final MaterialEvent event) {
        TFGMaterials.init();
    }

    private static void onPostRegisterMaterials(final PostMaterialEvent event) {
        TFGMaterials.postInit();
    }

    private static void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if (CONFIG.enableTFCAmbientCompat) {
                TFCAmbientalCompat.register();
            }

            CreateCompat.register();
        });
    }
}
