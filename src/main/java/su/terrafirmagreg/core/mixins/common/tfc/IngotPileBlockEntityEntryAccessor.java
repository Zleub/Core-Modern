package su.terrafirmagreg.core.mixins.common.tfc;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = "net.dries007.tfc.common.blockentities.IngotPileBlockEntity$Entry")
public interface IngotPileBlockEntityEntryAccessor {

    @Accessor
    ItemStack getStack();
}
