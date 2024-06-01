package su.terrafirmagreg.core.mixins.common.minecraft;

import net.minecraft.world.item.context.UseOnContext;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = UseOnContext.class)
public interface IUseOnContextInvoker {

//    @Invoker
//    BlockHitResult invokeGetHitResult();

}
