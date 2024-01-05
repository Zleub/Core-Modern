package su.terrafirmagreg.core.mixins.client.xaero;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xaero.common.IXaeroMinimap;
import xaero.common.MinimapLogs;
import xaero.common.minimap.write.MinimapWriter;
import xaero.common.minimap.write.biome.BiomeBlendCalculator;

@Mixin(value = MinimapWriter.class, remap = false)
public class Test {

    /*
    @Inject(method = "addBlockColorMultipliers", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/color/block/BlockColors;getColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;I)I"), remap = false, cancellable = true)
    private void dead(int c, BlockState state, Level world, BlockPos pos, CallbackInfoReturnable<Integer> cir) {
        System.out.println(state);
        cir.setReturnValue(0);
    }*/

    @Shadow private IXaeroMinimap modMain;

    @Shadow private boolean loadingBiomesVanillaMode;

    @Shadow @Final
    private BiomeBlendCalculator biomeBlendCalculator;

    /**
     * @author 123
     * @reason 123
     */
    @Overwrite
    private int addBlockColorMultipliers(int c, BlockState state, Level world, BlockPos pos) {
        if (this.modMain.getSettings().getBlockColours() == 1 && !this.loadingBiomesVanillaMode) {
            return c;
        } else {
            int grassColor = 16777215;

            try {
                grassColor = Minecraft.getInstance().getBlockColors().getColor(state, this.biomeBlendCalculator, pos, 0);
                System.out.println(grassColor);
            } catch (Throwable var12) {
                MinimapLogs.LOGGER.error("suppressed exception", var12);
            }

            if (grassColor != -1 && grassColor != 16777215) {
                float rMultiplier = (float)(c >> 16 & 255) / 255.0F;
                float gMultiplier = (float)(c >> 8 & 255) / 255.0F;
                float bMultiplier = (float)(c & 255) / 255.0F;
                int red = (int)((float)(grassColor >> 16 & 255) * rMultiplier);
                int green = (int)((float)(grassColor >> 8 & 255) * gMultiplier);
                int blue = (int)((float)(grassColor & 255) * bMultiplier);
                c = c & -16777216 | red << 16 | green << 8 | blue;
            }

            return c;
        }
    }

}
