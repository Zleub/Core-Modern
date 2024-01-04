package su.terrafirmagreg.core.mixins.common.minecraft;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.ServerAdvancementManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import su.terrafirmagreg.core.TerraFirmaGreg;

import java.util.Arrays;
import java.util.Map;

@Mixin(ServerAdvancementManager.class)
public class ServerAdvancementManagerMixin {

    @Redirect(
            method = "apply(Ljava/util/Map;Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/util/profiling/ProfilerFiller;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/advancements/AdvancementList;add(Ljava/util/Map;)V")
    )
    private void preventAdvancementAddition(AdvancementList list, Map<ResourceLocation, Advancement.Builder> map) {
        // TODO: use a set to avoid O(n) lookups
        var disabledMods = TerraFirmaGreg.CONFIG.modIds;
        map.entrySet().removeIf(entry -> Arrays.stream(disabledMods).toList().contains(entry.getKey().getNamespace()));
        list.add(map);
    }

}
