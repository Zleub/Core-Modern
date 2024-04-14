package su.terrafirmagreg.core.mixins.client.gtceu;

import com.google.gson.JsonElement;
import com.gregtechceu.gtceu.client.renderer.block.SurfaceRockRenderer;
import com.gregtechceu.gtceu.data.pack.GTDynamicResourcePack;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
@Mixin(value = SurfaceRockRenderer.class, remap = false)
@OnlyIn(Dist.CLIENT)
public abstract class SurfaceRockRendererMixin {

    /**
     * Добавляет моделям пылей из GTCEu возможность поворачиваться.
     */
    @Redirect(method = "reinitModels", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/pack/GTDynamicResourcePack;addBlockState(Lnet/minecraft/resources/ResourceLocation;Ljava/util/function/Supplier;)V"), remap = false)
    private static void tfg$reinitModels(ResourceLocation loc, Supplier<JsonElement> generator, @Local SurfaceRockRenderer model, @Local(ordinal = 0) ResourceLocation blockId, @Local(ordinal = 1) ResourceLocation modelId) {

        GTDynamicResourcePack.addBlockState(blockId, MultiVariantGenerator
                .multiVariant(((SurfaceRockRendererAccessor) model).getBlock(),
                        Variant.variant().with(VariantProperties.MODEL, modelId).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0),
                        Variant.variant().with(VariantProperties.MODEL, modelId).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90),
                        Variant.variant().with(VariantProperties.MODEL, modelId).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180),
                        Variant.variant().with(VariantProperties.MODEL, modelId).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
                )
                .with(BlockModelGenerators.createFacingDispatch()));
    }
}
