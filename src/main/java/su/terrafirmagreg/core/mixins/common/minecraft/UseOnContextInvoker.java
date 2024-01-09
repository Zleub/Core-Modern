package su.terrafirmagreg.core.mixins.common.minecraft;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = UseOnContext.class)
public interface UseOnContextInvoker {

    @Invoker
    BlockHitResult invokeGetHitResult();

}
