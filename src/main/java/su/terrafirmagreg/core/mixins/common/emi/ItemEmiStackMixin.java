package su.terrafirmagreg.core.mixins.common.emi;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.emi.emi.api.stack.ItemEmiStack;
import net.dries007.tfc.common.capabilities.food.FoodCapability;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = ItemEmiStack.class, remap = false)
public abstract class ItemEmiStackMixin {

    /**
     * Исправляет баг, когда еда в EMI может пропасть.
     * */
    @ModifyReturnValue(method = "getItemStack", at = @At(value = "RETURN"))
    private ItemStack getItemStack(final ItemStack stack) {
        return FoodCapability.setStackNonDecaying(stack);
    }

}