package su.terrafirmagreg.core.objects.data.recipes;

import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.wood.Wood;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.data.recipes.builders.create.TFGCuttingRecipeBuilder;
import su.terrafirmagreg.core.objects.data.TFGTags;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.ULV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CUTTER_RECIPES;

public final class TFGWoodRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        for (var woodType : Wood.values()) {
            var woodName = woodType.getSerializedName();

            var lumber = TFCItems.LUMBER.get(woodType).get();

            var allLogs = TFGTags.Items.createItemTag("tfc:" + woodName + "_logs");

            var log = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.LOG).get().asItem();
            var strippedLog = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.STRIPPED_LOG).get().asItem();

            var wood = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.WOOD).get().asItem();
            var strippedWood = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.STRIPPED_WOOD).get().asItem();

            var planks = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.PLANKS).get().asItem();
            var stairs = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.STAIRS).get().asItem();
            var slab = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.SLAB).get().asItem();

            // =========================== Stripped Log =========================== //

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id("stripped_" + woodName + "_log"))
                    .inputItems(log)
                    .circuitMeta(0)
                    .outputItems(strippedLog)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Stripped Wood =========================== //

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id("stripped_" + woodName + "_wood"))
                    .inputItems(wood)
                    .circuitMeta(0)
                    .outputItems(strippedWood)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Planks =========================== //

            ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_planks"))
                    .inputItems(lumber, 4)
                    .outputItems(planks)
                    .circuitMeta(6)
                    .EUt(1).duration(100).save(provider);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_planks"))
                    .inputItems(allLogs)
                    .circuitMeta(1)
                    .outputItems(planks, 6)
                    .outputItems(dust, GTMaterials.Wood, 2)
                    .duration(200)
                    .EUt(VA[ULV])
                    .save(provider);

            // =========================== Stairs =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_stairs"),
                    new ItemStack(stairs, 4),
                    "P  ", "PP ", "PPP", 'P', planks);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_stairs"))
                    .inputItems(planks)
                    .circuitMeta(0)
                    .outputItems(stairs)
                    .outputItems(dustSmall, GTMaterials.Wood)
                    .duration(200).EUt(VA[ULV])
                    .save(provider);

            // =========================== Slabs =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_slab_saw"), new ItemStack(slab, 2),
                    "sS", 'S', planks);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_slab"))
                    .inputItems(planks)
                    .circuitMeta(1)
                    .outputItems(slab, 2)
                    .duration(200).EUt(VA[ULV])
                    .save(provider);

            // =========================== Lumber =========================== //

            // From Logs
            VanillaRecipeHelper.addShapelessRecipe(provider, TerraFirmaGreg.id(woodName + "_lumber_from_any_log"),
                    new ItemStack(lumber, 16),
                    's', allLogs);

            new TFGCuttingRecipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_any_log"))
                    .input(allLogs)
                    .duration(50)
                    .output(new ItemStack(lumber, 16))
                    .save(provider);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_any_log"))
                    .inputItems(allLogs)
                    .circuitMeta(2)
                    .outputItems(new ItemStack(lumber, 16))
                    .outputItems(dust, GTMaterials.Wood, 2)
                    .duration(200)
                    .EUt(VA[ULV])
                    .save(provider);

            // From Planks
            VanillaRecipeHelper.addShapelessRecipe(provider, TerraFirmaGreg.id(woodName + "_lumber_from_planks"),
                    new ItemStack(lumber, 4),
                    's', planks);

            new TFGCuttingRecipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_planks"))
                    .input(planks)
                    .duration(50)
                    .output(new ItemStack(lumber, 4))
                    .save(provider);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_planks"))
                    .inputItems(planks)
                    .circuitMeta(2)
                    .outputItems(lumber, 4)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // From Stairs
            VanillaRecipeHelper.addShapelessRecipe(provider, TerraFirmaGreg.id(woodName + "_lumber_from_stairs"),
                    new ItemStack(lumber, 3),
                    's', stairs);

            new TFGCuttingRecipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_stairs"))
                    .input(stairs)
                    .duration(50)
                    .output(new ItemStack(lumber, 3))
                    .save(provider);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_stairs"))
                    .inputItems(stairs)
                    .outputItems(lumber, 3)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // From Slabs
            VanillaRecipeHelper.addShapelessRecipe(provider, TerraFirmaGreg.id(woodName + "_lumber_from_slab"),
                    new ItemStack(lumber, 2),
                    's', slab);

            new TFGCuttingRecipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_slab"))
                    .input(slab)
                    .duration(50)
                    .output(new ItemStack(lumber, 2))
                    .save(provider);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_slab"))
                    .inputItems(slab)
                    .outputItems(lumber, 2)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== asd =========================== //
            // Fence
            // Fence Log
            // Fence Gate
            // Door
            // Trapdoor

//            // door
//            if (entry.door != null) {
//                final boolean hasDoorRecipe = entry.doorRecipeName != null;
//                if (ConfigHolder.INSTANCE.recipes.hardWoodRecipes) {
//                    String recipeName = hasDoorRecipe ? entry.doorRecipeName : name + "_door";
//                    if (entry.trapdoor != null) {
//                        VanillaRecipeHelper.addShapedRecipe(provider, recipeName, new ItemStack(entry.door),
//                                "PTd", "PRS", "PPs",
//                                'P', entry.planks,
//                                'T', entry.trapdoor,
//                                'R', new UnificationEntry(ring, Iron),
//                                'S', new UnificationEntry(screw, Iron));
//
//                        // plank -> door assembling
//                        ASSEMBLER_RECIPES.recipeBuilder(name + "_door")
//                                .inputItems(entry.trapdoor)
//                                .inputItems(new ItemStack(entry.planks, 4))
//                                .inputFluids(Iron.getFluid(GTValues.L / 9))
//                                .outputItems(entry.door)
//                                .duration(400).EUt(4).save(provider);
//                    } else {
//                        VanillaRecipeHelper.addShapedRecipe(provider, recipeName, new ItemStack(entry.door),
//                                "PTd", "PRS", "PPs",
//                                'P', entry.planks,
//                                'T', ItemTags.WOODEN_TRAPDOORS,
//                                'R', new UnificationEntry(ring, Iron),
//                                'S', new UnificationEntry(screw, Iron));
//
//                        // plank -> door assembling
//                        ASSEMBLER_RECIPES.recipeBuilder(name + "_door")
//                                .inputItems(ItemTags.WOODEN_TRAPDOORS)
//                                .inputItems(new ItemStack(entry.planks, 4))
//                                .inputFluids(Iron.getFluid(GTValues.L / 9))
//                                .outputItems(entry.door)
//                                .duration(400).EUt(4).save(provider);
//                    }
//                } else {
//                    if (!hasDoorRecipe) {
//                        VanillaRecipeHelper.addShapedRecipe(provider, name + "_door", new ItemStack(entry.door, 3),
//                                "PP", "PP", "PP",
//                                'P', entry.planks);
//                    }
//
//                    ASSEMBLER_RECIPES.recipeBuilder(name + "_door")
//                            .inputItems(new ItemStack(entry.planks, 6))
//                            .outputItems(new ItemStack(entry.door, 3))
//                            .circuitMeta(6)
//                            .duration(600).EUt(4)
//                            .save(provider);
//                }
//            }

//            // fence
//            if (entry.fence != null) {
//                final boolean hasFenceRecipe = entry.fenceRecipeName != null;
//                if (ConfigHolder.INSTANCE.recipes.hardWoodRecipes) {
//
//                    VanillaRecipeHelper.addShapedRecipe(provider, hasFenceRecipe ? entry.fenceRecipeName : name + "_fence", new ItemStack(entry.fence),
//                            "PSP", "PSP", "PSP",
//                            'P', entry.planks,
//                            'S', entry.getStick());
//                } else {
//                    if (!hasFenceRecipe) {
//                        VanillaRecipeHelper.addShapedRecipe(provider, name + "_fence", new ItemStack(entry.fence, 3),
//                                "PSP", "PSP",
//                                'P', entry.planks,
//                                'S', entry.getStick());
//                    }
//                }
//
//                // plank -> fence assembling
//                ASSEMBLER_RECIPES.recipeBuilder(name + "_fence")
//                        .inputItems(entry.planks)
//                        .outputItems(entry.fence)
//                        .circuitMeta(1)
//                        .duration(100).EUt(4)
//                        .save(provider);
//            }
//
//            // fence gate
//            if (entry.fenceGate != null) {
//                final boolean hasFenceGateRecipe = entry.fenceGateRecipeName != null;
//                if (ConfigHolder.INSTANCE.recipes.hardWoodRecipes) {
//
//                    VanillaRecipeHelper.addShapedRecipe(provider, hasFenceGateRecipe ? entry.fenceGateRecipeName : name + "_fence_gate",
//                            new ItemStack(entry.fenceGate),
//                            "F F", "SPS", "SPS",
//                            'P', entry.planks,
//                            'S', entry.getStick(),
//                            'F', Items.FLINT);
//
//                    VanillaRecipeHelper.addShapedRecipe(provider, name + "_fence_gate_screws", new ItemStack(entry.fenceGate, 2),
//                            "IdI", "SPS", "SPS",
//                            'P', entry.planks,
//                            'S', entry.getStick(),
//                            'I', new UnificationEntry(screw, Iron));
//                } else {
//                    if (!hasFenceGateRecipe) {
//                        VanillaRecipeHelper.addShapedRecipe(provider, name + "_fence_gate", new ItemStack(entry.fenceGate),
//                                "SPS", "SPS",
//                                'P', entry.planks,
//                                'S', entry.getStick());
//                    }
//                }
//
//                // plank -> fence gate assembling
//                ASSEMBLER_RECIPES.recipeBuilder(name + "_fence_gate")
//                        .inputItems(new ItemStack(entry.planks, 2))
//                        .inputItems(Tags.Items.RODS_WOODEN, 2)
//                        .outputItems(entry.fenceGate)
//                        .circuitMeta(2)
//                        .duration(100).EUt(4).save(provider);
//            }
//
//            // boat
//            if (entry.boat != null) {
//                final boolean hasBoatRecipe = entry.boatRecipeName != null;
//                if (ConfigHolder.INSTANCE.recipes.hardWoodRecipes) {
//                    if (entry.slab != null) {
//
//                        VanillaRecipeHelper.addShapedRecipe(provider, hasBoatRecipe ? entry.boatRecipeName : name + "_boat", new ItemStack(entry.boat),
//                                "PHP", "PkP", "SSS",
//                                'P', entry.planks,
//                                'S', entry.slab,
//                                'H', ItemTags.SHOVELS);
//                    }
//                } else {
//                    if (!hasBoatRecipe) {
//                        VanillaRecipeHelper.addShapedRecipe(provider, name + "_boat", new ItemStack(entry.boat),
//                                "P P", "PPP",
//                                'P', entry.planks);
//                    }
//                }
//
//                // plank -> boat assembling
//                ASSEMBLER_RECIPES.recipeBuilder(name + "_boat")
//                        .inputItems(new ItemStack(entry.planks, 5))
//                        .outputItems(entry.boat)
//                        .circuitMeta(15)
//                        .duration(100).EUt(4).save(provider);
//            }
        }
    }

    public static void remove(Consumer<ResourceLocation> consumer) {
        consumer.accept(new ResourceLocation("gtceu:shaped/stick_saw"));
        consumer.accept(new ResourceLocation("minecraft:stick_from_bamboo_item"));
        consumer.accept(new ResourceLocation("gtceu:shaped/stick_normal"));

        for (var woodType: Wood.values()) {
            consumer.accept(new ResourceLocation("tfc:crafting/wood/" + woodType.getSerializedName() + "_lumber_log"));
            consumer.accept(new ResourceLocation("tfc:crafting/wood/" + woodType.getSerializedName() + "_lumber_planks"));
            consumer.accept(new ResourceLocation("tfc:crafting/wood/" + woodType.getSerializedName() + "_stairs"));
            consumer.accept(new ResourceLocation("tfc:crafting/wood/" + woodType.getSerializedName() + "_stairs_undo"));
            consumer.accept(new ResourceLocation("tfc:crafting/wood/" + woodType.getSerializedName() + "_slab"));
            consumer.accept(new ResourceLocation("tfc:crafting/wood/" + woodType.getSerializedName() + "_slab_undo"));
        }
    }
}
