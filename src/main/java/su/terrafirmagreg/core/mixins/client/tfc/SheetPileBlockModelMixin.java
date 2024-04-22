package su.terrafirmagreg.core.mixins.client.tfc;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.mojang.blaze3d.MethodsReturnNonnullByDefault;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dries007.tfc.client.RenderHelpers;
import net.dries007.tfc.client.model.SheetPileBlockModel;
import net.dries007.tfc.client.model.SimpleStaticBlockEntityModel;
import net.dries007.tfc.common.blockentities.SheetPileBlockEntity;
import net.dries007.tfc.common.blocks.DirectionPropertyBlock;
import net.dries007.tfc.common.blocks.devices.SheetPileBlock;
import net.dries007.tfc.util.Helpers;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import su.terrafirmagreg.core.ClientEventHandler;
import su.terrafirmagreg.core.objects.TFGHelpers;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Function;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@Mixin(value = SheetPileBlockModel.class, remap = false)
@OnlyIn(Dist.CLIENT)
public abstract class SheetPileBlockModelMixin implements SimpleStaticBlockEntityModel<SheetPileBlockModel, SheetPileBlockEntity> {

    /**
     * Измененный метод рендера кучек с одинарными слитками. Теперь они отрисовываются исходя из цвета материала слитка, инфа берется из GTCEu.
     * */
    @Override
    public TextureAtlasSprite render(SheetPileBlockEntity pile, PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay)
    {
        final BlockState state = pile.getBlockState();
        TextureAtlasSprite sprite = null;

        final Function<ResourceLocation, TextureAtlasSprite> textureAtlas = Minecraft.getInstance().getTextureAtlas(RenderHelpers.BLOCKS_ATLAS);

        for (Direction direction : Helpers.DIRECTIONS)
        {
            if (state.getValue(DirectionPropertyBlock.getProperty(direction))) // The properties are authoritative on which sides should be rendered
            {
                final var stack = pile.getSheet(direction);
                final var material = ChemicalHelper.getMaterial(stack);
                final int primaryColor = material == null ? 0 : material.material().getMaterialARGB(0);
                final int secondaryColor = material == null ? 0 : material.material().getMaterialARGB(1);

                sprite = textureAtlas.apply(ClientEventHandler.TFCMetalBlockTexturePattern);

                TFGHelpers.renderTexturedCuboid(poseStack, buffer, sprite, packedLight, packedOverlay, SheetPileBlock.getShapeForSingleFace(direction).bounds(), primaryColor, secondaryColor);
            }
        }

        if (sprite == null)
        {
            // Use whatever sprite we found in the ingot pile towards the top as the particle texture
            sprite = RenderHelpers.missingTexture();
        }

        return sprite;
    }

}
