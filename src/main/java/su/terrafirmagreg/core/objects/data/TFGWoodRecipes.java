package su.terrafirmagreg.core.objects.data;

import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.wood.Wood;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import su.terrafirmagreg.core.TerraFirmaGreg;

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

            var log = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.LOG).get().asItem();
            var strippedLog = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.STRIPPED_LOG).get().asItem();

            var wood = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.WOOD).get().asItem();
            var strippedWood = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.STRIPPED_WOOD).get().asItem();

            var planks = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.PLANKS).get().asItem();
            var stairs = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.STAIRS).get().asItem();
            var slab = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.SLAB).get().asItem();

            // Lumber
            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_lumber_from_log"))
                    .inputItems(TFGTags.Items.createItemTag("tfc:" + woodName + "_logs"))
                    .outputItems(new ItemStack(lumber, 6))
                    .outputItems(dust, GTMaterials.Wood, 2)
                    .circuitMeta(1)
                    .duration(200)
                    .EUt(VA[ULV])
                    .save(provider);

            // +++ Разборка стеирсов, слаба, пленкса

            // Stripped Log
            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id("stripped_" + woodName + "_log"))
                    .inputItems(log)
                    .circuitMeta(2)
                    .outputItems(strippedLog)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // Stripped Wood
            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id("stripped_" + woodName + "_wood"))
                    .inputItems(wood)
                    .circuitMeta(1)
                    .outputItems(strippedWood)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // Planks
            ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_planks"))
                    .inputItems(new ItemStack(lumber, 4))
                    .outputItems(planks)
                    .circuitMeta(6)
                    .EUt(1).duration(100).save(provider);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_planks"))
                    .inputItems(log)
                    .outputItems(new ItemStack(planks, 6))
                    .outputItems(dust, GTMaterials.Wood, 2)
                    .duration(200)
                    .EUt(VA[ULV])
                    .save(provider);

            // Stairs
            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_stairs"),
                    new ItemStack(stairs, 4),
                    "P  ", "PP ", "PPP", 'P', planks);

            ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_stairs"))
                    .inputItems(new ItemStack(planks, 6))
                    .outputItems(new ItemStack(stairs, 4))
                    .circuitMeta(7)
                    .EUt(1).duration(100).save(provider);

            // Slabs
            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_slab_saw"), new ItemStack(slab, 2),
                    "sS", 'S', planks);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_slab"))
                    .inputItems(planks)
                    .outputItems(new ItemStack(slab, 2))
                    .duration(200).EUt(VA[ULV])
                    .save(provider);

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
}
