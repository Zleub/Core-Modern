package su.terrafirmagreg.core.old_remove_after_1_21_release;//package su.terrafirmagreg.core.mixins.common.gtceu.recipes;
//
//import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.common.data.GTMaterials;
//import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
//import com.gregtechceu.gtceu.data.recipe.misc.MetaTileEntityLoader;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.world.item.ItemStack;
//import org.jetbrains.annotations.NotNull;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Redirect;
//
//import java.util.function.Consumer;
//
//@Mixin(value = MetaTileEntityLoader.class, remap = false)
//public abstract class MetaTileEntityLoaderMixin {
//
//    // TODO: Удалить совсем или удалить хз че сделать
//    /**
//     * Изменяет рецепт STEEL CASING, таким образом, чтобы данные об его составе сохранились в систему.
//     * Нужно для правильного декрафта этих прекрасных блоков в их состав (относится к LV).
//     * */
//    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/VanillaRecipeHelper;addShapedRecipe(Ljava/util/function/Consumer;ZLjava/lang/String;Lnet/minecraft/world/item/ItemStack;[Ljava/lang/Object;)V", ordinal = 1), remap = false)
//    private static void tfg$init$vanillaRecipeHelper$addShapedRecipe(Consumer<FinishedRecipe> provider, boolean withUnificationData, @NotNull String regName, @NotNull ItemStack result, @NotNull Object[] recipe) {
//        VanillaRecipeHelper.addShapedRecipe(provider, withUnificationData, regName, result, "RBR", "BwB", "RBR", 'R', new UnificationEntry(TagPrefix.plate, GTMaterials.RedSteel), 'B', new UnificationEntry(TagPrefix.plate, GTMaterials.BlueSteel));
//    }
//
//}
