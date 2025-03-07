package su.terrafirmagreg.core.old_remove_after_1_21_release;//package su.terrafirmagreg.core.old_remove_after_1_21_release;
//
//import com.gregtechceu.gtceu.api.GTValues;
//import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
//import com.gregtechceu.gtceu.api.data.chemical.material.Material;
//import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
//import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
//import com.gregtechceu.gtceu.common.data.GTItems;
//import com.gregtechceu.gtceu.data.recipe.generated.RecyclingRecipeHandler;
//import com.tterrag.registrate.util.entry.ItemEntry;
//import net.dries007.tfc.common.items.TFCItems;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import su.terrafirmagreg.core.TerraFirmaGreg;
//import su.terrafirmagreg.core.compat.gtceu.TFGPropertyKeys;
//import su.terrafirmagreg.core.compat.gtceu.materials.TFGMaterialFlags;
//import su.terrafirmagreg.core.compat.gtceu.properties.TFCProperty;
//
//import java.util.function.Consumer;
//
//import static com.gregtechceu.gtceu.api.GTValues.*;
//import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
//import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_EMPTY;
//import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_MOLDS;
//import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
//import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
//import static su.terrafirmagreg.core.compat.gtceu.TFGTagPrefix.*;
//import static su.terrafirmagreg.core.compat.gtceu.materials.TFGMaterials.*;
//
//public final class TFGRecipes {
//
//    public static void init(Consumer<FinishedRecipe> provider) {
//        registerToolRecyclingRecipes(provider);
//    }
//
//    private static void registerToolRecyclingRecipes(Consumer<FinishedRecipe> provider) {
//        /* Оголовья добавленные нами */
//        toolHeadMiningHammer.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadSword.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadPickaxe.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadShovel.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadAxe.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadHoe.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadScythe.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadFile.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadHammer.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadSaw.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadKnife.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadButcheryKnife.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadSpade.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadPropick.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadJavelin.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadChisel.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadMace.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        // TODO: Попробовать добавить энвилы и другую хуйню сюда
//
//        /* Оголовья грега, которые почему-то не имеют декрафта */
//        toolHeadBuzzSaw.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadScrewdriver.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadDrill.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadChainsaw.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//        toolHeadWrench.executeHandler(provider, PropertyKey.DUST, RecyclingRecipeHandler::processCrushing);
//    }
//
//    private static void registerTFCRockDecompositionRecipes(Consumer<FinishedRecipe> provider) {
//        // Gabbro
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("gabbro_dust_separation"))
//                .EUt(VA[MV]).duration(480)
//                .inputItems(dust, Gabbro)
//                .chancedOutput(dustTiny, Titanium, 6700, 700)
//                .chancedOutput(dustTiny, Iron, 3700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .save(provider);
//
//        // Shale
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("shale_dust_separation"))
//                .EUt(VA[MV]).duration(480)
//                .inputItems(dust, Shale)
//                .chancedOutput(dustTiny, Sodium, 7500, 500)
//                .chancedOutput(dustTiny, MetalMixture, 1500, 500)
//                .outputFluids(Oxygen.getFluid(16))
//                .save(provider);
//
//        // Claystone
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("claystone_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Claystone)
//                .chancedOutput(dustTiny, Aluminium, 6700, 700)
//                .chancedOutput(dustTiny, Silicon, 6700, 700)
//                .chancedOutput(dustTiny, Hematite, 6700, 700)
//                .outputFluids(Oxygen.getFluid(5))
//                .save(provider);
//
//        // Limestone
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("limestone_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Limestone)
//                .chancedOutput(dustTiny, Calcium, 8700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .outputFluids(Oxygen.getFluid(36))
//                .save(provider);
//
//        // Conglomerate
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("conglomerate_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Conglomerate)
//                .chancedOutput(dustTiny, Hematite, 6700, 700)
//                .chancedOutput(dustTiny, Silicon, 4700, 700)
//                .chancedOutput(dustTiny, TricalciumPhosphate, 3700, 700)
//                .outputFluids(Oxygen.getFluid(5))
//                .save(provider);
//
//        // Dolomite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("dolomite_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Dolomite)
//                .chancedOutput(dustTiny, Magnesium, 6700, 700)
//                .chancedOutput(dustTiny, Calcium, 5700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 3700, 700)
//                .outputFluids(Oxygen.getFluid(16))
//                .save(provider);
//
//        // Chert
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("chert_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Chert)
//                .chancedOutput(dustTiny, Silicon, 6700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 5700, 700)
//                .outputFluids(Oxygen.getFluid(24))
//                .save(provider);
//
//        // Chalk
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("chalk_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Chalk)
//                .chancedOutput(dustTiny, Calcium, 6700, 700)
//                .chancedOutput(dustTiny, Carbon, 3700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .outputFluids(Oxygen.getFluid(12))
//                .save(provider);
//
//        // Rhyolite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("rhyolite_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Rhyolite)
//                .chancedOutput(dustTiny, SiliconDioxide, 8700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 800, 700)
//                .save(provider);
//
//        // Dacite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("dacite_dust_separation"))
//                .duration(480).EUt(VA[MV])
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
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("slate_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Slate)
//                .chancedOutput(dustTiny, MetalMixture, 780, 480)
//                .outputFluids(Oxygen.getFluid(6))
//                .save(provider);
//
//        // Phyllite
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("phyllite_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Phyllite)
//                .chancedOutput(dustTiny, Quartzite, 5700, 700)
//                .chancedOutput(dustTiny, CalciumChloride, 1700, 700)
//                .outputFluids(Oxygen.getFluid(2))
//                .save(provider);
//
//        // Schist
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("schist_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Schist)
//                .chancedOutput(dustTiny, Mica, 6700, 700)
//                .chancedOutput(dustTiny, Talc, 5700, 700)
//                .chancedOutput(dustTiny, Graphite, 4700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 780, 700)
//                .outputFluids(Oxygen.getFluid(12))
//                .save(provider);
//
//        // Gneiss
//        CENTRIFUGE_RECIPES.recipeBuilder(TerraFirmaGreg.id("gneiss_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Gneiss)
//                .chancedOutput(dustTiny, Quartzite, 6700, 700)
//                .chancedOutput(dustTiny, Biotite, 3700, 700)
//                .outputFluids(Oxygen.getFluid(2))
//                .save(provider);
//    }
//
////    private static void registerExtruderMoldRecipes(Consumer<FinishedRecipe> provider) {
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_mining_hammer_head"),
////                SHAPE_EXTRUDER_MINING_HAMMER_HEAD.asStack(),
////                "Sfh", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_sword_head"),
////                SHAPE_EXTRUDER_SWORD_HEAD.asStack(),
////                "Shf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_pickaxe_head"),
////                SHAPE_EXTRUDER_PICKAXE_HEAD.asStack(),
////                "S  ", "hf ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_axe_head"),
////                SHAPE_EXTRUDER_AXE_HEAD.asStack(),
////                "S  ", " fh", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_hoe_head"),
////                SHAPE_EXTRUDER_HOE_HEAD.asStack(),
////                "S  ", " hf", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_scythe_head"),
////                SHAPE_EXTRUDER_SCYTHE_HEAD.asStack(),
////                "S  ", "   ", "fh ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_file_head"),
////                SHAPE_EXTRUDER_FILE_HEAD.asStack(),
////                "S  ", "   ", "hf ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_hammer_head"),
////                SHAPE_EXTRUDER_HAMMER_HEAD.asStack(),
////                "Sf ", " h ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_saw_head"),
////                SHAPE_EXTRUDER_SAW_HEAD.asStack(),
////                "Sh ", " f ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_knife_head"),
////                SHAPE_EXTRUDER_KNIFE_HEAD.asStack(),
////                "S f", "   ", "  h", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_butchery_head_head"),
////                SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD.asStack(),
////                "S h", "   ", "  f", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_shovel_head"),
////                SHAPE_EXTRUDER_SHOVEL_HEAD.asStack(),
////                "S  ", "f  ", "h  ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_spade_head"),
////                SHAPE_EXTRUDER_SPADE_HEAD.asStack(),
////                "S  ", "f  ", "  h", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_propick_head"),
////                SHAPE_EXTRUDER_PROPICK_HEAD.asStack(),
////                "Sxf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_javelin_head"),
////                SHAPE_EXTRUDER_JAVELIN_HEAD.asStack(),
////                "S x", "f  ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_chisel_head"),
////                SHAPE_EXTRUDER_CHISEL_HEAD.asStack(),
////                "S  ", "xf ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_extruder_mace_head"),
////                SHAPE_EXTRUDER_MACE_HEAD.asStack(),
////                "S  ", " xf", "   ", 'S', SHAPE_EMPTY.asStack());
////    }
////
////    private static void registerCastingMoldRecipes(Consumer<FinishedRecipe> provider) {
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_mold_unfinished_lamp"),
////                SHAPE_MOLD_UNFINISHED_LAMP.asStack(),
////                "Sh ", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_mold_trapdoor"),
////                SHAPE_MOLD_TRAPDOOR.asStack(),
////                "S h", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_mold_chain"),
////                SHAPE_MOLD_CHAIN.asStack(),
////                "S  ", "h  ", "   ", 'S', SHAPE_EMPTY.asStack());
////
////        VanillaRecipeHelper.addStrictShapedRecipe(provider,
////                TerraFirmaGreg.id("shape_mold_bell"),
////                SHAPE_MOLD_BELL.asStack(),
////                "S  ", " h ", "   ", 'S', SHAPE_EMPTY.asStack());
////    }
//
////    private static void registerExtruderMoldCopyingRecipes(Consumer<FinishedRecipe> provider) {
////        for (var shapeMold : TFGItems.SHAPE_EXTRUDERS) {
////            FORMING_PRESS_RECIPES.recipeBuilder(TerraFirmaGreg.id("copy_mold_" + shapeMold.get()))
////                    .duration(120).EUt(22)
////                    .notConsumable(shapeMold)
////                    .inputItems(SHAPE_EMPTY)
////                    .outputItems(shapeMold)
////                    .save(provider);
////        }
////    }
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
////    private static void registerProcessingToolHeadsRecipes(Consumer<FinishedRecipe> consumer) {
////        for (var material : GTCEuAPI.materialManager.getRegisteredMaterials()) {
////            if (material.hasProperty(PropertyKey.TOOL)) {
////
////                int counter = 0;
////
////                processToolHead(toolHeadAxe, material, SHAPE_EXTRUDER_AXE_HEAD, counter++, consumer);
////                processToolHead(toolHeadHoe, material, SHAPE_EXTRUDER_HOE_HEAD, counter++, consumer);
////                processToolHead(toolHeadShovel, material, SHAPE_EXTRUDER_SHOVEL_HEAD, counter++, consumer);
////                processToolHead(toolHeadKnife, material, SHAPE_EXTRUDER_KNIFE_HEAD, counter++, consumer);
////                processToolHead(toolHeadMiningHammer, material, SHAPE_EXTRUDER_MINING_HAMMER_HEAD, counter++, consumer);
////                processToolHead(toolHeadSword, material, SHAPE_EXTRUDER_SWORD_HEAD, counter++, consumer);
////                processToolHead(toolHeadPickaxe, material, SHAPE_EXTRUDER_PICKAXE_HEAD, counter++, consumer);
////                processToolHead(toolHeadScythe, material, SHAPE_EXTRUDER_SCYTHE_HEAD, counter++, consumer);
////                processToolHead(toolHeadFile, material, SHAPE_EXTRUDER_FILE_HEAD, counter++, consumer);
////                processToolHead(toolHeadHammer, material, SHAPE_EXTRUDER_HAMMER_HEAD, counter++, consumer);
////                processToolHead(toolHeadSaw, material, SHAPE_EXTRUDER_SAW_HEAD, counter++, consumer);
////                processToolHead(toolHeadButcheryKnife, material, SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD, counter++, consumer);
////                processToolHead(toolHeadSpade, material, SHAPE_EXTRUDER_SPADE_HEAD, counter++, consumer);
////                processToolHead(toolHeadPropick, material, SHAPE_EXTRUDER_PROPICK_HEAD, counter++, consumer);
////                processToolHead(toolHeadJavelin, material, SHAPE_EXTRUDER_JAVELIN_HEAD, counter++, consumer);
////                processToolHead(toolHeadChisel, material, SHAPE_EXTRUDER_CHISEL_HEAD, counter++, consumer);
////                processToolHead(toolHeadMace, material, SHAPE_EXTRUDER_MACE_HEAD, counter, consumer);
////            }
////        }
////    }
//
//
//
//    private static void registerRandomRecipes(Consumer<FinishedRecipe> provider) {
////        ingot.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processIngot(tagPrefix, material, property, provider));
//        ingotDouble.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::processDoubleIngot);
//        plate.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::processPlate);
////        plateDouble.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processDoublePlate(tagPrefix, material, property, provider));
////        rod.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRod(tagPrefix, material, property, provider));
////        rodLong.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processLongRod(tagPrefix, material, property, provider));
////        bolt.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processBolt(tagPrefix, material, property, provider));
////        screw.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processScrew(tagPrefix, material, property, provider));
////        ring.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRing(tagPrefix, material, property, provider));
////        block.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processBlock(tagPrefix, material, property, provider));
////        nugget.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processNugget(tagPrefix, material, property, provider));
////        dustTiny.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processTinyDust(tagPrefix, material, property, provider));
////        dustSmall.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processSmallDust(tagPrefix, material, property, provider));
////        dust.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processDust(tagPrefix, material, property, provider));
////        dustImpure.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processImpureDust(tagPrefix, material, property, provider));
////        dustPure.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processPureDust(tagPrefix, material, property, provider));
////        poorRawOre.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processPoorRawOre(tagPrefix, material, property, provider));
////        rawOre.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRawOre(tagPrefix, material, property, provider));
////        richRawOre.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processRichRawOre(tagPrefix, material, property, provider));
////        crushed.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processCrushedOre(tagPrefix, material, property, provider));
////        crushedPurified.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processCrushedPurifiedOre(tagPrefix, material, property, provider));
////        crushedRefined.executeHandler(TFGPropertyKeys.TFC_PROPERTY, (tagPrefix, material, property) -> processCrushedRefinedOre(tagPrefix, material, property, provider));
//
////        oreSmall.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessSmallOre);
////        oreSmallNative.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessSmallNativeOre);
////        anvil.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessAnvil);
////        lamp.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessLamp);
////        lampUnfinished.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessUnfinishedLamp);
////        trapdoor.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessTrapdoor);
////        chain.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessChain);
////        bell.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessBell);
//
//        // Better way to get latex
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id("latex_heating"))
//                .EUt(VA[LV]).duration(480)
//                .inputItems(dust, Sulfur)
//                .inputFluids(Latex.getFluid(1000))
//                .outputItems(GTItems.STICKY_RESIN)
//                .save(provider);
//    }
//
////    private static void processIngot(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var ingotStack = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
//
//    private static void processDoubleIngot(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var ingotStack = ChemicalHelper.get(ingot, material);
//        var doubleIngotStack = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        BENDER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_double_ingot"))
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(ingotStack.copyWithCount(2))
//                .circuitMeta(6)
//                .outputItems(doubleIngotStack)
//                .save(provider);
//
//        EXTRACTOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("extract_" + material.getName() + "_double_ingot"))
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(doubleIngotStack)
//                .outputFluids(material.getFluid(288))
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_double_ingot"))
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(doubleIngotStack)
//                .outputItems(dust, material, 2)
//                .save(provider);
//    }
//
//    private static void processPlate(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var plateStack = ChemicalHelper.get(prefix, material);
//        var doubleIngotStack = ChemicalHelper.get(ingotDouble, material);
//        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        if (material.hasFlag(TFGMaterialFlags.GENERATE_DOUBLE_INGOTS)) {
//            FORGE_HAMMER_RECIPES.recipeBuilder(TerraFirmaGreg.id("hammer_" + material.getName() + "_plate"))
//                    .EUt(VA[ULV]).duration((int) material.getMass() * 4)
//                    .inputItems(doubleIngotStack)
//                    .outputItems(plateStack)
//                    .save(provider);
//        }
//    }
//
////    private static void processDoublePlate(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var doublePlateStack = ChemicalHelper.get(prefix, material);
////        // var plateStack = ChemicalHelper.get(plate, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processRod(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var ingotStack = ChemicalHelper.get(ingot, material);
////        // var rodStack = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processLongRod(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var rodStack = ChemicalHelper.get(rod, material);
////        // var longRodStack = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processBolt(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var boltStack = ChemicalHelper.get(prefix, material);
////        // var ingotStack = ChemicalHelper.get(ingot, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processScrew(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var screwStack = ChemicalHelper.get(prefix, material);
////        // var ingotStack = ChemicalHelper.get(ingot, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processRing(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var ringStack = ChemicalHelper.get(prefix, material);
////        // var ingotStack = ChemicalHelper.get(ingot, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processBlock(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var blockStack = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processTinyDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var tinyDust = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processSmallDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var smallDust = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var dust = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processImpureDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var impureDust = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processPureDust(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var pureDust = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processPoorRawOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var poorRawOre = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processRawOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var rawOre = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processRichRawOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var richRawOre = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processCrushedOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var crushedOre = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processCrushedPurifiedOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var crushedPurifiedOre = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processCrushedRefinedOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var crushedRefinedOre = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
////
////    private static void processNugget(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        // var nuggets = ChemicalHelper.get(prefix, material);
////        // var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////    }
//
//    private static void proccessSmallOre(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var smallOre = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_small_ore"))
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
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_small_native_ore"))
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
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_anvil"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 32)
//                .inputItems(anvil)
//                .outputItems(dust, outputMaterial, 14)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("arc_" + material.getName() + "_anvil"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 32)
//                .inputItems(anvil)
//                .outputItems(ingot, outputMaterial, 14)
//                .save(provider);
//
//        // Сборка
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_anvil_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputItems(ingot, outputMaterial, 14)
//                .notConsumable(GTItems.SHAPE_MOLD_ANVIL)
//                .itemOutputs(anvil)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_anvil_from_fluid"))
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
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_lamp"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 8)
//                .inputItems(finishedLamp)
//                .outputItems(ChemicalHelper.get(dust, outputMaterial), ChemicalHelper.get(dust, Glass, 4))
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("arc_" + material.getName() + "_lamp"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 8)
//                .inputItems(finishedLamp)
//                .outputItems(ChemicalHelper.get(ingot, outputMaterial), ChemicalHelper.get(block, Glass))
//                .save(provider);
//
//        // Сборка
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_lamp"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(new ItemStack(TFCItems.LAMP_GLASS.get()), unfinishedLamp)
//                .circuitMeta(12)
//                .outputItems(finishedLamp)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_lamp_from_liquid"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(unfinishedLamp)
//                .inputFluids(Glass.getFluid(576))
//                .circuitMeta(13)
//                .outputItems(finishedLamp)
//                .save(provider);
//    }
//
////    private static void proccessUnfinishedLamp(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        var unfinishedLamp = ChemicalHelper.get(prefix, material);
////        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////
////        // Разборка
////
////        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_unfinished_lamp"))
////                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 8)
////                .inputItems(unfinishedLamp)
////                .outputItems(dust, outputMaterial)
////                .save(provider);
////
////        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("arc_" + material.getName() + "_unfinished_lamp"))
////                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 8)
////                .inputItems(unfinishedLamp)
////                .outputItems(ingot, outputMaterial)
////                .save(provider);
////
////        // Сборка
////
////        ALLOY_SMELTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_unfinished_lamp_from_ingots"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 7)
////                .inputItems(ingot, outputMaterial)
////                .notConsumable(SHAPE_MOLD_UNFINISHED_LAMP)
////                .itemOutputs(unfinishedLamp)
////                .save(provider);
////
////        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_unfinished_lamp_from_fluid"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 7)
////                .inputFluids(outputMaterial.getFluid(144))
////                .notConsumable(SHAPE_MOLD_UNFINISHED_LAMP)
////                .itemOutputs(unfinishedLamp)
////                .save(provider);
////    }
//
////    private static void proccessTrapdoor(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
////        var trapdoor = ChemicalHelper.get(prefix, material);
////        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
////
////        // Разборка
////
////        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_trapdoor"))
////                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 7)
////                .inputItems(trapdoor)
////                .outputItems(dust, outputMaterial)
////                .save(provider);
////
////        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("arc_" + material.getName() + "_trapdoor"))
////                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
////                .inputItems(trapdoor)
////                .outputItems(ingot, outputMaterial)
////                .save(provider);
////
////        // Сборка
////
////        ALLOY_SMELTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_trapdoor_from_ingots"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
////                .inputItems(ingot, outputMaterial)
////                .notConsumable(SHAPE_MOLD_TRAPDOOR)
////                .itemOutputs(trapdoor)
////                .save(provider);
////
////        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_trapdoor_from_fluid"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
////                .inputFluids(outputMaterial.getFluid(144))
////                .notConsumable(SHAPE_MOLD_TRAPDOOR)
////                .itemOutputs(trapdoor)
////                .save(provider);
////    }
//
//    private static void proccessChain(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var chain = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_chain"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 3)
//                .inputItems(chain)
//                .outputItems(dustTiny, outputMaterial)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("arc_" + material.getName() + "_chain"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 3)
//                .inputItems(chain)
//                .outputItems(nugget, outputMaterial)
//                .save(provider);
//
//        // Сборка
//
////        ALLOY_SMELTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_chain_from_ingots"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 2)
////                .inputItems(ingot, outputMaterial)
////                .notConsumable(SHAPE_MOLD_CHAIN)
////                .itemOutputs(chain.copyWithCount(9))
////                .save(provider);
////
////        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_chain_from_fluid"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 2)
////                .inputFluids(outputMaterial.getFluid(144))
////                .notConsumable(SHAPE_MOLD_CHAIN)
////                .itemOutputs(chain.copyWithCount(9))
////                .save(provider);
//    }
//
//    private static void proccessBell(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var bell = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        // Разборка
//
//        MACERATOR_RECIPES.recipeBuilder(TerraFirmaGreg.id("macerate_" + material.getName() + "_bell"))
//                .EUt(VA[LV]).duration((int) outputMaterial.getMass() * 5)
//                .inputItems(bell)
//                .outputItems(dust, outputMaterial)
//                .save(provider);
//
//        ARC_FURNACE_RECIPES.recipeBuilder(TerraFirmaGreg.id("arc_" + material.getName() + "_bell"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 5)
//                .inputItems(bell)
//                .outputItems(ingot, outputMaterial)
//                .save(provider);
//
//        // Сборка
//
////        ALLOY_SMELTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_bell_from_ingots"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 4)
////                .inputItems(ingot, outputMaterial)
////                .notConsumable(SHAPE_MOLD_BELL)
////                .itemOutputs(bell)
////                .save(provider);
////
////        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TerraFirmaGreg.id(material.getName() + "_bell_from_fluid"))
////                .EUt(VA[ULV]).duration((int) material.getMass() * 4)
////                .inputFluids(outputMaterial.getFluid(144))
////                .notConsumable(SHAPE_MOLD_BELL)
////                .itemOutputs(bell)
////                .save(provider);
//    }
//
//    private static void processToolHead(TagPrefix prefix, Material material, ItemEntry<Item> extruderShape, int circuitValue, Consumer<FinishedRecipe> consumer) {
//        var output = ChemicalHelper.get(prefix, material);
//        if (output.isEmpty()) return;
//
//        if (material.hasProperty(PropertyKey.INGOT)) {
//            EXTRUDER_RECIPES.recipeBuilder(TerraFirmaGreg.id("extrude_" + material.getName() + "_ingot_to_" + prefix.name().toLowerCase() + "_head"))
//                    .duration(12).EUt(32)
//                    .notConsumable(extruderShape)
//                    .inputItems(ingot, material, (int) (prefix.materialAmount() / GTValues.M))
//                    .outputItems(output)
//                    .save(consumer);
//        } else if (material.hasProperty(PropertyKey.GEM)) {
//            LASER_ENGRAVER_RECIPES.recipeBuilder(TerraFirmaGreg.id("engrave_" + material.getName() + "_gem_to_" + prefix.name().toLowerCase() + "_head"))
//                    .duration(12).EUt(32)
//                    .circuitMeta(circuitValue)
//                    .notConsumable(ChemicalHelper.get(TagPrefix.lens, Glass))
//                    .inputItems(gem, material, (int) (prefix.materialAmount() / GTValues.M))
//                    .outputItems(output)
//                    .save(consumer);
//        }
//    }
//}
