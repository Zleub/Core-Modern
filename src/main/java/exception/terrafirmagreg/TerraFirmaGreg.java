package exception.terrafirmagreg;

import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TerraFirmaGreg.MOD_ID)
public class TerraFirmaGreg {

    public static final String MOD_ID = "terrafirmagreg";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final NonNullSupplier<Registrate> REGISTRATE = NonNullSupplier.lazy(() -> Registrate.create(MOD_ID));

    public TerraFirmaGreg() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //TerraFirmaGregCreativeTabs.register(eventBus);
        //TerraFirmaGregItems.register(eventBus);
        //TerraFirmaGregBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
