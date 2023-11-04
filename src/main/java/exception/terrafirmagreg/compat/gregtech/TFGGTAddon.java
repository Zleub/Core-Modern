package exception.terrafirmagreg.compat.gregtech;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.addon.events.KJSRecipeKeyEvent;
import com.gregtechceu.gtceu.api.addon.events.MaterialCasingCollectionEvent;
import exception.terrafirmagreg.TerraFirmaGreg;
import exception.terrafirmagreg.compat.gregtech.TFGMaterials;
import exception.terrafirmagreg.compat.gregtech.TFGTagPrefixes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class TFGGTAddon implements IGTAddon {
    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return TerraFirmaGreg.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        TFGTagPrefixes.init();
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
    }

    @Override
    public void registerMaterials() {
        TFGMaterials.init();
    }

    @Override
    public void registerSounds() {
        IGTAddon.super.registerSounds();
    }

    @Override
    public void registerCovers() {
        IGTAddon.super.registerCovers();
    }

    @Override
    public void registerRecipeTypes() {
        IGTAddon.super.registerRecipeTypes();
    }

    @Override
    public void registerMachines() {
        IGTAddon.super.registerMachines();
    }

    @Override
    public void registerWorldgenLayers() {
        IGTAddon.super.registerWorldgenLayers();
    }

    @Override
    public void registerVeinGenerators() {
        IGTAddon.super.registerVeinGenerators();
    }

    @Override
    public void initializeRecipes(Consumer<FinishedRecipe> provider) {
        IGTAddon.super.initializeRecipes(provider);
    }

    @Override
    public void collectMaterialCasings(MaterialCasingCollectionEvent event) {
        IGTAddon.super.collectMaterialCasings(event);
    }

    @Override
    public void registerRecipeKeys(KJSRecipeKeyEvent event) {
        IGTAddon.super.registerRecipeKeys(event);
    }
}
