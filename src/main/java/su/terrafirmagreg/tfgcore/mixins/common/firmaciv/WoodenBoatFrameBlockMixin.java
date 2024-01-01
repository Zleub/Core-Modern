package su.terrafirmagreg.tfgcore.mixins.common.firmaciv;

import com.alekiponi.firmaciv.common.block.WoodenBoatFrameBlock;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = WoodenBoatFrameBlock.class)
public abstract class WoodenBoatFrameBlockMixin {

    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/items/ItemHandlerHelper;giveItemToPlayer(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", ordinal = 1), remap = false)
    private void onGiveCopperBoltToPlayer(Player player, ItemStack stack)
    {
        ItemStack bolt = ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Copper);

        if (!bolt.isEmpty()) ItemHandlerHelper.giveItemToPlayer(player, bolt);
    }

    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z", ordinal = 1))
    private boolean onCheckIsItemBolt(ItemStack instance, Item item)
    {
        ItemStack bolt = ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Copper);

        return !bolt.isEmpty() && instance.is(bolt.getItem());
    }

}
