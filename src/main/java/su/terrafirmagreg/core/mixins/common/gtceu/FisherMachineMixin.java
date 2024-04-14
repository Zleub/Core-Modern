package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.machine.trait.NotifiableItemStackHandler;
import com.gregtechceu.gtceu.common.machine.electric.FisherMachine;
import net.dries007.tfc.common.fluids.TFCFluids;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.objects.TFGTags;

import java.util.function.Function;

@Mixin(value = FisherMachine.class, remap = false)
public abstract class FisherMachineMixin  {

    /**
     * Разрешает рыболовство на реках и в океанах.
     * */
    @Redirect(method = "updateHasWater", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/material/FluidState;is(Lnet/minecraft/world/level/material/Fluid;)Z"), remap = true)
    private boolean tfg$updateHasWater(FluidState instance, Fluid fluid) {
        return instance.is(Fluids.WATER) || instance.is(TFCFluids.RIVER_WATER.get()) || instance.is(TFCFluids.SALT_WATER.source().get());
    }

    /**
     * Разрешает класть любые нитки с тегом forge:string в рыболов
     * */
    @Redirect(method = "updateFishingUpdateSubscription", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"), remap = true)
    private boolean tfg$updateFishingUpdateSubscription(ItemStack instance, Item item) {
        return instance.is(TFGTags.Items.Strings);
    }

    /**
     * Разрешает класть любые нитки с тегом forge:string в рыболов
     * */
    @Redirect(method = "createBaitItemHandler", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/machine/trait/NotifiableItemStackHandler;setFilter(Ljava/util/function/Function;)Lcom/gregtechceu/gtceu/api/machine/trait/NotifiableItemStackHandler;"), remap = false)
    private NotifiableItemStackHandler tfg$createBaitItemHandler(NotifiableItemStackHandler instance, Function<ItemStack, Boolean> filter) {
        return instance.setFilter((item) -> item.is(TFGTags.Items.Strings));
    }

    /**
     * Исправляет баг, когда рыболов не тратит нитки.
     * */
    @Redirect(method = "fishingUpdate", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/machine/trait/NotifiableItemStackHandler;extractItem(IIZ)Lnet/minecraft/world/item/ItemStack;"), remap = false)
    private ItemStack tfg$fishingUpdate(NotifiableItemStackHandler instance, int i1, int i2, boolean b) {
        return instance.extractItemInternal(i1, i2, b);
    }
}
