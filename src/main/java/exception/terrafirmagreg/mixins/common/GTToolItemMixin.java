package exception.terrafirmagreg.mixins.common;

import com.gregtechceu.gtceu.api.item.GTToolItem;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.mojang.datafixers.util.Pair;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static net.minecraft.world.item.HoeItem.changeIntoState;

@Mixin(value = GTToolItem.class, remap = false)
public abstract class GTToolItemMixin {

    @Inject(method = "useAxeOn", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private void onUseAxeOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> cir)
    {
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        Player player = context.getPlayer();
        BlockState blockState = level.getBlockState(blockPos);
        Optional<BlockState> strippable = Optional.ofNullable(blockState.getToolModifiedState(context, ToolActions.AXE_STRIP, false));
        Optional<BlockState> cleanable = Optional.ofNullable(blockState.getToolModifiedState(context, ToolActions.AXE_SCRAPE, false));
        Optional<BlockState> waxable = Optional.ofNullable(blockState.getToolModifiedState(context, ToolActions.AXE_WAX_OFF, false));
        ItemStack itemStack = context.getItemInHand();
        Optional<BlockState> result = Optional.empty();

        if (strippable.isPresent()) {
            level.playSound(player, blockPos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            result = strippable;
        } else if (cleanable.isPresent()) {
            level.playSound(player, blockPos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3005, blockPos, 0);
            result = cleanable;
        } else if (waxable.isPresent()) {
            level.playSound(player, blockPos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3004, blockPos, 0);
            result = waxable;
        }

        if (result.isPresent()) {
            if (player instanceof ServerPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)player, blockPos, itemStack);
            }

            level.setBlock(blockPos, result.get(), 11);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(player, result.get()));
            if (player != null) {
                itemStack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(context.getHand()));
            }

            cir.setReturnValue(InteractionResult.sidedSuccess(level.isClientSide));
        } else {
            cir.setReturnValue(InteractionResult.PASS);
        }

    }

    @Inject(method = "useShovelOn", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private void  onUseShovelOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> cir) {
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = level.getBlockState(blockPos);
        if (context.getClickedFace() == Direction.DOWN) {
            cir.setReturnValue(InteractionResult.PASS);
        } else {
            Player player = context.getPlayer();
            BlockState blockState2 = blockState.getToolModifiedState(context, ToolActions.SHOVEL_FLATTEN, false);
            BlockState blockState3 = null;
            if (blockState2 != null && level.getBlockState(blockPos.above()).isAir()) {
                level.playSound(player, blockPos, SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0F, 1.0F);
                blockState3 = blockState2;
            } else if (blockState.getBlock() instanceof CampfireBlock && blockState.getValue(CampfireBlock.LIT)) {
                if (!level.isClientSide()) {
                    level.levelEvent(null, 1009, blockPos, 0);
                }

                CampfireBlock.dowse(context.getPlayer(), level, blockPos, blockState);
                blockState3 = blockState.setValue(CampfireBlock.LIT, false);
            }

            if (blockState3 != null) {
                if (!level.isClientSide) {
                    level.setBlock(blockPos, blockState3, 11);
                    level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(player, blockState3));
                    if (player != null) {
                        context.getItemInHand().hurtAndBreak(1, player, p -> p.broadcastBreakEvent(context.getHand()));
                    }
                }

                cir.setReturnValue(InteractionResult.sidedSuccess(level.isClientSide)); ;
            } else {
                cir.setReturnValue(InteractionResult.PASS);
            }
        }
    }

    public InteractionResult useHoeOn(UseOnContext context)
    {
        Level level = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        BlockState toolModifiedState = level.getBlockState(blockpos).getToolModifiedState(context, ToolActions.HOE_TILL, false);
        Pair<Predicate<UseOnContext>, Consumer<UseOnContext>> pair = toolModifiedState == null ? null : Pair.of(ctx -> true, changeIntoState(toolModifiedState));
        if (pair == null) {
            return InteractionResult.PASS;
        } else {
            Predicate<UseOnContext> predicate = pair.getFirst();
            Consumer<UseOnContext> consumer = pair.getSecond();
            if (predicate.test(context)) {
                Player player = context.getPlayer();
                level.playSound(player, blockpos, SoundEvents.HOE_TILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                if (!level.isClientSide) {
                    consumer.accept(context);
                    if (player != null) {
                        context.getItemInHand().hurtAndBreak(1, player, (player1) -> {
                            player1.broadcastBreakEvent(context.getHand());
                        });
                    }
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            } else {
                return InteractionResult.PASS;
            }
        }
    }

    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        if (stack.getItem() instanceof GTToolItem item) {
            switch (item.getToolType())
            {
                case AXE -> {
                    return ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction);
                }

                case SHOVEL -> {
                    return ToolActions.DEFAULT_SHOVEL_ACTIONS.contains(toolAction);
                }

                case HOE -> {
                    return ToolActions.DEFAULT_HOE_ACTIONS.contains(toolAction);
                }

                default -> {
                    return false;
                }
            }
        }
        return false;
    }
}
