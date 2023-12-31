package su.terrafirmagreg.tfgcore;

import com.mojang.logging.LogUtils;
import com.simibubi.create.content.equipment.potatoCannon.PotatoCannonProjectileType;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.dries007.tfc.common.blocks.crop.Crop;
import net.dries007.tfc.common.items.TFCItems;
import net.dries007.tfc.common.recipes.AlloyRecipe;
import net.dries007.tfc.common.recipes.TFCRecipeSerializers;
import net.dries007.tfc.common.recipes.TFCRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import su.terrafirmagreg.tfgcore.compat.create.CreateCompat;
import su.terrafirmagreg.tfgcore.compat.create.CustomArmInteractionPointTypes;
import su.terrafirmagreg.tfgcore.compat.gtceu.TFGGTAddon;
import su.terrafirmagreg.tfgcore.compat.tfcambiental.TFCAmbientalCompat;

@Mod(TerraFirmaGreg.MOD_ID)
public class TerraFirmaGreg {

    public static final String MOD_ID = "terrafirmagreg";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static TFGConfig CONFIG;

    public TerraFirmaGreg() {
        CONFIG = Configuration.registerConfig(TFGConfig.class, ConfigFormats.json()).getConfigInstance();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(TerraFirmaGreg::init);

        // MinecraftForge.EVENT_BUS.register(this);
    }

    private static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            TFCAmbientalCompat.register();
            CreateCompat.register();
        });
    }
}
