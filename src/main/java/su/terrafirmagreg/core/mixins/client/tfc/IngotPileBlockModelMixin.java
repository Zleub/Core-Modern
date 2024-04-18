package su.terrafirmagreg.core.mixins.client.tfc;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.mojang.blaze3d.MethodsReturnNonnullByDefault;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.dries007.tfc.TerraFirmaCraft;
import net.dries007.tfc.client.RenderHelpers;
import net.dries007.tfc.client.model.IngotPileBlockModel;
import net.dries007.tfc.client.model.SimpleStaticBlockEntityModel;
import net.dries007.tfc.common.blockentities.IngotPileBlockEntity;
import net.dries007.tfc.common.blocks.devices.IngotPileBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import su.terrafirmagreg.core.mixins.common.tfc.IngotPileBlockEntityEntryAccessor;
import su.terrafirmagreg.core.mixins.common.tfc.IngotPileBlockEntityAccessor;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.function.Function;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@Mixin(IngotPileBlockModel.class)
@OnlyIn(Dist.CLIENT)
public abstract class IngotPileBlockModelMixin implements SimpleStaticBlockEntityModel<IngotPileBlockModel, IngotPileBlockEntity> {

    @Unique
    private static final ResourceLocation tfg$RESOURCE_LOCATION = new ResourceLocation(TerraFirmaCraft.MOD_ID, "block/metal/smooth_pattern");

    /**
     * Измененный метод рендера кучек с одинарными слитками. Теперь они отрисовываются исходя из цвета материала слитка, инфа берется из GTCEu.
     * */
    @Override
    public TextureAtlasSprite render(IngotPileBlockEntity pile, PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay)
    {
        final int ingots = pile.getBlockState().getValue(IngotPileBlock.COUNT);
        final Function<ResourceLocation, TextureAtlasSprite> textureAtlas = Minecraft.getInstance().getTextureAtlas(RenderHelpers.BLOCKS_ATLAS);

        var pileEntries = ((IngotPileBlockEntityAccessor) (Object) pile).getEntries();

        TextureAtlasSprite sprite = null;
        for (int i = 0; i < ingots; i++)
        {
            var stack = tfg$getStackByIndex(pileEntries, i);
            var material = ChemicalHelper.getMaterial(stack);

            int color = material == null ? 0 : material.material().getMaterialARGB();

            sprite = textureAtlas.apply(tfg$RESOURCE_LOCATION);

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

            tfg$renderTexturedTrapezoidalCuboid(poseStack, buffer, sprite, packedLight, packedOverlay, minX, maxX, minZ, maxZ, minX + scale, maxX - scale, minZ + scale, maxZ - scale, minY, maxY, 7, 4, 15, oddLayer, color);

            poseStack.popPose();
        }

        if (sprite == null) sprite = RenderHelpers.missingTexture();

        return sprite;
    }

    /**
     * Метод получает стак из списка стаков с доп проверками.
     * */
    @Unique
    private static ItemStack tfg$getStackByIndex(List<?> entries, int index) {
        try
        {
            return  ((IngotPileBlockEntityEntryAccessor) (Object) entries.get(index)).getStack();
        }
        catch (IndexOutOfBoundsException e)
        {
            return ItemStack.EMPTY;
        }
    }

    /**
     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
     * */
    @Unique
    private static void tfg$renderTexturedTrapezoidalCuboid(PoseStack poseStack, VertexConsumer buffer, TextureAtlasSprite sprite, int packedLight, int packedOverlay, float pMinX, float pMaxX, float pMinZ, float pMaxZ, float qMinX, float qMaxX, float qMinZ, float qMaxZ, float minY, float maxY, float xPixels, float yPixels, float zPixels, boolean invertNormal, int color)
    {
        tfg$renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getTrapezoidalCuboidXVertices(pMinX, pMaxX, pMinZ, pMaxZ, qMinX, qMaxX, qMinZ, qMaxZ, minY, maxY), zPixels, yPixels, invertNormal ? 0 : 1, 0, invertNormal ? 1 : 0, color);
        tfg$renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getTrapezoidalCuboidYVertices(pMinX, pMaxX, pMinZ, pMaxZ, qMinX, qMaxX, qMinZ, qMaxZ, minY, maxY), zPixels, xPixels, 0, 1, 0, color);
        tfg$renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getTrapezoidalCuboidZVertices(pMinX, pMaxX, pMinZ, pMaxZ, qMinX, qMaxX, qMinZ, qMaxZ, minY, maxY), xPixels, yPixels, invertNormal ? 1 : 0, 0, invertNormal ? 0 : 1, color);
    }

    /**
     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
     * */
    @Unique
    private static void tfg$renderTexturedQuads(PoseStack poseStack, VertexConsumer buffer, TextureAtlasSprite sprite, int packedLight, int packedOverlay, float[][] vertices, float uSize, float vSize, float normalX, float normalY, float normalZ, int color)
    {
        for (float[] v : vertices)
        {
            tfg$renderTexturedVertex(poseStack, buffer, packedLight, packedOverlay, v[0], v[1], v[2], sprite.getU(v[3] * uSize), sprite.getV(v[4] * vSize), v[5] * normalX, v[5] * normalY, v[5] * normalZ, color);
        }
    }

    /**
     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета + изменен вызов color на принятие ARGB.
     * */
    @Unique
    private static void tfg$renderTexturedVertex(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float x, float y, float z, float u, float v, float normalX, float normalY, float normalZ, int color)
    {
        buffer.vertex(poseStack.last().pose(), x, y, z)
                .color(color)
                .uv(u, v)
                .uv2(packedLight)
                .overlayCoords(packedOverlay)
                .normal(poseStack.last().normal(), normalX, normalY, normalZ)
                .endVertex();
    }

}
