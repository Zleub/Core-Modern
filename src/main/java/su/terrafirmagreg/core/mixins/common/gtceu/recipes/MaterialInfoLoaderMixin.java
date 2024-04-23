package su.terrafirmagreg.core.mixins.common.gtceu.recipes;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.MaterialInfoLoader;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static com.gregtechceu.gtceu.api.GTValues.M;

@Mixin(value = MaterialInfoLoader.class, remap = false)
public class MaterialInfoLoaderMixin {

    // TODO: Здесь баг грега, тк предметы регаются как блоки и херь сохраняющая состав если вызвать get,
    //  вернет null для блока, если подан предмет этого блока
    /**
     * Изменяет состав LV HULL, таким образом, чтобы данные об его составе сохранились в систему.
     * Нужно для правильного декрафта этих прекрасных блоков в их состав (относится к LV).
     * */
    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/data/chemical/ChemicalHelper;registerMaterialInfo(Lnet/minecraft/world/level/ItemLike;Lcom/gregtechceu/gtceu/api/data/chemical/material/stack/ItemMaterialInfo;)V", ordinal = 9), remap = false)
    private static void tfg$init(ItemLike item, ItemMaterialInfo materialInfo) {
        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[1].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.RedSteel, M * 4),
                new MaterialStack(GTMaterials.BlueSteel, M * 4),
                new MaterialStack(GTMaterials.Tin, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));
    }

}
