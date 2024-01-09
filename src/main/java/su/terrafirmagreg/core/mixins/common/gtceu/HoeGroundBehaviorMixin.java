package su.terrafirmagreg.core.mixins.common.gtceu;

import com.google.common.collect.ImmutableSet;
import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
import com.gregtechceu.gtceu.api.item.tool.aoe.AoESymmetrical;
import com.gregtechceu.gtceu.common.item.tool.behavior.HoeGroundBehavior;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import su.terrafirmagreg.core.mixins.common.minecraft.UseOnContextInvoker;

import java.util.Set;

@Mixin(value = HoeGroundBehavior.class, remap = false)
public class HoeGroundBehaviorMixin {

    @Shadow
    protected boolean isBlockTillable(ItemStack stack, Level world, Player player, BlockPos pos, UseOnContext context) {
        throw new AssertionError();
    }

    @Shadow
    public static Set<BlockPos> getTillableBlocks(ItemStack stack, AoESymmetrical aoeDefinition, Level world, Player player, HitResult rayTraceResult) {
        throw new AssertionError();
    }

    @Shadow
    protected boolean tillGround(UseOnContext context, BlockState block) {
        throw new AssertionError();
    }

    /**
     * @author Exception
     * @reason Исправление работы мотыг с модовыми блоками
     */
    @NotNull
    @Overwrite
    public InteractionResult onItemUse(UseOnContext context) {
        if (context.getClickedFace() == Direction.DOWN) return InteractionResult.PASS;

        Level world = context.getLevel();
        Player player = context.getPlayer();
        BlockPos pos = context.getClickedPos();
        InteractionHand hand = context.getHand();

        ItemStack stack = player.getItemInHand(hand);
        AoESymmetrical aoeDefinition = ToolHelper.getAoEDefinition(stack);
        Set<BlockPos> blocks;
        // only attempt to till if the center block is tillable
        // Block hitBlock = world.getBlockState(pos).getBlock();
        if (isBlockTillable(stack, world, player, pos, context)) {
            if (aoeDefinition == AoESymmetrical.none()) {
                blocks = ImmutableSet.of(pos);
            } else {
                HitResult rayTraceResult = ToolHelper.getPlayerDefaultRaytrace(player);

                if (rayTraceResult == null) return InteractionResult.PASS;
                if (rayTraceResult.getType() != HitResult.Type.BLOCK) return InteractionResult.PASS;
                if (!(rayTraceResult instanceof BlockHitResult blockHitResult))
                    return InteractionResult.PASS;
                if (blockHitResult.getDirection() == null)
                    return InteractionResult.PASS;

                blocks = getTillableBlocks(stack, aoeDefinition, world, player, blockHitResult);
                if (isBlockTillable(stack, world, player, blockHitResult.getBlockPos(), context)) {
                    blocks.add(blockHitResult.getBlockPos());
                }
            }
        } else return InteractionResult.PASS;

        boolean tilled = false;
        for (BlockPos blockPos : blocks) {
            BlockState state = world.getBlockState(blockPos);
            tilled |= tillGround(new UseOnContext(player, hand, ((UseOnContextInvoker) context).invokeGetHitResult().withPosition(blockPos)), state);
            if (!player.isCreative()) {
                ToolHelper.damageItem(context.getItemInHand(), context.getPlayer());
            }
            if (stack.isEmpty())
                break;
        }

        if (tilled) {
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.HOE_TILL,
                    SoundSource.PLAYERS, 1.0F, 1.0F);
            player.swing(hand);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
