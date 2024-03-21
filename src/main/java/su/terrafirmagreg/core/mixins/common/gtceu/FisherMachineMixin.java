package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.common.machine.electric.FisherMachine;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.objects.TFGTags;

@Mixin(value = FisherMachine.class, remap = false)
public class FisherMachineMixin {

    @Redirect(method = "updateFishingUpdateSubscription", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"), remap = false)
    private boolean onUpdateFishingUpdateSubscription(ItemStack instance, Item pItem) {
        return instance.is(TFGTags.Items.Strings);
    }

    @Redirect(method = "lambda$createBaitItemHandler$1", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"), remap = false)
    private static boolean onCreateBaitItemHandler(ItemStack instance, Item pItem) {
        return instance.is(TFGTags.Items.Strings);
    }

}
