package su.terrafirmagreg.core.mixins.common.tfc;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.logging.LogUtils;
import net.dries007.tfc.common.capabilities.size.*;
import net.dries007.tfc.util.collections.IndirectHashCollection;
import net.minecraft.world.item.*;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

import static net.dries007.tfc.common.capabilities.size.ItemSizeManager.MANAGER;

@Mixin(value = ItemSizeManager.class, remap = false)
public abstract class ItemSizeManagerMixin {

    @Shadow
    @Final
    public static IndirectHashCollection<Item, ItemSizeDefinition> CACHE;

    @Shadow
    @Final
    public static ItemSize TOOL_SIZE;

    @Shadow
    @Final
    public static ItemSize ARMOR_SIZE;

    @Shadow
    @Final
    public static ItemSize BLOCK_SIZE;

    @Shadow
    @Final
    public static ItemSize DEFAULT_SIZE;

    @Unique
    private static final ItemSize tfg$BLOCK_SIZE = new ItemSize(Size.NORMAL, Weight.VERY_LIGHT);
//    private static final ItemSize tfg$BLOCK_SIZE = new ItemSize(Size.NORMAL, Weight.VERY_LIGHT);

    @Inject(method = "get", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private static void tfg$get(ItemStack stack, CallbackInfoReturnable<IItemSize> cir) {
//        cir.setReturnValue(tfg$BLOCK_SIZE);

        // If the item (or, a block) defines itself as an IItemSize, we use that first
        final Item item = stack.getItem();
        if (item instanceof IItemSize size)
        {
            cir.setReturnValue(size);
        }
        if (item instanceof BlockItem block && block.getBlock() instanceof IItemSize size)
        {
            cir.setReturnValue(size);
        }

        // Definitions
        for (ItemSizeDefinition def : CACHE.getAll(stack.getItem()))
        {
            if (def.matches(stack))
            {
                cir.setReturnValue(def);;
            }
        }

        // Default rules
        if (item instanceof TieredItem || item instanceof BucketItem)
        {
            cir.setReturnValue(TOOL_SIZE);
        }
        else if (item instanceof ArmorItem || item instanceof HorseArmorItem)
        {
            cir.setReturnValue(ARMOR_SIZE);
        }
        else if (item instanceof BlockItem)
        {
            cir.setReturnValue(tfg$BLOCK_SIZE);
        }
        else
        {
            cir.setReturnValue(DEFAULT_SIZE);
        }
    }

//    @ModifyReturnValue(method = "get", at = @At(value = "RETURN", ordinal = 2), remap = false)
//    private static IItemSize tfg$get(IItemSize original) {
//        return tfg$BLOCK_SIZE;
//    }
}
