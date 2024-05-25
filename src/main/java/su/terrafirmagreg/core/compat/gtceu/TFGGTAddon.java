package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.data.TFGData;
import su.terrafirmagreg.core.objects.TFGItems;
import su.terrafirmagreg.core.objects.data.TFGRecipes;
import su.terrafirmagreg.core.objects.TFGRegistries;

import java.util.function.Consumer;

@SuppressWarnings("unused")
@GTAddon
public final class TFGGTAddon implements IGTAddon {

    @Override
    public void initializeAddon() {
        TFGItems.init();
    }

    @Override
    public GTRegistrate getRegistrate() {
        return TFGRegistries.REGISTRATE;
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
//        TFGWorldGenLayers.init();
    }

    @Override
    public void registerOreVeins() {
//        TFGOreVeins.register();
    }

    @Override
    public void registerFluidVeins() {
        TFGFluidVeins.register();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        TFGData.init();
        TFGRecipes.init(provider);
    }

    @Override
    public void removeRecipes(Consumer<ResourceLocation> consumer) {
        TFGData.remove(consumer);
    }
}
