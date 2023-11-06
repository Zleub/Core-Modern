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
    public void registerMaterials() {
        TFGMaterials.init();
    }

}
