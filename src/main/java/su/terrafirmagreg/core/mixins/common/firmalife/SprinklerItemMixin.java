package su.terrafirmagreg.core.mixins.common.firmalife;

import com.eerussianguy.firmalife.common.items.SprinklerItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value = SprinklerItem.class, remap = false)
public abstract class SprinklerItemMixin extends BlockItem {

    @Shadow @Final
    private Block floorBlock;

    public SprinklerItemMixin(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Nullable
    @Override
    protected BlockState getPlacementState(BlockPlaceContext context)
    {
        final Level level = context.getLevel();
        final BlockPos pos = context.getClickedPos();
        final BlockPos.MutableBlockPos cursor = new BlockPos.MutableBlockPos();

        for (Direction dir : context.getNearestLookingDirections())
        {
            cursor.setWithOffset(pos, dir);

            if (dir == Direction.UP)
            {
                return super.getPlacementState(context);
            }
            else if (dir == Direction.DOWN)
            {
                return tfg$getPlacementState(floorBlock, context);
            }
        }
        return null;
    }

    @Unique
    @Nullable
    private BlockState tfg$getPlacementState(Block block, BlockPlaceContext context)
    {
        final BlockState state = block.getStateForPlacement(context);
        return state != null && this.canPlace(context, state) ? state : null;
    }
}
