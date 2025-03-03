package su.terrafirmagreg.core.mixins.common.gtceu;

import com.lowdragmc.lowdraglib.side.item.ItemTransferHelper;
import net.dries007.tfc.common.capabilities.food.FoodCapability;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemTransferHelper.class, remap = false)

public class ItemTransferHelperMixin {
    @Inject(method = "canItemStacksStack(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", at = @At(value = "RETURN", ordinal = 0), remap = false, cancellable = true)
    private static void canItemStacksStack(ItemStack first, ItemStack second, CallbackInfoReturnable<Boolean> cir) {
        if (FoodCapability.has(first) && FoodCapability.has(second)) {
            cir.setReturnValue(FoodCapability.get(first).getCreationDate() == FoodCapability.get(second).getCreationDate());

        }
    }
}
