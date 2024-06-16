package su.terrafirmagreg.core.mixins.common.tfcastikocarts;

import com.google.common.collect.ImmutableSet;
import com.gregtechceu.gtceu.api.item.IGTTool;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
import com.gregtechceu.gtceu.api.item.tool.aoe.AoESymmetrical;
import de.mennomax.astikorcarts.entity.AbstractDrawnInventoryEntity;
import de.mennomax.astikorcarts.util.ProxyItemUseContext;
import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.common.blocks.GroundcoverBlock;
import net.dries007.tfc.common.blocks.devices.PlacedItemBlock;
import net.dries007.tfc.common.blocks.rock.LooseRockBlock;
import net.dries007.tfc.common.blocks.wood.ILeavesBlock;
import net.dries007.tfc.common.container.ISlotCallback;
import net.dries007.tfc.util.Helpers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ToolActions;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tfcastikorcarts.common.entities.carts.TFCPlowEntity;

import java.util.Set;

// TODO

@Pseudo
@Mixin(value = TFCPlowEntity.class, remap = false)
public abstract class TFCPlowEntityMixin extends AbstractDrawnInventoryEntity implements ISlotCallback {
    public TFCPlowEntityMixin(EntityType<? extends Entity> entityTypeIn, Level worldIn) {
        super(entityTypeIn, worldIn);
    }

//    @Shadow @Final
//    public static int SLOT_COUNT;
//
//    @Shadow @Final
//    public static double BLADEOFFSET;
//
//    public TFCPlowEntityMixin(EntityType<? extends Entity> entityTypeIn, Level worldIn) {
//        super(entityTypeIn, worldIn);
//    }
//
//    @Shadow
//    public ItemStack getStackInSlot(int i) {
//        throw new AssertionError();
//    }
//
//    @Shadow
//    public void updateSlot(int slot) {
//        throw new AssertionError();
//    }
//
//    // TODO
//    /**
//     *
//     * */
//    @Inject(method = "plow", at = @At(value = "HEAD"), remap = false, cancellable = true)
//    public void tfg$plow(Player player, CallbackInfo ci) {
//        for (int i = 0; i < SLOT_COUNT; i++)
//        {
//            final ItemStack stack = getStackInSlot(i);
//            if (stack.getItem() instanceof IGTTool toolItem)
//            {
//                float offset = 38.0F - i * 38.0F;
//                double blockPosX = this.getX() + Mth.sin((float) Math.toRadians(this.getYRot() - offset)) * BLADEOFFSET;
//                double blockPosZ = this.getZ() - Mth.cos((float) Math.toRadians(this.getYRot() - offset)) * BLADEOFFSET;
//                BlockPos blockPos = new BlockPos((int) blockPosX, (int) (this.getY() - 0.5D), (int) blockPosZ);
//
//                if (toolItem.getToolType() == GTToolType.SCYTHE)
//                {
//                    final BlockPos upPos = blockPos.above();
//                    final BlockPos upUpPos = upPos.above();
//                    final BlockState blockStateAt = level().getBlockState(blockPos);
//                    final BlockState blockStateAtUp = level().getBlockState(upPos);
//                    final BlockState blockStateAtUpUp = level().getBlockState(upUpPos);
//                    final Block blockAt = blockStateAt.getBlock();
//                    final Block blockAtUp = blockStateAtUp.getBlock();
//                    final Block blockAtUpUp = blockStateAtUpUp.getBlock();
//
//                    if (blockAt instanceof BushBlock || blockAt instanceof GroundcoverBlock || blockAt instanceof LooseRockBlock || blockAt instanceof PlacedItemBlock || blockAt instanceof ILeavesBlock || Helpers.isBlock(blockAt, TFCTags.Blocks.MINEABLE_WITH_SCYTHE))
//                    {
//                        Block.dropResources(blockStateAt, level(), blockPos, blockStateAt.hasBlockEntity() ? level().getBlockEntity(blockPos) : null, player, player.getMainHandItem());
//                        level().destroyBlock(blockPos, true);
//                    }
//                    if (blockAtUp instanceof BushBlock || blockAtUp instanceof GroundcoverBlock || blockAtUp instanceof LooseRockBlock || blockAtUp instanceof PlacedItemBlock || blockAtUp instanceof ILeavesBlock || Helpers.isBlock(blockAtUp, TFCTags.Blocks.MINEABLE_WITH_SCYTHE))
//                    {
//                        Block.dropResources(blockStateAtUp, level(), upPos, blockStateAtUp.hasBlockEntity() ? level().getBlockEntity(upPos) : null, player, player.getMainHandItem());
//                        level().destroyBlock(upPos, true);
//                    }
//                    if (blockAtUpUp instanceof BushBlock || blockAtUpUp instanceof GroundcoverBlock || blockAtUpUp instanceof LooseRockBlock || blockAtUpUp instanceof PlacedItemBlock || blockAtUpUp instanceof ILeavesBlock || Helpers.isBlock(blockAtUpUp, TFCTags.Blocks.MINEABLE_WITH_SCYTHE))
//                    {
//                        Block.dropResources(blockStateAtUpUp, level(), upUpPos, blockStateAtUpUp.hasBlockEntity() ? level().getBlockEntity(upUpPos) : null, player, player.getMainHandItem());
//                        level().destroyBlock(upUpPos, true);
//                    }
//
//                    ToolHelper.damageItem(stack, player);
//
//                    if (toolItem.definition$getDamage(stack) >= toolItem.definition$getMaxDamage(stack))
//                    {
//                        playSound(SoundEvents.ITEM_BREAK, 0.8F, 0.8F + level().random.nextFloat() * 0.4F);
//                        updateSlot(i);
//                    }
//                }
//                else if (toolItem.getToolType() == GTToolType.KNIFE || toolItem.getToolType() == GTToolType.BUTCHERY_KNIFE)
//                {
//                    final BlockPos upPos = blockPos.above();
//                    final BlockPos upUpPos = upPos.above();
//                    final Block blockAt = this.level().getBlockState(blockPos).getBlock();
//                    final Block blockAtUp = this.level().getBlockState(upPos).getBlock();
//                    final Block blockAtUpUp = this.level().getBlockState(upUpPos).getBlock();
//
//                    if (blockAt instanceof BushBlock || blockAt instanceof GroundcoverBlock || blockAt instanceof LooseRockBlock || blockAt instanceof PlacedItemBlock || blockAt instanceof ILeavesBlock || Helpers.isBlock(blockAt, TFCTags.Blocks.MINEABLE_WITH_KNIFE))
//                    {
//                        this.level().destroyBlock(blockPos, true);
//                    }
//                    if (blockAtUp instanceof BushBlock || blockAtUp instanceof GroundcoverBlock || blockAtUp instanceof LooseRockBlock || blockAtUp instanceof PlacedItemBlock || blockAtUp instanceof ILeavesBlock || Helpers.isBlock(blockAtUp, TFCTags.Blocks.MINEABLE_WITH_KNIFE))
//                    {
//                        this.level().destroyBlock(upPos, true);
//                    }
//                    if (blockAtUpUp instanceof BushBlock || blockAtUpUp instanceof GroundcoverBlock || blockAtUpUp instanceof LooseRockBlock || blockAtUpUp instanceof PlacedItemBlock || blockAtUpUp instanceof ILeavesBlock || Helpers.isBlock(blockAtUpUp, TFCTags.Blocks.MINEABLE_WITH_KNIFE))
//                    {
//                        this.level().destroyBlock(upUpPos, true);
//                    }
//
//                    ToolHelper.damageItem(stack, null);
//
//                    if (toolItem.definition$getDamage(stack) >= toolItem.definition$getMaxDamage(stack))
//                    {
//                        playSound(SoundEvents.ITEM_BREAK, 0.8F, 0.8F + level().random.nextFloat() * 0.4F);
//                        updateSlot(i);
//                    }
//                }
//                else if (toolItem.getToolType() == GTToolType.HOE)
//                {
//                    final BlockPos upPos = blockPos.above();
//                    final BlockPos upUpPos = upPos.above();
//                    final Block blockAt = this.level().getBlockState(blockPos).getBlock();
//                    final Block blockAtUp = this.level().getBlockState(upPos).getBlock();
//                    final Block blockAtUpUp = this.level().getBlockState(upUpPos).getBlock();
//
//                    if (blockAt instanceof BushBlock || blockAt instanceof GroundcoverBlock || blockAt instanceof LooseRockBlock || blockAt instanceof PlacedItemBlock)
//                    {
//                        this.level().destroyBlock(blockPos, true);
//                    }
//                    if (blockAtUp instanceof BushBlock || blockAtUp instanceof GroundcoverBlock || blockAtUp instanceof LooseRockBlock || blockAtUp instanceof PlacedItemBlock)
//                    {
//                        this.level().destroyBlock(upPos, true);
//                    }
//                    if (blockAtUpUp instanceof BushBlock || blockAtUpUp instanceof GroundcoverBlock || blockAtUpUp instanceof LooseRockBlock || blockAtUpUp instanceof PlacedItemBlock)
//                    {
//                        this.level().destroyBlock(upUpPos, true);
//                    }
//
//                    tfg$onItemUseHoe(new ProxyItemUseContext(player, stack, new BlockHitResult(new Vec3(blockPos.getX(), blockPos.getY(), blockPos.getZ()), Direction.UP, blockPos, false)));
//
//                    ToolHelper.damageItem(stack, player);
//                    if (toolItem.definition$getDamage(stack) >= toolItem.definition$getMaxDamage(stack))
//                    {
//                        playSound(SoundEvents.ITEM_BREAK, 0.8F, 0.8F + level().random.nextFloat() * 0.4F);
//                        updateSlot(i);
//                    }
//                }
//                else if (toolItem.getToolType() == GTToolType.SHOVEL) {
//                    final BlockPos upPos = blockPos.above();
//                    final BlockPos upUpPos = upPos.above();
//                    final Block blockAt = this.level().getBlockState(blockPos).getBlock();
//                    final Block blockAtUp = this.level().getBlockState(upPos).getBlock();
//                    final Block blockAtUpUp = this.level().getBlockState(upUpPos).getBlock();
//
//                    if (blockAt instanceof BushBlock || blockAt instanceof GroundcoverBlock || blockAt instanceof LooseRockBlock || blockAt instanceof PlacedItemBlock)
//                    {
//                        this.level().destroyBlock(blockPos, true);
//                    }
//                    if (blockAtUp instanceof BushBlock || blockAtUp instanceof GroundcoverBlock || blockAtUp instanceof LooseRockBlock || blockAtUp instanceof PlacedItemBlock)
//                    {
//                        this.level().destroyBlock(upPos, true);
//                    }
//                    if (blockAtUpUp instanceof BushBlock || blockAtUpUp instanceof GroundcoverBlock || blockAtUpUp instanceof LooseRockBlock || blockAtUpUp instanceof PlacedItemBlock)
//                    {
//                        this.level().destroyBlock(upUpPos, true);
//                    }
//
//                    tfg$onItemUseShovel(new ProxyItemUseContext(player, stack, new BlockHitResult(new Vec3(blockPos.getX(), blockPos.getY(), blockPos.getZ()), Direction.UP, blockPos, false)));
//
//                    ToolHelper.damageItem(stack, player);
//                    if (toolItem.definition$getDamage(stack) >= toolItem.definition$getMaxDamage(stack))
//                    {
//                        playSound(SoundEvents.ITEM_BREAK, 0.8F, 0.8F + level().random.nextFloat() * 0.4F);
//                        updateSlot(i);
//                    }
//                }
//            }
//        }
//
//        ci.cancel();
//    }
//
//    @Unique
//    private static InteractionResult tfg$onItemUseHoe(UseOnContext context) {
//        if (context.getClickedFace() == Direction.DOWN) return InteractionResult.PASS;
//
////        System.out.println(context.getHitResult().getDirection() + " " + context.getHitResult().getLocation());
//
//        Level world = context.getLevel();
//        Player player = context.getPlayer();
//        BlockPos pos = context.getClickedPos();
//        InteractionHand hand = context.getHand();
//
//        ItemStack stack = context.getItemInHand();
//        AoESymmetrical aoeDefinition = ToolHelper.getAoEDefinition(stack);
//
//        Set<BlockPos> blocks;
//        // only attempt to till if the center block is tillable
//        if (tfg$isBlockTillable(stack, world, player, pos, context)) {
//            if (aoeDefinition == AoESymmetrical.none()) {
//                blocks = ImmutableSet.of(pos);
//            } else {
//                HitResult rayTraceResult = ToolHelper.getPlayerDefaultRaytrace(player);
//
//                if (rayTraceResult == null) return InteractionResult.PASS;
//                if (rayTraceResult.getType() != HitResult.Type.BLOCK) return InteractionResult.PASS;
//                if (!(rayTraceResult instanceof BlockHitResult blockHitResult))
//                    return InteractionResult.PASS;
//                if (blockHitResult.getDirection() == null)
//                    return InteractionResult.PASS;
//
//                blocks = tfg$getTillableBlocks(stack, aoeDefinition, world, player, blockHitResult);
//                if (tfg$isBlockTillable(stack, world, player, blockHitResult.getBlockPos(), context)) {
//                    blocks.add(blockHitResult.getBlockPos());
//                }
//            }
//        } else return InteractionResult.PASS;
//
//        boolean tilled = false;
//        for (BlockPos blockPos : blocks) {
//            BlockState state = world.getBlockState(blockPos);
//            //
//            tilled |= tfg$tillGround(new UseOnContext(world, player, hand, stack, context.getHitResult().withPosition(blockPos)), state);
////            if (!player.isCreative()) {
////                // ToolHelper.damageItem(context.getItemInHand(), context.getPlayer());
////            }
//            if (stack.isEmpty())
//                break;
//        }
//
//        if (tilled) {
//            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.HOE_TILL,
//                    SoundSource.PLAYERS, 1.0F, 1.0F);
//            player.swing(hand);
//            return InteractionResult.SUCCESS;
//        }
//
//        return InteractionResult.PASS;
//    }
//
//    @Unique
//    private static Set<BlockPos> tfg$getTillableBlocks(ItemStack stack, AoESymmetrical aoeDefinition, Level world, Player player, HitResult rayTraceResult) {
//        return ToolHelper.iterateAoE(stack, aoeDefinition, world, player, rayTraceResult, TFCPlowEntityMixin::tfg$isBlockTillable);
//    }
//
//    @Unique
//    private static boolean tfg$isBlockTillable(ItemStack stack, Level world, Player player, BlockPos pos, UseOnContext context) {
//        if (world.getBlockState(pos.above()).isAir()) {
//            BlockState state = world.getBlockState(pos);
//            BlockState newState = state.getToolModifiedState(context, ToolActions.HOE_TILL, false);
//            return newState != null && newState != state;
//        }
//        return false;
//    }
//
//    @Unique
//    private static boolean tfg$tillGround(UseOnContext context, BlockState state) {
//        BlockState newState = state.getToolModifiedState(context, ToolActions.HOE_TILL, false);
//        if (newState != null && newState != state) {
//            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), GameEvent.Context.of(context.getPlayer(), state));
//            return context.getLevel().setBlock(context.getClickedPos(), newState, Block.UPDATE_ALL_IMMEDIATE);
//        }
//        return false;
//    }
//
//    @Unique
//    private static InteractionResult tfg$onItemUseShovel(UseOnContext context) {
//        if (context.getClickedFace() == Direction.DOWN)
//            return InteractionResult.PASS;
//
//        Level level = context.getLevel();
//        Player player = context.getPlayer();
//        BlockPos pos = context.getClickedPos();
//        InteractionHand hand = context.getHand();
//
//        ItemStack stack = context.getItemInHand();
//        AoESymmetrical aoeDefinition = ToolHelper.getAoEDefinition(stack);
//
//        Set<BlockPos> blocks;
//        // only attempt to till if the center block is tillable
//        if (level.getBlockState(pos.above()).isAir() && tfg$isBlockPathConvertible(stack, level, player, pos, context)) {
//            if (aoeDefinition == AoESymmetrical.none()) {
//                blocks = ImmutableSet.of(pos);
//            } else {
//                HitResult rayTraceResult = ToolHelper.getPlayerDefaultRaytrace(player);
//
//                if (rayTraceResult == null)
//                    return InteractionResult.PASS;
//                if (rayTraceResult.getType() != HitResult.Type.BLOCK)
//                    return InteractionResult.PASS;
//                if (!(rayTraceResult instanceof BlockHitResult blockHitResult))
//                    return InteractionResult.PASS;
//                if (blockHitResult.getDirection() == null)
//                    return InteractionResult.PASS;
//
//                blocks = tfg$getPathConvertibleBlocks(stack, aoeDefinition, level, player, rayTraceResult);
//                blocks.add(blockHitResult.getBlockPos());
//            }
//        } else
//            return InteractionResult.PASS;
//
//        boolean pathed = false;
//        for (BlockPos blockPos : blocks) {
//            BlockState newState = tfg$getFlattened(level.getBlockState(blockPos), new UseOnContext(level, player, hand, stack, context.getHitResult().withPosition(blockPos)));
//            if (newState == null) {
//                continue;
//            }
//            pathed |= level.setBlock(blockPos, newState, Block.UPDATE_ALL);
////            if (!player.isCreative()) {
////                ToolHelper.damageItem(context.getItemInHand(), context.getPlayer());
////            }
//            if (stack.isEmpty())
//                break;
//        }
//
//        if (pathed) {
//            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SHOVEL_FLATTEN,
//                    SoundSource.PLAYERS, 1.0F, 1.0F);
//            player.swing(hand);
//            return InteractionResult.SUCCESS;
//        }
//
//        return InteractionResult.PASS;
//    }
//
//    @Unique
//    private static Set<BlockPos> tfg$getPathConvertibleBlocks(ItemStack stack, AoESymmetrical aoeDefinition, Level world,
//                                                         Player player, HitResult rayTraceResult) {
//        return ToolHelper.iterateAoE(stack, aoeDefinition, world, player, rayTraceResult, TFCPlowEntityMixin::tfg$isBlockPathConvertible);
//    }
//
//    @Unique
//    private static boolean tfg$isBlockPathConvertible(ItemStack stack, Level level, Player player, BlockPos pos, UseOnContext context) {
//        if (level.getBlockState(pos.above()).isAir()) {
//            BlockState state = level.getBlockState(pos);
//            BlockState newState = state.getToolModifiedState(context, ToolActions.SHOVEL_FLATTEN, false);
//            return newState != null && newState != state;
//        }
//        return false;
//    }
//
//    @Unique
//    private static BlockState tfg$getFlattened(BlockState unFlattenedState, UseOnContext context) {
//        return unFlattenedState.getToolModifiedState(context, ToolActions.SHOVEL_FLATTEN, false);
//    }
}
