package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.common.item.tool.behavior.HoeGroundBehavior;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = HoeGroundBehavior.class, remap = false)
public abstract class HoeBehaviorMixin {

    /**
     * Удобная механика вспахивания грядки под водой.
     */
    @Redirect(method = "isBlockTillable", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;isAir()Z"), remap = true)
    private boolean tfg$isBlockTillable(BlockState instance) {
        return instance.getBlock() == TFCBlocks.SALT_WATER.get() || instance.getBlock() == Blocks.WATER || instance.isAir();
    }

}
