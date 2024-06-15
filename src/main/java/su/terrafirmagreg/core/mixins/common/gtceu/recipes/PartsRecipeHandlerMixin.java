package su.terrafirmagreg.core.mixins.common.gtceu.recipes;

import com.gregtechceu.gtceu.data.recipe.generated.PartsRecipeHandler;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Consumer;

@Mixin(value = PartsRecipeHandler.class, remap = false)
public abstract class PartsRecipeHandlerMixin {

    /**
     * Отключение генерации рецептов: 2 пластины + молот = двойная пластина (верстак).
     * */
    @Redirect(method = "processPlateDouble", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/VanillaRecipeHelper;addShapedRecipe(Ljava/util/function/Consumer;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;[Ljava/lang/Object;)V"), remap = false)
    private static void tfg$processPlateDouble$vanillaRecipeHelper$addShapedRecipe$doublePlate(Consumer<FinishedRecipe> provider, String regName, ItemStack result, Object[] recipe) {}

    /**
     * Отключение генерации рецептов: 2 стержня + молот = длинный стержень (верстак).
     * */
    @Redirect(method = "processLongStick", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/VanillaRecipeHelper;addShapedRecipe(Ljava/util/function/Consumer;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;[Ljava/lang/Object;)V", ordinal = 3), remap = false)
    private static void tfg$processLongStick$vanillaRecipeHelper$addShapedRecipe$longStick(Consumer<FinishedRecipe> provider, String regName, ItemStack result, Object[] recipe) {}
}
