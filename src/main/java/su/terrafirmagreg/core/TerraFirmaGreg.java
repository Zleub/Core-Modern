package su.terrafirmagreg.core;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

@Mod(TerraFirmaGreg.MOD_ID)
public final class TerraFirmaGreg {

    public static final String MOD_ID = "tfg";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TerraFirmaGreg() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TFGConfig.SPEC);

        TFGCommonEventHandler.init();
        if (FMLEnvironment.dist == Dist.CLIENT) TFGClientEventHandler.init();

        // ModList.get().isLoaded(modId)
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
