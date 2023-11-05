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

        /*
        REGISTRATE.get().block("my_block", Block::new)
                .color(() -> () -> (s, e, f, g) -> 0xFFFFFF)
                .blockstate((c, p) -> {
                    p.simpleBlock(c.get(), p.models()
                            .withExistingParent("test_block", p.modLoc("block/ore"))
                            .texture("overlay", new ResourceLocation("gtceu", "block/material_sets/dull/ore"))
                            .renderType("cutout_mipped")
                    );
                })
                .item()
                .color(() -> () -> (s, e) -> 0xFFFFFF)
                .build()
                .register();

        for (var rock : Rock.values())
        {
            for (var material : GTRegistries.MATERIALS.values())
            {

            }
        }*/


        MinecraftForge.EVENT_BUS.register(this);
    }
}
