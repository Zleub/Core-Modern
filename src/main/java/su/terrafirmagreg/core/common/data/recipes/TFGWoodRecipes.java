package su.terrafirmagreg.core.common.data.recipes;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.wood.Wood;
import net.dries007.tfc.common.items.TFCItems;
import net.dries007.tfc.util.Metal;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;
import su.terrafirmagreg.core.TFGCore;
import su.terrafirmagreg.core.common.data.TFGTags;
import su.terrafirmagreg.core.common.data.recipes.builders.create.TFGCuttingRecipeBuilder;

import java.util.Set;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.ULV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CUTTER_RECIPES;

public final class TFGWoodRecipes {

    private static final Set<String> VanillaOverworldWoods = Set.of(
            "oak", "spruce", "birch",
            "jungle", "acacia", "dark_oak",
            "mangrove", "cherry"
    );

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

            var workbench = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.WORKBENCH).get().asItem();
            var chest = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.CHEST).get().asItem();
            var chestTrapped = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.TRAPPED_CHEST).get().asItem();

            var axle = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.AXLE).get().asItem();
            var axleBladed = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.BLADED_AXLE).get().asItem();

            var chestMinecart = TFCItems.CHEST_MINECARTS.get(woodType).get();

            var support = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.VERTICAL_SUPPORT).get().asItem();

            var clutch = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.CLUTCH).get().asItem();
            var gearBox = TFCBlocks.WOODS.get(woodType).get(Wood.BlockType.GEAR_BOX).get().asItem();

            var copperSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.COPPER).get().asItem();
            var bismuthBronzeSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.BISMUTH_BRONZE).get().asItem();
            var bronzeSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.BRONZE).get().asItem();
            var blackBronzeSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.BLACK_BRONZE).get().asItem();
            var wroughtIronSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.WROUGHT_IRON).get().asItem();
            var steelSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.STEEL).get().asItem();
            var blackSteelSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.BLACK_STEEL).get().asItem();
            var redSteelSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.RED_STEEL).get().asItem();
            var blueSteelSign = TFCBlocks.WALL_HANGING_SIGNS.get(woodType).get(Metal.Default.BLUE_STEEL).get().asItem();

            // =========================== Stripped Log =========================== //

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TFGCore.id("stripped_" + woodName + "_log"))
                    .inputItems(log)
                    .circuitMeta(0)
                    .outputItems(strippedLog)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Stripped Wood =========================== //

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TFGCore.id("stripped_" + woodName + "_wood"))
                    .inputItems(wood)
                    .circuitMeta(0)
                    .outputItems(strippedWood)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Planks =========================== //

            ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_planks"))
                    .inputItems(lumber, 4)
                    .outputItems(planks)
                    .circuitMeta(6)
                    .EUt(1).duration(100).save(provider);

            CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_planks"))
                    .inputItems(allLogs)
                    .circuitMeta(1)
                    .outputItems(planks, 6)
                    .outputItems(dust, GTMaterials.Wood, 2)
                    .duration(200)
                    .EUt(VA[ULV])
                    .save(provider);

            // =========================== Stairs =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_stairs_saw"),
                    new ItemStack(stairs, 1),
                    "s", "P", 'P', planks);

            CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_stairs"))
                    .inputItems(planks)
                    .circuitMeta(0)
                    .outputItems(stairs)
                    .outputItems(dustSmall, GTMaterials.Wood)
                    .duration(200).EUt(VA[ULV])
                    .save(provider);

            // =========================== Slabs =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_slab_saw"), new ItemStack(slab, 2),
                    "sP", 'P', planks);

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_slab"), new ItemStack(slab, 1),
                    "LL", 'L', lumber);

            CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_slab"))
                    .inputItems(planks)
                    .circuitMeta(1)
                    .outputItems(slab, 2)
                    .duration(200).EUt(VA[ULV])
                    .save(provider);

            // =========================== Fence =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_fence"), new ItemStack(fence, 4),
                    "s  ", "PLP", "PLP",
                    'P', planks, 'L', lumber);

            ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_fence"))
                    .inputItems(planks)
                    .circuitMeta(1)
                    .outputItems(fence)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Fence Log =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_fence_log"), new ItemStack(fenceLog, 4),
                    "s  ", "PLP", "PLP",
                    'P', allLogs, 'L', lumber);

            ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_fence_log"))
                    .inputItems(allLogs)
                    .circuitMeta(1)
                    .outputItems(fenceLog)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Fence Gate =========================== //

            ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_fence_gate"))
                    .inputItems(planks, 2)
                    .inputItems(lumber, 2)
                    .circuitMeta(2)
                    .outputItems(fenceGate, 2)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Door =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_door"),
                new ItemStack(door),
                "LTd", "LRS", "LLs",
                'L', lumber,
                'T', trapdoor,
                'R', new UnificationEntry(ring, GTMaterials.WroughtIron),
                'S', new UnificationEntry(screw, GTMaterials.WroughtIron));

            ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_door"))
                    .inputItems(trapdoor)
                    .inputItems(new ItemStack(lumber, 4))
                    .inputFluids(GTMaterials.Iron.getFluid(L / 9))
                    .outputItems(door)
                    .duration(400).EUt(4).save(provider);

            // =========================== Lumber =========================== //

            // From Logs
            VanillaRecipeHelper.addShapelessRecipe(provider, TFGCore.id(woodName + "_lumber_from_any_log"),
                    new ItemStack(lumber, 16),
                    's', allLogs);

            new TFGCuttingRecipeBuilder(TFGCore.id(woodName + "_lumber_from_any_log"))
                    .input(allLogs)
                    .duration(50)
                    .output(new ItemStack(lumber, 16))
                    .save(provider);

            CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_lumber_from_any_log"))
                    .inputItems(allLogs)
                    .circuitMeta(2)
                    .outputItems(new ItemStack(lumber, 16))
                    .outputItems(dust, GTMaterials.Wood, 2)
                    .duration(200)
                    .EUt(VA[ULV])
                    .save(provider);

            // From Planks
            VanillaRecipeHelper.addShapelessRecipe(provider, TFGCore.id(woodName + "_lumber_from_planks"),
                    new ItemStack(lumber, 4),
                    's', planks);

            new TFGCuttingRecipeBuilder(TFGCore.id(woodName + "_lumber_from_planks"))
                    .input(planks)
                    .duration(50)
                    .output(new ItemStack(lumber, 4))
                    .save(provider);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_lumber_from_planks"))
                    .inputItems(planks)
                    .circuitMeta(2)
                    .outputItems(lumber, 4)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // From Stairs
            VanillaRecipeHelper.addShapelessRecipe(provider, TFGCore.id(woodName + "_lumber_from_stairs"),
                    new ItemStack(lumber, 3),
                    's', stairs);

            new TFGCuttingRecipeBuilder(TFGCore.id(woodName + "_lumber_from_stairs"))
                    .input(stairs)
                    .duration(50)
                    .output(new ItemStack(lumber, 3))
                    .save(provider);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_lumber_from_stairs"))
                    .inputItems(stairs)
                    .outputItems(lumber, 3)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // From Slabs
            VanillaRecipeHelper.addShapelessRecipe(provider, TFGCore.id(woodName + "_lumber_from_slab"),
                    new ItemStack(lumber, 2),
                    's', slab);

            new TFGCuttingRecipeBuilder(TFGCore.id(woodName + "_lumber_from_slab"))
                    .input(slab)
                    .duration(50)
                    .output(new ItemStack(lumber, 2))
                    .save(provider);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_lumber_from_slab"))
                    .inputItems(slab)
                    .outputItems(lumber, 2)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Boat =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_boat"), new ItemStack(boat),
                    "PHP", "PkP", "SSS",
                    'P', planks,
                    'S', slab,
                    'H', fence);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_boat"))
                    .inputItems(planks, 5)
                    .inputItems(slab, 1)
                    .outputItems(boat)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Pressure Plate =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_pressure_plate"), new ItemStack(pressurePlate, 2),
                    "SrS", "LCL", "SdS",
                    'S', new UnificationEntry(TagPrefix.bolt, GTMaterials.Wood),
                    'L', slab,
                    'C', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron)
            );

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_pressure_plate"))
                    .inputItems(TagPrefix.spring, GTMaterials.Iron)
                    .inputItems(slab, 2)
                    .outputItems(pressurePlate, 2)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Button =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_button"), new ItemStack(button, 6),
                    "sP",
                    'P', pressurePlate);

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_button"))
                    .inputItems(pressurePlate)
                    .outputItems(button, 12)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Workbench =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_workbench"), new ItemStack(workbench),
                    "FF", "LL",
                    'F', new UnificationEntry(gem, GTMaterials.Flint),
                    'L', allLogs
            );

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_workbench"))
                    .inputItems(allLogs)
                    .inputItems(gem, GTMaterials.Flint)
                    .circuitMeta(4)
                    .outputItems(workbench)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Chest =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_chest"), new ItemStack(chest),
                    "LPL", "PFP", "LPL",
                    'F', new UnificationEntry(gem, GTMaterials.Flint),
                    'L', allLogs,
                    'P', lumber
            );

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_chest"))
                    .inputItems(lumber, 16)
                    .circuitMeta(5)
                    .outputItems(chest)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Trapped Chest =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(woodName + "_trapped_chest"),
                    new ItemStack(chestTrapped),
                    " H ", "SCS", " d ",
                    'H', new ItemStack(Blocks.TRIPWIRE_HOOK),
                    'S', new UnificationEntry(TagPrefix.screw, GTMaterials.WroughtIron),
                    'C', chest);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_trapped_chest"))
                    .inputItems(chest)
                    .inputItems(Blocks.TRIPWIRE_HOOK.asItem())
                    .circuitMeta(6)
                    .inputFluids(GTMaterials.Iron.getFluid(L / 9))
                    .outputItems(chestTrapped)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Axle =========================== //

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_axle"))
                    .inputItems(strippedLog, 2)
                    .inputFluids(GTMaterials.Glue.getFluid(144))
                    .circuitMeta(7)
                    .outputItems(axle)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Bladed Axle =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(wood + "_bladed_axle"),
                    new ItemStack(axleBladed),
                    "hAI",
                    'A', axle,
                    'I', ChemicalHelper.get(ingot, GTMaterials.Steel));

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_bladed_axle"))
                    .inputItems(plate, GTMaterials.Steel)
                    .inputItems(axle)
                    .circuitMeta(1)
                    .outputItems(axleBladed)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Clutch =========================== //

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_clutch"))
                    .inputItems(lumber, 4)
                    .inputItems(strippedLog, 2)
                    .inputItems(plate, GTMaterials.Brass)
                    .inputFluids(GTMaterials.Redstone.getFluid(144))
                    .circuitMeta(4)
                    .outputItems(clutch, 2)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Gear Box =========================== //

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_gear_box"))
                    .inputItems(lumber, 4)
                    .inputItems(plate, GTMaterials.Brass)
                    .circuitMeta(5)
                    .outputItems(gearBox, 2)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Chest Mine Cart =========================== //

            VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(wood + "_chest_minecart"),
                    new ItemStack(chestMinecart),
                    "hIw", " M ", " d ",
                    'I', CustomTags.WOODEN_CHESTS,
                    'M', new ItemStack(Items.MINECART));

            // =========================== Bed =========================== //

            GTRecipeTypes.CHEMICAL_BATH_RECIPES.recipeBuilder(TFGCore.id("bed_decolor"))
                .inputItems(TFGTags.Items.createItemTag("tfc:colored_bed"))
                .inputFluids(GTMaterials.Chlorine.getFluid(72))
                .outputItems(Blocks.WHITE_BED.asItem())
                .duration(300)
                .EUt(12)
                .save(provider);


            for (var dye : DyeColor.values()) {
                var bed = getItem(dye.getSerializedName() + "_bed");
                var dyeMaterial = GTMaterials.get(dye.getSerializedName() + "_dye");

                if (bed == null || dyeMaterial == null) {
                    TFGCore.LOGGER.error("Error when adding custom bed recipes, report to author git pls.");
                    continue;
                }

                VanillaRecipeHelper.addShapedRecipe(provider, TFGCore.id(dye.getSerializedName() + "_bed"),
                    new ItemStack(bed),
                    "WWW", "PPP", "FrF",
                    'W', TFGTags.Items.HighQualityCloth,
                    'P', TFGTags.Items.Lumbers,
                    'F', ItemTags.WOODEN_FENCES);

                if (dye != DyeColor.WHITE)
                    GTRecipeTypes.CHEMICAL_BATH_RECIPES.recipeBuilder(TFGCore.id(dye.getSerializedName() + "_bed"))
                    .inputItems(Blocks.WHITE_BED.asItem())
                    .inputFluids(dyeMaterial.getFluid(216))
                    .outputItems(bed)
                    .duration(420)
                    .EUt(24)
                    .save(provider);

            }

            // =========================== Support =========================== //

            GTRecipeTypes.CUTTER_RECIPES.recipeBuilder(TFGCore.id("support_" + woodName))
                    .inputItems(allLogs, 2)
                    .circuitMeta(8)
                    .outputItems(support, 8)
                    .EUt(VA[ULV])
                    .duration(200)
                    .save(provider);

            // =========================== Hanging Metal Signs =========================== //

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_copper_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.Copper.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(copperSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_bismuth_bronze_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.BismuthBronze.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(bismuthBronzeSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_bronze_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.Bronze.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(bronzeSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_black_bronze_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.BlackBronze.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(blackBronzeSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_wrought_iron_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.WroughtIron.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(wroughtIronSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_steel_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.Steel.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(steelSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_black_steel_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.BlackSteel.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(blackSteelSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_red_steel_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.RedSteel.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(redSteelSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_blue_steel_hanging_sign"))
                    .inputItems(lumber, 6)
                    .inputFluids(GTMaterials.BlueSteel.getFluid(6))
                    .circuitMeta(8)
                    .outputItems(blueSteelSign, 3)
                    .duration(100).EUt(VA[ULV]).save(provider);

            // =========================== Tracks =========================== //

            if (TFGCore.IsSteamAndRailsLoaded()) {
                var narrowTrack = getItem("railways:track_tfc_" + woodName + "_narrow");
                var normalTrack = getItem("railways:track_tfc_" + woodName);
                var wideTrack = getItem("railways:track_tfc_" + woodName + "_wide");

                if (narrowTrack == null || normalTrack == null || wideTrack == null) {
                    TFGCore.LOGGER.error("Error when adding custom track recipes, report to author git pls.");
                    continue;
                }

                // Narrow
                GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_track_narrow"))
                        .inputItems(slab)
                        .inputItems(nugget, GTMaterials.Steel, 4)
                        .inputItems(TFGTags.Items.Screws, 4)
                        .outputItems(narrowTrack)
                        .duration(800).EUt(VA[LV]).save(provider);

                // Normal
                GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_track_normal_1"))
                        .inputItems(narrowTrack)
                        .inputItems(slab)
                        .inputItems(nugget, GTMaterials.Steel, 4)
                        .inputItems(TFGTags.Items.Screws, 4)
                        .outputItems(normalTrack)
                        .duration(400).EUt(VA[LV]).save(provider);

                GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_track_normal_2"))
                        .inputItems(slab, 2)
                        .inputItems(nugget, GTMaterials.Steel, 8)
                        .inputItems(TFGTags.Items.Screws, 8)
                        .outputItems(normalTrack)
                        .duration(800).EUt(VA[LV]).save(provider);

                // Wide
                GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_track_wide_1"))
                        .inputItems(narrowTrack)
                        .inputItems(slab, 2)
                        .inputItems(nugget, GTMaterials.Steel, 8)
                        .inputItems(TFGTags.Items.Screws, 8)
                        .outputItems(wideTrack)
                        .duration(600).EUt(VA[LV]).save(provider);

                GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_track_wide_2"))
                        .inputItems(normalTrack)
                        .inputItems(slab)
                        .inputItems(nugget, GTMaterials.Steel, 4)
                        .inputItems(TFGTags.Items.Screws, 4)
                        .outputItems(wideTrack)
                        .duration(400).EUt(VA[LV]).save(provider);


                GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(TFGCore.id(woodName + "_track_wide_3"))
                        .inputItems(slab, 3)
                        .inputItems(nugget, GTMaterials.Steel, 12)
                        .inputItems(TFGTags.Items.Screws, 12)
                        .outputItems(wideTrack)
                        .duration(800).EUt(VA[LV]).save(provider);
            }
        }
    }

    public static void remove(Consumer<ResourceLocation> consumer) {
        consumer.accept(id("gtceu:shaped/stick_saw"));
        consumer.accept(id("minecraft:stick_from_bamboo_item"));
        consumer.accept(id("gtceu:shaped/stick_normal"));

        consumer.accept(id("tfc:crafting/vanilla/crafting_table"));
        consumer.accept(id("gtceu:shaped/crafting_table"));
        consumer.accept(id("gtceu:assembler/crafting_table"));

        consumer.accept(id("gtceu:shaped/chest"));
        consumer.accept(id("gtceu:assembler/chest"));

        consumer.accept(id("gtceu:shaped/trapped_chest"));

        consumer.accept(id("gtceu:shaped/chest_minecart"));
        consumer.accept(id("gtceu:assembler/chest_minecart"));

        consumer.accept(id("tfc:crafting/vanilla/lectern"));

        consumer.accept(id("minecraft:chiseled/bookshelf"));

        consumer.accept(id("gtceu:assembler/bookshelf"));

        for (var dye : DyeColor.values()) {
            consumer.accept(id("tfc:crafting/vanilla/color/" + dye.getName()  + "_bed"));
            consumer.accept(id("gtceu:shaped/" + dye.getName() + "_bed"));
            consumer.accept(id("minecraft:dye_" + dye.getName() + "_bed"));
        }

        for (var woodType : VanillaOverworldWoods) {
            consumer.accept(id("minecraft:" + woodType + "_wood"));
            consumer.accept(id("create:cutting/" + woodType + "_log"));

            consumer.accept(id("minecraft:stripped_" + woodType + "_wood"));
            consumer.accept(id("create:cutting/" + woodType + "_wood"));

            consumer.accept(id("minecraft:" + woodType + "_planks"));
            consumer.accept(id("create:cutting/stripped_" + woodType + "_log"));
            consumer.accept(id("create:cutting/stripped_" + woodType + "_wood"));

            consumer.accept(id("minecraft:" + woodType + "_stairs"));
            consumer.accept(id("gtceu:assembler/" + woodType + "_stairs"));

            consumer.accept(id("minecraft:" + woodType + "_slab"));

            consumer.accept(id("minecraft:" + woodType + "_fence"));
            consumer.accept(id("gtceu:assembler/" + woodType + "_fence"));

            consumer.accept(id("minecraft:" + woodType + "_fence_gate"));
            consumer.accept(id("gtceu:assembler/" + woodType + "_fence_gate"));

            consumer.accept(id("minecraft:" + woodType + "_door"));

            consumer.accept(id("minecraft:" + woodType + "_trapdoor"));

            consumer.accept(id("minecraft:" + woodType + "_pressure_plate"));
            consumer.accept(id("gtceu:shaped/" + woodType + "_pressure_plate"));
            consumer.accept(id("gtceu:assembler/" + woodType + "_pressure_plate"));

            consumer.accept(id("gtceu:shaped/" + woodType + "_button"));
            consumer.accept(id("gtceu:cutter/" + woodType + "_button"));
            consumer.accept(id("gtceu:cutter/" + woodType + "_button_distilled_water"));
            consumer.accept(id("gtceu:cutter/" + woodType + "_button_water"));

            consumer.accept(id("minecraft:" + woodType + "_sign"));
            consumer.accept(id("gtceu:assembler/" + woodType + "_sign"));

            consumer.accept(id("minecraft:" + woodType + "_hanging_sign"));

            consumer.accept(id("minecraft:" + woodType + "_boat"));

            consumer.accept(id("minecraft:" + woodType + "_chest_boat"));
        }

        for (var woodType : Wood.values()) {
            var woodName = woodType.getSerializedName();

            consumer.accept(id("tfc:crafting/wood/" + woodName + "_lumber_log"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_lumber_planks"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_stairs"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_stairs_undo"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_slab"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_slab_undo"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_door"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_fence"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_log_fence"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_boat"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_pressure_plate"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_button"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_workbench"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_chest"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_trapped_chest"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_chest_minecart"));
            consumer.accept(id("tfc:crafting/wood/" + woodName + "_bladed_axle"));
        }
    }

    private static ResourceLocation id(String id) {
        return new ResourceLocation(id);
    }

    @Nullable
    private static Item getItem(String id) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(id));
    }
}
