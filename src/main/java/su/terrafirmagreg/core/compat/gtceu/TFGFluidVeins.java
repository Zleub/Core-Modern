package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.worldgen.bedrockfluid.BedrockFluidDefinition;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;

public class TFGFluidVeins {

    public static BedrockFluidDefinition SALT_WATER = BedrockFluidDefinition.builder(GTCEu.id("salt_water_deposit"))
            .fluid(() -> BuiltInRegistries.FLUID.get(new ResourceLocation("tfc", "salt_water")))
            .weight(5)
            .yield(50, 100)
            .depletionAmount(1)
            .depletionChance(100)
            .depletedYield(15)
            .biomes(200, Biomes.DEEP_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_FROZEN_OCEAN)
            .biomes(150, BiomeTags.IS_OCEAN)
            .register();

    public static void register() {}

}
