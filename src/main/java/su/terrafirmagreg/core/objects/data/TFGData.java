package su.terrafirmagreg.core.objects.data;

import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
import com.gregtechceu.gtceu.common.data.GTItems;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import su.terrafirmagreg.core.compat.gtceu.TFGPropertyKeys;
import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefix;
import su.terrafirmagreg.core.compat.gtceu.properties.TFCProperty;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public final class TFGData {

    public static void remove(Consumer<ResourceLocation> consumer) {
        //        consumer.accept(new ResourceLocation("tfc:data/tfc/item_heats/blooms"));
    }

    public static void init() {
//        for (final var material : GTCEuAPI.materialManager.getRegisteredMaterials()) {
//            var property = material.getProperty(TFGPropertyKeys.TFC_PROPERTY);
//            if (property == null) continue;
//
//            addTagItemHeat(TagPrefix.dustTiny, material, property, 0.357F);
//            addTagItemHeat(TagPrefix.dustSmall, material, property, 0.714F);
//            addTagItemHeat(TagPrefix.dust, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.dustImpure, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.dustPure, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.rod, material, property, 0.567F);
//            addTagItemHeat(TagPrefix.rodLong, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.bolt, material, property, 0.245F);
//            addTagItemHeat(TagPrefix.screw, material, property, 0.567F);
//            addTagItemHeat(TagPrefix.nugget, material, property, 0.124F);
//            addTagItemHeat(TagPrefix.ring, material, property, 0.567F);
//            addTagItemHeat(TagPrefix.block, material, property, 12.861F);
//
//            addTagItemHeat(TagPrefix.ingot, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.ingotDouble, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.plate, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.plateDouble, material, property, 1.429F);
//
//            addTagItemHeat(TFGTagPrefix.poorRawOre, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.rawOre, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.richRawOre, material, property, 1.429F);
//
//            addTagItemHeat(TagPrefix.crushed, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.crushedRefined, material, property, 1.429F);
//            addTagItemHeat(TagPrefix.crushedPurified, material, property, 1.429F);
//
//            addTagItemHeat(TFGTagPrefix.toolHeadSword, material, property, 2.875F);
//            addTagItemHeat(TFGTagPrefix.toolHeadShovel, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadScythe, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadPickaxe, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadSaw, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadKnife, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadHoe, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadHammer, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadAxe, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadFile, material, property, 1.429F);
//            addTagItemHeat(TFGTagPrefix.toolHeadButcheryKnife, material, property, 2.875F);
//            addTagItemHeat(TFGTagPrefix.toolHeadMiningHammer, material, property, 2.875F);
//            addTagItemHeat(TFGTagPrefix.toolHeadSpade, material, property, 2.875F);
//
//            addToolItemHeat(GTToolType.SWORD, material, property, 1.429F);
//            addToolItemHeat(GTToolType.PICKAXE, material, property, 1.429F);
//            addToolItemHeat(GTToolType.SHOVEL, material, property, 1.429F);
//            addToolItemHeat(GTToolType.AXE, material, property, 1.429F);
//            addToolItemHeat(GTToolType.HOE, material, property, 1.429F);
//            addToolItemHeat(GTToolType.SAW, material, property, 1.429F);
//            addToolItemHeat(GTToolType.HARD_HAMMER, material, property, 2.875F);
//            addToolItemHeat(GTToolType.FILE, material, property, 1.429F);
//            addToolItemHeat(GTToolType.SCYTHE, material, property, 1.429F);
//            addToolItemHeat(GTToolType.KNIFE, material, property, 1.429F);
//            addToolItemHeat(GTToolType.BUTCHERY_KNIFE, material, property, 2.875F);
//            addToolItemHeat(GTToolType.MINING_HAMMER, material, property, 1.429F);
//            addToolItemHeat(GTToolType.SPADE, material, property, 2.875F);
//        }
//
//        addItemHeat(TFCItems.BRASS_MECHANISMS.get(), 0.567F, null, null);
//        addItemHeat(TFCItems.BLUE_STEEL_BUCKET.get(), 1.429F, 924, 1232);
//        addItemHeat(TFCItems.RED_STEEL_BUCKET.get(), 1.429F, 924, 1232);
//        addItemHeat(GTItems.COMPRESSED_COKE_CLAY.get(), 0.1242F, null, null);

        //        addItemHeat(FirmacivItems.CANNON.get(), 2.875F, null, null);
        //        addItemHeat(FirmacivItems.CANNON_BARREL.get(), 2.875F, null, null);
        //        addItemHeat(FirmacivBlocks.CLEAT.get(), 2.875F, null, null);
        //        addItemHeat(FirmacivItems.ANCHOR.get(), 2.875F, null, null);
        //        addItemHeat(FirmacivItems.CANNONBALL.get(), 2.875F, null, null);
    }

    private static void addTagItemHeat(@NotNull final TagPrefix tagPrefix, @NotNull final Material material, @NotNull final TFCProperty prop, final float heatCapacity) {
        final var stack = ChemicalHelper.get(tagPrefix, material);
        addItemStackHeat(stack, prop, heatCapacity);
    }

    private static void addToolItemHeat(@NotNull final GTToolType toolType, @NotNull final Material material, @NotNull TFCProperty prop, final float heatCapacity) {
        final var stack = ToolHelper.get(toolType, material);
        addItemStackHeat(stack, prop, heatCapacity);
    }

    private static void addItemStackHeat(@NotNull final ItemStack stack, @NotNull final TFCProperty tfcProperty, final float heatCapacity) {
        addItemHeat(stack.getItem(), heatCapacity, tfcProperty.getForgingTemp(), tfcProperty.getWeldingTemp());
    }

    private static void addItemHeat(@NotNull final ItemLike itemLike, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
        var rl = ForgeRegistries.ITEMS.getKey(itemLike.asItem());
        if (rl == null) return;

        var json = getItemHeatJson(itemLike.asItem(), heatCapacity, forgingTemp, weldingTemp);
        TFGDynamicDataPack.addData("tfc:tfc/item_heats/" + rl.getPath(), json);
    }

    @NotNull
    private static JsonObject getItemHeatJson(@NotNull final ItemLike item, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
        var json = new JsonObject();

        json.add("ingredient", Ingredient.of(item).toJson());
        json.addProperty("heat_capacity", heatCapacity);

        if (forgingTemp != null) json.addProperty("forging_temperature", forgingTemp);
        if (weldingTemp != null) json.addProperty("welding_temperature", weldingTemp);

        return json;
    }
}
