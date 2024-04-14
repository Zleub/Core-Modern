package su.terrafirmagreg.core.objects;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.MarkerMaterials;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.compat.gtceu.TFGPropertyKeys;
import su.terrafirmagreg.core.compat.gtceu.TFGTagPrefixes;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_EMPTY;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.gregtechceu.gtceu.data.recipe.generated.RecyclingRecipeHandler.processCrushing;
import static su.terrafirmagreg.core.compat.gtceu.TFGMaterials.*;
import static su.terrafirmagreg.core.compat.gtceu.TFGTagPrefixes.*;
import static su.terrafirmagreg.core.objects.TFGItems.*;

public final class TFGRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        registerTFCRockDecompositionRecipes(provider);
        registerExtruderMoldRecipes(provider);
        registerExtruderMoldCopyingRecipes(provider);
        registerProcessingToolHeadsRecipes(provider);
        registerToolRecyclingRecipes(provider);
        registerRandomRecipes(provider);
    }

    private static void registerTFCRockDecompositionRecipes(Consumer<FinishedRecipe> provider) {
        // Gabbro
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("gabbro_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Gabbro)
                .chancedOutput(dustTiny, Titanium, 6700, 700)
                .chancedOutput(dustTiny, Iron, 3700, 700)
                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
                .save(provider);

        // Shale
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("shale_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Shale)
                .chancedOutput(dustTiny, Sodium, 7500, 500)
                .chancedOutput(dustTiny, MetalMixture, 1500, 500)
                .outputFluids(Oxygen.getFluid(16))
                .save(provider);

        // Claystone
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("claystone_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Claystone)
                .chancedOutput(dustTiny, Aluminium, 6700, 700)
                .chancedOutput(dustTiny, Silicon, 6700, 700)
                .chancedOutput(dustTiny, Hematite, 6700, 700)
                .outputFluids(Oxygen.getFluid(5))
                .save(provider);

        // Limestone
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("limestone_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Limestone)
                .chancedOutput(dustTiny, Calcium, 8700, 700)
                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
                .outputFluids(Oxygen.getFluid(36))
                .save(provider);

        // Conglomerate
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("conglomerate_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Conglomerate)
                .chancedOutput(dustTiny, Hematite, 6700, 700)
                .chancedOutput(dustTiny, Silicon, 4700, 700)
                .chancedOutput(dustTiny, TricalciumPhosphate, 3700, 700)
                .outputFluids(Oxygen.getFluid(5))
                .save(provider);

        // Dolomite
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("dolomite_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Dolomite)
                .chancedOutput(dustTiny, Magnesium, 6700, 700)
                .chancedOutput(dustTiny, Calcium, 5700, 700)
                .chancedOutput(dustTiny, MetalMixture, 3700, 700)
                .outputFluids(Oxygen.getFluid(16))
                .save(provider);

        // Chert
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("chert_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Chert)
                .chancedOutput(dustTiny, Silicon, 6700, 700)
                .chancedOutput(dustTiny, MetalMixture, 5700, 700)
                .outputFluids(Oxygen.getFluid(24))
                .save(provider);

        // Chalk
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("chalk_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Chalk)
                .chancedOutput(dustTiny, Calcium, 6700, 700)
                .chancedOutput(dustTiny, Carbon, 3700, 700)
                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
                .outputFluids(Oxygen.getFluid(12))
                .save(provider);

        // Rhyolite
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("rhyolite_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Rhyolite)
                .chancedOutput(dustTiny, SiliconDioxide, 8700, 700)
                .chancedOutput(dustTiny, MetalMixture, 800, 700)
                .save(provider);

        // Dacite
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("dacite_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Dacite)
                .chancedOutput(dustTiny, Sodium, 6700, 700)
                .chancedOutput(dustTiny, Calcium, 5700, 700)
                .chancedOutput(dustTiny, SiliconDioxide, 4700, 700)
                .chancedOutput(dustTiny, Aluminium, 3700, 700)
                .chancedOutput(dustTiny, MetalMixture, 150, 700)
                .outputFluids(Oxygen.getFluid(12))
                .save(provider);

        // Slate
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("slate_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Slate)
                .chancedOutput(dustTiny, MetalMixture, 780, 480)
                .outputFluids(Oxygen.getFluid(6))
                .save(provider);

        // Phyllite
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("phyllite_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Phyllite)
                .chancedOutput(dustTiny, Quartzite, 5700, 700)
                .chancedOutput(dustTiny, CalciumChloride, 1700, 700)
                .outputFluids(Oxygen.getFluid(2))
                .save(provider);

        // Schist
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("schist_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Schist)
                .chancedOutput(dustTiny, Mica, 6700, 700)
                .chancedOutput(dustTiny, Talc, 5700, 700)
                .chancedOutput(dustTiny, Graphite, 4700, 700)
                .chancedOutput(dustTiny, MetalMixture, 780, 700)
                .outputFluids(Oxygen.getFluid(12))
                .save(provider);

        // Gneiss
        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("gneiss_dust_separation")).duration(480).EUt(VA[MV])
                .inputItems(dust, Gneiss)
                .chancedOutput(dustTiny, Quartzite, 6700, 700)
                .chancedOutput(dustTiny, Biotite, 3700, 700)
                .outputFluids(Oxygen.getFluid(2))
                .save(provider);
    }

    private static void registerExtruderMoldRecipes(Consumer<FinishedRecipe> provider) {
        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_mining_hammer_head"),
                SHAPE_EXTRUDER_MINING_HAMMER_HEAD.asStack(),
                "Sfh", "   ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_sword_head"),
                SHAPE_EXTRUDER_SWORD_HEAD.asStack(),
                "Shf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_pickaxe_head"),
                SHAPE_EXTRUDER_PICKAXE_HEAD.asStack(),
                "S  ", "hf ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_axe_head"),
                SHAPE_EXTRUDER_AXE_HEAD.asStack(),
                "S  ", " fh", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_hoe_head"),
                SHAPE_EXTRUDER_HOE_HEAD.asStack(),
                "S  ", " hf", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_scythe_head"),
                SHAPE_EXTRUDER_SCYTHE_HEAD.asStack(),
                "S  ", "   ", "fh ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_file_head"),
                SHAPE_EXTRUDER_FILE_HEAD.asStack(),
                "S  ", "   ", "hf ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_hammer_head"),
                SHAPE_EXTRUDER_HAMMER_HEAD.asStack(),
                "Sf ", " h ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_saw_head"),
                SHAPE_EXTRUDER_SAW_HEAD.asStack(),
                "Sh ", " f ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_knife_head"),
                SHAPE_EXTRUDER_KNIFE_HEAD.asStack(),
                "S f", "   ", "  h", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_butchery_head_head"),
                SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD.asStack(),
                "S h", "   ", "  f", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_shovel_head"),
                SHAPE_EXTRUDER_SHOVEL_HEAD.asStack(),
                "S  ", "f  ", "h  ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_spade_head"),
                SHAPE_EXTRUDER_SPADE_HEAD.asStack(),
                "S  ", "f  ", "  h", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_propick_head"),
                SHAPE_EXTRUDER_PROPICK_HEAD.asStack(),
                "Sxf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_javelin_head"),
                SHAPE_EXTRUDER_JAVELIN_HEAD.asStack(),
                "S x", "f  ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_chisel_head"),
                SHAPE_EXTRUDER_CHISEL_HEAD.asStack(),
                "S  ", "xf ", "   ", 'S', SHAPE_EMPTY.asStack());

        VanillaRecipeHelper.addStrictShapedRecipe(provider,
                TerraFirmaGreg.id("shape_extruder_mace_head"),
                SHAPE_EXTRUDER_MACE_HEAD.asStack(),
                "S  ", " xf", "   ", 'S', SHAPE_EMPTY.asStack());
    }

    private static void registerExtruderMoldCopyingRecipes(Consumer<FinishedRecipe> provider) {
        for (ItemEntry<?> shapeMold : TFGItems.SHAPE_EXTRUDERS) {
            FORMING_PRESS_RECIPES.recipeBuilder(TerraFirmaGreg.id("copy_mold_" + shapeMold.get()))
                    .duration(120).EUt(22)
                    .notConsumable(shapeMold)
                    .inputItems(SHAPE_EMPTY)
                    .outputItems(shapeMold)
                    .save(provider);
        }
    }

    private static void registerProcessingToolHeadsRecipes(Consumer<FinishedRecipe> consumer) {
        for (var material : GTCEuAPI.materialManager.getRegisteredMaterials()) {
            if (material.hasProperty(PropertyKey.TOOL)) {

                int counter = 0;

                processHead(toolHeadAxe, material, SHAPE_EXTRUDER_AXE_HEAD, counter++, consumer);
                processHead(toolHeadHoe, material, SHAPE_EXTRUDER_HOE_HEAD, counter++, consumer);
                processHead(toolHeadShovel, material, SHAPE_EXTRUDER_SHOVEL_HEAD, counter++, consumer);
                processHead(toolHeadKnife, material, SHAPE_EXTRUDER_KNIFE_HEAD, counter++, consumer);
                processHead(toolHeadMiningHammer, material, SHAPE_EXTRUDER_MINING_HAMMER_HEAD, counter++, consumer);
                processHead(toolHeadSword, material, SHAPE_EXTRUDER_SWORD_HEAD, counter++, consumer);
                processHead(toolHeadPickaxe, material, SHAPE_EXTRUDER_PICKAXE_HEAD, counter++, consumer);
                processHead(toolHeadScythe, material, SHAPE_EXTRUDER_SCYTHE_HEAD, counter++, consumer);
                processHead(toolHeadFile, material, SHAPE_EXTRUDER_FILE_HEAD, counter++, consumer);
                processHead(toolHeadHammer, material, SHAPE_EXTRUDER_HAMMER_HEAD, counter++, consumer);
                processHead(toolHeadSaw, material, SHAPE_EXTRUDER_SAW_HEAD, counter++, consumer);
                processHead(toolHeadButcheryKnife, material, SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD, counter++, consumer);
                processHead(toolHeadSpade, material, SHAPE_EXTRUDER_SPADE_HEAD, counter++, consumer);
                processHead(toolHeadPropick, material, SHAPE_EXTRUDER_PROPICK_HEAD, counter++, consumer);
                processHead(toolHeadJavelin, material, SHAPE_EXTRUDER_JAVELIN_HEAD, counter++, consumer);
                processHead(toolHeadChisel, material, SHAPE_EXTRUDER_CHISEL_HEAD, counter++, consumer);
                processHead(toolHeadMace, material, SHAPE_EXTRUDER_MACE_HEAD, counter, consumer);
            }
        }
    }

    private static void registerToolRecyclingRecipes(Consumer<FinishedRecipe> provider) {
        /* Оголовья добавленные нами */
        toolHeadMiningHammer.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadSword.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadPickaxe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadShovel.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadAxe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadHoe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadScythe.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadFile.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadHammer.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadSaw.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadKnife.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadButcheryKnife.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadSpade.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadPropick.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadJavelin.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadChisel.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadMace.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));

        /* Оголовья грега, которые почему-то не имеют декрафта */
        toolHeadBuzzSaw.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadScrewdriver.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadDrill.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadChainsaw.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
        toolHeadWrench.executeHandler(PropertyKey.DUST, (tagPrefix, material, property) -> processCrushing(tagPrefix, material, property, provider));
    }

    private static void registerRandomRecipes(Consumer<FinishedRecipe> provider) {
        TFGTagPrefixes.ingotDouble.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processDoubleIngots(tagPrefix, material, provider));

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id("latex_heating")).duration(480).EUt(VA[LV])
                .inputItems(dust, Sulfur)
                .inputFluids(Latex.getFluid(1000))
                .outputItems(GTItems.STICKY_RESIN)
                .save(provider);
    }

    private static void processDoubleIngots(TagPrefix thingPrefix, Material material, Consumer<FinishedRecipe> provider) {
        //ALLOY_SMELTER_RECIPES.recipeBuilder("weld_" + material + "_ingots")
        //        .duration(12).EUt(32)
        //        .inputItems(TagPrefix.ingot, material, 2)
        //        .outputItems(thingPrefix,  material)
        //        .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder("double_" + material.getUnlocalizedName() + "_ingot")
                .EUt(VA[ULV]).duration((int) material.getMass())
                .inputItems(thingPrefix, material)
                .outputFluids(material.getFluid(288))
                .save(provider);

        MACERATOR_RECIPES.recipeBuilder("double_" + material.getUnlocalizedName() + "_ingot_to_dust")
                .EUt(VA[ULV]).duration((int) material.getMass())
                .inputItems(thingPrefix, material)
                .outputItems(dust, material, 2)
                .save(provider);
    }

    private static void processHead(TagPrefix tagPrefix, Material material, ItemEntry<Item> extruderShape, int circuitValue, Consumer<FinishedRecipe> consumer) {
        var output = ChemicalHelper.get(tagPrefix, material);
        if (output.isEmpty()) return;

        if (material.hasProperty(PropertyKey.INGOT)) {
            EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getUnlocalizedName() + "_ingot_to_" + tagPrefix.name + "_head")
                    .duration(12).EUt(32)
                    .notConsumable(extruderShape)
                    .inputItems(ingot, material, (int) (tagPrefix.materialAmount() / GTValues.M))
                    .outputItems(output)
                    .save(consumer);
        }
        else if (material.hasProperty(PropertyKey.GEM)) {
            LASER_ENGRAVER_RECIPES.recipeBuilder("engrave_" + material.getUnlocalizedName() + "_gem_to_" + tagPrefix.name + "_head")
                    .duration(12).EUt(32)
                    .circuitMeta(circuitValue)
                    .notConsumable(ChemicalHelper.get(TagPrefix.lens, Glass))
                    .inputItems(gem, material, (int) (tagPrefix.materialAmount() / GTValues.M))
                    .outputItems(output)
                    .save(consumer);
        }
    }

}
