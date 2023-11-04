package exception.terrafirmagreg.objects.creativetabs;

import exception.terrafirmagreg.TerraFirmaGreg;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TerraFirmaGregCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TerraFirmaGreg.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_TABS.register("test_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.ACACIA_PLANKS))
                    .title(Component.translatable("creative_tab.test"))
                    .displayItems((p, i) -> {
                        i.accept(Items.ITEM_FRAME);
                    })
                    .build()
    );

    public static void register(IEventBus eventBus)
    {
        CREATIVE_TABS.register(eventBus);
    }
}
