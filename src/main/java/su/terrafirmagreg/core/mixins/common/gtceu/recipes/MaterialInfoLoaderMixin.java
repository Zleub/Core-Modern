package su.terrafirmagreg.core.mixins.common.gtceu.recipes;

import com.eerussianguy.firmalife.common.blocks.FLBlocks;
import com.eerussianguy.firmalife.common.blocks.greenhouse.Greenhouse;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.MaterialInfoLoader;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.terrafirmagreg.core.objects.GreenhouseWrapper;

import static com.gregtechceu.gtceu.api.GTValues.M;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

@Mixin(value = MaterialInfoLoader.class, remap = false)
public class MaterialInfoLoaderMixin {

    @Inject(method = "init", at = @At(value = "HEAD"), remap = false)
    private static void tfg$init(CallbackInfo ci) {
        for (var type : GreenhouseWrapper.values()) {
            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.DOOR).get().asItem(), new ItemMaterialInfo(
                new MaterialStack(type.getMaterial(), M * 3),
                new MaterialStack(Glass, M * 2)
            ));

            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PANEL_ROOF).get().asItem(), new ItemMaterialInfo(
                    new MaterialStack(type.getMaterial(), M * 3),
                    new MaterialStack(Glass, M * 2)
            ));

            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PANEL_WALL).get().asItem(), new ItemMaterialInfo(
                    new MaterialStack(type.getMaterial(), M * 3),
                    new MaterialStack(Glass, M * 2)
            ));

            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PORT).get().asItem(), new ItemMaterialInfo(
                    new MaterialStack(type.getMaterial(), M * 3),
                    new MaterialStack(Glass, M * 2),
                    new MaterialStack(Copper, M)
            ));

            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.ROOF).get().asItem(), new ItemMaterialInfo(
                    new MaterialStack(type.getMaterial(), M * 3),
                    new MaterialStack(Glass, M * 2)
            ));

            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.ROOF_TOP).get().asItem(), new ItemMaterialInfo(
                    new MaterialStack(type.getMaterial(), M * 3),
                    new MaterialStack(Glass, M * 2)
            ));

            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.TRAPDOOR).get().asItem(), new ItemMaterialInfo(
                    new MaterialStack(type.getMaterial(), M * 3),
                    new MaterialStack(Glass, M * 2)
            ));

            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.WALL).get().asItem(), new ItemMaterialInfo(
                    new MaterialStack(type.getMaterial(), M * 3),
                    new MaterialStack(Glass, M * 2)
            ));
        }
    }

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
