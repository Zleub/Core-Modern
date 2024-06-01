package su.terrafirmagreg.core.mixins.client.gtceu;

import com.gregtechceu.gtceu.client.renderer.block.SurfaceRockRenderer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = SurfaceRockRenderer.class, remap = false)
@OnlyIn(Dist.CLIENT)
public interface ISurfaceRockRendererAccessor {

    @Accessor
    Block getBlock();
}
