package su.terrafirmagreg.core;

import net.dries007.tfc.TerraFirmaCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public final class TFGClientEventHandler {

    public static final ResourceLocation TFCMetalBlockTexturePattern = new ResourceLocation(TerraFirmaCraft.MOD_ID, "block/metal/smooth_pattern");

    public static void init() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(TFGClientEventHandler::registerSpecialModels);
    }

    private static void registerSpecialModels(ModelEvent.RegisterAdditional event) {
        event.register(new ResourceLocation(TerraFirmaCraft.MOD_ID, "block/metal/smooth_pattern"));
    }

}
