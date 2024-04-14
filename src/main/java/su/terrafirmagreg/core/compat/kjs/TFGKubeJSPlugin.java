package su.terrafirmagreg.core.compat.kjs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterials;
import su.terrafirmagreg.core.compat.gtceu.TFGPropertyKeys;
import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefix;

public class TFGKubeJSPlugin extends KubeJSPlugin {

    @Override
    public void registerBindings(BindingsEvent event) {
        super.registerBindings(event);
        event.add("TFGMaterials", TFGMaterials.class);
        event.add("TFGTagPrefix", TFGTagPrefix.class);
        event.add("TFGPropertyKey", TFGPropertyKeys.class);
        event.add("TFGMaterialFlags", TFGMaterialFlags.class);
    }
}
