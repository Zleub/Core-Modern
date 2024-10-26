package su.terrafirmagreg.core.mixins.common.tfc;

import net.dries007.tfc.common.capabilities.size.*;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemSizeManager.class, remap = false)
public abstract class ItemSizeManagerMixin {

    @Unique
    private static final ItemSize tfg$BLOCK_SIZE = new ItemSize(Size.NORMAL, Weight.VERY_LIGHT);

    @Inject(method = "get", at = @At(value = "RETURN", ordinal = 2), remap = false, cancellable = true)
    private static void tfg$get(ItemStack stack, CallbackInfoReturnable<IItemSize> cir) {
        cir.setReturnValue(tfg$BLOCK_SIZE);
    }

}
