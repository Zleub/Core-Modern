package su.terrafirmagreg.core.mixins.common.firmalife;

import com.eerussianguy.firmalife.common.blockentities.SprinklerBlockEntity;
import com.gregtechceu.gtceu.api.blockentity.PipeBlockEntity;
import com.gregtechceu.gtceu.common.blockentity.FluidPipeBlockEntity;
import com.lowdragmc.lowdraglib.side.fluid.FluidStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * @author Exception
 * Позволяет спринклеру кушать воду из труб GregTech.
 * */
@Mixin(value = SprinklerBlockEntity.class, remap = false)
public abstract class SprinklerBlockEntityMixin {

    @Unique
    private static final Fluid tfg$CACHED_WATER = ForgeRegistries.FLUIDS.getValue(new ResourceLocation("minecraft:water"));


    @Redirect(method = "serverTick", at = @At(value = "INVOKE", target = "Lcom/eerussianguy/firmalife/common/blockentities/SprinklerBlockEntity;searchForFluid(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/material/Fluid;"), remap = false)
    private static Fluid serverTickSearch(Level l1, BlockPos pos1, Direction dir1, Level level, BlockPos pos, BlockState state, SprinklerBlockEntity sprinkler) {
        var posAbove = pos.above();
        var pipeAboveEntity = (FluidPipeBlockEntity) level.getBlockEntity(posAbove);

        if (pipeAboveEntity != null) {
            var isConnected = PipeBlockEntity.isConnected(pipeAboveEntity.getConnections(), Direction.DOWN);

            return tfg$drainFluid(pipeAboveEntity, isConnected);
        }

        var posBelow = pos.below();
        var pipeBelowEntity = (FluidPipeBlockEntity) level.getBlockEntity(posBelow);

        if (pipeBelowEntity != null) {
            var isConnected = PipeBlockEntity.isConnected(pipeBelowEntity.getConnections(), Direction.UP);

            return tfg$drainFluid(pipeBelowEntity, isConnected);
        }

        return null;
    }

    @Unique
    private static Fluid tfg$drainFluid(FluidPipeBlockEntity pipeEntity, boolean isConnected) {
        if (!isConnected) return null;

        var tanks = pipeEntity.getFluidTanks();

        for (var tank : tanks) {
            var drainedFluid =  tank.drain(FluidStack.create(tfg$CACHED_WATER, 10), false);

            if (drainedFluid == FluidStack.empty())
                return null;

            return drainedFluid.getFluid();
        }

        return null;
    }
}