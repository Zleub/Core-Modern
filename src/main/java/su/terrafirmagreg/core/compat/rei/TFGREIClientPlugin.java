package su.terrafirmagreg.core.compat.rei;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.entry.CollapsibleEntryRegistry;
import me.shedaniel.rei.api.client.registry.screen.ExclusionZones;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.forge.REIPluginClient;
import net.dries007.tfc.client.screen.CalendarScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.TFGTags;

import java.util.List;

@REIPluginClient
public class TFGREIClientPlugin implements REIClientPlugin {

    @Override
    public void registerExclusionZones(ExclusionZones zones) {
        zones.register(CalendarScreen.class, screen -> List.of(new Rectangle(screen.getGuiLeft() + screen.getXSize() + 2, screen.getGuiTop(), 20, 118)));
    }

    @Override
    public void registerCollapsibleEntries(CollapsibleEntryRegistry registry) {

        registry.group(new ResourceLocation(TerraFirmaGreg.MOD_ID, "dead"), Component.translatable("tagprefix.andesite"), EntryIngredients.ofItemTag(ItemTags.PLANKS));
    }
}
