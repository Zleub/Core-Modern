package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.data.worldgen.bedrockfluid.BedrockFluidDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;

public class TFGFluidVeins {

    public static final BedrockFluidDefinition SALT_WATER = BedrockFluidDefinition.builder(new ResourceLocation("tfg", "tfc_salt_water_deposit"))
            .fluid(() -> ForgeRegistries.FLUIDS.getValue(new ResourceLocation("tfc", "salt_water")))
            .weight(5)
            .yield(50, 100)
            .depletionAmount(1)
            .depletionChance(100)
            .depletedYield(15)
            .dimensions(Set.of(Level.OVERWORLD))
            .register();

    public static void register() {}

}
