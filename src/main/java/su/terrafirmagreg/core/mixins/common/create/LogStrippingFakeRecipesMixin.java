package su.terrafirmagreg.core.mixins.common.create;

import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.simibubi.create.foundation.data.recipe.LogStrippingFakeRecipes;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ToolActions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = LogStrippingFakeRecipes.class, remap = false)
public abstract class LogStrippingFakeRecipesMixin {

    @Unique
    private static final ItemStack tfg$ToolStack = ToolHelper.get(GTToolType.AXE, GTMaterials.Neutronium);

//    @Redirect(method = "process", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/AxeItem;getAxeStrippingState(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;"), remap = false)
//    private static BlockState tfg$process$getAxeStrippingState(BlockState originalState) {
//        return tfg$isBlockStrippable(originalState);
//    }

    //    @Redirect(method = "createRecipes", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/registries/tags/ITagManager;getTag(Lnet/minecraft/tags/TagKey;)Lnet/minecraftforge/registries/tags/ITag;"), remap = false)
    //    private static ITag<Item> tfg$createRecipes$getTag(ITagManager<Item> instance, @NotNull TagKey<Item> vTagKey) {
    //        return instance.getTag(TFGTags.Items.createItemTag("tfc:log_pile_logs"));
    //    }

//    @Redirect(method = "process", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/AxeItem;getAxeStrippingState(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;"), remap = false)
//    private static BlockState tfg$process$getAxeStrippingState(BlockState originalState) {
//        return tfg$isBlockStrippable(originalState);
//    }

    /**
     * Украдено из LogStripBehavior (GTM)
     * */
//    @Unique
//    private static BlockState tfg$isBlockStrippable(BlockState state) {
//        var level = Minecraft.getInstance().level;
//        var player = Minecraft.getInstance().player;
//
//        return state.getToolModifiedState(
//                new UseOnContext(
//                        level,
//                        player,
//                        InteractionHand.MAIN_HAND,
//                        tfg$ToolStack,
//                        new BlockHitResult(
//                                new Vec3(0, 0, 0),
//                                Direction.UP,
//                                new BlockPos(0, 0, 0),
//                                false)
//                ), ToolActions.AXE_STRIP, false);
//    }

}
