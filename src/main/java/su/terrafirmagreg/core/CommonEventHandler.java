package su.terrafirmagreg.core;

import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import su.terrafirmagreg.core.compat.create.CreateCompat;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterials;
import su.terrafirmagreg.core.compat.tfcambiental.TFCAmbientalCompat;
import su.terrafirmagreg.core.config.TFGCommonConfig;
import su.terrafirmagreg.core.config.TFGConfig;

public final class CommonEventHandler {

    public static void init() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(CommonEventHandler::onCommonSetup);
        bus.addListener(CommonEventHandler::onRegisterMaterials);
        bus.addListener(CommonEventHandler::onPostRegisterMaterials);
    }

    private static void onRegisterMaterials(final MaterialEvent event) {
        TFGMaterials.init();
    }

    private static void onPostRegisterMaterials(final PostMaterialEvent event) {
        TFGMaterials.postInit();
    }

    private static void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if (TFGConfig.COMMON.enableTFCAmbientalCompat.get()) TFCAmbientalCompat.register();
            if (TFGConfig.COMMON.enableCreateCompat.get()) CreateCompat.register();
        });
    }

}
