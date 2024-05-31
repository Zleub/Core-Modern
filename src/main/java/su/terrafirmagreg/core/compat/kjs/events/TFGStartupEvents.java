package su.terrafirmagreg.core.compat.kjs.events;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;

public interface TFGStartupEvents {
    EventGroup GROUP = EventGroup.of("TFGStartupEvents");

    EventHandler MATERIAL_INFO_MODIFICATION = GROUP.startup("materialInfo", () -> TFGMaterialInfoModification.class);
}
