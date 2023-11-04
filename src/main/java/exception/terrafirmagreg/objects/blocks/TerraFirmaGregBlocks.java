package exception.terrafirmagreg.objects.blocks;

import exception.terrafirmagreg.TerraFirmaGreg;
import exception.terrafirmagreg.objects.items.TerraFirmaGregItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

public class TerraFirmaGregBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TerraFirmaGreg.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        var array = Arrays.asList("test1", "test2");

        for (var item: array)
        {
            registerBlock(item, () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
        }

        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return TerraFirmaGregItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }
}
