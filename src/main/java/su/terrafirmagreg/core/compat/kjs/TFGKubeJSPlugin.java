package su.terrafirmagreg.core.compat.kjs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;
import dev.latvian.mods.kubejs.script.ScriptType;
import dev.latvian.mods.kubejs.util.ClassFilter;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags;
import su.terrafirmagreg.core.compat.gtceu.TFGMaterials;
import su.terrafirmagreg.core.compat.gtceu.TFGPropertyKeys;
import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefixes;

public class TFGKubeJSPlugin extends KubeJSPlugin {

    @Override
    public void registerClasses(ScriptType type, ClassFilter filter) {
        super.registerClasses(type, filter);
        filter.deny("su.terrafirmagreg.core");
    }

    @Override
    public void registerBindings(BindingsEvent event) {
        super.registerBindings(event);
        event.add("TFGMaterials", TFGMaterials.class);
        event.add("TFGTagPrefix", TFGTagPrefixes.class);
        event.add("TFGPropertyKey", TFGPropertyKeys.class);
        event.add("TFGMaterialFlags", TFGMaterialFlags.class);
    }
}
