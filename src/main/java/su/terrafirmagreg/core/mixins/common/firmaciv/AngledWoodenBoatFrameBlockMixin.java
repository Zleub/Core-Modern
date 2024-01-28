package su.terrafirmagreg.core.mixins.common.firmaciv;

import com.alekiponi.firmaciv.common.block.AngledWoodenBoatFrameBlock;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.items.ItemHandlerHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.objects.TFGTags;
@Mixin(value = AngledWoodenBoatFrameBlock.class, remap = false)
public abstract class AngledWoodenBoatFrameBlockMixin {

    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/items/ItemHandlerHelper;giveItemToPlayer(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", ordinal = 1), remap = false)
    private void onGiveCopperBoltToPlayer(Player player, ItemStack stack)
    {
        var copperBoltStack = Ingredient.of(TFGTags.Items.CopperBolt).getItems()[0];

        if (!copperBoltStack.isEmpty()) ItemHandlerHelper.giveItemToPlayer(player, copperBoltStack);
    }

    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z", ordinal = 1))
    private boolean onCheckIsItemBolt(ItemStack instance, Item item)
    {
        var copperBoltStack = Ingredient.of(TFGTags.Items.CopperBolt).getItems()[0];

        return !copperBoltStack.isEmpty() && instance.is(copperBoltStack.getItem());
    }

}
