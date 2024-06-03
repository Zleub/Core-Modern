package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.block.SurfaceRockBlock;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
@Mixin(value = SurfaceRockBlock.class, remap = false)
public abstract class SurfaceRockBlockMixin extends Block {

    @Shadow @Final
    private Material material;

    public SurfaceRockBlockMixin(Properties properties) {
        super(properties);
    }

    /**
     * В Jade отображает не пустой объект при наведении на лежащую кучку руды,
     * а пыль, которая выпадет при нажатии ПКМ.
     */
    @SuppressWarnings("deprecation")
    @Override
    public ItemStack getCloneItemStack(BlockGetter level, BlockPos pos, BlockState state) {
        return ChemicalHelper.get(TagPrefix.dustSmall, material);
    }
}
