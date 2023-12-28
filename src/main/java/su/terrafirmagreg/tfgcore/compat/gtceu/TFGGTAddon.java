package su.terrafirmagreg.tfgcore.compat.gtceu;

import com.gregtechceu.gtceu.api.addon.IGTAddon;
import net.minecraft.data.recipes.FinishedRecipe;
import su.terrafirmagreg.tfgcore.TerraFirmaGreg;
import su.terrafirmagreg.tfgcore.objects.TFGRecipes;

import java.util.function.Consumer;

public class TFGGTAddon implements IGTAddon {
    @Override
    public void initializeAddon() {}

    @Override
    public String addonModId() {
        return TerraFirmaGreg.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        TFGTagPrefixes.init();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        TFGRecipes.init(provider);
    }

    @Override
    public void registerMaterials() {
        TFGMaterials.init();
    }
}
