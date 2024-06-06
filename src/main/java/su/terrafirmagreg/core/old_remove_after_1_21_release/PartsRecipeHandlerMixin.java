//package su.terrafirmagreg.core.old_remove_after_1_21_release;
//
//import com.gregtechceu.gtceu.data.recipe.generated.PartsRecipeHandler;
//import org.spongepowered.asm.mixin.Mixin;
//
//@Mixin(value = PartsRecipeHandler.class, remap = false)
//public abstract class PartsRecipeHandlerMixin {
//
//    /**
//     * Отключение генерации рецептов: 2 пластины + молот = двойная пластина (верстак).
//     * */
////    @Redirect(method = "processPlateDouble", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/VanillaRecipeHelper;addShapedRecipe(Ljava/util/function/Consumer;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;[Ljava/lang/Object;)V"), remap = false)
////    private static void tfg$processPlateDouble$vanillaRecipeHelper$addShapedRecipe$doublePlate(Consumer<FinishedRecipe> provider, String regName, ItemStack result, Object[] recipe) {}
//
//    /**
//     * Отключение генерации рецептов: 2 стержня + молот = длинный стержень (верстак).
//     * */
////    @Redirect(method = "processLongStick", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/VanillaRecipeHelper;addShapedRecipe(Ljava/util/function/Consumer;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;[Ljava/lang/Object;)V", ordinal = 3), remap = false)
////    private static void tfg$processLongStick$vanillaRecipeHelper$addShapedRecipe$longStick(Consumer<FinishedRecipe> provider, String regName, ItemStack result, Object[] recipe) {}
//}
