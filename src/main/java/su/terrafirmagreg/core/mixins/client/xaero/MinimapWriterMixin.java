package su.terrafirmagreg.core.mixins.client.xaero;

import net.dries007.tfc.client.TFCColors;
import net.dries007.tfc.common.blocks.soil.IGrassBlock;
import net.dries007.tfc.common.blocks.soil.TFCSandBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import xaero.common.IXaeroMinimap;
import xaero.common.MinimapLogs;
import xaero.common.minimap.write.MinimapWriter;
import xaero.common.minimap.write.biome.BiomeBlendCalculator;

@Mixin(value = MinimapWriter.class, remap = false)
public class MinimapWriterMixin {

    @Shadow @Final private BiomeBlendCalculator biomeBlendCalculator;

    @Redirect(method = "addBlockColorMultipliers", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/color/block/BlockColors;getColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;I)I"), remap = false)
    private int onVanillaGetColor(BlockColors instance, BlockState pState, BlockAndTintGetter pLevel, BlockPos pPos, int pTintIndex) {
        if (pState.getBlock() instanceof IGrassBlock)
            return TFCColors.getGrassColor(pPos, pTintIndex);
        return instance.getColor(pState, biomeBlendCalculator, pPos, 0);
    }
}
