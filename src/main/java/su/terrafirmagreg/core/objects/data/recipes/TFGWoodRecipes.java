package su.terrafirmagreg.core.objects.data.recipes;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.wood.Wood;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import su.terrafirmagreg.core.TerraFirmaGreg;
import su.terrafirmagreg.core.objects.data.recipes.builders.create.TFGCuttingRecipeBuilder;
import su.terrafirmagreg.core.objects.data.TFGTags;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
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

            var door = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.DOOR).get().asItem();
            var trapdoor = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.TRAPDOOR).get().asItem();

            var fence = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.FENCE).get().asItem();
            var fenceGate = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.FENCE_GATE).get().asItem();
            var fenceLog = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.LOG_FENCE).get().asItem();

            var boat = TFCItems.BOATS.get(woodType).get();

            var pressurePlate = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.PRESSURE_PLATE).get().asItem();
            var button = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.BUTTON).get().asItem();

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

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_stairs_saw"),
                    new ItemStack(stairs, 1),
                    "s", "P", 'P', planks);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_stairs"))
                    .inputItems(planks)
                    .circuitMeta(0)
                    .outputItems(stairs)
                    .outputItems(dustSmall, GTMaterials.Wood)
                    .duration(200).EUt(VA[ULV])
                    .save(provider);

            // =========================== Slabs =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_slab_saw"), new ItemStack(slab, 2),
                    "sP", 'P', planks);

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_slab"), new ItemStack(slab, 1),
                    "LL", 'L', lumber);

            CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_slab"))
                    .inputItems(planks)
                    .circuitMeta(1)
                    .outputItems(slab, 2)
                    .duration(200).EUt(VA[ULV])
                    .save(provider);

            // =========================== Fence =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_fence"), new ItemStack(fence, 4),
                    "s  ", "PLP", "PLP",
                    'P', planks, 'L', lumber);

            ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_fence"))
                    .inputItems(planks)
                    .circuitMeta(1)
                    .outputItems(fence)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Fence Log =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_fence_log"), new ItemStack(fenceLog, 4),
                    "s  ", "PLP", "PLP",
                    'P', allLogs, 'L', lumber);

            ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_fence_log"))
                    .inputItems(allLogs)
                    .circuitMeta(1)
                    .outputItems(fenceLog)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Fence Gate =========================== //

            ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_fence_gate"))
                    .inputItems(planks, 2)
                    .inputItems(lumber, 2)
                    .circuitMeta(2)
                    .outputItems(fenceGate, 2)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Door =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_door"),
                new ItemStack(door),
                "LTd", "LRS", "LLs",
                'L', lumber,
                'T', trapdoor,
                'R', new UnificationEntry(ring, GTMaterials.WroughtIron),
                'S', new UnificationEntry(screw, GTMaterials.WroughtIron));

            ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_door"))
                    .inputItems(trapdoor)
                    .inputItems(new ItemStack(lumber, 4))
                    .inputFluids(GTMaterials.Iron.getFluid(L / 9))
                    .outputItems(door)
                    .duration(400).EUt(4).save(provider);

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


            // =========================== Boat =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_boat"), new ItemStack(boat),
                    "PHP", "PkP", "SSS",
                    'P', planks,
                    'S', slab,
                    'H', ItemTags.SHOVELS);

            // =========================== Pressure Plate =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_pressure_plate"), new ItemStack(pressurePlate, 2),
                    "SrS", "LCL", "SdS",
                    'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood),
                    'L', slab,
                    'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron)
            );

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_pressure_plate"))
                    .inputItems(TagPrefix.spring, GTMaterials.Iron)
                    .inputItems(slab, 2)
                    .outputItems(pressurePlate, 2)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Button =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TerraFirmaGreg.id(woodName + "_button"), new ItemStack(button, 6),
                    "sP",
                    'P', pressurePlate);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TerraFirmaGreg.id(woodName + "_button"))
                    .inputItems(pressurePlate)
                    .outputItems(button, 12)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

        }
    }

    public static void remove(Consumer<ResourceLocation> consumer) {
        consumer.accept(id("gtceu:shaped/stick_saw"));
        consumer.accept(id("minecraft:stick_from_bamboo_item"));
        consumer.accept(id("gtceu:shaped/stick_normal"));

        // Doors
//        consumer.accept(id("minecraft:oak_door"));
//        consumer.accept(id("minecraft:spruce_door"));
//        consumer.accept(id("minecraft:birch_door"));
//        consumer.accept(id("minecraft:jungle_door"));
//        consumer.accept(id("minecraft:acacia_door"));
//        consumer.accept(id("minecraft:dark_oak_door"));
//        consumer.accept(id("minecraft:mangrove_door"));
//        consumer.accept(id("minecraft:cherry_door"));
//        consumer.accept(id("minecraft:bamboo_door"));

        // Trapdoors
//        consumer.accept(id("minecraft:oak_trapdoor"));
//        consumer.accept(id("minecraft:spruce_trapdoor"));
//        consumer.accept(id("minecraft:birch_trapdoor"));
//        consumer.accept(id("minecraft:jungle_trapdoor"));
//        consumer.accept(id("minecraft:acacia_trapdoor"));
//        consumer.accept(id("minecraft:dark_oak_trapdoor"));
//        consumer.accept(id("minecraft:mangrove_trapdoor"));
//        consumer.accept(id("minecraft:cherry_trapdoor"));
//        consumer.accept(id("minecraft:bamboo_trapdoor"));

        for (var woodType: Wood.values()) {
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_lumber_log"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_lumber_planks"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_stairs"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_stairs_undo"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_slab"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_slab_undo"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_door"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_fence"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_log_fence"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_boat"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_pressure_plate"));
            consumer.accept(id("tfc:crafting/wood/" + woodType.getSerializedName() + "_button"));
        }
    }

    private static ResourceLocation id(String id) {
        return new ResourceLocation(id);
    }
}
