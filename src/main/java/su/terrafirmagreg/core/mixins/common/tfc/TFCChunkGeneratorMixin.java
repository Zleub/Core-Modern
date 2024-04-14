package su.terrafirmagreg.core.mixins.common.tfc;

import com.gregtechceu.gtceu.api.data.worldgen.ores.OrePlacer;
import net.dries007.tfc.world.TFCChunkGenerator;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TFCChunkGenerator.class)
public abstract class TFCChunkGeneratorMixin {

    @Unique
    private final OrePlacer tfg$orePlacer = new OrePlacer();

    /**
     * Для того, чтобы генератор руд грега работал в мире TFC.
     * */
    @Inject(method = "applyBiomeDecoration", at = @At("TAIL"), remap = true)
    private void tfg$applyBiomeDecoration(WorldGenLevel level, ChunkAccess chunk, StructureManager structureManager, CallbackInfo ci) {
        tfg$orePlacer.placeOres(level, (ChunkGenerator) ((Object) this), chunk);
    }
}
