package su.terrafirmagreg.core.mixins.common.tfc;

import net.dries007.tfc.common.blockentities.IngotPileBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(value = IngotPileBlockEntity.class, remap = false)
public interface IngotPileBlockEntityAccessor {

    @Accessor
    List<?> getEntries();
}
