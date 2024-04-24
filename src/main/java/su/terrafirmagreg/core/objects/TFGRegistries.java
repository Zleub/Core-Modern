package su.terrafirmagreg.core.objects;

import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import su.terrafirmagreg.core.TerraFirmaGreg;

public final class TFGRegistries {

    public static final GTRegistrate REGISTRATE = GTRegistrate.create(TerraFirmaGreg.MOD_ID);
    public static MaterialRegistry MATERIAL_REGISTRY;

}
