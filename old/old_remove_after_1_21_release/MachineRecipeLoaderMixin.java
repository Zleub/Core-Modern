package su.terrafirmagreg.core.old_remove_after_1_21_release;//package su.terrafirmagreg.core.mixins.common.gtceu.recipes;
//
//import com.gregtechceu.gtceu.api.data.chemical.material.Material;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.common.data.GTMaterials;
//import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
//import com.gregtechceu.gtceu.data.recipe.misc.MachineRecipeLoader;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Redirect;
//
//@Mixin(value = MachineRecipeLoader.class, remap = false)
//public abstract class MachineRecipeLoaderMixin {
//
//    /**
//     * Исправляет рецепт CASING LV на TFG лад.
//     * */
//    @Redirect(method = "registerAssemblerRecipes", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/builder/GTRecipeBuilder;inputItems(Lcom/gregtechceu/gtceu/api/data/tag/TagPrefix;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;I)Lcom/gregtechceu/gtceu/data/recipe/builder/GTRecipeBuilder;", ordinal = 9), remap = false)
//    private static GTRecipeBuilder tfg$registerAssemblerRecipes(GTRecipeBuilder instance, TagPrefix orePrefix, Material material, int count) {
//        instance.inputItems(TagPrefix.plate, GTMaterials.RedSteel, 4);
//        instance.inputItems(TagPrefix.plate, GTMaterials.BlueSteel, 4);
//        return instance;
//    }
//}

// TODO
