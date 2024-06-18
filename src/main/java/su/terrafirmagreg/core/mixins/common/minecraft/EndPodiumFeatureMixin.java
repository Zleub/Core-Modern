package su.terrafirmagreg.core.mixins.common.minecraft;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelWriter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.EndPodiumFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(EndPodiumFeature.class)
public abstract class EndPodiumFeatureMixin extends Feature<NoneFeatureConfiguration> {

    public EndPodiumFeatureMixin(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Redirect(method = "place", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/levelgen/feature/EndPodiumFeature;setBlock(Lnet/minecraft/world/level/LevelWriter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", ordinal = 6))
    private void tfg$place(EndPodiumFeature instance, LevelWriter levelWriter, BlockPos blockPos, BlockState state) {}

}
