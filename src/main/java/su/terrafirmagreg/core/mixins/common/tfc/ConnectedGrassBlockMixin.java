package su.terrafirmagreg.core.mixins.common.tfc;

import net.dries007.tfc.common.blocks.soil.ConnectedGrassBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Consumer;

@Mixin(value = ConnectedGrassBlock.class, remap = false)
public class ConnectedGrassBlockMixin {


    @Redirect(method = "getToolModifiedState", at = @At(value = "INVOKE", target = "Ljava/util/function/Consumer;accept(Ljava/lang/Object;)V"), remap = false)
    public <T> void getToolModifiedState(Consumer instance, T t) {}

}
