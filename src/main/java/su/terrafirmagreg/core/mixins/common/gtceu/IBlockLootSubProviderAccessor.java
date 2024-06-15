package su.terrafirmagreg.core.mixins.common.gtceu;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BlockLootSubProvider.class)
public interface IBlockLootSubProviderAccessor {

    @Accessor("HAS_NO_SILK_TOUCH")
    static LootItemCondition.Builder getHasNoSilkTouchCondition() {
        throw new UnsupportedOperationException();
    }
}
