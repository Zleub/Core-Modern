package su.terrafirmagreg.core.mixins.common.firmalife;

import com.eerussianguy.firmalife.common.FLTags;
import com.eerussianguy.firmalife.common.util.GreenhouseType;
import com.eerussianguy.firmalife.common.util.Mechanics;
import net.dries007.tfc.util.Helpers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Mechanics.class, remap = false)
public abstract class MechanicsMixin {

    @Inject(method = "lambda$tryFindGreenhouseInfo$2", at = @At("HEAD"), cancellable = true)
    private static void tryFindCellarInfo$0(GreenhouseType greenhouse, Level level, BlockState wallState, BlockPos wallPos, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        if (Helpers.isBlock(wallState, FLTags.Blocks.ALWAYS_VALID_GREENHOUSE_WALL))
            cir.setReturnValue(true);
    }

}
