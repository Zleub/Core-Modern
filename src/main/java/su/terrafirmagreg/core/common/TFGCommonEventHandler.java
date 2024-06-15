package su.terrafirmagreg.core.common;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.data.pack.GTPackSource;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import su.terrafirmagreg.core.TFGConfig;
import su.terrafirmagreg.core.TFGCore;
import su.terrafirmagreg.core.common.data.TFGDynamicDataPack;
import su.terrafirmagreg.core.compat.gtceu.materials.TFGMaterialHandler;

public final class TFGCommonEventHandler {

    public static void init() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(TFGConfig::onLoad);
        bus.addListener(TFGCommonEventHandler::onCommonSetup);
        bus.addListener(TFGCommonEventHandler::onRegisterMaterialRegistry);
        bus.addListener(TFGCommonEventHandler::onRegisterMaterials);
        bus.addListener(TFGCommonEventHandler::onPostRegisterMaterials);
        bus.addListener(TFGCommonEventHandler::registerPackFinders);
    }

    private static void onRegisterMaterialRegistry(final MaterialRegistryEvent event) {
        TFGCore.MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(TFGCore.MOD_ID);
    }

    private static void onRegisterMaterials(final MaterialEvent event) {
        TFGMaterialHandler.init();
    }

    private static void onPostRegisterMaterials(final PostMaterialEvent event) {
        TFGMaterialHandler.postInit();
    }

    private static void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //            if (TFGConfig.enableTFCAmbientalCompat) TFCAmbientalCompat.register();
            //            if (TFGConfig.enableCreateCompat) CreateCompat.register();
        });
    }

     private static void registerPackFinders(final AddPackFindersEvent event) {
         if (event.getPackType() == PackType.CLIENT_RESOURCES) return;

        event.addRepositorySource(
                new GTPackSource("tfg:dynamic_data", event.getPackType(), Pack.Position.BOTTOM, TFGDynamicDataPack::new)
        );
     }
}