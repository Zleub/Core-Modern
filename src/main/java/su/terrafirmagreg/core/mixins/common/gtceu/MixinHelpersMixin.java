package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.core.MixinHelpers;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = MixinHelpers.class, remap = false)
public abstract class MixinHelpersMixin {

    @Redirect(method = "lambda$generateGTDynamicLoot$23", at = @At(value = "INVOKE", target = "Lnet/minecraft/data/loot/BlockLootSubProvider;createSilkTouchDispatchTable(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/storage/loot/entries/LootPoolEntryContainer$Builder;)Lnet/minecraft/world/level/storage/loot/LootTable$Builder;"), remap = false)
    private static LootTable.Builder tfg$lambda$generateGTDynamicLoot$23(Block pBlock, LootPoolEntryContainer.Builder<?> pBuilder, @Local int oreMultiplier, @Local Block block) {
        return LootTable.lootTable().withPool(
                LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(
                                AlternativesEntry.alternatives(
                                                LootItem.lootTableItem(Items.ACACIA_LEAVES)
                                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, Math.max(1, oreMultiplier))))
                                                        .setWeight(20)
                                                        .when(IBlockLootSubProviderAccessor.getHasNoSilkTouchCondition())
                                                        .apply(ApplyExplosionDecay.explosionDecay()),
                                                LootItem.lootTableItem(Items.STONE)
                                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, Math.max(1, oreMultiplier))))
                                                        .setWeight(60)
                                                        .when(IBlockLootSubProviderAccessor.getHasNoSilkTouchCondition())
                                                        .apply(ApplyExplosionDecay.explosionDecay()),
                                                LootItem.lootTableItem(Items.OAK_BOAT)
                                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, Math.max(1, oreMultiplier))))
                                                        .setWeight(20)
                                                        .when(IBlockLootSubProviderAccessor.getHasNoSilkTouchCondition())
                                                        .apply(ApplyExplosionDecay.explosionDecay())
                                        )
                                        .otherwise(
                                                LootItem.lootTableItem(block)
                                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 1)))
                                        )
                        )
        );
    }

}
