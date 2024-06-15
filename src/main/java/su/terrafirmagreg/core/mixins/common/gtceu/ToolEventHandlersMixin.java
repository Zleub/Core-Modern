//package su.terrafirmagreg.core.mixins.common.gtceu;
//
//import com.gregtechceu.gtceu.api.block.OreBlock;
//import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
//import com.gregtechceu.gtceu.api.item.IGTTool;
//import com.gregtechceu.gtceu.api.item.tool.GTToolType;
//import com.gregtechceu.gtceu.common.item.tool.ToolEventHandlers;
//import it.unimi.dsi.fastutil.objects.ObjectArrayList;
//import net.minecraft.core.BlockPos;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.DiggerItem;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.PickaxeItem;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.state.BlockState;
//import org.jetbrains.annotations.Nullable;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//import su.terrafirmagreg.core.common.TFGHelpers;
//import su.terrafirmagreg.core.common.data.TFGTags;
//import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefix;
//
//@Mixin(value = ToolEventHandlers.class, remap = false)
//public abstract class ToolEventHandlersMixin {
//
//    @Inject(method = "onHarvestDrops", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/item/tool/ToolHelper;applyHammerDropConversion(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/List;IFLnet/minecraft/util/RandomSource;)V", shift = At.Shift.BEFORE), remap = false, cancellable = true)
//    private static void test(@Nullable Player player, ItemStack tool, Level world, BlockPos pos, BlockState state, boolean isSilkTouch, int fortuneLevel, ObjectArrayList<ItemStack> drops, float dropChance, CallbackInfoReturnable<ObjectArrayList<ItemStack>> cir) {
//
//        if (state.getBlock() instanceof OreBlock oreBlock) {
//            var gtTool = (IGTTool) tool.getItem();
//
//            if (gtTool.getToolType() == GTToolType.PICKAXE || gtTool.getToolType() == GTToolType.MINING_HAMMER) {
//                float chance = TFGHelpers.RANDOM.nextFloat();
//
//                if (chance > 0 && chance < 0.2f) {
//                    System.out.println("Poor " + chance);
//                    drops.removeIf(el -> el.is(TFGTags.Items.NormalRawOre));
//                    drops.add(ChemicalHelper.get(TFGTagPrefix.poorRawOre, oreBlock.material));
//                }
//
//                else if (chance >= 0.2 && chance <= 0.8f) {
//                    // Ничего не делаем, дроп итак уже правильный
//                }
//
//                else {
//                    System.out.println("Rich " + chance);
//                    drops.removeIf(el -> el.is(TFGTags.Items.NormalRawOre));
//                    drops.add(ChemicalHelper.get(TFGTagPrefix.richRawOre, oreBlock.material));
//                }
//            }
//        }
//    }
//}
