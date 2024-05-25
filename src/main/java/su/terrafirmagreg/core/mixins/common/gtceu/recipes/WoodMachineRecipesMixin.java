package su.terrafirmagreg.core.mixins.common.gtceu.recipes;

import com.gregtechceu.gtceu.data.recipe.WoodTypeEntry;
import com.gregtechceu.gtceu.data.recipe.misc.WoodMachineRecipes;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

@Mixin(value = WoodMachineRecipes.class, remap = false)
public class WoodMachineRecipesMixin {

    @ModifyReturnValue(method = "getDefaultEntries", at = @At("RETURN"), remap = false)
    private static List<WoodTypeEntry> getDefaultEntries(List<WoodTypeEntry> original) {
        return original.stream().filter(el -> el.woodName.equals("rubber") || el.woodName.equals("treated")).toList();
    }

}
