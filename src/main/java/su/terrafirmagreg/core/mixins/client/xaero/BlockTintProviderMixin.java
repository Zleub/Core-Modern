package su.terrafirmagreg.core.mixins.client.xaero;

import net.dries007.tfc.client.TFCColors;
import net.dries007.tfc.common.blocks.soil.IGrassBlock;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import xaero.map.biome.BlockTintProvider;

@OnlyIn(Dist.CLIENT)
@Mixin(value = BlockTintProvider.class, remap = false)
public class BlockTintProviderMixin {

    @Redirect(method = "getBiomeColor", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/color/block/BlockColors;getColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;I)I"), remap = true)
    private int onVanillaGetColor(BlockColors instance, BlockState pState, BlockAndTintGetter pLevel, BlockPos pPos, int pTintIndex) {
        if (pState.getBlock() instanceof IGrassBlock)
            return TFCColors.getGrassColor(pPos, pTintIndex);
        return instance.getColor(pState, (BlockAndTintGetter) this, pPos, pTintIndex);
    }

}
