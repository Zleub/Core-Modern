package su.terrafirmagreg.core.common.data.recipes;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public final class TFGRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
//        registerTFCRockDecompositionRecipes(provider);
//        registerExtruderMoldRecipes(provider);
//        registerCastingMoldRecipes(provider);
//        registerExtruderMoldCopyingRecipes(provider);
//        registerCastingMoldCopyingRecipes(provider);
//        registerProcessingToolHeadsRecipes(provider);
//        registerTagPrefixHandlerRecipes(provider);
    }

//    private static void registerTFCRockDecompositionRecipes(Consumer<FinishedRecipe> provider) {
//        // Gabbro
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("gabbro_dust_separation"))
//                .EUt(VA[MV]).duration(480)
//                .inputItems(dust, Gabbro)
//                .chancedOutput(dustTiny, Titanium, 6700, 700)
//                .chancedOutput(dustTiny, Iron, 3700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .save(provider);
//
//        // Shale
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("shale_dust_separation"))
//                .EUt(VA[MV]).duration(480)
//                .inputItems(dust, Shale)
//                .chancedOutput(dustTiny, Sodium, 7500, 500)
//                .chancedOutput(dustTiny, MetalMixture, 1500, 500)
//                .outputFluids(Oxygen.getFluid(16))
//                .save(provider);
//
//        // Claystone
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("claystone_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Claystone)
//                .chancedOutput(dustTiny, Aluminium, 6700, 700)
//                .chancedOutput(dustTiny, Silicon, 6700, 700)
//                .chancedOutput(dustTiny, Hematite, 6700, 700)
//                .outputFluids(Oxygen.getFluid(5))
//                .save(provider);
//
//        // Limestone
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("limestone_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Limestone)
//                .chancedOutput(dustTiny, Calcium, 8700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .outputFluids(Oxygen.getFluid(36))
//                .save(provider);
//
//        // Conglomerate
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("conglomerate_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Conglomerate)
//                .chancedOutput(dustTiny, Hematite, 6700, 700)
//                .chancedOutput(dustTiny, Silicon, 4700, 700)
//                .chancedOutput(dustTiny, TricalciumPhosphate, 3700, 700)
//                .outputFluids(Oxygen.getFluid(5))
//                .save(provider);
//
//        // Dolomite
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("dolomite_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Dolomite)
//                .chancedOutput(dustTiny, Magnesium, 6700, 700)
//                .chancedOutput(dustTiny, Calcium, 5700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 3700, 700)
//                .outputFluids(Oxygen.getFluid(16))
//                .save(provider);
//
//        // Chert
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("chert_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Chert)
//                .chancedOutput(dustTiny, Silicon, 6700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 5700, 700)
//                .outputFluids(Oxygen.getFluid(24))
//                .save(provider);
//
//        // Chalk
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("chalk_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Chalk)
//                .chancedOutput(dustTiny, Calcium, 6700, 700)
//                .chancedOutput(dustTiny, Carbon, 3700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 1700, 700)
//                .outputFluids(Oxygen.getFluid(12))
//                .save(provider);
//
//        // Rhyolite
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("rhyolite_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Rhyolite)
//                .chancedOutput(dustTiny, SiliconDioxide, 8700, 700)
//                .chancedOutput(dustTiny, MetalMixture, 800, 700)
//                .save(provider);
//
//        // Dacite
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("dacite_dust_separation"))
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
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("slate_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Slate)
//                .chancedOutput(dustTiny, MetalMixture, 780, 480)
//                .outputFluids(Oxygen.getFluid(6))
//                .save(provider);
//
//        // Phyllite
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("phyllite_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Phyllite)
//                .chancedOutput(dustTiny, Quartzite, 5700, 700)
//                .chancedOutput(dustTiny, CalciumChloride, 1700, 700)
//                .outputFluids(Oxygen.getFluid(2))
//                .save(provider);
//
//        // Schist
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("schist_dust_separation"))
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
//        CENTRIFUGE_RECIPES.recipeBuilder(TFGCore.id("gneiss_dust_separation"))
//                .duration(480).EUt(VA[MV])
//                .inputItems(dust, Gneiss)
//                .chancedOutput(dustTiny, Quartzite, 6700, 700)
//                .chancedOutput(dustTiny, Biotite, 3700, 700)
//                .outputFluids(Oxygen.getFluid(2))
//                .save(provider);
//    }

//    private static void registerExtruderMoldRecipes(Consumer<FinishedRecipe> provider) {
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_mining_hammer_head"),
//                SHAPE_EXTRUDER_MINING_HAMMER_HEAD.asStack(),
//                "Sfh", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_sword_head"),
//                SHAPE_EXTRUDER_SWORD_HEAD.asStack(),
//                "Shf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_pickaxe_head"),
//                SHAPE_EXTRUDER_PICKAXE_HEAD.asStack(),
//                "S  ", "hf ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_axe_head"),
//                SHAPE_EXTRUDER_AXE_HEAD.asStack(),
//                "S  ", " fh", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_hoe_head"),
//                SHAPE_EXTRUDER_HOE_HEAD.asStack(),
//                "S  ", " hf", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_scythe_head"),
//                SHAPE_EXTRUDER_SCYTHE_HEAD.asStack(),
//                "S  ", "   ", "fh ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_file_head"),
//                SHAPE_EXTRUDER_FILE_HEAD.asStack(),
//                "S  ", "   ", "hf ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_hammer_head"),
//                SHAPE_EXTRUDER_HAMMER_HEAD.asStack(),
//                "Sf ", " h ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_saw_head"),
//                SHAPE_EXTRUDER_SAW_HEAD.asStack(),
//                "Sh ", " f ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_knife_head"),
//                SHAPE_EXTRUDER_KNIFE_HEAD.asStack(),
//                "S f", "   ", "  h", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_butchery_head_head"),
//                SHAPE_EXTRUDER_BUTCHERY_KNIFE_HEAD.asStack(),
//                "S h", "   ", "  f", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_shovel_head"),
//                SHAPE_EXTRUDER_SHOVEL_HEAD.asStack(),
//                "S  ", "f  ", "h  ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_spade_head"),
//                SHAPE_EXTRUDER_SPADE_HEAD.asStack(),
//                "S  ", "f  ", "  h", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_propick_head"),
//                SHAPE_EXTRUDER_PROPICK_HEAD.asStack(),
//                "Sxf", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_javelin_head"),
//                SHAPE_EXTRUDER_JAVELIN_HEAD.asStack(),
//                "S x", "f  ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_chisel_head"),
//                SHAPE_EXTRUDER_CHISEL_HEAD.asStack(),
//                "S  ", "xf ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_extruder_mace_head"),
//                SHAPE_EXTRUDER_MACE_HEAD.asStack(),
//                "S  ", " xf", "   ", 'S', SHAPE_EMPTY.asStack());
//    }

//    private static void registerCastingMoldRecipes(Consumer<FinishedRecipe> provider) {
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_mold_unfinished_lamp"),
//                SHAPE_MOLD_UNFINISHED_LAMP.asStack(),
//                "Sh ", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_mold_trapdoor"),
//                SHAPE_MOLD_TRAPDOOR.asStack(),
//                "S h", "   ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_mold_chain"),
//                SHAPE_MOLD_CHAIN.asStack(),
//                "S  ", "h  ", "   ", 'S', SHAPE_EMPTY.asStack());
//
//        VanillaRecipeHelper.addStrictShapedRecipe(provider,
//                TFGCore.id("shape_mold_bell"),
//                SHAPE_MOLD_BELL.asStack(),
//                "S  ", " h ", "   ", 'S', SHAPE_EMPTY.asStack());
//    }

//    private static void registerExtruderMoldCopyingRecipes(Consumer<FinishedRecipe> provider) {
//        for (var shapeMold : TFGItems.SHAPE_EXTRUDERS) {
//            FORMING_PRESS_RECIPES.recipeBuilder(TFGCore.id("copy_mold_" + shapeMold.get()))
//                    .duration(120).EUt(22)
//                    .notConsumable(shapeMold)
//                    .inputItems(SHAPE_EMPTY)
//                    .outputItems(shapeMold)
//                    .save(provider);
//        }
//    }

//    private static void registerCastingMoldCopyingRecipes(Consumer<FinishedRecipe> provider) {
//        for (var shapeMold : TFGItems.SHAPE_MOLDS) {
//            FORMING_PRESS_RECIPES.recipeBuilder(TFGCore.id("copy_mold_" + shapeMold.get() + "_casting_mold"))
//                    .duration(120).EUt(22)
//                    .notConsumable(shapeMold)
//                    .inputItems(SHAPE_EMPTY)
//                    .outputItems(shapeMold)
//                    .save(provider);
//        }
//    }

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

//    private static void registerTagPrefixHandlerRecipes(Consumer<FinishedRecipe> provider) {
//        ingotDouble.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::processDoubleIngot);
//        plate.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::processPlate);
//
//        anvil.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessAnvil);
//        lamp.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessLamp);
//        lampUnfinished.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessUnfinishedLamp);
//        trapdoor.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessTrapdoor);
//        chain.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessChain);
//        bell.executeHandler(provider, TFGPropertyKeys.TFC_PROPERTY, TFGRecipes::proccessBell);
//    }

//    private static void processDoubleIngot(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var ingotStack = ChemicalHelper.get(ingot, material);
//        var doubleIngotStack = ChemicalHelper.get(prefix, material);
//
//        BENDER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_double_ingot"))
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(ingotStack.copyWithCount(2))
//                .circuitMeta(6)
//                .outputItems(doubleIngotStack)
//                .save(provider);
//
//        EXTRACTOR_RECIPES.recipeBuilder(TFGCore.id("extract_" + material.getName() + "_double_ingot"))
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(doubleIngotStack)
//                .outputFluids(material.getFluid(288))
//                .save(provider);
//
//        MACERATOR_RECIPES.recipeBuilder(TFGCore.id("macerate_" + material.getName() + "_double_ingot"))
//                .EUt(VA[ULV]).duration((int) material.getMass())
//                .inputItems(doubleIngotStack)
//                .outputItems(dust, material, 2)
//                .save(provider);
//    }

//    private static void processPlate(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var plateStack = ChemicalHelper.get(prefix, material);
//        var doubleIngotStack = ChemicalHelper.get(ingotDouble, material);
//
//        if (material.hasFlag(TFGMaterialFlags.GENERATE_DOUBLE_INGOTS)) {
//            FORGE_HAMMER_RECIPES.recipeBuilder(TFGCore.id("hammer_" + material.getName() + "_plate"))
//                    .EUt(VA[ULV]).duration((int) material.getMass() * 4)
//                    .inputItems(doubleIngotStack)
//                    .outputItems(plateStack)
//                    .save(provider);
//        }
//    }

//    private static void proccessAnvil(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var anvil = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_anvil_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputItems(ingot, outputMaterial, 14)
//                .notConsumable(GTItems.SHAPE_MOLD_ANVIL)
//                .outputItems(anvil)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_anvil_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputFluids(outputMaterial.getFluid(2016))
//                .notConsumable(GTItems.SHAPE_MOLD_ANVIL)
//                .outputItems(anvil)
//                .save(provider);
//    }

//    private static void proccessLamp(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var finishedLamp = ChemicalHelper.get(prefix, material);
//        var unfinishedLamp = ChemicalHelper.get(lampUnfinished, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_lamp"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(new ItemStack(TFCItems.LAMP_GLASS.get()), unfinishedLamp)
//                .circuitMeta(12)
//                .outputItems(finishedLamp)
//                .save(provider);
//
//        ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_lamp_from_liquid"))
//                .EUt(VA[ULV]).duration((int) outputMaterial.getMass() * 7)
//                .inputItems(unfinishedLamp)
//                .inputFluids(Glass.getFluid(576))
//                .circuitMeta(13)
//                .outputItems(finishedLamp)
//                .save(provider);
//    }

//    private static void proccessUnfinishedLamp(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var unfinishedLamp = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_unfinished_lamp_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 7)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_UNFINISHED_LAMP)
//                .outputItems(unfinishedLamp)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_unfinished_lamp_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 7)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_UNFINISHED_LAMP)
//                .outputItems(unfinishedLamp)
//                .save(provider);
//    }

//    private static void proccessTrapdoor(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var trapdoor = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_trapdoor_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_TRAPDOOR)
//                .outputItems(trapdoor)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_trapdoor_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 6)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_TRAPDOOR)
//                .outputItems(trapdoor)
//                .save(provider);
//    }

//    private static void proccessChain(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var chain = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_chain_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 2)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_CHAIN)
//                .outputItems(chain.copyWithCount(9))
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_chain_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 2)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_CHAIN)
//                .outputItems(chain.copyWithCount(9))
//                .save(provider);
//    }

//    private static void proccessBell(TagPrefix prefix, Material material, TFCProperty property, Consumer<FinishedRecipe> provider) {
//        var bell = ChemicalHelper.get(prefix, material);
//        var outputMaterial = property.getOutputMaterial() == null ? material : property.getOutputMaterial();
//
//
//        ALLOY_SMELTER_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_bell_from_ingots"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 4)
//                .inputItems(ingot, outputMaterial)
//                .notConsumable(SHAPE_MOLD_BELL)
//                .outputItems(bell)
//                .save(provider);
//
//        FLUID_SOLIDFICATION_RECIPES.recipeBuilder(TFGCore.id(material.getName() + "_bell_from_fluid"))
//                .EUt(VA[ULV]).duration((int) material.getMass() * 4)
//                .inputFluids(outputMaterial.getFluid(144))
//                .notConsumable(SHAPE_MOLD_BELL)
//                .outputItems(bell)
//                .save(provider);
//    }

//    private static void processToolHead(TagPrefix prefix, Material material, ItemEntry<Item> extruderShape, int circuitValue, Consumer<FinishedRecipe> consumer) {
//        var output = ChemicalHelper.get(prefix, material);
//        if (output.isEmpty()) return;
//
//        if (material.hasProperty(PropertyKey.INGOT)) {
//            EXTRUDER_RECIPES.recipeBuilder(TFGCore.id("extrude_" + material.getName() + "_ingot_to_" + prefix.name().toLowerCase() + "_head"))
//                    .duration(12).EUt(32)
//                    .notConsumable(extruderShape)
//                    .inputItems(ingot, material, (int) (prefix.materialAmount() / GTValues.M))
//                    .outputItems(output)
//                    .save(consumer);
//        } else if (material.hasProperty(PropertyKey.GEM)) {
//            LASER_ENGRAVER_RECIPES.recipeBuilder(TFGCore.id("engrave_" + material.getName() + "_gem_to_" + prefix.name().toLowerCase() + "_head"))
//                    .duration(12).EUt(32)
//                    .circuitMeta(circuitValue)
//                    .notConsumable(ChemicalHelper.get(TagPrefix.lens, Glass))
//                    .inputItems(gem, material, (int) (prefix.materialAmount() / GTValues.M))
//                    .outputItems(output)
//                    .save(consumer);
//        }
//    }
}
