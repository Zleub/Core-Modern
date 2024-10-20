package su.terrafirmagreg.core;

import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.network.NetworkConstants;
import org.slf4j.Logger;
import su.terrafirmagreg.core.client.TFGClientEventHandler;
import su.terrafirmagreg.core.common.TFGCommonEventHandler;

@Mod(TFGCore.MOD_ID)
public final class TFGCore {
    public static final String MOD_ID = "tfg";
    public static final String NAME = "TerraFirmaGreg";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final GTRegistrate REGISTRATE = GTRegistrate.create(TFGCore.MOD_ID);
    public static MaterialRegistry MATERIAL_REGISTRY;

    public TFGCore() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TFGConfig.SPEC);

        TFGCommonEventHandler.init();
        if (FMLEnvironment.dist == Dist.CLIENT) TFGClientEventHandler.init();

        setupFixForGlobalServerConfig();
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    private static void setupFixForGlobalServerConfig() {
        ModLoadingContext.get().registerExtensionPoint(
                IExtensionPoint.DisplayTest.class,
                () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true)
        );
    }
}
