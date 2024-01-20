package su.terrafirmagreg.core.compat.rei;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.entry.CollapsibleEntryRegistry;
import me.shedaniel.rei.api.client.registry.screen.ExclusionZones;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.forge.REIPluginClient;
import net.dries007.tfc.client.screen.CalendarScreen;
import net.dries007.tfc.client.screen.ClimateScreen;
import net.dries007.tfc.client.screen.NutritionScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.TFGTags;

import java.util.List;

@OnlyIn(Dist.CLIENT)
@REIPluginClient
public class TFGREIClientPlugin implements REIClientPlugin {

    @Override
    public void registerExclusionZones(ExclusionZones zones) {
        zones.register(InventoryScreen.class, screen -> List.of(new Rectangle(screen.getGuiLeft() + screen.getXSize() + 2, screen.getGuiTop(), 20, 120)));
        zones.register(CalendarScreen.class, screen -> List.of(new Rectangle(screen.getGuiLeft() + screen.getXSize() + 2, screen.getGuiTop(), 20, 120)));
        zones.register(NutritionScreen.class, screen -> List.of(new Rectangle(screen.getGuiLeft() + screen.getXSize() + 2, screen.getGuiTop(), 20, 120)));
        zones.register(ClimateScreen.class, screen -> List.of(new Rectangle(screen.getGuiLeft() + screen.getXSize() + 2, screen.getGuiTop(), 20, 120)));
    }

    @Override
    public void registerCollapsibleEntries(CollapsibleEntryRegistry registry) {
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Ores);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.RichRawOres);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.NormalRawOres);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.PoorRawOres);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.CrushedOres);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.PurifiedOres);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.RefinedOres);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Nuggets);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.TinyDusts);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SmallDusts);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Dusts);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.PureDusts);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.ImpureDusts);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Ingots);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HotIngots);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.DoubleIngots);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Plates);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.DoublePlates);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.DensePlates);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Gears);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SmallGears);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Rods);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.LongRods);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Springs);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SmallSprings);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.GemsExquisite);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.GemsFlawless);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.GemsNormal);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.GemsFlawed);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.GemsChipped);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Frames);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.StorageBlocks);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SwordHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.PickaxeHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.AxeHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.ShovelHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HoeHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SawHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.ScytheHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HammerHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.KnifeHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.FileHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.ButcheryKnifeHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.MiningHammerHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SpadeHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.MaceHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.PropickHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.ChiselHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.JavelinHeads);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.DrillHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.ChainsawHeads);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.BuzzSawHeads);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.WrenchTips);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.ScrewdriverTips);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.TurbineBlades);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Lenses);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Rounds);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Rings);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Bolts);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Screws);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Foils);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.Rotors);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.FineWires);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SingleWires);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.DoubleWires);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.QuadrupleWires);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.OctalWires);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HexWires);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SingleCables);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.DoubleCables);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.QuadrupleCables);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.OctalCables);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HexCables);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.TinyFluidPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SmallFluidPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.NormalFluidPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.LargeFluidPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HugeFluidPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.QuadrupleFluidPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.NonupleFluidPipes);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SmallItemPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.NormalItemPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.LargeItemPipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HugeItemPipes);

        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.SmallRestrictivePipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.NormalRestrictivePipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.LargeRestrictivePipes);
        registerCollapsibleEntryForItemTag(registry, TFGTags.Items.HugeRestrictivePipes);

        // TODO: Добавить больше
    }

    private static void registerCollapsibleEntryForItemTag(CollapsibleEntryRegistry registry, TagKey<Item> tagKey) {
        var path = tagKey.location().getPath();
        var lang = path.replace('/', '.');
        registry.group(new ResourceLocation(TerraFirmaGreg.MOD_ID, path), Component.translatable(String.format("collapsable_entry.%s", lang)), EntryIngredients.ofItemTag(tagKey));
    }
}
