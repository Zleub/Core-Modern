package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.TieredEnergyMachine;
import com.gregtechceu.gtceu.api.machine.feature.IAutoOutputItem;
import com.gregtechceu.gtceu.api.machine.feature.IFancyUIMachine;
import com.gregtechceu.gtceu.api.machine.feature.IMachineModifyDrops;
import com.gregtechceu.gtceu.common.machine.electric.FisherMachine;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = FisherMachine.class, remap = false)
public class FisherMachineMixin {

    // works fine
    /*
    @Inject(method = "updateFishingUpdateSubscription", at = @At(value = "HEAD"), remap = false)
    private void asdasdasdas(CallbackInfo ci) {
        System.out.println("dead");
    }*/

    // not working, WHY SUKAAAA
    /*
    @Redirect(method = "updateFishingUpdateSubscription", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"), remap = false)
    private boolean onUpdateFishingUpdateSubscription(ItemStack instance, Item pItem) {
        return false;
    }
    */

    // not working, WHY SUKAAAA
    /*
    @Redirect(method = "lambda$createBaitItemHandler$1", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"), remap = false)
    private static boolean onCreateBaitItemHandler(ItemStack instance, Item pItem) {
        return false;
    }
    */
}
