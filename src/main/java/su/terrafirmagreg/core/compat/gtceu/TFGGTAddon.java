package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.data.recipes.FinishedRecipe;
import su.terrafirmagreg.core.TFGCore;
import su.terrafirmagreg.core.common.TFGItems;
import su.terrafirmagreg.core.common.data.recipes.TFGRecipes;

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
        return TFGCore.REGISTRATE;
    }

    @Override
    public String addonModId() {
        return TFGCore.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        TFGTagPrefix.init();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        // TFGRecipes.init(provider);
    }
}
