package su.terrafirmagreg.core.mixins.client.tfc;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.mojang.blaze3d.MethodsReturnNonnullByDefault;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.dries007.tfc.client.RenderHelpers;
import net.dries007.tfc.client.model.IngotPileBlockModel;
import net.dries007.tfc.client.model.SimpleStaticBlockEntityModel;
import net.dries007.tfc.common.blockentities.IngotPileBlockEntity;
import net.dries007.tfc.common.blocks.devices.IngotPileBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import su.terrafirmagreg.core.ClientEventHandler;
import su.terrafirmagreg.core.mixins.common.tfc.IngotPileBlockEntityAccessor;
import su.terrafirmagreg.core.objects.TFGHelpers;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Function;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@Mixin(IngotPileBlockModel.class)
@OnlyIn(Dist.CLIENT)
public abstract class IngotPileBlockModelMixin implements SimpleStaticBlockEntityModel<IngotPileBlockModel, IngotPileBlockEntity> {

    /**
     * Измененный метод рендера кучек с одинарными слитками. Теперь они отрисовываются исходя из цвета материала слитка, инфа берется из GTCEu.
     * */
    @Override
    public TextureAtlasSprite render(IngotPileBlockEntity pile, PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay)
    {
        final int ingots = pile.getBlockState().getValue(IngotPileBlock.COUNT);
        final Function<ResourceLocation, TextureAtlasSprite> textureAtlas = Minecraft.getInstance().getTextureAtlas(RenderHelpers.BLOCKS_ATLAS);

        final var pileEntries = ((IngotPileBlockEntityAccessor) (Object) pile).getEntries();

        TextureAtlasSprite sprite = null;
        for (int i = 0; i < ingots; i++)
        {
            final var stack = TFGHelpers.getStackFromIngotPileTileEntityByIndex(pileEntries, i);
            final var material = ChemicalHelper.getMaterial(stack);
            final int primaryColor = material == null ? 0 : material.material().getMaterialARGB(0);
            final int secondaryColor = material == null ? 0 : material.material().getMaterialARGB(1);

            sprite = textureAtlas.apply(ClientEventHandler.TFCMetalBlockTexturePattern);

            final int layer = (i + 8) / 8;
            final boolean oddLayer = (layer % 2) == 1;
            final float x = (i % 4) * 0.25f;
            final float y = (layer - 1) * 0.125f;
            final float z = i % 8 >= 4 ? 0.5f : 0;

            poseStack.pushPose();
            if (oddLayer)
            {
                // Rotate 90 degrees every other layer
                poseStack.translate(0.5f, 0f, 0.5f);
                poseStack.mulPose(Axis.YP.rotationDegrees(90f));
                poseStack.translate(-0.5f, 0f, -0.5f);
            }

            poseStack.translate(x, y, z);

            final float scale = 0.0625f / 2f;
            final float minX = scale * 0.5f;
            final float minY = scale * 0f;
            final float minZ = scale * 0.5f;
            final float maxX = scale * (minX + 7);
            final float maxY = scale * (minY + 4);
            final float maxZ = scale * (minZ + 15);

            TFGHelpers.renderTexturedTrapezoidalCuboid(poseStack, buffer, sprite, packedLight, packedOverlay, minX, maxX, minZ, maxZ, minX + scale, maxX - scale, minZ + scale, maxZ - scale, minY, maxY, 7, 4, 15, oddLayer, primaryColor, secondaryColor);

            poseStack.popPose();
        }

        if (sprite == null) sprite = RenderHelpers.missingTexture();

        return sprite;
    }
}
