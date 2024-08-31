package su.terrafirmagreg.core.old_remove_after_1_21_release;//package su.terrafirmagreg.core.old_remove_after_1_21_release;
//
//public class FromDynamicData {
//}
//
//package su.terrafirmagreg.core.compat.firmaciv;
//
//import com.alekiponi.firmaciv.common.block.FirmacivBlocks;
//import com.alekiponi.firmaciv.common.item.FirmacivItems;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.common.data.GTMaterials;
//import net.dries007.tfc.common.items.TFCItems;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.ItemStack;
//import su.terrafirmagreg.core.TerraFirmaGreg;
//import su.terrafirmagreg.core.compat.tfc.HeatingRecipeBuilder;
//import su.terrafirmagreg.core.objects.TFGTags;
//
//import java.util.function.Consumer;
//
//import static com.gregtechceu.gtceu.api.GTValues.*;
//        import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
//        import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
//
//public final class FirmaCivRecipes {
//
//    public static void init(Consumer<FinishedRecipe> provider) {
//        //region Anchor
//        var anchor = FirmacivItems.ANCHOR.get();
//
//        new HeatingRecipeBuilder("firmaciv:anchor")
//                .input(anchor)
//                .output(GTMaterials.Steel.getFluid(), 288)
//                .temperature(1540)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/anchor"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plateDouble, GTMaterials.Steel)
//                .circuitMeta(10)
//                .outputItems(FirmacivItems.ANCHOR.get())
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_anchor"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(anchor)
//                .outputItems(dust, GTMaterials.Steel, 2)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_anchor"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(anchor)
//                .outputItems(ingot, GTMaterials.Steel, 2)
//                .save(provider);
//        //endregion
//
//        //region Barometer
//        var barometer = FirmacivItems.BAROMETER.get();
//
//        new HeatingRecipeBuilder("firmaciv:barometer")
//                .input(barometer)
//                .output(GTMaterials.Brass.getFluid(), 216)
//                .temperature(930)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/barometer"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plate, GTMaterials.Brass)
//                .inputItems(TagPrefix.rod, GTMaterials.Brass)
//                .inputItems(TFGTags.Items.Glass)
//                .inputFluids(GTMaterials.Water.getFluid(1000))
//                .circuitMeta(10)
//                .outputItems(barometer)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_barometer"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(barometer)
//                .outputItems(dust, GTMaterials.Brass)
//                .outputItems(dustSmall, GTMaterials.Brass, 2)
//                .outputItems(dustSmall, GTMaterials.Glass)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_barometer"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(barometer)
//                .outputItems(ingot, GTMaterials.Brass, 1)
//                .outputItems(nugget, GTMaterials.Brass, 2)
//                .save(provider);
//        //endregion
//
//        //region Cannon Barrel
//        var cannonBarrel = FirmacivItems.CANNON_BARREL.get();
//
//        new HeatingRecipeBuilder("firmaciv:cannon_barrel")
//                .input(cannonBarrel)
//                .output(GTMaterials.Iron.getFluid(), 288)
//                .temperature(1535)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/cannon_barrel"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plateDouble, GTMaterials.WroughtIron)
//                .circuitMeta(13)
//                .outputItems(cannonBarrel)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_cannon_barrel"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cannonBarrel)
//                .outputItems(dust, GTMaterials.WroughtIron, 2)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_cannon_barrel"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cannonBarrel)
//                .outputItems(ingot, GTMaterials.WroughtIron, 2)
//                .save(provider);
//        //endregion
//
//        //region Cannon
//        var cannon = FirmacivItems.CANNON.get();
//
//        new HeatingRecipeBuilder("firmaciv:cannon")
//                .input(cannon)
//                .output(GTMaterials.Iron.getFluid(), 1008)
//                .temperature(1535)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_cannon"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cannon)
//                .outputItems(dust, GTMaterials.WroughtIron, 7)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_cannon"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cannon)
//                .outputItems(ingot, GTMaterials.WroughtIron, 7)
//                .save(provider);
//
//        //endregion
//
//        //region Cannonball
//        var cannonball = FirmacivItems.CANNONBALL.get();
//
//        new HeatingRecipeBuilder("firmaciv:cannonball")
//                .input(cannonball)
//                .output(GTMaterials.Iron.getFluid(), 288)
//                .temperature(1535)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/cannonball"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plateDouble, GTMaterials.WroughtIron)
//                .circuitMeta(10)
//                .outputItems(cannonball)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_cannonball"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cannonball)
//                .outputItems(dust, GTMaterials.WroughtIron, 2)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_cannonball"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cannonball)
//                .outputItems(ingot, GTMaterials.WroughtIron, 2)
//                .save(provider);
//        //endregion
//
//        //region Cleat
//        var cleat = new ItemStack(FirmacivBlocks.CLEAT.get());
//
//        new HeatingRecipeBuilder("firmaciv:cleat")
//                .input(cleat)
//                .output(GTMaterials.Steel.getFluid(), 288)
//                .temperature(1535)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/cleat"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plateDouble, GTMaterials.Steel)
//                .circuitMeta(11)
//                .outputItems(cleat)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_cleat"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cleat)
//                .outputItems(dust, GTMaterials.Steel)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_cleat"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(cleat)
//                .outputItems(ingot, GTMaterials.Steel)
//                .save(provider);
//        //endregion
//
//        //region Nav Clock
//        var navClock = FirmacivItems.NAV_CLOCK.get();
//
//        new HeatingRecipeBuilder("firmaciv:nav_clock")
//                .input(navClock)
//                .output(GTMaterials.Brass.getFluid(), 504)
//                .temperature(930)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/nav_clock"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plate, GTMaterials.Brass, 3)
//                .inputItems(TagPrefix.rod, GTMaterials.Brass, 1)
//                .inputItems(TFCItems.LENS.get())
//                .circuitMeta(14)
//                .outputItems(navClock)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_nav_clock"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(navClock)
//                .outputItems(dust, GTMaterials.Brass, 3)
//                .outputItems(dustSmall, GTMaterials.Brass, 2)
//                .outputItems(dustSmall, GTMaterials.Glass)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_nav_clock"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(navClock)
//                .outputItems(ingot, GTMaterials.Brass, 3)
//                .outputItems(nugget, GTMaterials.Brass, 2)
//                .save(provider);
//        //endregion
//
//        //region Oarlock
//        var oarlock = new ItemStack(FirmacivBlocks.OARLOCK.get());
//
//        new HeatingRecipeBuilder("firmaciv:oarlock")
//                .input(oarlock)
//                .output(GTMaterials.Iron.getFluid(), 288)
//                .temperature(1535)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/oarlock"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plateDouble, GTMaterials.WroughtIron)
//                .circuitMeta(11)
//                .outputItems(oarlock)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_oarlock"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(oarlock)
//                .outputItems(dust, GTMaterials.WroughtIron, 2)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_oarlock"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(oarlock)
//                .outputItems(ingot, GTMaterials.WroughtIron, 2)
//                .save(provider);
//
//        //endregion
//
//        //region Sextant
//        var sextant = FirmacivItems.SEXTANT.get();
//
//        new HeatingRecipeBuilder("firmaciv:sextant")
//                .input(sextant)
//                .output(GTMaterials.Brass.getFluid(), 360)
//                .temperature(930)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/sextant"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.plate, GTMaterials.Brass, 2)
//                .inputItems(TagPrefix.rod, GTMaterials.Brass)
//                .inputItems(TFCItems.LENS.get())
//                .circuitMeta(11)
//                .outputItems(sextant)
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/macerate_sextant"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(sextant)
//                .outputItems(dust, GTMaterials.Brass, 2)
//                .outputItems(dustSmall, GTMaterials.Brass, 2)
//                .outputItems(dustSmall, GTMaterials.Glass)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/arc_sextant"))
//                .EUt(VA[ULV]).duration(180)
//                .inputItems(sextant)
//                .outputItems(ingot, GTMaterials.Brass, 2)
//                .outputItems(nugget, GTMaterials.Brass, 2)
//                .save(provider);
//        //endregion
//
//        //region Unfinished Barometer
//        new HeatingRecipeBuilder("firmaciv:unfinished_barometer")
//                .input(FirmacivItems.UNFINISHED_BAROMETER.get())
//                .output(GTMaterials.Brass.getFluid(), 144)
//                .temperature(930)
//                .save(provider);
//
//        //endregion
//
//        //region Unfinished Sextant
//        new HeatingRecipeBuilder("firmaciv:unfinished_sextant")
//                .input(FirmacivItems.UNFINISHED_SEXTANT.get())
//                .output(GTMaterials.Brass.getFluid(), 288)
//                .temperature(930)
//                .save(provider);
//
//        //endregion
//
//        //region Unfinished Nav Clock
//        new HeatingRecipeBuilder("firmaciv:unfinished_nav_clock")
//                .input(FirmacivItems.UNFINISHED_NAV_CLOCK.get())
//                .output(GTMaterials.Brass.getFluid(), 288)
//                .temperature(930)
//                .save(provider);
//
//        //endregion
//
//        //region Compass
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("firmaciv/compass"))
//                .EUt(VA[ULV]).duration(75)
//                .inputItems(TagPrefix.dust, GTMaterials.Redstone)
//                .inputItems(TagPrefix.plate, GTMaterials.WroughtIron)
//                .circuitMeta(1)
//                .outputItems(FirmacivItems.FIRMACIV_COMPASS.get())
//                .save(provider);
//        //endregion
//    }
//
//}
//
//
//package su.terrafirmagreg.core.compat.tfc;
//
//import com.google.gson.JsonObject;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraftforge.fluids.FluidStack;
//import net.minecraftforge.registries.ForgeRegistries;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.function.Consumer;
//
//public abstract class AbstractRecipeBuilder {
//
//    protected ResourceLocation id;
//
//    public AbstractRecipeBuilder(final String id) {
//        this.id = new ResourceLocation(id);
//    }
//
//    public abstract void save(Consumer<FinishedRecipe> consumer);
//
//    @Nullable
//    protected JsonObject fluidStackToJson(final FluidStack fluidStack) {
//        return fluidStackToJson(fluidStack, "fluid");
//    }
//
//    @Nullable
//    protected JsonObject fluidStackToJson(final FluidStack fluidStack, final String fluidIdPropName) {
//        var json = new JsonObject();
//
//        var fluid = ForgeRegistries.FLUIDS.getKey(fluidStack.getFluid());
//        if (fluid == null) throw new IllegalArgumentException("Can't find fluid from fluidStack in fluid registry, its weird...");
//
//        json.addProperty(fluidIdPropName, fluid.getNamespace() + ":" + fluid.getPath());
//        json.addProperty("amount", fluidStack.getAmount());
//
//        return json;
//    }
//}
//
//package su.terrafirmagreg.core.mixins.common.gtceu;
//
//import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.api.data.worldgen.GTOreDefinition;
//import com.gregtechceu.gtceu.api.data.worldgen.IWorldGenLayer;
//import com.gregtechceu.gtceu.integration.GTOreVeinWidget;
//import com.lowdragmc.lowdraglib.gui.texture.ColorRectTexture;
//import com.lowdragmc.lowdraglib.gui.widget.PhantomSlotWidget;
//import com.lowdragmc.lowdraglib.gui.widget.SlotWidget;
//import com.lowdragmc.lowdraglib.gui.widget.Widget;
//import com.lowdragmc.lowdraglib.gui.widget.WidgetGroup;
//import com.lowdragmc.lowdraglib.jei.IngredientIO;
//import com.lowdragmc.lowdraglib.misc.ItemStackTransfer;
//import com.lowdragmc.lowdraglib.utils.CycleItemStackHandler;
//import com.lowdragmc.lowdraglib.utils.LocalizationUtils;
//import net.dries007.tfc.common.blocks.TFCBlocks;
//import net.dries007.tfc.common.blocks.rock.Rock;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.util.FastColor;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.level.Level;
//import org.spongepowered.asm.mixin.Final;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Shadow;
//import org.spongepowered.asm.mixin.Unique;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.Redirect;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefix;
//import su.terrafirmagreg.core.objects.TFGHelpers;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Mixin(value = GTOreVeinWidget.class, remap = false)
//public abstract class GTOreVeinWidgetMixin extends WidgetGroup {
//
//    @Shadow
//    @Final
//    public static int width;
//
////    @Shadow
////    @Final
////    private Set<ResourceKey<Level>> dimensionFilter;
//
//    /**
//     * Для того, чтобы в gui рудных жил отображались все виды руды (бедная, нормальная, богатая), а не только нормальная.
//     * Для того, чтобы отображались блоки в которых спавнится руда.
//     * */
//    @Inject(method = "setupBaseGui(Lcom/gregtechceu/gtceu/api/data/worldgen/GTOreDefinition;)V", at = @At(value = "HEAD"), remap = false, cancellable = true)
//    private void tfg$setupBaseGui(GTOreDefinition oreDefinition, CallbackInfo ci){
//        /* Отображение кусков руд */
//        List<Integer> chances = oreDefinition.veinGenerator().getAllChances();
//
//        var oreLists = tfg$getOreRawOres(oreDefinition);
//        int n = oreLists.size();
//
//        int x = (width - 18 * n) / 2;
//        for (int i = 0; i < n; i++) {
//            SlotWidget oreSlot = new SlotWidget(new CycleItemStackHandler(oreLists), i, x, 18, false, false);
//            int finalI = i;
//            oreSlot.setOnAddedTooltips((stack, tooltips) ->
//                    tooltips.add(Component.nullToEmpty(LocalizationUtils.format("gtceu.jei.ore_vein_diagram.chance", chances.get(finalI)))));
//            oreSlot.setIngredientIO(IngredientIO.OUTPUT);
//            addWidget(oreSlot);
//            x += 18;
//        }
//
//        /* Отображение планет вместо имен измерений */
////        var ruleTest = oreDefinition.layer().getTarget();
////        var stackTargets = new HashSet<ItemStack>();
////
////        for (var rock : Rock.values()) {
////            var rockRawBlock = TFCBlocks.ROCK_BLOCKS.get(rock).get(Rock.BlockType.RAW).get();
////
////            if (ruleTest.test(rockRawBlock.defaultBlockState(), null))
////                stackTargets.add(new ItemStack(rockRawBlock));
////        }
////
////        if (!stackTargets.isEmpty())
////            addWidget(new SlotWidget(new CycleItemStackHandler(List.of(new ArrayList<>(stackTargets).stream().toList())), 0, 78, 50));
////
////        var x1 = 5;
////        var y1 = 80;
////        for (var i = 0; i < dimensionFilter.size(); i++) {
////            Item planetItem;
////
////            var dimensionList = dimensionFilter.stream().toList();
////            var dimElement = dimensionList.get(i);
////
////            planetItem = TFGHelpers.DIM_ID_TO_PLANET_PLACEHOLDER_MAP.get(dimElement.location().toString());
////
////            if (planetItem == null)
////                planetItem = Items.BARRIER;
////
////            var slot = new PhantomSlotWidget(new ItemStackTransfer(new ItemStack(planetItem)), 0, x1, y1);
////            slot.setBackground(new ColorRectTexture(FastColor.ARGB32.color(0, 0, 0, 0)));
////            addWidget(slot);
////
////            x1 += 18;
////            if (x1 + 18 > width) {
////                x1 = 5;
////                y1 += 18;
////            }
////        }
//
//        ci.cancel();
//    }
//
////    /**
////     * Удаляет текст измерений в которых появляется руда.
////     * */
////    @Redirect(method = "setupText(Lcom/gregtechceu/gtceu/api/data/worldgen/GTOreDefinition;)V", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/integration/GTOreVeinWidget;addWidget(Lcom/lowdragmc/lowdraglib/gui/widget/Widget;)Lcom/lowdragmc/lowdraglib/gui/widget/WidgetGroup;", ordinal = 5), remap = false)
////    private WidgetGroup tfg$setupText(GTOreVeinWidget instance, Widget widget) {
////        return null;
////    }
//
////    /**
////     * Удаляет текст измерений в которых появляется жидкостная руда.
////     * */
////    @Redirect(method = "setupText(Lcom/gregtechceu/gtceu/api/data/worldgen/bedrockfluid/BedrockFluidDefinition;)V", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/integration/GTOreVeinWidget;addWidget(Lcom/lowdragmc/lowdraglib/gui/widget/Widget;)Lcom/lowdragmc/lowdraglib/gui/widget/WidgetGroup;", ordinal = 3), remap = false)
////    private WidgetGroup tfg$setupText1(GTOreVeinWidget instance, Widget widget) {
////        return null;
////    }
//
//    /**
//     * Этот метод в оригинале используется в 2 местах в коде. В setupBaseGui мы его удалили,
//     * второе использование осталось в методе получения ингредиентов,
//     * но он не нужен, тк кнопки R и U итак работают по предмету, поэтому делаем возвращение пустого списка,
//     * своего рода оптимизация.
//     * */
//    @Inject(method = "getContainedOresAndBlocks", at = @At(value = "HEAD"), remap = false, cancellable = true)
//    private static void tfg$getContainedOresAndBlocks(GTOreDefinition oreDefinition, CallbackInfoReturnable<List<ItemStack>> cir) {
//        cir.setReturnValue(List.of());
//    }
//
//    /**
//     * Метод возвращает список из списков типов руд жилы. Например в жиле с алмазами и графитом список будет следующий:
//     * Список(Список(Алмаз бедный, Алмаз нормальный, Алмаз богатый), Список(Графит бедный, Графит нормальный, Графит богатый))
//     * */
//    @Unique
//    private static List<List<ItemStack>> tfg$getOreRawOres(GTOreDefinition oreDefinition) {
//        var list = new ArrayList<List<ItemStack>>();
//
//        oreDefinition.veinGenerator().getAllEntries().forEach(el -> {
//            if (el.getKey().right().isPresent()) {
//                var oreList = new ArrayList<ItemStack>();
//
//                oreList.add(ChemicalHelper.get(TFGTagPrefix.poorRawOre, el.getKey().right().get()));
//                oreList.add(ChemicalHelper.get(TagPrefix.rawOre, el.getKey().right().get()));
//                oreList.add(ChemicalHelper.get(TFGTagPrefix.richRawOre, el.getKey().right().get()));
//
//                list.add(oreList);
//            }
//        });
//
//        return list;
//    }
//}
//
//package su.terrafirmagreg.core.objects;
//
//import com.alekiponi.firmaciv.common.block.FirmacivBlocks;
//import com.alekiponi.firmaciv.common.item.FirmacivItems;
//import com.google.gson.JsonObject;
//import com.gregtechceu.gtceu.api.GTCEuAPI;
//import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
//import com.gregtechceu.gtceu.api.data.chemical.material.Material;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.api.item.tool.GTToolType;
//import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
//import com.gregtechceu.gtceu.common.data.GTItems;
//import net.dries007.tfc.common.blocks.Gem;
//import net.dries007.tfc.common.blocks.rock.Ore;
//import net.dries007.tfc.common.items.TFCItems;
//import net.dries007.tfc.util.Metal;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.level.ItemLike;
//import net.minecraftforge.registries.ForgeRegistries;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//import su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags;
//import su.terrafirmagreg.core.compat.gtceu.TFGPropertyKeys;
//import su.terrafirmagreg.core.compat.gtceu.properties.TFCProperty;
//
//import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
//        import static com.gregtechceu.gtceu.api.item.tool.GTToolType.*;
//        import static su.terrafirmagreg.core.compat.gtceu.TFGTagPrefix.*;
//
//public final class TFGData {
//    public static void initAddition() {
//        registerTFCHeatData();
//    }
//
//    public static void initRemoving() {
//        //region Отключение рецептов инструментов дублирующих GTCEu
//        for (var material : GTCEuAPI.materialManager.getRegisteredMaterials()) {
//            if (!material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL)) continue;
//
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/sword/" + material.getName());
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/pickaxe/" + material.getName());
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/axe/" + material.getName());
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/hoe/" + material.getName());
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/hammer/" + material.getName());
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/saw/" + material.getName());
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/scythe/" + material.getName());
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/knife/" + material.getName());
//        }
//        //endregion
//
//        //region Отключение рецептов нагрева руд
//        for (var grade : Ore.Grade.values()) {
//            for (var ore : Ore.values()) {
//                if (!ore.isGraded()) continue;
//
//                TFGDynamicDataPack.removeRecipe("tfc:heating/ore/" + grade.name().toLowerCase() + "_" + ore.name().toLowerCase());
//            }
//        }
//        //endregion
//
//        //region Отлючение рецептов TFC вариантов металических блоков, ступеней, пластин
//        for (var metal : Metal.Default.values()) {
//            if (!metal.hasParts()) continue;
//
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/block/" + metal.name().toLowerCase());
//            TFGDynamicDataPack.removeRecipe("tfc:heating/metal/" + metal.name().toLowerCase() + "_block");
//
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/block/" + metal.name().toLowerCase() + "_stairs");
//            TFGDynamicDataPack.removeRecipe("tfc:heating/metal/" + metal.name().toLowerCase() + "_block_stairs");
//
//            TFGDynamicDataPack.removeRecipe("tfc:crafting/metal/block/" + metal.name().toLowerCase() + "_slab");
//            TFGDynamicDataPack.removeRecipe("tfc:heating/metal/" + metal.name().toLowerCase() + "_block_slab");
//        }
//        //endregion
//
//        //region Отключение оставшихся рецептов из CastIron
//
//        // Слиток
//        TFGDynamicDataPack.removeRecipe("tfc:casting/cast_iron_ingot");
//        TFGDynamicDataPack.removeRecipe("tfc:casting/cast_iron_fire_ingo");
//        TFGDynamicDataPack.removeRecipe("tfc:heating/metal/cast_iron_ingot");
//        TFGDynamicDataPack.removeRecipe("tfc:welding/cast_iron_double_ingot");
//        TFGDynamicDataPack.removeRecipe("tfc:anvil/cast_iron_rod");
//
//        // Двойной слиток
//        TFGDynamicDataPack.removeRecipe("tfc:heating/metal/cast_iron_double_ingot");
//        TFGDynamicDataPack.removeRecipe("tfc:anvil/cast_iron_sheet");
//
//        // Пластина
//        TFGDynamicDataPack.removeRecipe("tfc:heating/metal/cast_iron_sheet");
//        TFGDynamicDataPack.removeRecipe("tfc:welding/cast_iron_double_sheet");
//
//        // Двойная пластина
//        TFGDynamicDataPack.removeRecipe("tfc:heating/metal/cast_iron_double_sheet");
//
//        // Стержень
//        TFGDynamicDataPack.removeRecipe("tfc:heating/metal/cast_iron_rod");
//        //endregion
//
//        for (var gem : Gem.values()) {
//            TFGDynamicDataPack.removeRecipe("firmaciv:quern/" + gem.name().toLowerCase());
//        }
//
//        TFGDynamicDataPack.removeRecipe("firmaciv:anvil/copper_bolt");
//        TFGDynamicDataPack.removeRecipe("firmaciv:heating/copper_bolt");
//
//        // Другое
//        TFGDynamicDataPack.removeRecipe("gtceu:alloy_smelter/anvil");
//        TFGDynamicDataPack.removeRecipe("gtceu:fluid_solidifier/solidify_anvil");
//    }
//
//    private static void registerTFCHeatData() {
//        for (final var material : GTCEuAPI.materialManager.getRegisteredMaterials()) {
//            var tfcProperty = material.getProperty(TFGPropertyKeys.TFC_PROPERTY);
//            if (tfcProperty == null) continue;
//
//            addTagItemHeat(dustTiny, material, tfcProperty, 0.357F);
//            addTagItemHeat(dustSmall, material, tfcProperty, 0.714F);
//            addTagItemHeat(dust, material, tfcProperty, 1.429F);
//            addTagItemHeat(dustImpure, material, tfcProperty, 1.429F);
//            addTagItemHeat(dustPure, material, tfcProperty, 1.429F);
//            addTagItemHeat(rod, material, tfcProperty, 0.567F);
//            addTagItemHeat(rodLong, material, tfcProperty, 1.429F);
//            addTagItemHeat(bolt, material, tfcProperty, 0.245F);
//            addTagItemHeat(screw, material, tfcProperty, 0.567F);
//            addTagItemHeat(nugget, material, tfcProperty, 0.124F);
//            addTagItemHeat(ring, material, tfcProperty, 0.567F);
//            addTagItemHeat(block, material, tfcProperty, 12.861F);
//
//            addTagItemHeat(ingot, material, tfcProperty, 1.429F);
//            addTagItemHeat(ingotDouble, material, tfcProperty, 1.429F);
//            addTagItemHeat(plate, material, tfcProperty, 1.429F);
//            addTagItemHeat(plateDouble, material, tfcProperty, 1.429F);
//
//            addTagItemHeat(poorRawOre, material, tfcProperty, 1.429F);
//            addTagItemHeat(rawOre, material, tfcProperty, 1.429F);
//            addTagItemHeat(richRawOre, material, tfcProperty, 1.429F);
//
//            addTagItemHeat(crushed, material, tfcProperty, 1.429F);
//            addTagItemHeat(crushedRefined, material, tfcProperty, 1.429F);
//            addTagItemHeat(crushedPurified, material, tfcProperty, 1.429F);
//
//            addTagItemHeat(toolHeadSword, material, tfcProperty, 2.875F);
//            addTagItemHeat(toolHeadShovel, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadScythe, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadPickaxe, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadSaw, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadKnife, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadHoe, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadHammer, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadAxe, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadFile, material, tfcProperty, 1.429F);
//            addTagItemHeat(toolHeadButcheryKnife, material, tfcProperty, 2.875F);
//            addTagItemHeat(toolHeadMiningHammer, material, tfcProperty, 2.875F);
//            addTagItemHeat(toolHeadSpade, material, tfcProperty, 2.875F);
//
//            addToolItemHeat(SWORD, material, tfcProperty, 1.429F);
//            addToolItemHeat(PICKAXE, material, tfcProperty, 1.429F);
//            addToolItemHeat(SHOVEL, material, tfcProperty, 1.429F);
//            addToolItemHeat(AXE, material, tfcProperty, 1.429F);
//            addToolItemHeat(HOE, material, tfcProperty, 1.429F);
//            addToolItemHeat(SAW, material, tfcProperty, 1.429F);
//            addToolItemHeat(HARD_HAMMER, material, tfcProperty, 2.875F);
//            addToolItemHeat(FILE, material, tfcProperty, 1.429F);
//            addToolItemHeat(SCYTHE, material, tfcProperty, 1.429F);
//            addToolItemHeat(KNIFE, material, tfcProperty, 1.429F);
//            addToolItemHeat(BUTCHERY_KNIFE, material, tfcProperty, 2.875F);
//            addToolItemHeat(MINING_HAMMER, material, tfcProperty, 1.429F);
//            addToolItemHeat(SPADE, material, tfcProperty, 2.875F);
//        }
//
//        addItemStackHeat(TFCItems.BRASS_MECHANISMS.get(), 0.567F, null, null);
//        addItemStackHeat(TFCItems.BLUE_STEEL_BUCKET.get(), 1.429F, 924, 1232);
//        addItemStackHeat(TFCItems.RED_STEEL_BUCKET.get(), 1.429F, 924, 1232);
//        addItemStackHeat(GTItems.COMPRESSED_COKE_CLAY.get(), 0.1242F, null, null);
//
//        addItemStackHeat(FirmacivItems.CANNON.get(), 2.875F, null, null);
//        addItemStackHeat(FirmacivItems.CANNON_BARREL.get(), 2.875F, null, null);
//        addItemStackHeat(FirmacivBlocks.CLEAT.get(), 2.875F, null, null);
//        addItemStackHeat(FirmacivItems.ANCHOR.get(), 2.875F, null, null);
//        addItemStackHeat(FirmacivItems.CANNONBALL.get(), 2.875F, null, null);
//    }
//
//    private static void addTagItemHeat(@NotNull final TagPrefix tagPrefix, @NotNull final Material material, @NotNull final TFCProperty prop, final float heatCapacity) {
//        final var stack = ChemicalHelper.get(tagPrefix, material);
//        addItemStackHeat(stack, prop, heatCapacity);
//    }
//
//    private static void addToolItemHeat(@NotNull final GTToolType toolType, @NotNull final Material material, @NotNull TFCProperty prop, final float heatCapacity) {
//        final var stack = ToolHelper.get(toolType, material);
//        addItemStackHeat(stack, prop, heatCapacity);
//    }
//
//    private static void addItemStackHeat(@NotNull final ItemStack stack, @NotNull final TFCProperty tfcProperty, final float heatCapacity) {
//        addItemStackHeat(stack, heatCapacity, tfcProperty.getForgingTemp(), tfcProperty.getWeldingTemp());
//    }
//
//    private static void addItemStackHeat(@NotNull final ItemLike itemLike, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
//        addItemStackHeat(new ItemStack(itemLike), heatCapacity, forgingTemp, weldingTemp);
//    }
//
//    private static void addItemStackHeat(@NotNull final ItemStack item, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
//        if (item.isEmpty()) return;
//
//        var rl = ForgeRegistries.ITEMS.getKey(item.getItem());
//        if (rl == null) return;
//
//        var json = Helpers.getItemHeatJson(item, heatCapacity, forgingTemp, weldingTemp);
//        TFGDynamicDataPack.addData("tfc:tfc/item_heats/" + rl.getPath(), json);
//    }
//
//    private static final class Helpers {
//
//        @NotNull
//        private static JsonObject getItemHeatJson(@NotNull final ItemStack stack, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
//            var json = new JsonObject();
//
//            json.add("ingredient", Ingredient.of(stack).toJson());
//            json.addProperty("heat_capacity", heatCapacity);
//
//            if (forgingTemp != null) json.addProperty("forging_temperature", forgingTemp);
//            if (weldingTemp != null) json.addProperty("welding_temperature", weldingTemp);
//
//            return json;
//        }
//
//        @NotNull
//        private static JsonObject getItemHeatJson(@NotNull final Item item, final float heatCapacity, @Nullable final Integer forgingTemp, @Nullable final Integer weldingTemp) {
//            return getItemHeatJson(new ItemStack(item), heatCapacity, forgingTemp, weldingTemp);
//        }
//
//    }
//
//}
//
//package su.terrafirmagreg.core.objects;
//
//import com.mojang.blaze3d.vertex.PoseStack;
//import com.mojang.blaze3d.vertex.VertexConsumer;
//import net.dries007.tfc.client.RenderHelpers;
//import net.minecraft.client.renderer.texture.TextureAtlasSprite;
//import net.minecraft.util.FastColor;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.phys.AABB;
//import su.terrafirmagreg.core.mixins.common.tfc.IngotPileBlockEntityEntryAccessor;
//
//import java.util.List;
//import java.util.Map;
//
//public final class TFGHelpers {
//
//    public static Map<String, Item> DIM_ID_TO_PLANET_PLACEHOLDER_MAP = Map.ofEntries(
//            Map.entry("minecraft:overworld", TFGItems.EarthPlaceholder.get()),
//            Map.entry("gcyr:moon", TFGItems.MoonPlaceholder.get()),
//            Map.entry("gcyr:mars", TFGItems.MarsPlaceholder.get()),
//            Map.entry("gcyr:venus", TFGItems.VenusPlaceholder.get())
//    );
//
//    public static int calcAmountOfMetal(float defaultAmount, int percent) {
//        var value = defaultAmount / (100 / percent);
//        return (value % 2 == 0) ? (int) value : Math.round(value) - 1;
//    }
//
//    /**
//     * Метод получает стак из списка стаков с доп проверками.
//     * */
//    public static ItemStack getStackFromIngotPileTileEntityByIndex(List<?> entries, int index) {
//        try
//        {
//            return  ((IngotPileBlockEntityEntryAccessor) (Object) entries.get(index)).getStack();
//        }
//        catch (IndexOutOfBoundsException e)
//        {
//            return ItemStack.EMPTY;
//        }
//    }
//
//    /**
//     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
//     * */
//    public static void renderTexturedCuboid(PoseStack poseStack, VertexConsumer buffer, TextureAtlasSprite sprite, int packedLight, int packedOverlay, AABB bounds, int color1, int color2)
//    {
//        renderTexturedCuboid(poseStack, buffer, sprite, packedLight, packedOverlay, (float) bounds.minX, (float) bounds.minY, (float) bounds.minZ, (float) bounds.maxX, (float) bounds.maxY, (float) bounds.maxZ, color1, color2);
//    }
//
//    /**
//     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
//     * */
//    public static void renderTexturedCuboid(PoseStack poseStack, VertexConsumer buffer, TextureAtlasSprite sprite, int packedLight, int packedOverlay, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, int color1, int color2)
//    {
//        renderTexturedCuboid(poseStack, buffer, sprite, packedLight, packedOverlay, minX, minY, minZ, maxX, maxY, maxZ, 16f * (maxX - minX), 16f * (maxY - minY), 16f * (maxZ - minZ), color1, color2);
//    }
//
//    /**
//     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
//     * */
//    public static void renderTexturedCuboid(PoseStack poseStack, VertexConsumer buffer, TextureAtlasSprite sprite, int packedLight, int packedOverlay, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, float xPixels, float yPixels, float zPixels, int color1, int color2)
//    {
//        renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getXVertices(minX, minY, minZ, maxX, maxY, maxZ), zPixels, yPixels, 1, 0, 0, color1, color2);
//        renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getYVertices(minX, minY, minZ, maxX, maxY, maxZ), zPixels, xPixels, 0, 1, 0, color1, color2);
//        renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getZVertices(minX, minY, minZ, maxX, maxY, maxZ), xPixels, yPixels, 0, 0, 1, color1, color2);
//    }
//
//    /**
//     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
//     * */
//    public static void renderTexturedTrapezoidalCuboid(PoseStack poseStack, VertexConsumer buffer, TextureAtlasSprite sprite, int packedLight, int packedOverlay, float pMinX, float pMaxX, float pMinZ, float pMaxZ, float qMinX, float qMaxX, float qMinZ, float qMaxZ, float minY, float maxY, float xPixels, float yPixels, float zPixels, boolean invertNormal, int color1, int color2)
//    {
//        renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getTrapezoidalCuboidXVertices(pMinX, pMaxX, pMinZ, pMaxZ, qMinX, qMaxX, qMinZ, qMaxZ, minY, maxY), zPixels, yPixels, invertNormal ? 0 : 1, 0, invertNormal ? 1 : 0, color1, color2);
//        renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getTrapezoidalCuboidYVertices(pMinX, pMaxX, pMinZ, pMaxZ, qMinX, qMaxX, qMinZ, qMaxZ, minY, maxY), zPixels, xPixels, 0, 1, 0, color1, color2);
//        renderTexturedQuads(poseStack, buffer, sprite, packedLight, packedOverlay, RenderHelpers.getTrapezoidalCuboidZVertices(pMinX, pMaxX, pMinZ, pMaxZ, qMinX, qMaxX, qMinZ, qMaxZ, minY, maxY), xPixels, yPixels, invertNormal ? 1 : 0, 0, invertNormal ? 0 : 1, color1, color2);
//    }
//
//    /**
//     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
//     * */
//    public static void renderTexturedQuads(PoseStack poseStack, VertexConsumer buffer, TextureAtlasSprite sprite, int packedLight, int packedOverlay, float[][] vertices, float uSize, float vSize, float normalX, float normalY, float normalZ, int color1, int color2)
//    {
//        for (float[] v : vertices)
//        {
//            renderTexturedVertex(poseStack, buffer, packedLight, packedOverlay, v[0], v[1], v[2], sprite.getU(v[3] * uSize), sprite.getV(v[4] * vSize), v[5] * normalX, v[5] * normalY, v[5] * normalZ, color1, color2);
//        }
//    }
//
//    /**
//     * Просто скопированный метод из RenderHelper.java (TFC) + добавленный аргумент для цвета.
//     * */
//    public static void renderTexturedVertex(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float x, float y, float z, float u, float v, float normalX, float normalY, float normalZ, int color1, int color2)
//    {
//        buffer.vertex(poseStack.last().pose(), x, y, z)
//                .color(increaseBrightness(FastColor.ARGB32.multiply(color1, color2), 90))
//                .uv(u, v)
//                .uv2(packedLight)
//                .overlayCoords(packedOverlay)
//                .normal(poseStack.last().normal(), normalX, normalY, normalZ)
//                .endVertex();
//    }
//
//    /**
//     * Увеличивает яркость у передаваемого цвета ARGB.
//     * */
//    public static int increaseBrightness(int argbValue, int increment) {
//        // Получаем составляющие ARGB значения
//        int alpha = (argbValue >> 24) & 0xFF;
//        int red = (argbValue >> 16) & 0xFF;
//        int green = (argbValue >> 8) & 0xFF;
//        int blue = argbValue & 0xFF;
//
//        // Увеличиваем яркость для каждой компоненты цвета
//        red = Math.min(255, red + increment);
//        green = Math.min(255, green + increment);
//        blue = Math.min(255, blue + increment);
//
//        // Собираем новое ARGB значение
//        return (alpha << 24) | (0xFF000000 | (red << 16) | (green << 8) | blue);
//    }
//}
//
//package su.terrafirmagreg.core.objects;
//
//import com.gregtechceu.gtceu.api.GTCEuAPI;
//import com.gregtechceu.gtceu.api.GTValues;
//import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
//import com.gregtechceu.gtceu.api.data.chemical.material.Material;
//import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.api.item.tool.GTToolType;
//import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
//import com.gregtechceu.gtceu.common.data.GTItems;
//import com.gregtechceu.gtceu.common.data.GTMaterials;
//import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
//import com.tterrag.registrate.util.entry.ItemEntry;
//import net.dries007.tfc.common.capabilities.forge.ForgeRule;
//import net.dries007.tfc.common.items.TFCItems;
//import net.dries007.tfc.util.Metal;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.block.Blocks;
//import su.terrafirmagreg.core.TerraFirmaGreg;
//import su.terrafirmagreg.core.compat.gtceu.TFGMaterialFlags;
//import su.terrafirmagreg.core.compat.gtceu.TFGMaterials;
//import su.terrafirmagreg.core.compat.gtceu.TFGPropertyKeys;
//import su.terrafirmagreg.core.compat.gtceu.properties.TFCProperty;
//import su.terrafirmagreg.core.compat.tfc.AnvilRecipeBuilder;
//import su.terrafirmagreg.core.compat.tfc.CastingRecipeBuilder;
//import su.terrafirmagreg.core.compat.tfc.HeatingRecipeBuilder;
//import su.terrafirmagreg.core.compat.tfc.WeldingRecipeBuilder;
//
//import java.util.function.Consumer;
//
//import static com.gregtechceu.gtceu.api.GTValues.*;
//        import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
//        import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingot;
//import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_EMPTY;
//import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
//        import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
//        import static com.gregtechceu.gtceu.data.recipe.generated.RecyclingRecipeHandler.processCrushing;
//import static su.terrafirmagreg.core.compat.gtceu.TFGMaterials.*;
//        import static su.terrafirmagreg.core.compat.gtceu.TFGTagPrefix.*;
//        import static su.terrafirmagreg.core.objects.TFGItems.*;
//
//public final class TFGRecipes {
//
//    public static void init(Consumer<FinishedRecipe> provider) {
//        registerTFCRockDecompositionRecipes(provider);
//        registerExtruderMoldRecipes(provider);
//        registerCastingMoldRecipes(provider);
//        registerExtruderMoldCopyingRecipes(provider);
//        registerCastingMoldCopyingRecipes(provider);
//        registerProcessingToolHeadsRecipes(provider);
//        registerToolRecyclingRecipes(provider);
//        // registerHeatingRecipes(provider);
//        registerRandomRecipes(provider);
//    }
//
//    private static void registerTFCRockDecompositionRecipes(Consumer<FinishedRecipe> provider) {
//        // Gabbro
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("gabbro_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Gabbro)
//                .chancedOutput(dustTiny, Titanium, 6700, 700)
//                .chancedOutput(dustTiny, Iron, 3700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .save(provider);
//
//        // Shale
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("shale_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Shale)
//                .chancedOutput(dustTiny, Sodium, 7500, 500)
//                .chancedOutput(dustTiny, MetalMixture, 1500, 500)
//                .outputFluids(Oxygen.getFluid(16))
//                .save(provider);
//
//        // Claystone
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("claystone_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Claystone)
//                .chancedOutput(dustTiny, Aluminium, 6700, 700)
//                .chancedOutput(dustTiny, Silicon, 6700, 700)
//                .chancedOutput(dustTiny, Hematite, 6700, 700)
//                .outputFluids(Oxygen.getFluid(5))
//                .save(provider);
//
//        // Limestone
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("limestone_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Limestone)
//                .chancedOutput(dustTiny, Calcium, 8700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .outputFluids(Oxygen.getFluid(36))
//                .save(provider);
//
//        // Conglomerate
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("conglomerate_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Conglomerate)
//                .chancedOutput(dustTiny, Hematite, 6700, 700)
//                .chancedOutput(dustTiny, Silicon, 4700, 700)
//                .chancedOutput(dustTiny, TricalciumPhosphate, 3700, 700)
//                .outputFluids(Oxygen.getFluid(5))
//                .save(provider);
//
//        // Dolomite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("dolomite_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Dolomite)
//                .chancedOutput(dustTiny, Magnesium, 6700, 700)
//                .chancedOutput(dustTiny, Calcium, 5700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 3700, 700)
//                .outputFluids(Oxygen.getFluid(16))
//                .save(provider);
//
//        // Chert
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("chert_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Chert)
//                .chancedOutput(dustTiny, Silicon, 6700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 5700, 700)
//                .outputFluids(Oxygen.getFluid(24))
//                .save(provider);
//
//        // Chalk
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("chalk_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Chalk)
//                .chancedOutput(dustTiny, Calcium, 6700, 700)
//                .chancedOutput(dustTiny, Carbon, 3700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .outputFluids(Oxygen.getFluid(12))
//                .save(provider);
//
//        // Rhyolite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("rhyolite_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Rhyolite)
//                .chancedOutput(dustTiny, SiliconDioxide, 8700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 800, 700)
//                .save(provider);
//
//        // Dacite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("dacite_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Dacite)
//                .chancedOutput(dustTiny, Sodium, 6700, 700)
//                .chancedOutput(dustTiny, Calcium, 5700, 700)
//                .chancedOutput(dustTiny, SiliconDioxide, 4700, 700)
//                .chancedOutput(dustTiny, Aluminium, 3700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 150, 700)
//                .outputFluids(Oxygen.getFluid(12))
//                .save(provider);
//
//        // Slate
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("slate_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Slate)
//                .chancedOutput(dustTiny, MetalMixture, 780, 480)
//                .outputFluids(Oxygen.getFluid(6))
//                .save(provider);
//
//        // Phyllite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("phyllite_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Phyllite)
//                .chancedOutput(dustTiny, Quartzite, 5700, 700)
//                .chancedOutput(dustTiny, CalciumChloride, 1700, 700)
//                .outputFluids(Oxygen.getFluid(2))
//                .save(provider);
//
//        // Schist
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("schist_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Schist)
//                .chancedOutput(dustTiny, Mica, 6700, 700)
//                .chancedOutput(dustTiny, Talc, 5700, 700)
//                .chancedOutput(dustTiny, Graphite, 4700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 780, 700)
//                .outputFluids(Oxygen.getFluid(12))
//                .save(provider);
//
//        // Gneiss
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("gneiss_dust_separation")).duration(480).EUt(VA[MV])
//                .inputItems(dust, Gneiss)
//                .chancedOutput(dustTiny, Quartzite, 6700, 700)
//                .chancedOutput(dustTiny, Biotite, 3700, 700)
//                .outputFluids(Oxygen.getFluid(2))
//                .save(provider);
//    }
//
//    private static void registerExtruderMoldRecipes(Consumer<FinishedRecipe> provider) {
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_mining_hammer_head"),
//                SHAPE_EXTRUDER_MINING_HAMMER_HEAD.asStack(),
//                "Sfh", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_sword_head"),
//                SHAPE_EXTRUDER_SWORD_HEAD.asStack(),
//                "Shf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_pickaxe_head"),
//                SHAPE_EXTRUDER_PICKAXE_HEAD.asStack(),
//                "S  ", "hf ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_axe_head"),
//                SHAPE_EXTRUDER_AXE_HEAD.asStack(),
//                "S  ", " fh", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_hoe_head"),
//                SHAPE_EXTRUDER_HOE_HEAD.asStack(),
//                "S  ", " hf", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_scythe_head"),
//                SHAPE_EXTRUDER_SCYTHE_HEAD.asStack(),
//                "S  ", "   ", "fh ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_file_head"),
//                SHAPE_EXTRUDER_FILE_HEAD.asStack(),
//                "S  ", "   ", "hf ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_hammer_head"),
//                SHAPE_EXTRUDER_HAMMER_HEAD.asStack(),
//                "Sf ", " h ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_saw_head"),
//                SHAPE_EXTRUDER_SAW_HEAD.asStack(),
//                "Sh ", " f ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_knife_head"),
//                SHAPE_EXTRUDER_KNIFE_HEAD.asStack(),
//                "S f", "   ", "  h", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_butchery_head_head"),
//                SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD.asStack(),
//                "S h", "   ", "  f", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_shovel_head"),
//                SHAPE_EXTRUDER_SHOVEL_HEAD.asStack(),
//                "S  ", "f  ", "h  ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_spade_head"),
//                SHAPE_EXTRUDER_SPADE_HEAD.asStack(),
//                "S  ", "f  ", "  h", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_propick_head"),
//                SHAPE_EXTRUDER_PROPICK_HEAD.asStack(),
//                "Sxf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_javelin_head"),
//                SHAPE_EXTRUDER_JAVELIN_HEAD.asStack(),
//                "S x", "f  ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_chisel_head"),
//                SHAPE_EXTRUDER_CHISEL_HEAD.asStack(),
//                "S  ", "xf ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_extruder_mace_head"),
//                SHAPE_EXTRUDER_MACE_HEAD.asStack(),
//                "S  ", " xf", "   ", 'S', SHAPE_EMPTY.asStack());
//    }
//
//    private static void registerCastingMoldRecipes(Consumer<FinishedRecipe> provider) {
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_mold_unfinished_lamp"),
//                SHAPE_MOLD_UNFINISHED_LAMP.asStack(),
//                "Sh ", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_mold_trapdoor"),
//                SHAPE_MOLD_TRAPDOOR.asStack(),
//                "S h", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_mold_chain"),
//                SHAPE_MOLD_CHAIN.asStack(),
//                "S  ", "h  ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TerraFirmaGreg.id("shape_mold_bell"),
//                SHAPE_MOLD_BELL.asStack(),
//                "S  ", " h ", "   ", 'S', SHAPE_EMPTY.asStack());
//    }
//
//    private static void registerExtruderMoldCopyingRecipes(Consumer<FinishedRecipe> provider) {
//        for (var shapeMold : TFGItems.SHAPE_EXTRUDERS) {
//            FORMING_PRESS_RECIPES.recipeBuilder(TerraFirmaGreg.id("copy_mold_" + shapeMold.get()))
//                    .duration(120).EUt(22)
//                    .notConsumable(shapeMold)
//                    .inputItems(SHAPE_EMPTY)
//                    .outputItems(shapeMold)
//                    .save(provider);
//        }
//    }
//
//    private static void registerCastingMoldCopyingRecipes(Consumer<FinishedRecipe> provider) {
//        for (var shapeMold : SHAPE_MOLDS) {
//            FORMING_PRESS_RECIPES.recipeBuilder(TerraFirmaGreg.id("copy_mold_" + shapeMold.get() + "_casting_mold"))
//                    .duration(120).EUt(22)
//                    .notConsumable(shapeMold)
//                    .inputItems(SHAPE_EMPTY)
//                    .outputItems(shapeMold)
//                    .save(provider);
//        }
//    }
//
//    private static void registerProcessingToolHeadsRecipes(Consumer<FinishedRecipe> consumer) {
//        for (var material : GTCEuAPI.materialManager.getRegisteredMaterials()) {
//            if (material.hasProperty(PropertyKey.TOOL)) {
//
//                int counter = 0;
//
//                processToolHead(toolHeadAxe, material, SHAPE_EXTRUDER_AXE_HEAD, counter++, consumer);
//                processToolHead(toolHeadHoe, material, SHAPE_EXTRUDER_HOE_HEAD, counter++, consumer);
//                processToolHead(toolHeadShovel, material, SHAPE_EXTRUDER_SHOVEL_HEAD, counter++, consumer);
//                processToolHead(toolHeadKnife, material, SHAPE_EXTRUDER_KNIFE_HEAD, counter++, consumer);
//                processToolHead(toolHeadMiningHammer, material, SHAPE_EXTRUDER_MINING_HAMMER_HEAD, counter++, consumer);
//                processToolHead(toolHeadSword, material, SHAPE_EXTRUDER_SWORD_HEAD, counter++, consumer);
//                processToolHead(toolHeadPickaxe, material, SHAPE_EXTRUDER_PICKAXE_HEAD, counter++, consumer);
//                processToolHead(toolHeadScythe, material, SHAPE_EXTRUDER_SCYTHE_HEAD, counter++, consumer);
//                processToolHead(toolHeadFile, material, SHAPE_EXTRUDER_FILE_HEAD, counter++, consumer);
//                processToolHead(toolHeadHammer, material, SHAPE_EXTRUDER_HAMMER_HEAD, counter++, consumer);
//                processToolHead(toolHeadSaw, material, SHAPE_EXTRUDER_SAW_HEAD, counter++, consumer);
//                processToolHead(toolHeadButcheryKnife, material, SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD, counter++, consumer);
//                processToolHead(toolHeadSpade, material, SHAPE_EXTRUDER_SPADE_HEAD, counter++, consumer);
//                processToolHead(toolHeadPropick, material, SHAPE_EXTRUDER_PROPICK_HEAD, counter++, consumer);
//                processToolHead(toolHeadJavelin, material, SHAPE_EXTRUDER_JAVELIN_HEAD, counter++, consumer);
//                processToolHead(toolHeadChisel, material, SHAPE_EXTRUDER_CHISEL_HEAD, counter++, consumer);
//                processToolHead(toolHeadMace, material, SHAPE_EXTRUDER_MACE_HEAD, counter, consumer);
//            }
//        }
//    }
//
//    private static void registerToolRecyclingRecipes(Consumer<FinishedRecipe> provider) {
//        /* Оголовья добавленные нами */
//        toolHeadMiningHammer.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadSword.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadPickaxe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadShovel.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadAxe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadHoe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadScythe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadFile.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadHammer.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadSaw.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadKnife.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadButcheryKnife.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadSpade.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadPropick.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadJavelin.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadChisel.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadMace.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//
//        /* Оголовья грега, которые почему-то не имеют декрафта */
//        toolHeadBuzzSaw.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadScrewdriver.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadDrill.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadChainsaw.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//        toolHeadWrench.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
//    }
//
//    private static void registerRandomRecipes(Consumer<FinishedRecipe> provider) {
//        ingot.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processIngot(tagPrefix, material, property, provider));
//        ingotDouble.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processDoubleIngot(tagPrefix, material, property, provider));
//        plate.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processPlate(tagPrefix, material, property, provider));
//        plateDouble.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processDoublePlate(tagPrefix, material, property, provider));
//        rod.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRod(tagPrefix, material, property, provider));
//        rodLong.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processLongRod(tagPrefix, material, property, provider));
//        bolt.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processBolt(tagPrefix, material, property, provider));
//        screw.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processScrew(tagPrefix, material, property, provider));
//        ring.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRing(tagPrefix, material, property, provider));
//        block.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processBlock(tagPrefix, material, property, provider));
//        nugget.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processNugget(tagPrefix, material, property, provider));
//        dustTiny.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processTinyDust(tagPrefix, material, property, provider));
//        dustSmall.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processSmallDust(tagPrefix, material, property, provider));
//        dust.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processDust(tagPrefix, material, property, provider));
//        dustImpure.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processImpureDust(tagPrefix, material, property, provider));
//        dustPure.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processPureDust(tagPrefix, material, property, provider));
//        poorRawOre.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processPoorRawOre(tagPrefix, material, property, provider));
//        rawOre.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRawOre(tagPrefix, material, property, provider));
//        richRawOre.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRichRawOre(tagPrefix, material, property, provider));
//        crushed.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processCrushedOre(tagPrefix, material, property, provider));
//        crushedPurified.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processCrushedPurifiedOre(tagPrefix, material, property, provider));
//        crushedRefined.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processCrushedRefinedOre(tagPrefix, material, property, provider));
//
//        oreSmall.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessSmallOre(tagPrefix, material, property, provider));
//        oreSmallNative.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessSmallNativeOre(tagPrefix, material, property, provider));
//        anvil.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessAnvil(tagPrefix, material, property, provider));
//        lamp.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessLamp(tagPrefix, material, property, provider));
//        lampUnfinished.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessUnfinishedLamp(tagPrefix, material, property, provider));
//        trapdoor.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessTrapdoor(tagPrefix, material, property, provider));
//        chain.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessChain(tagPrefix, material, property, provider));
//        bell.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> proccessBell(tagPrefix, material, property, provider));
//
//        // Better way to get latex
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id("latex_heating"))
//                .EUt(VA[LV]).duration(480)
//                .inputItems(dust, Sulfur)
//                .inputFluids(Latex.getFluid(1000))
//                .outputItems(GTItems.STICKY_RESIN)
//                .save(provider);
//
//        //region Brass Mechanisms
//        new HeatingRecipeBuilder("tfg:metal/brass_mechanisms")
//                .input(TFCItems.BRASS_MECHANISMS.get())
//                .output(Brass.getFluid(), 72)
//                .temperature(930)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id("tfc/brass_mechanisms"))
//                .EUt(VA[LV]).duration(160)
//                .inputItems(plate, Brass)
//                .outputItems(TFCItems.BRASS_MECHANISMS.get(), 2)
//                .save(provider);
//        //endregion
//
//        //region Ковка незаконченных слитков в Forge Hammer
//        FORGE_HAMMER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/refined_bloom"))
//                .EUt(VA[ULV]).duration(1000)
//                .inputItems(TFCItems.RAW_IRON_BLOOM.get())
//                .itemOutputs(new ItemStack(TFCItems.REFINED_IRON_BLOOM.get()))
//                .save(provider);
//
//        FORGE_HAMMER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/wrought_iron_ingot"))
//                .EUt(VA[ULV]).duration(960)
//                .inputItems(new ItemStack(TFCItems.REFINED_IRON_BLOOM.get()))
//                .itemOutputs(ChemicalHelper.get(ingot, WroughtIron))
//                .save(provider);
//
//        FORGE_HAMMER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/high_carbon_steel"))
//                .EUt(VA[ULV]).duration(760)
//                .inputItems(ingot, PigIron)
//                .itemOutputs(ChemicalHelper.get(ingot, HighCarbonSteel))
//                .save(provider);
//
//        FORGE_HAMMER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/black_steel"))
//                .EUt(VA[ULV]).duration(760)
//                .inputItems(ingot, HighCarbonBlackSteel)
//                .itemOutputs(ChemicalHelper.get(ingot, BlackSteel))
//                .save(provider);
//
//        FORGE_HAMMER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/blue_steel"))
//                .EUt(VA[ULV]).duration(760)
//                .inputItems(ingot, HighCarbonBlueSteel)
//                .itemOutputs(ChemicalHelper.get(ingot, BlueSteel))
//                .save(provider);
//
//        FORGE_HAMMER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/red_steel"))
//                .EUt(VA[ULV]).duration(760)
//                .inputItems(ingot, HighCarbonRedSteel)
//                .itemOutputs(ChemicalHelper.get(ingot, RedSteel))
//                .save(provider);
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/high_carbon_black_steel"))
//                .EUt(VA[ULV]).duration(840)
//                .inputItems(ingot, WeakSteel)
//                .inputItems(ingot, PigIron)
//                .itemOutputs(ChemicalHelper.get(ingot, HighCarbonBlackSteel))
//                .save(provider);
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/high_carbon_blue_steel"))
//                .EUt(VA[ULV]).duration(840)
//                .inputItems(ingot, BlackSteel)
//                .inputItems(ingot, WeakBlueSteel)
//                .itemOutputs(ChemicalHelper.get(ingot, HighCarbonBlueSteel))
//                .save(provider);
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:tfc/high_carbon_red_steel"))
//                .EUt(VA[ULV]).duration(840)
//                .inputItems(ingot, BlackSteel)
//                .inputItems(ingot, WeakRedSteel)
//                .itemOutputs(ChemicalHelper.get(ingot, HighCarbonRedSteel))
//                .save(provider);
//        //endregion
//
//        //region Исправление рецептов различных металлических предметов
//
//        //region Jacks
//        new HeatingRecipeBuilder("tfc:jacks")
//                .input(TFCItems.JACKS.get())
//                .output(Brass.getFluid(), 144)
//                .temperature(930)
//                .save(provider);
//
//        new WeldingRecipeBuilder("tfc:jacks")
//                .inputs(ChemicalHelper.get(plate, Brass), ChemicalHelper.get(rod, Brass))
//                .output(TFCItems.JACKS.get())
//                .tier(2)
//                .save(provider);
//        //endregion
//
//        //region Ванильная дверь
//        new HeatingRecipeBuilder("tfc:iron_door")
//                .input(Blocks.IRON_DOOR)
//                .output(Iron.getFluid(), 288)
//                .temperature(1535)
//                .save(provider);
//
//        // Ванильная дверь на наковальне
//        new AnvilRecipeBuilder("tfc:iron_door")
//                .input(ChemicalHelper.get(plate, WroughtIron))
//                .output(Blocks.IRON_DOOR)
//                .rules(ForgeRule.HIT_LAST, ForgeRule.DRAW_NOT_LAST, ForgeRule.PUNCH_NOT_LAST)
//                .tier(3)
//                .save(provider);
//        //endregion
//
//        // Gem Saw
//        new HeatingRecipeBuilder("tfc:gem_saw")
//                .input(TFCItems.GEM_SAW.get())
//                .output(Brass.getFluid(), 72)
//                .temperature(930)
//                .save(provider);
//
//        // Декрафт сырой крицы в жидкость
//        new HeatingRecipeBuilder("tfc:raw_bloom")
//                .input(TFCItems.RAW_IRON_BLOOM.get())
//                .output(Iron.getFluid(), 144)
//                .temperature(1535)
//                .save(provider);
//
//        // Декрафт укрепленной крицы в жидкость
//        new HeatingRecipeBuilder("tfc:refined_bloom")
//                .input(TFCItems.REFINED_IRON_BLOOM.get())
//                .output(Iron.getFluid(), 144)
//                .temperature(1535)
//                .save(provider);
//
//        // Гриль
//        new HeatingRecipeBuilder("tfc:grill")
//                .input(TFCItems.WROUGHT_IRON_GRILL.get())
//                .output(Iron.getFluid(), 288)
//                .temperature(1535)
//                .save(provider);
//
//        // Refined Iron Bloom -> Wrought Iron Ingot
//        new AnvilRecipeBuilder("tfc:wrought_iron_from_bloom")
//                .input(TFCItems.REFINED_IRON_BLOOM.get())
//                .output(ChemicalHelper.get(ingot, WroughtIron))
//                .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.HIT_THIRD_LAST)
//                .tier(2)
//                .save(provider);
//
//        // High Carbon Steel Ingot -> Steel Ingot
//        new AnvilRecipeBuilder("tfc:steel_ingot")
//                .input(ChemicalHelper.get(ingot, HighCarbonSteel))
//                .output(ChemicalHelper.get(ingot, WroughtIron))
//                .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.HIT_THIRD_LAST)
//                .tier(3)
//                .save(provider);
//
//        // High Carbon Black Steel Ingot -> Black Steel Ingot
//        new AnvilRecipeBuilder("tfc:black_steel_ingot")
//                .input(ChemicalHelper.get(ingot, HighCarbonBlackSteel))
//                .output(ChemicalHelper.get(ingot, BlackSteel))
//                .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.HIT_THIRD_LAST)
//                .tier(4)
//                .save(provider);
//
//        // High Carbon Red Steel Ingot -> Red Steel Ingot
//        new AnvilRecipeBuilder("tfc:red_steel_ingot")
//                .input(ChemicalHelper.get(ingot, HighCarbonRedSteel))
//                .output(ChemicalHelper.get(ingot, RedSteel))
//                .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.HIT_THIRD_LAST)
//                .tier(5)
//                .save(provider);
//
//        // High Carbon Blue Steel Ingot -> Blue Steel Ingot
//        new AnvilRecipeBuilder("tfc:blue_steel_ingot")
//                .input(ChemicalHelper.get(ingot, HighCarbonBlueSteel))
//                .output(ChemicalHelper.get(ingot, BlueSteel))
//                .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.HIT_THIRD_LAST)
//                .tier(5)
//                .save(provider);
//        //endregion
//    }
//
//    private static void processIngot(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var ingotStack = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_ingot")
//                .input(ingotStack)
//                .output(outputMaterial.getFluid(), 144)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        if (material != WroughtIron) {
//            new CastingRecipeBuilder("tfc:" + material.getName() + "_ingot")
//                    .input(TFCItems.MOLDS.get(Metal.ItemType.INGOT).get())
//                    .input(outputMaterial.getFluid(), 144)
//                    .output(ingotStack)
//                    .breakChance(0.1)
//                    .save(provider);
//
//            new CastingRecipeBuilder("tfc:" + material.getName() + "_fire_ingot")
//                    .input(TFCItems.FIRE_INGOT_MOLD.get())
//                    .input(outputMaterial.getFluid(), 144)
//                    .output(ingotStack)
//                    .breakChance(0.01)
//                    .save(provider);
//        }
//
//        //region Инструменты из слитков
//        if (material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL)) {
//            //region Кирка
//            var pickaxe = ToolHelper.get(GTToolType.PICKAXE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_pickaxe")
//                    .input(pickaxe)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье кирки
//            var pickaxeHead = ChemicalHelper.get(toolHeadPickaxe, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_pickaxe_head")
//                    .input(pickaxeHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_pickaxe_head")
//                    .input(ingotStack)
//                    .output(pickaxeHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.BEND_NOT_LAST, ForgeRule.DRAW_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_pickaxe_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.PICKAXE_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(pickaxeHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Топор
//            var axe = ToolHelper.get(GTToolType.AXE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_axe")
//                    .input(axe)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье топора
//            var axeHead = ChemicalHelper.get(toolHeadAxe, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_axe_head")
//                    .input(axeHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_axe_head")
//                    .input(ingotStack)
//                    .output(axeHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.UPSET_THIRD_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_axe_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.AXE_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(axeHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion\
//
//            //region Лопата
//            var shovel = ToolHelper.get(GTToolType.SHOVEL, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_shovel")
//                    .input(shovel)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье лопаты
//            var shovelHead = ChemicalHelper.get(toolHeadShovel, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_shovel_head")
//                    .input(shovelHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_shovel_head")
//                    .input(ingotStack)
//                    .output(shovelHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.HIT_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_shovel_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.SHOVEL_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(shovelHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Мотыга
//            var hoe = ToolHelper.get(GTToolType.HOE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_hoe")
//                    .input(hoe)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье мотыги
//            var hoeHead = ChemicalHelper.get(toolHeadHoe, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_hoe_head")
//                    .input(hoeHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_hoe_head")
//                    .input(ingotStack)
//                    .output(hoeHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.HIT_NOT_LAST, ForgeRule.BEND_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_hoe_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.HOE_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(hoeHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Молот
//            var hammer = ToolHelper.get(GTToolType.HARD_HAMMER, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_hammer")
//                    .input(hammer)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье молота
//            var hammerHead = ChemicalHelper.get(toolHeadHammer, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_hammer_head")
//                    .input(hammerHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_hammer_head")
//                    .input(ingotStack)
//                    .output(hammerHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.SHRINK_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_hammer_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.HAMMER_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(hammerHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Пила
//            var saw = ToolHelper.get(GTToolType.SAW, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_saw")
//                    .input(saw)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье пилы
//            var sawHead = ChemicalHelper.get(toolHeadSaw, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_saw_blade")
//                    .input(sawHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_saw_blade")
//                    .input(ingotStack)
//                    .output(sawHead)
//                    .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_saw_blade")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.SAW_BLADE).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(sawHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Коса
//            var scythe = ToolHelper.get(GTToolType.SCYTHE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_scythe")
//                    .input(scythe)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье косы
//            var scytheHead = ChemicalHelper.get(toolHeadScythe, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_scythe_blade")
//                    .input(scytheHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_scythe_blade")
//                    .input(ingotStack)
//                    .output(scytheHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.BEND_NOT_LAST, ForgeRule.DRAW_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_scythe_blade")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.SCYTHE_BLADE).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(scytheHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Напильник
//            var file = ToolHelper.get(GTToolType.FILE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_file")
//                    .input(file)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье напильника
//            var fileHead = ChemicalHelper.get(toolHeadFile, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_file_head")
//                    .input(fileHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_file_head")
//                    .input(ingotStack)
//                    .output(fileHead)
//                    .rules(ForgeRule.UPSET_LAST, ForgeRule.BEND_NOT_LAST, ForgeRule.PUNCH_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Нож
//            var knife = ToolHelper.get(GTToolType.KNIFE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_knife")
//                    .input(knife)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье ножа
//            var knifeHead = ChemicalHelper.get(toolHeadKnife, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_knife_blade")
//                    .input(knifeHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_knife_blade")
//                    .input(ingotStack)
//                    .output(knifeHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.BEND_NOT_LAST, ForgeRule.SHRINK_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_knife_blade")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.KNIFE_BLADE).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(knifeHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Ножницы
//            var shears = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.SHEARS).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_shears")
//                    .input(shears)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            new WeldingRecipeBuilder("tfc:" + material.getName() + "_shears")
//                    .inputs(knifeHead, knifeHead)
//                    .output(shears)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            //endregion
//
//            //region Рудоискатель
//            var prospector = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.PROPICK).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_propick")
//                    .input(prospector)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье рудоискателя
//            var prospectorHead = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.PROPICK_HEAD).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_propick_head")
//                    .input(prospectorHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_propick_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.PROPICK_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(prospectorHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Стамеска
//            var chisel = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.CHISEL).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_chisel")
//                    .input(chisel)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье стамески
//            var chiselHead = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.CHISEL_HEAD).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_chisel_head")
//                    .input(chiselHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_chisel_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.CHISEL_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(chiselHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Копье
//            var javelin = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.JAVELIN).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_javelin")
//                    .input(javelin)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//
//            //region Оголовье копья
//            var javelinHead = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.JAVELIN_HEAD).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_javelin_head")
//                    .input(javelinHead)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_javelin_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.JAVELIN_HEAD).get())
//                        .input(outputMaterial.getFluid(), 144)
//                        .output(javelinHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//        }
//        //endregion
//    }
//
//    private static void processDoubleIngot(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var ingotStack = ChemicalHelper.get(ingot, material);
//        var doubleIngotStack = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_double_ingot")
//                .input(doubleIngotStack)
//                .output(outputMaterial.getFluid(), 288)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new WeldingRecipeBuilder("tfc:" + material.getName() + "_double_ingot")
//                .inputs(ingotStack, ingotStack)
//                .output(doubleIngotStack)
//                .tier(property.getTier())
//                .save(provider);
//
//        BENDER_RECIPES.recipeBuilder(material.getName() + "_double_ingot")
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(ingotStack.copyWithCount(2))
//                .circuitMeta(6)
//                .outputItems(doubleIngotStack)
//                .save(provider);
//
//        EXTRACTOR_RECIPES.recipeBuilder("extract_" + material.getName() + "_double_ingot")
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(doubleIngotStack)
//                .outputFluids(material.getFluid(288))
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder("macerate_" + material.getName() + "_double_ingot")
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(doubleIngotStack)
//                .outputItems(dust, material, 2)
//                .save(provider);
//
//        //region Инструменты из двойных слитков
//        if (material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL)) {
//            //region Меч
//            var sword = ToolHelper.get(GTToolType.SWORD, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_sword")
//                    .input(sword)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            //endregion
//
//            //region Оголовье меча
//            var swordHead = ChemicalHelper.get(toolHeadSword, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_sword_blade")
//                    .input(swordHead)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_sword_blade")
//                    .input(doubleIngotStack)
//                    .output(swordHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.BEND_NOT_LAST, ForgeRule.DRAW_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_sword_blade")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.SWORD_BLADE).get())
//                        .input(outputMaterial.getFluid(), 288)
//                        .output(swordHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Дубина
//            var mace = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.MACE).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_mace")
//                    .input(mace)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            //endregion
//
//            //region Оголовье дубины
//            var maceHead = ChemicalHelper.get(toolHeadMace, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_mace_head")
//                    .input(mace)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            // Рецепт наковальни не нужен, тк там используется тэг, удивительно...
//
//            if (material.hasFlag(TFGMaterialFlags.CAN_BE_UNMOLDED)) {
//                new CastingRecipeBuilder("tfc:" + material.getName() + "_mace_head")
//                        .input(TFCItems.MOLDS.get(Metal.ItemType.MACE_HEAD).get())
//                        .input(outputMaterial.getFluid(), 288)
//                        .output(maceHead)
//                        .breakChance(1)
//                        .save(provider);
//
//            }
//            //endregion
//
//            //region Мясницкий нож
//            var butcheryKnife = ToolHelper.get(GTToolType.BUTCHERY_KNIFE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_butchery_knife")
//                    .input(butcheryKnife)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            //endregion
//
//            //region Оголовье мясницкого ножа
//            var butcheryKnifeHead = ChemicalHelper.get(toolHeadButcheryKnife, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_butchery_knife_head")
//                    .input(butcheryKnifeHead)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_butchery_knife_head")
//                    .input(doubleIngotStack)
//                    .output(butcheryKnifeHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.BEND_NOT_LAST, ForgeRule.BEND_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Молот шахтера
//            var miningHammer = ToolHelper.get(GTToolType.MINING_HAMMER, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_mining_hammer")
//                    .input(miningHammer)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            //endregion
//
//            //region Оголовье мясницкого ножа
//            var miningHammerHead = ChemicalHelper.get(toolHeadMiningHammer, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_mining_hammer_head")
//                    .input(miningHammerHead)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_mining_hammer_head")
//                    .input(doubleIngotStack)
//                    .output(miningHammerHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.SHRINK_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Экскаватор
//            var spade = ToolHelper.get(GTToolType.SPADE, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_spade")
//                    .input(spade)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            //endregion
//
//            //region Оголовье экскаватора
//            var spadeHead = ChemicalHelper.get(toolHeadSpade, material);
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_spade_head")
//                    .input(spadeHead)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_spade_head")
//                    .input(doubleIngotStack)
//                    .output(spadeHead)
//                    .rules(ForgeRule.PUNCH_LAST, ForgeRule.HIT_NOT_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//        }
//        //endregion
//    }
//
//    private static void processPlate(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var plateStack = ChemicalHelper.get(prefix, material);
//        var doubleIngotStack = ChemicalHelper.get(ingotDouble, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_sheet")
//                .input(plateStack)
//                .output(outputMaterial.getFluid(), 144)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        if (!doubleIngotStack.isEmpty()) {
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_sheet")
//                    .input(doubleIngotStack)
//                    .output(plateStack)
//                    .tier(property.getTier())
//                    .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.HIT_THIRD_LAST)
//                    .save(provider);
//        }
//
//        if (material.hasFlag(TFGMaterialFlags.GENERATE_DOUBLE_INGOTS)) {
//            FORGE_HAMMER_RECIPES.recipeBuilder("hammer_" + material.getName() + "_sheet")
//                    .EUt(VA[ULV]).duration((int) material.getMass() * 4)
//                    .inputItems(doubleIngotStack)
//                    .outputItems(plateStack)
//                    .save(provider);
//        }
//
//        //region Инструменты из пластин
//        if (material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL)) {
//            //region Крючок для удочки
//
//            var fishingHook = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.FISH_HOOK).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_fish_hook")
//                    .input(fishingHook)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_fish_hook")
//                    .input(plateStack)
//                    .output(fishingHook)
//                    .rules(ForgeRule.DRAW_NOT_LAST, ForgeRule.BEND_ANY, ForgeRule.HIT_ANY)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            //endregion
//
//            //region Удочка
//            var fishingRod = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.FISHING_ROD).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_fishing_rod")
//                    .input(fishingRod)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//            //endregion
//        }
//        //endregion
//    }
//
//    private static void processDoublePlate(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var doublePlateStack = ChemicalHelper.get(prefix, material);
//        var plateStack = ChemicalHelper.get(plate, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_double_sheet")
//                .input(doublePlateStack)
//                .output(outputMaterial.getFluid(), 288)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new WeldingRecipeBuilder("tfc:" + material.getName() + "_double_sheet")
//                .inputs(plateStack, plateStack)
//                .output(doublePlateStack)
//                .tier(property.getTier())
//                .save(provider);
//
//        //region Броня
//        if (material.hasFlag(TFGMaterialFlags.HAS_TFC_ARMOR)) {
//            //region Незаконченный шлем
//            var unfinishedHelmet = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.UNFINISHED_HELMET).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_unfinished_helmet")
//                    .input(unfinishedHelmet)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_unfinished_helmet")
//                    .input(doublePlateStack)
//                    .output(unfinishedHelmet)
//                    .rules(ForgeRule.HIT_LAST, ForgeRule.BEND_SECOND_LAST, ForgeRule.BEND_THIRD_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Законченный шлем
//            var finishedHelmet = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.HELMET).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_helmet")
//                    .input(finishedHelmet)
//                    .output(outputMaterial.getFluid(), 432)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            new WeldingRecipeBuilder("tfc:" + material.getName() + "_helmet")
//                    .inputs(new ItemStack(unfinishedHelmet), plateStack)
//                    .output(finishedHelmet)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Незаконченный нагрудник
//            var unfinishedChestplate = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.UNFINISHED_CHESTPLATE).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_unfinished_chestplate")
//                    .input(unfinishedChestplate)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_unfinished_chestplate")
//                    .input(doublePlateStack)
//                    .output(unfinishedChestplate)
//                    .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.UPSET_THIRD_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Законченный нагрудник
//            var finishedChestplate = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.CHESTPLATE).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_chestplate")
//                    .input(finishedChestplate)
//                    .output(outputMaterial.getFluid(), 576)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            new WeldingRecipeBuilder("tfc:" + material.getName() + "_chestplate")
//                    .inputs(new ItemStack(unfinishedChestplate), doublePlateStack)
//                    .output(finishedChestplate)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Незаконченные штаны
//            var unfinishedGreaves = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.UNFINISHED_GREAVES).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_unfinished_greaves")
//                    .input(unfinishedGreaves)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_unfinished_greaves")
//                    .input(doublePlateStack)
//                    .output(unfinishedGreaves)
//                    .rules(ForgeRule.BEND_ANY, ForgeRule.DRAW_ANY, ForgeRule.HIT_ANY)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Незаконченные штаны
//            var finishedGreaves = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.GREAVES).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_greaves")
//                    .input(finishedGreaves)
//                    .output(outputMaterial.getFluid(), 432)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            new WeldingRecipeBuilder("tfc:" + material.getName() + "_greaves")
//                    .inputs(new ItemStack(unfinishedGreaves), plateStack)
//                    .output(finishedGreaves)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Незаконченные ботинки
//            var unfinishedBoots = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.UNFINISHED_BOOTS).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_unfinished_boots")
//                    .input(unfinishedBoots)
//                    .output(outputMaterial.getFluid(), 144)
//                    .temperature(property.getMeltTemp())
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_unfinished_boots")
//                    .input(plateStack)
//                    .output(unfinishedBoots)
//                    .rules(ForgeRule.BEND_LAST, ForgeRule.BEND_SECOND_LAST, ForgeRule.SHRINK_THIRD_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Незаконченные ботинки
//            var finishedBoots = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.BOOTS).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_boots")
//                    .input(finishedBoots)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            new WeldingRecipeBuilder("tfc:" + material.getName() + "_boots")
//                    .inputs(new ItemStack(unfinishedBoots), plateStack)
//                    .output(finishedBoots)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//
//            //region Конская броня
//            var horseArmor = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.HORSE_ARMOR).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_horse_armor")
//                    .input(horseArmor)
//                    .output(outputMaterial.getFluid(), 864)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            //endregion
//        }
//        //endregion
//
//        //region Инструменты из двойных пластин
//        if (material.hasFlag(TFGMaterialFlags.HAS_TFC_TOOL)) {
//            //region Фурма
//            var tuyere = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.TUYERE).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_tuyere")
//                    .input(tuyere)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_tuyere")
//                    .input(doublePlateStack)
//                    .output(tuyere)
//                    .rules(ForgeRule.BEND_LAST, ForgeRule.BEND_SECOND_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//
//            //endregion
//
//            //region Щит
//            var shield = TFCItems.METAL_ITEMS.get(Metal.Default.valueOf(material.getName().toUpperCase())).get(Metal.ItemType.SHIELD).get();
//
//            new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_shield")
//                    .input(shield)
//                    .output(outputMaterial.getFluid(), 288)
//                    .temperature(property.getMeltTemp())
//                    .useDurability()
//                    .save(provider);
//
//            new AnvilRecipeBuilder("tfc:" + material.getName() + "_shield")
//                    .input(doublePlateStack)
//                    .output(shield)
//                    .rules(ForgeRule.UPSET_LAST, ForgeRule.BEND_SECOND_LAST, ForgeRule.BEND_THIRD_LAST)
//                    .tier(property.getTier())
//                    .save(provider);
//            //endregion
//        }
//        //endregion
//    }
//
//    private static void processRod(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var ingotStack = ChemicalHelper.get(ingot, material);
//        var rodStack = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_rod")
//                .input(rodStack)
//                .output(outputMaterial.getFluid(), 72)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new AnvilRecipeBuilder("tfc:" + material.getName() + "_rod")
//                .input(ingotStack)
//                .output(rodStack.copyWithCount(2))
//                .rules(ForgeRule.BEND_LAST, ForgeRule.BEND_SECOND_LAST, ForgeRule.DRAW_THIRD_LAST)
//                .tier(property.getTier())
//                .save(provider);
//    }
//
//    private static void processLongRod(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var rodStack = ChemicalHelper.get(rod, material);
//        var longRodStack = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_long_rod")
//                .input(longRodStack)
//                .output(outputMaterial.getFluid(), 144)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new WeldingRecipeBuilder("tfc:" + material.getName() + "_long_rod")
//                .inputs(rodStack, rodStack)
//                .output(longRodStack)
//                .tier(property.getTier())
//                .save(provider);
//
//
//    }
//
//    private static void processBolt(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var boltStack = ChemicalHelper.get(prefix, material);
//        var ingotStack = ChemicalHelper.get(ingot, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_bolt")
//                .input(boltStack)
//                .output(outputMaterial.getFluid(), 72)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new AnvilRecipeBuilder("tfc:" + material.getName() + "_bolt")
//                .input(ingotStack)
//                .output(boltStack.copyWithCount(2))
//                .rules(ForgeRule.PUNCH_LAST, ForgeRule.DRAW_SECOND_LAST, ForgeRule.DRAW_THIRD_LAST)
//                .tier(property.getTier())
//                .save(provider);
//    }
//
//    private static void processScrew(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var screwStack = ChemicalHelper.get(prefix, material);
//        var ingotStack = ChemicalHelper.get(ingot, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_screw")
//                .input(screwStack)
//                .output(outputMaterial.getFluid(), 36)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new AnvilRecipeBuilder("tfc:" + material.getName() + "_screw")
//                .input(ingotStack)
//                .output(screwStack.copyWithCount(2))
//                .rules(ForgeRule.PUNCH_LAST, ForgeRule.PUNCH_SECOND_LAST, ForgeRule.SHRINK_THIRD_LAST)
//                .tier(property.getTier())
//                .save(provider);
//    }
//
//    private static void processRing(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var ringStack = ChemicalHelper.get(prefix, material);
//        var ingotStack = ChemicalHelper.get(ingot, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_ring")
//                .input(ringStack)
//                .output(outputMaterial.getFluid(), 72)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new AnvilRecipeBuilder("tfc:" + material.getName() + "_ring")
//                .input(ingotStack)
//                .output(ringStack.copyWithCount(2))
//                .rules(ForgeRule.HIT_LAST, ForgeRule.HIT_SECOND_LAST, ForgeRule.HIT_THIRD_LAST)
//                .tier(property.getTier())
//                .save(provider);
//    }
//
//    private static void processBlock(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var blockStack = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_block")
//                .input(blockStack)
//                .output(outputMaterial.getFluid(), 1296)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processTinyDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var tinyDust = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_tiny_dust")
//                .input(tinyDust)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(16, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processSmallDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var smallDust = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_small_dust")
//                .input(smallDust)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(36, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var dust = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_dust")
//                .input(dust)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(144, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processImpureDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var impureDust = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_impure_dust")
//                .input(impureDust)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(86, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processPureDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var pureDust = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_pure_dust")
//                .input(pureDust)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(124, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processPoorRawOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var poorRawOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_poor_raw_ore")
//                .input(poorRawOre)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(24, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processRawOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var rawOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_raw_ore")
//                .input(rawOre)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(36, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processRichRawOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var richRawOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_rich_raw_ore")
//                .input(richRawOre)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(48, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processCrushedOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var crushedOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_crushed_ore")
//                .input(crushedOre)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(76, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processCrushedPurifiedOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var crushedPurifiedOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_crushed_purified_ore")
//                .input(crushedPurifiedOre)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(106, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processCrushedRefinedOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var crushedRefinedOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_crushed_refined_ore")
//                .input(crushedRefinedOre)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(112, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void processNugget(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var nuggets = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfg:metal/" + material.getName() + "_nugget")
//                .input(nuggets)
//                .output(outputMaterial.getFluid(), TFGHelpers.calcAmountOfMetal(16, property.getPercentOfMaterial()))
//                .temperature(property.getMeltTemp())
//                .save(provider);
//    }
//
//    private static void proccessSmallOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var smallOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:ore/small_" + material.getName())
//                .input(smallOre)
//                .output(outputMaterial.getFluid(), 16)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder("macerate_" + material.getName() + "_small_ore")
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(smallOre)
//                .outputItems(dustSmall, outputMaterial)
//                .save(provider);
//
//    }
//
//    private static void proccessSmallNativeOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var smallNativeOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:ore/small_native_" + material.getName())
//                .input(smallNativeOre)
//                .output(outputMaterial.getFluid(), 16)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder("macerate_" + material.getName() + "_small_native_ore")
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(smallNativeOre)
//                .outputItems(dustSmall, outputMaterial)
//                .save(provider);
//    }
//
//    private static void proccessAnvil(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var anvil = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_anvil")
//                .input(anvil)
//                .output(outputMaterial.getFluid(), 2016)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(new ResourceLocation("tfg:macerate_" + material.getName() + "_anvil"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 32)
//                .inputItems(anvil)
//                .outputItems(dust, outputMaterial, 14)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(new ResourceLocation("tfg:arc_" + material.getName() + "_anvil"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 32)
//                .inputItems(anvil)
//                .outputItems(ingot, outputMaterial, 14)
//                .save(provider);
//
//        // Сборка
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_anvil_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputItems(ingot, outputMaterial, 14)
//                .notConsumable(GTItems.SHAPE_MOLD_ANVIL)
//                .itemOutputs(anvil)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_anvil_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputFluids(outputMaterial.getFluid(2016))
//                .notConsumable(GTItems.SHAPE_MOLD_ANVIL)
//                .itemOutputs(anvil)
//                .save(provider);
//    }
//
//    private static void proccessLamp(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var finishedLamp = ChemicalHelper.get(prefix, material);
//        var unfinishedLamp = ChemicalHelper.get(lampUnfinished, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_lamp")
//                .input(finishedLamp)
//                .output(outputMaterial.getFluid(), 144)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(new ResourceLocation("tfg:macerate_" + material.getName() + "_lamp"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 8)
//                .inputItems(finishedLamp)
//                .outputItems(ChemicalHelper.get(dust, outputMaterial), ChemicalHelper.get(dust, Glass, 4))
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(new ResourceLocation("tfg:arc_" + material.getName() + "_lamp"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 8)
//                .inputItems(finishedLamp)
//                .outputItems(ChemicalHelper.get(ingot, outputMaterial), ChemicalHelper.get(block, Glass))
//                .save(provider);
//
//        // Сборка
//        ASSEMBLER_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_lamp"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(new ItemStack(TFCItems.LAMP_GLASS.get()), unfinishedLamp)
//                .circuitMeta(12)
//                .outputItems(finishedLamp)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_lamp_from_liquid"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(unfinishedLamp)
//                .inputFluids(Glass.getFluid(576))
//                .circuitMeta(13)
//                .outputItems(finishedLamp)
//                .save(provider);
//    }
//
//    private static void proccessUnfinishedLamp(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var unfinishedLamp = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_unfinished_lamp")
//                .input(unfinishedLamp)
//                .output(outputMaterial.getFluid(), 144)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(new ResourceLocation("tfg:macerate_" + material.getName() + "_unfinished_lamp"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 8)
//                .inputItems(unfinishedLamp)
//                .outputItems(dust, outputMaterial)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(new ResourceLocation("tfg:arc_" + material.getName() + "_unfinished_lamp"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 8)
//                .inputItems(unfinishedLamp)
//                .outputItems(ingot, outputMaterial)
//                .save(provider);
//
//        // Сборка
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_unfinished_lamp_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 7)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_UNFINISHED_LAMP)
//                .itemOutputs(unfinishedLamp)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_unfinished_lamp_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 7)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_UNFINISHED_LAMP)
//                .itemOutputs(unfinishedLamp)
//                .save(provider);
//    }
//
//    private static void proccessTrapdoor(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var trapdoor = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_trapdoor")
//                .input(trapdoor)
//                .output(outputMaterial.getFluid(), 144)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(new ResourceLocation("tfg:macerate_" + material.getName() + "_trapdoor"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(trapdoor)
//                .outputItems(dust, outputMaterial)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(new ResourceLocation("tfg:arc_" + material.getName() + "_trapdoor"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(trapdoor)
//                .outputItems(ingot, outputMaterial)
//                .save(provider);
//
//        // Сборка
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_trapdoor_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_TRAPDOOR)
//                .itemOutputs(trapdoor)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_trapdoor_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_TRAPDOOR)
//                .itemOutputs(trapdoor)
//                .save(provider);
//    }
//
//    private static void proccessChain(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var chain = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_chain")
//                .input(chain)
//                .output(outputMaterial.getFluid(), 9)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(new ResourceLocation("tfg:macerate_" + material.getName() + "_chain"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 3)
//                .inputItems(chain)
//                .outputItems(dustTiny, outputMaterial)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(new ResourceLocation("tfg:arc_" + material.getName() + "_chain"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 3)
//                .inputItems(chain)
//                .outputItems(nugget, outputMaterial)
//                .save(provider);
//
//        // Сборка
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_chain_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 2)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_CHAIN)
//                .itemOutputs(chain.copyWithCount(9))
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_chain_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 2)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_CHAIN)
//                .itemOutputs(chain.copyWithCount(9))
//                .save(provider);
//    }
//
//    private static void proccessBell(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var bell = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        new HeatingRecipeBuilder("tfc:metal/" + material.getName() + "_bell")
//                .input(bell)
//                .output(outputMaterial.getFluid(), 144)
//                .temperature(property.getMeltTemp())
//                .save(provider);
//
//        new CastingRecipeBuilder("tfc:" + material.getName() + "_bell")
//                .input(TFCItems.BELL_MOLD.get())
//                .input(outputMaterial.getFluid(), 144)
//                .output(bell)
//                .save(provider);
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(new ResourceLocation("tfg:macerate_" + material.getName() + "_bell"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 5)
//                .inputItems(bell)
//                .outputItems(dust, outputMaterial)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(new ResourceLocation("tfg:arc_" + material.getName() + "_bell"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 5)
//                .inputItems(bell)
//                .outputItems(ingot, outputMaterial)
//                .save(provider);
//
//        // Сборка
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_bell_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 4)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_BELL)
//                .itemOutputs(bell)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(new ResourceLocation("tfg:" + material.getName() + "_bell_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 4)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_BELL)
//                .itemOutputs(bell)
//                .save(provider);
//    }
//
//    private static void processToolHead(TagPrefix prefix, Material material, ItemEntry<Item> extruderShape, int circuitValue, Consumer<FinishedRecipe> consumer) {
//        var output = ChemicalHelper.get(prefix, material);
//        if (output.isEmpty()) return;
//
//        if (material.hasProperty(PropertyKey.INGOT)) {
//            EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getUnlocalizedName() + "_ingot_to_" + prefix.name + "_head")
//                    .duration(12).EUt(32)
//                    .notConsumable(extruderShape)
//                    .inputItems(ingot, material, (int) (prefix.materialAmount() / GTValues.M))
//                    .outputItems(output)
//                    .save(consumer);
//        }
//        else if (material.hasProperty(PropertyKey.GEM)) {
//            LASER_ENGRAVER_RECIPES.recipeBuilder("engrave_" + material.getUnlocalizedName() + "_gem_to_" + prefix.name + "_head")
//                    .duration(12).EUt(32)
//                    .circuitMeta(circuitValue)
//                    .notConsumable(ChemicalHelper.get(TagPrefix.lens, Glass))
//                    .inputItems(gem, material, (int) (prefix.materialAmount() / GTValues.M))
//                    .outputItems(output)
//                    .save(consumer);
//        }
//    }
//}