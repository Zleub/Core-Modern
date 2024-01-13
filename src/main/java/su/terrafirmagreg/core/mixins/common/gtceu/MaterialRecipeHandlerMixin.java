package su.terrafirmagreg.core.mixins.common.gtceu;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.IngotProperty;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.gregtechceu.gtceu.data.recipe.generated.MaterialRecipeHandler;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Consumer;

@Mixin(value = MaterialRecipeHandler.class, remap = false)
public class MaterialRecipeHandlerMixin {

    /**
     * Генерация рецептов 2x ingot -> 1x plate
     * */
    @Redirect(method = "processIngot", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/VanillaRecipeHelper;addShapedRecipe(Ljava/util/function/Consumer;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;[Ljava/lang/Object;)V", ordinal = 2), remap = false)
    private static void onPlateRecipeGeneration(Consumer<FinishedRecipe> provider, String regName, ItemStack result, Object[] recipe) {}

    /**
     * Генерация рецептов 9 слитков -> Блок
     */
    @Redirect(method = "processIngot", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/builder/GTRecipeBuilder;save(Ljava/util/function/Consumer;)V", ordinal = 5), remap = false)
    private static void onPlateRecipeGeneration(GTRecipeBuilder instance, Consumer<FinishedRecipe> consumer) {}

    /**
     * В GT при добавлении предмета в output или input сразу проверяется empty ли он,
     * чтобы отключить рецепт не хватит просто его не сохранять в некоторых случаях.
     * Если output'а или input'а нет, то нужно будет еще задать условие и какой-то предмет который существует,
     * собственно это мы тут и делаем.
     */
    @Redirect(method = "processIngot", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/builder/GTRecipeBuilder;outputItems(Lcom/gregtechceu/gtceu/api/data/tag/TagPrefix;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;I)Lcom/gregtechceu/gtceu/data/recipe/builder/GTRecipeBuilder;", ordinal = 1), remap = false)
    private static GTRecipeBuilder asdfasdf(GTRecipeBuilder instance, TagPrefix orePrefix, Material material, int count) {
        if (!ChemicalHelper.get(TagPrefix.nugget, material).isEmpty()) {
            instance.outputItems(TagPrefix.nugget, material, 9);
        }
        return instance;
    }

    /**
     * Отключение рецепта генерации nugget'ов из слитков, если nugget'а нет.
     */
    @Redirect(method = "processIngot", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/builder/GTRecipeBuilder;save(Ljava/util/function/Consumer;)V", ordinal = 3), remap = false)
    private static void onNuggetRecipeGeneration(GTRecipeBuilder instance, Consumer<FinishedRecipe> consumer, TagPrefix ingotPrefix, Material material, IngotProperty property) {
        if (!ChemicalHelper.get(TagPrefix.nugget, material).isEmpty()) {
            instance.save(consumer);
        }
    }
}
