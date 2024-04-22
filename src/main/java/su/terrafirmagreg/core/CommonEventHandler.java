package su.terrafirmagreg.core;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import su.terrafirmagreg.core.compat.create.CreateCompat;
import su.terrafirmagreg.core.compat.gtceu.materials.TFGMaterialHandler;
import su.terrafirmagreg.core.compat.gtceu.materials.TFGMaterials;
import su.terrafirmagreg.core.compat.tfcambiental.TFCAmbientalCompat;
import su.terrafirmagreg.core.objects.TFGRegistries;

public final class CommonEventHandler {

    public static void init() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(TFGConfig::onLoad);
        bus.addListener(CommonEventHandler::onRegisterMaterialRegistry);
        bus.addListener(CommonEventHandler::onRegisterMaterials);
        bus.addListener(CommonEventHandler::onPostRegisterMaterials);
        bus.addListener(CommonEventHandler::onCommonSetup);
    }

    private static void onRegisterMaterialRegistry(MaterialRegistryEvent event) {
        TFGRegistries.MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(TerraFirmaGreg.MOD_ID);
    }

    private static void onRegisterMaterials(final MaterialEvent event) {
        TFGMaterialHandler.init();
    }

    private static void onPostRegisterMaterials(final PostMaterialEvent event) {
        TFGMaterialHandler.postInit();
    }

    private static void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if (TFGConfig.enableTFCAmbientalCompat) TFCAmbientalCompat.register();
            if (TFGConfig.enableCreateCompat) CreateCompat.register();
        });
    }

}
