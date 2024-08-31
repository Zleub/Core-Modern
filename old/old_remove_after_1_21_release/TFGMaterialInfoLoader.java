//package su.terrafirmagreg.core.old_remove_after_1_21_release;
//
//import com.alekiponi.firmaciv.common.block.FirmacivBlocks;
//import com.alekiponi.firmaciv.common.item.FirmacivItems;
//import com.eerussianguy.firmalife.common.blocks.FLBlocks;
//import com.eerussianguy.firmalife.common.blocks.greenhouse.Greenhouse;
//import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
//import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
//import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
//import com.gregtechceu.gtceu.common.data.GTMachines;
//import com.gregtechceu.gtceu.common.data.GTMaterials;
//import net.dries007.tfc.common.blocks.TFCBlocks;
//import net.dries007.tfc.common.blocks.wood.Wood;
//import net.dries007.tfc.common.items.Food;
//import net.dries007.tfc.common.items.TFCItems;
//import net.dries007.tfc.util.Metal;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.level.ItemLike;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraftforge.registries.ForgeRegistries;
//import su.terrafirmagreg.core.TFGCore;
//import su.terrafirmagreg.core.old_remove_after_1_21_release.GreenhouseWrapper;
//import tfcastikorcarts.common.items.AstikorItems;
//
//import static com.gregtechceu.gtceu.api.GTValues.M;
//
//public final class TFGMaterialInfoLoader {
//
//    public static void init() {
//
//        /// ============================ GTM Hulls ============================ ///
//
//        // Исправление бага с хуллами
//        // Если они передаются как блоки, то после не могут быть использованы нормально в методах унификации GTCEu
//
//        removeMaterialInfo(GTMachines.HULL[0].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[0].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.WroughtIron, M * 8),
//                new MaterialStack(GTMaterials.RedAlloy, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2))
//        );
//
//        removeMaterialInfo(GTMachines.HULL[1].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[1].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.RedSteel, M),
//                new MaterialStack(GTMaterials.BlueSteel, M),
//                new MaterialStack(GTMaterials.Tin, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[2].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[2].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.Aluminium, M * 8),
//                new MaterialStack(GTMaterials.Copper, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[3].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[3].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.StainlessSteel, M * 8),
//                new MaterialStack(GTMaterials.Gold, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[4].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[4].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.Titanium, M * 8),
//                new MaterialStack(GTMaterials.Aluminium, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[5].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[5].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.TungstenSteel, M * 8),
//                new MaterialStack(GTMaterials.Platinum, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[6].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[6].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.RhodiumPlatedPalladium, M * 8),
//                new MaterialStack(GTMaterials.NiobiumTitanium, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[7].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[7].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.NaquadahAlloy, M * 8),
//                new MaterialStack(GTMaterials.VanadiumGallium, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[8].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[8].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.Darmstadtium, M * 8),
//                new MaterialStack(GTMaterials.YttriumBariumCuprate, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        removeMaterialInfo(GTMachines.HULL[9].getBlock());
//        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[9].getItem().asItem(), new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.Neutronium, M * 8),
//                new MaterialStack(GTMaterials.Europium, M),
//                new MaterialStack(GTMaterials.Rubber, M * 2)));
//
//        /// ============================ Дерево ============================ ///
//
//        // Доски
//        removeMaterialInfo(Blocks.ACACIA_PLANKS);
//        removeMaterialInfo(Blocks.BIRCH_PLANKS);
//        removeMaterialInfo(Blocks.JUNGLE_PLANKS);
//        removeMaterialInfo(Blocks.OAK_PLANKS);
//        removeMaterialInfo(Blocks.SPRUCE_PLANKS);
//        removeMaterialInfo(Blocks.DARK_OAK_PLANKS);
//        removeMaterialInfo(Blocks.MANGROVE_PLANKS);
//        removeMaterialInfo(Blocks.CRIMSON_PLANKS);
//        removeMaterialInfo(Blocks.WARPED_PLANKS);
//        removeMaterialInfo(Blocks.BAMBOO_PLANKS);
//        removeMaterialInfo(Blocks.CHERRY_PLANKS);
//
//        // Ступени
//        removeMaterialInfo(Blocks.OAK_STAIRS);
//        removeMaterialInfo(Blocks.BIRCH_STAIRS);
//        removeMaterialInfo(Blocks.SPRUCE_STAIRS);
//        removeMaterialInfo(Blocks.JUNGLE_STAIRS);
//        removeMaterialInfo(Blocks.DARK_OAK_STAIRS);
//        removeMaterialInfo(Blocks.ACACIA_STAIRS);
//        removeMaterialInfo(Blocks.MANGROVE_STAIRS);
//        removeMaterialInfo(Blocks.CRIMSON_STAIRS);
//        removeMaterialInfo(Blocks.WARPED_STAIRS);
//        removeMaterialInfo(Blocks.BAMBOO_STAIRS);
//        removeMaterialInfo(Blocks.BAMBOO_MOSAIC_STAIRS);
//        removeMaterialInfo(Blocks.CHERRY_STAIRS);
//
//        // Полублоки
//        removeMaterialInfo(Blocks.OAK_SLAB);
//        removeMaterialInfo(Blocks.BIRCH_SLAB);
//        removeMaterialInfo(Blocks.SPRUCE_SLAB);
//        removeMaterialInfo(Blocks.JUNGLE_SLAB);
//        removeMaterialInfo(Blocks.DARK_OAK_SLAB);
//        removeMaterialInfo(Blocks.ACACIA_SLAB);
//        removeMaterialInfo(Blocks.MANGROVE_SLAB);
//        removeMaterialInfo(Blocks.CRIMSON_SLAB);
//        removeMaterialInfo(Blocks.WARPED_SLAB);
//        removeMaterialInfo(Blocks.BAMBOO_SLAB);
//        removeMaterialInfo(Blocks.BAMBOO_MOSAIC_SLAB);
//        removeMaterialInfo(Blocks.CHERRY_SLAB);
//
//        // Заборы
//        removeMaterialInfo(Blocks.OAK_FENCE);
//        removeMaterialInfo(Blocks.BIRCH_FENCE);
//        removeMaterialInfo(Blocks.SPRUCE_FENCE);
//        removeMaterialInfo(Blocks.JUNGLE_FENCE);
//        removeMaterialInfo(Blocks.DARK_OAK_FENCE);
//        removeMaterialInfo(Blocks.ACACIA_FENCE);
//        removeMaterialInfo(Blocks.MANGROVE_FENCE);
//        removeMaterialInfo(Blocks.CRIMSON_FENCE);
//        removeMaterialInfo(Blocks.WARPED_FENCE);
//        removeMaterialInfo(Blocks.BAMBOO_FENCE);
//        removeMaterialInfo(Blocks.CHERRY_FENCE);
//
//        // Калитки
//        removeMaterialInfo(Blocks.OAK_FENCE_GATE);
//        removeMaterialInfo(Blocks.BIRCH_FENCE_GATE);
//        removeMaterialInfo(Blocks.SPRUCE_FENCE_GATE);
//        removeMaterialInfo(Blocks.JUNGLE_FENCE_GATE);
//        removeMaterialInfo(Blocks.DARK_OAK_FENCE_GATE);
//        removeMaterialInfo(Blocks.ACACIA_FENCE_GATE);
//        removeMaterialInfo(Blocks.MANGROVE_FENCE_GATE);
//        removeMaterialInfo(Blocks.CRIMSON_FENCE_GATE);
//        removeMaterialInfo(Blocks.WARPED_FENCE_GATE);
//        removeMaterialInfo(Blocks.BAMBOO_FENCE_GATE);
//        removeMaterialInfo(Blocks.CHERRY_FENCE_GATE);
//
//        // Двери
//        removeMaterialInfo(Items.ACACIA_DOOR);
//        removeMaterialInfo(Items.BIRCH_DOOR);
//        removeMaterialInfo(Items.JUNGLE_DOOR);
//        removeMaterialInfo(Items.OAK_DOOR);
//        removeMaterialInfo(Items.SPRUCE_DOOR);
//        removeMaterialInfo(Items.DARK_OAK_DOOR);
//        removeMaterialInfo(Items.MANGROVE_DOOR);
//        removeMaterialInfo(Items.CRIMSON_DOOR);
//        removeMaterialInfo(Items.WARPED_DOOR);
//        removeMaterialInfo(Items.BAMBOO_DOOR);
//        removeMaterialInfo(Items.CHERRY_DOOR);
//
//        // Кнопки
//        removeMaterialInfo(Blocks.OAK_BUTTON);
//        removeMaterialInfo(Blocks.BIRCH_BUTTON);
//        removeMaterialInfo(Blocks.SPRUCE_BUTTON);
//        removeMaterialInfo(Blocks.JUNGLE_BUTTON);
//        removeMaterialInfo(Blocks.DARK_OAK_BUTTON);
//        removeMaterialInfo(Blocks.ACACIA_BUTTON);
//        removeMaterialInfo(Blocks.MANGROVE_BUTTON);
//        removeMaterialInfo(Blocks.CRIMSON_BUTTON);
//        removeMaterialInfo(Blocks.WARPED_BUTTON);
//        removeMaterialInfo(Blocks.BAMBOO_BUTTON);
//        removeMaterialInfo(Blocks.CHERRY_BUTTON);
//
//        // Лодки
//        removeMaterialInfo(Items.OAK_BOAT);
//        removeMaterialInfo(Items.BIRCH_BOAT);
//        removeMaterialInfo(Items.SPRUCE_BOAT);
//        removeMaterialInfo(Items.JUNGLE_BOAT);
//        removeMaterialInfo(Items.DARK_OAK_BOAT);
//        removeMaterialInfo(Items.ACACIA_BOAT);
//        removeMaterialInfo(Items.MANGROVE_BOAT);
//        removeMaterialInfo(Items.BAMBOO_RAFT);
//        removeMaterialInfo(Items.CHERRY_BOAT);
//
//        // Сундуки
//        removeMaterialInfo(Blocks.CHEST);
//        removeMaterialInfo(Blocks.TRAPPED_CHEST);
//
//        // Верстаки
//        removeMaterialInfo(Blocks.CRAFTING_TABLE);
//
//        // Добавления для всех типов TFC
//        for (var wood : Wood.values()) {
//            var woodName = wood.getSerializedName();
//
//            var planks = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.PLANKS).get().asItem();
//            var bookshelf = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.BOOKSHELF).get().asItem();
//            var door = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.DOOR).get().asItem();
//            var trapdoor = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.TRAPDOOR).get().asItem();
//            var fence = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.FENCE).get().asItem();
//            var logFence = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.LOG_FENCE).get().asItem();
//            var fenceGate = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.FENCE_GATE).get().asItem();
//            var button = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.BUTTON).get().asItem();
//            var pressurePlate = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.PRESSURE_PLATE).get().asItem();
//            var slab = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.SLAB).get().asItem();
//            var stair = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.STAIRS).get().asItem();
//            var toolRack = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.TOOL_RACK).get().asItem();
//            var twig = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.TWIG).get().asItem();
//            var workbench = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.WORKBENCH).get().asItem();
//            var chest = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.CHEST).get().asItem();
//            var trappedChest = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.TRAPPED_CHEST).get().asItem();
//            var loom = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.LOOM).get().asItem();
//            var sluice = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.SLUICE).get().asItem();
//            var barrel = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.BARREL).get().asItem();
//            var lectern = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.LECTERN).get().asItem();
//            var scribingTable = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.SCRIBING_TABLE).get().asItem();
//            var sewingTable = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.SEWING_TABLE).get().asItem();
//            var jarShelf = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.JAR_SHELF).get().asItem();
//            var axle = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.AXLE).get().asItem();
//            var bladedAxle = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.BLADED_AXLE).get().asItem();
//            var encasedAxle = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.ENCASED_AXLE).get().asItem();
//            var clutch = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.CLUTCH).get().asItem();
//            var gearBox = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.GEAR_BOX).get().asItem();
//            var waterWheel = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.WATER_WHEEL).get().asItem();
//            var support = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.HORIZONTAL_SUPPORT).get().asItem();
//            var sign = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.SIGN).get().asItem();
//            var sapling = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.SAPLING).get().asItem();
//            var leaves = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.LEAVES).get().asItem();
//            var fallenLeaves = TFCBlocks.WOODS.get(wood).get(Wood.BlockType.FALLEN_LEAVES).get().asItem();
//
//            var copperSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.COPPER).get().asItem();
//            var bismuthBronzeSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.BISMUTH_BRONZE).get().asItem();
//            var bronzeSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.BRONZE).get().asItem();
//            var blackBronzeSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.BLACK_BRONZE).get().asItem();
//            var wroughtIronSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.WROUGHT_IRON).get().asItem();
//            var steelSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.STEEL).get().asItem();
//            var blackSteelSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.BLACK_STEEL).get().asItem();
//            var redSteelSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.RED_STEEL).get().asItem();
//            var blueSteelSign = TFCBlocks.CEILING_HANGING_SIGNS.get(wood).get(Metal.Default.BLUE_STEEL).get().asItem();
//
//            var lumber = TFCItems.LUMBER.get(wood).get();
//            var boat = TFCItems.BOATS.get(wood).get();
//            var chestMinecart = TFCItems.CHEST_MINECARTS.get(wood).get();
//
//            ChemicalHelper.registerMaterialInfo(planks, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(bookshelf, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, (M / 4) * 3)));
//            ChemicalHelper.registerMaterialInfo(door, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 2), new MaterialStack(GTMaterials.Iron, M / 9)));
//            ChemicalHelper.registerMaterialInfo(trapdoor, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(fence, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(logFence, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(fenceGate, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(button, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(pressurePlate, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(slab, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(stair, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(toolRack, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(twig, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(workbench, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 2)));
//            ChemicalHelper.registerMaterialInfo(chest, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 8)));
//            ChemicalHelper.registerMaterialInfo(trappedChest, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 8), new MaterialStack(GTMaterials.Iron, M / 2)));
//            ChemicalHelper.registerMaterialInfo(loom, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(sluice, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(barrel, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(lectern, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(scribingTable, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(sewingTable, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(jarShelf, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(axle, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(bladedAxle, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(encasedAxle, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(clutch, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(gearBox, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(waterWheel, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(support, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(sign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(leaves, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M / 9)));
//            ChemicalHelper.registerMaterialInfo(fallenLeaves, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M / 9)));
//            ChemicalHelper.registerMaterialInfo(sapling, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M / 4)));
//
//            ChemicalHelper.registerMaterialInfo(copperSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(bismuthBronzeSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(bronzeSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(blackBronzeSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(wroughtIronSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(steelSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(blackSteelSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(redSteelSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(blueSteelSign, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//
//            ChemicalHelper.registerMaterialInfo(lumber, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M / 4)));
//            ChemicalHelper.registerMaterialInfo(boat, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            ChemicalHelper.registerMaterialInfo(chestMinecart, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//
//            if (TFGCore.IsFirmaLifeLoaded()) {
//                var foodShelf = FLBlocks.FOOD_SHELVES.get(wood).get().asItem();
//                var hanger = FLBlocks.HANGERS.get(wood).get().asItem();
//                var jarbnet = FLBlocks.JARBNETS.get(wood).get().asItem();
//
//                ChemicalHelper.registerMaterialInfo(foodShelf, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//                ChemicalHelper.registerMaterialInfo(hanger, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//                ChemicalHelper.registerMaterialInfo(jarbnet, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            }
//
//            if (TFGCore.IsSteamAndRailsLoaded()) {
//                var narrowTrack = ForgeRegistries.ITEMS.getValue(new ResourceLocation("railways:track_tfc_" + woodName + "_narrow"));
//                var normalTrack = ForgeRegistries.ITEMS.getValue(new ResourceLocation("railways:track_tfc_" + woodName));
//                var wideTrack = ForgeRegistries.ITEMS.getValue(new ResourceLocation("railways:track_tfc_" + woodName + "_wide"));
//
//                if (narrowTrack == null || normalTrack == null || wideTrack == null) {
//                    TFGCore.LOGGER.error("Error when adding custom track recipes, report to author git pls.");
//                    continue;
//                }
//
//                ChemicalHelper.registerMaterialInfo(narrowTrack, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//                ChemicalHelper.registerMaterialInfo(normalTrack, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//                ChemicalHelper.registerMaterialInfo(wideTrack, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//            }
//
//            if (TFGCore.IsAstikorCartsLoaded()) {
//                var cartWheel = AstikorItems.WHEEL_TFC.get(wood).get().asItem();
//                var plow = AstikorItems.PLOW_TFC.get(wood).get().asItem();
//                var animalCart = AstikorItems.ANIMAL_CART_TFC.get(wood).get().asItem();
//                var supplyCart = AstikorItems.SUPPLY_CART_TFC.get(wood).get().asItem();
//
//                ChemicalHelper.registerMaterialInfo(cartWheel, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//                ChemicalHelper.registerMaterialInfo(plow, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//                ChemicalHelper.registerMaterialInfo(animalCart, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//                ChemicalHelper.registerMaterialInfo(supplyCart, new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
//
//            }
//        }
//
//        /// ============================ Камень ============================ ///
//
//        // Каменные ступени
//        removeMaterialInfo(Blocks.STONE_STAIRS);
//        removeMaterialInfo(Blocks.SANDSTONE_STAIRS);
//        removeMaterialInfo(Blocks.RED_SANDSTONE_STAIRS);
//        removeMaterialInfo(Blocks.STONE_BRICK_STAIRS);
//
//        // Каменные полублоки
//        removeMaterialInfo(Blocks.STONE_SLAB);
//        removeMaterialInfo(Blocks.SANDSTONE_SLAB);
//        removeMaterialInfo(Blocks.RED_SANDSTONE_SLAB);
//        removeMaterialInfo(Blocks.COBBLESTONE_SLAB);
//        removeMaterialInfo(Blocks.BRICK_SLAB);
//        removeMaterialInfo(Blocks.STONE_BRICK_SLAB);
//
//        // Каменная кнопка
//        removeMaterialInfo(Blocks.STONE_BUTTON);
//
//        // Нажимные плиты
//        removeMaterialInfo(Blocks.STONE_PRESSURE_PLATE);
//
//        /// ============================ Ванильная броня ============================ ///
//
//        removeMaterialInfo(Items.CHAINMAIL_HELMET);
//        removeMaterialInfo(Items.CHAINMAIL_CHESTPLATE);
//        removeMaterialInfo(Items.CHAINMAIL_LEGGINGS);
//        removeMaterialInfo(Items.CHAINMAIL_BOOTS);
//
//        removeMaterialInfo(Items.IRON_HELMET);
//        removeMaterialInfo(Items.IRON_CHESTPLATE);
//        removeMaterialInfo(Items.IRON_LEGGINGS);
//        removeMaterialInfo(Items.IRON_BOOTS);
//        removeMaterialInfo(Items.IRON_HORSE_ARMOR);
//
//        removeMaterialInfo(Items.GOLDEN_HELMET);
//        removeMaterialInfo(Items.GOLDEN_CHESTPLATE);
//        removeMaterialInfo(Items.GOLDEN_LEGGINGS);
//        removeMaterialInfo(Items.GOLDEN_BOOTS);
//        removeMaterialInfo(Items.GOLDEN_HORSE_ARMOR);
//
//        removeMaterialInfo(Items.DIAMOND_HELMET);
//        removeMaterialInfo(Items.DIAMOND_CHESTPLATE);
//        removeMaterialInfo(Items.DIAMOND_LEGGINGS);
//        removeMaterialInfo(Items.DIAMOND_BOOTS);
//        removeMaterialInfo(Items.DIAMOND_HORSE_ARMOR);
//
//        /// ============================ Ванильные инструменты ============================ ///
//
//        removeMaterialInfo(Items.WOODEN_SHOVEL);
//        removeMaterialInfo(Items.WOODEN_PICKAXE);
//        removeMaterialInfo(Items.WOODEN_AXE);
//        removeMaterialInfo(Items.WOODEN_HOE);
//        removeMaterialInfo(Items.WOODEN_SWORD);
//
//        removeMaterialInfo(Items.STONE_SHOVEL);
//        removeMaterialInfo(Items.STONE_PICKAXE);
//        removeMaterialInfo(Items.STONE_AXE);
//        removeMaterialInfo(Items.STONE_HOE);
//        removeMaterialInfo(Items.STONE_SWORD);
//
//        removeMaterialInfo(Items.IRON_SHOVEL);
//        removeMaterialInfo(Items.IRON_PICKAXE);
//        removeMaterialInfo(Items.IRON_AXE);
//        removeMaterialInfo(Items.IRON_SWORD);
//        removeMaterialInfo(Items.IRON_HOE);
//
//        removeMaterialInfo(Items.GOLDEN_SHOVEL);
//        removeMaterialInfo(Items.GOLDEN_PICKAXE);
//        removeMaterialInfo(Items.GOLDEN_AXE);
//        removeMaterialInfo(Items.GOLDEN_SWORD);
//        removeMaterialInfo(Items.GOLDEN_HOE);
//
//        removeMaterialInfo(Items.DIAMOND_SHOVEL);
//        removeMaterialInfo(Items.DIAMOND_PICKAXE);
//        removeMaterialInfo(Items.DIAMOND_AXE);
//        removeMaterialInfo(Items.DIAMOND_SWORD);
//        removeMaterialInfo(Items.DIAMOND_HOE);
//
//        /// ============================ Металл ============================ ///
//
//        ChemicalHelper.registerMaterialInfo(Items.IRON_DOOR, new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M)));
//
//        ChemicalHelper.registerMaterialInfo(Items.BUCKET, new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.RedSteel, M),
//                new MaterialStack(GTMaterials.BlueSteel, M)));
//
//        ChemicalHelper.registerMaterialInfo(TFCItems.BRASS_MECHANISMS.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Brass, M / 2)));
//        ChemicalHelper.registerMaterialInfo(TFCBlocks.GRILL.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M * 2)));
//
//        if (TFGCore.IsFirmaLifeLoaded()) {
//            for (var type : GreenhouseWrapper.values()) {
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.DOOR).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M),
//                        new MaterialStack(GTMaterials.Glass, M)
//                ));
//
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PANEL_ROOF).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M / 2),
//                        new MaterialStack(GTMaterials.Glass, M / 3)
//                ));
//
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PANEL_WALL).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M / 2),
//                        new MaterialStack(GTMaterials.Glass, M / 3)
//                ));
//
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PORT).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M / 8),
//                        new MaterialStack(GTMaterials.Glass, M / 2),
//                        new MaterialStack(GTMaterials.Copper, M / 8)
//                ));
//
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.ROOF).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M / 3),
//                        new MaterialStack(GTMaterials.Glass, M / 3)
//                ));
//
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.ROOF_TOP).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M / 6),
//                        new MaterialStack(GTMaterials.Glass, M / 3)
//                ));
//
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.TRAPDOOR).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M / 6),
//                        new MaterialStack(GTMaterials.Glass, M / 2)
//                ));
//
//                ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.WALL).get().asItem(), new ItemMaterialInfo(
//                        new MaterialStack(type.getMaterial(), M / 2),
//                        new MaterialStack(GTMaterials.Glass, M / 3)
//                ));
//            }
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.COPPER_PIPE.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Copper, M / 8)));
//        }
//
//        if (TFGCore.IsFirmaCivLoaded()) {
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.SEXTANT.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Brass, M * 2), new MaterialStack(GTMaterials.Glass, M)));
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.UNFINISHED_SEXTANT.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Brass, M * 2)));
//
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.NAV_CLOCK.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Brass, M * 4), new MaterialStack(GTMaterials.Glass, M * 2)));
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.UNFINISHED_NAV_CLOCK.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Brass, M * 4)));
//
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.BAROMETER.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Brass, M * 2), new MaterialStack(GTMaterials.Glass, M)));
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.UNFINISHED_BAROMETER.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Brass, M * 2)));
//
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.FIRMACIV_COMPASS.get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M / 9), new MaterialStack(GTMaterials.Glass, M / 9)));
//            ChemicalHelper.registerMaterialInfo(FirmacivBlocks.OARLOCK.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M * 2)));
//            ChemicalHelper.registerMaterialInfo(FirmacivBlocks.CLEAT.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, M * 2)));
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.ANCHOR.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, M * 4)));
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.CANNON.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M * 13)));
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.CANNON_BARREL.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M * 4)));
//            ChemicalHelper.registerMaterialInfo(FirmacivItems.CANNONBALL.get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M * 2)));
//        }
//
//        removeMaterialInfo(Items.CHEST_MINECART);
//        removeMaterialInfo(Blocks.ANVIL);
//        removeMaterialInfo(Blocks.CHIPPED_ANVIL);
//        removeMaterialInfo(Blocks.DAMAGED_ANVIL);
//        removeMaterialInfo(Items.COMPASS);
//
//        /// ============================ Другое ============================ ///
//
//        removeMaterialInfo(Items.WHEAT);
//        ChemicalHelper.registerMaterialInfo(TFCItems.FOOD.get(Food.WHEAT).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M * 2)));
//
//        removeMaterialInfo(Blocks.FURNACE);
//        removeMaterialInfo(Blocks.STONE_BRICKS);
//        removeMaterialInfo(Blocks.COBBLESTONE);
//        removeMaterialInfo(Blocks.MOSSY_COBBLESTONE);
//    }
//
//    private static void removeMaterialInfo(ItemLike itemLike) {
//        var a = ChemicalHelper.ITEM_MATERIAL_INFO.remove(itemLike);
//        if (a == null) {
//            TFGCore.LOGGER.warn("Не произведено удаление унификации: {}", itemLike.asItem());
//        }
//    }
//
//}