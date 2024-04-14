package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.data.recipes.FinishedRecipe;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.TFGItems;
import su.terrafirmagreg.core.objects.TFGRecipes;

import java.util.function.Consumer;

@GTAddon
public class TFGGTAddon implements IGTAddon {

    @Override
    public void initializeAddon() {
        TFGItems.init();
    }

    @Override
    public GTRegistrate getRegistrate() {
        return null;
    }

    @Override
    public String addonModId() {
        return TerraFirmaGreg.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        TFGTagPrefix.init();
    }

    @Override
    public void registerWorldgenLayers() {
        TFGWorldGenLayers.init();
    }

    @Override
    public void registerOreVeins() {
        TFGOreVeins.register();
    }

    @Override
    public void registerFluidVeins() {
        TFGFluidVeins.register();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        TFGRecipes.init(provider);
    }
}
