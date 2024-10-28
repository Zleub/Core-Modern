package su.terrafirmagreg.core.mixins.common.firmaciv;

//import com.alekiponi.firmaciv.common.block.FlatWoodenBoatFrameBlock;
//import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.common.data.GTMaterials;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraftforge.items.ItemHandlerHelper;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Pseudo;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Redirect;
//
//@Pseudo
//@Mixin(value = FlatWoodenBoatFrameBlock.class)
//public abstract class WoodenBoatFrameBlockMixin {
//
//    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/items/ItemHandlerHelper;giveItemToPlayer(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", ordinal = 1), remap = false)
//    private void tfg$use$itemHandlerHelper$giveItemToPlayer(Player player, ItemStack stack) {
//        var copperBoltStack = ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Copper);
//        if (!copperBoltStack.isEmpty()) ItemHandlerHelper.giveItemToPlayer(player, copperBoltStack);
//    }
//
//    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z", ordinal = 1))
//    private boolean tfg$use$itemStack$is(ItemStack instance, Item item) {
//        var copperBoltStack = ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Copper);
//        return !copperBoltStack.isEmpty() && instance.is(copperBoltStack.getItem());
//    }
//
//}