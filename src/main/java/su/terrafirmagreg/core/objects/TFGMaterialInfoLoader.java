package su.terrafirmagreg.core.objects;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.dries007.tfc.common.blocks.TFCBlocks;
import net.dries007.tfc.common.blocks.wood.Wood;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import su.terrafirmagreg.core.TerraFirmaGreg;

import static com.gregtechceu.gtceu.api.GTValues.M;

public final class TFGMaterialInfoLoader {

    public static boolean isEnabled = false;

    public static void init() {
        if (!isEnabled) return;

        /// ============================ GTM Hulls ============================ ///

        // Исправление бага с хуллами
        // Если они передаются как блоки, то после не могут быть использованы нормально в методах унификации GTCEu

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[0].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.WroughtIron, M * 8),
                new MaterialStack(GTMaterials.RedAlloy, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[1].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.RedSteel, M * 4),
                new MaterialStack(GTMaterials.BlueSteel, M * 4),
                new MaterialStack(GTMaterials.Tin, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[2].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.Aluminium, M * 8),
                new MaterialStack(GTMaterials.Copper, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[3].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.StainlessSteel, M * 8),
                new MaterialStack(GTMaterials.Gold, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[4].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.Titanium, M * 8),
                new MaterialStack(GTMaterials.Aluminium, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[5].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.TungstenSteel, M * 8),
                new MaterialStack(GTMaterials.Platinum, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[6].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.RhodiumPlatedPalladium, M * 8),
                new MaterialStack(GTMaterials.NiobiumTitanium, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[7].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.NaquadahAlloy, M * 8),
                new MaterialStack(GTMaterials.VanadiumGallium, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[8].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.Darmstadtium, M * 8),
                new MaterialStack(GTMaterials.YttriumBariumCuprate, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        ChemicalHelper.registerMaterialInfo(GTMachines.HULL[9].getItem().asItem(), new ItemMaterialInfo(
                new MaterialStack(GTMaterials.Neutronium, M * 8),
                new MaterialStack(GTMaterials.Europium, M),
                new MaterialStack(GTMaterials.Rubber, M * 2)));

        /// ============================ Дерево ============================ ///

        // Доски
        removeMaterialInfo(Blocks.ACACIA_PLANKS);
        removeMaterialInfo(Blocks.BIRCH_PLANKS);
        removeMaterialInfo(Blocks.JUNGLE_PLANKS);
        removeMaterialInfo(Blocks.OAK_PLANKS);
        removeMaterialInfo(Blocks.SPRUCE_PLANKS);
        removeMaterialInfo(Blocks.DARK_OAK_PLANKS);
        removeMaterialInfo(Blocks.MANGROVE_PLANKS);
        removeMaterialInfo(Blocks.CRIMSON_PLANKS);
        removeMaterialInfo(Blocks.WARPED_PLANKS);
        removeMaterialInfo(Blocks.BAMBOO_PLANKS);
        removeMaterialInfo(Blocks.CHERRY_PLANKS);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCBlocks.WOODS.get(wood).get(Wood.BlockType.PLANKS).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
        }

        // Ступени
        removeMaterialInfo(Blocks.OAK_STAIRS);
        removeMaterialInfo(Blocks.BIRCH_STAIRS);
        removeMaterialInfo(Blocks.SPRUCE_STAIRS);
        removeMaterialInfo(Blocks.JUNGLE_STAIRS);
        removeMaterialInfo(Blocks.DARK_OAK_STAIRS);
        removeMaterialInfo(Blocks.ACACIA_STAIRS);
        removeMaterialInfo(Blocks.MANGROVE_STAIRS);
        removeMaterialInfo(Blocks.CRIMSON_STAIRS);
        removeMaterialInfo(Blocks.WARPED_STAIRS);
        removeMaterialInfo(Blocks.BAMBOO_STAIRS);
        removeMaterialInfo(Blocks.BAMBOO_MOSAIC_STAIRS);
        removeMaterialInfo(Blocks.CHERRY_STAIRS);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCBlocks.WOODS.get(wood).get(Wood.BlockType.STAIRS).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, (3 * M) / 2)));
        }

        // Полублоки
        removeMaterialInfo(Blocks.OAK_SLAB);
        removeMaterialInfo(Blocks.BIRCH_SLAB);
        removeMaterialInfo(Blocks.SPRUCE_SLAB);
        removeMaterialInfo(Blocks.JUNGLE_SLAB);
        removeMaterialInfo(Blocks.DARK_OAK_SLAB);
        removeMaterialInfo(Blocks.ACACIA_SLAB);
        removeMaterialInfo(Blocks.MANGROVE_SLAB);
        removeMaterialInfo(Blocks.CRIMSON_SLAB);
        removeMaterialInfo(Blocks.WARPED_SLAB);
        removeMaterialInfo(Blocks.BAMBOO_SLAB);
        removeMaterialInfo(Blocks.BAMBOO_MOSAIC_SLAB);
        removeMaterialInfo(Blocks.CHERRY_SLAB);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCBlocks.WOODS.get(wood).get(Wood.BlockType.SLAB).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M / 2)));
        }

        // Заборы
        removeMaterialInfo(Blocks.OAK_FENCE);
        removeMaterialInfo(Blocks.BIRCH_FENCE);
        removeMaterialInfo(Blocks.SPRUCE_FENCE);
        removeMaterialInfo(Blocks.JUNGLE_FENCE);
        removeMaterialInfo(Blocks.DARK_OAK_FENCE);
        removeMaterialInfo(Blocks.ACACIA_FENCE);
        removeMaterialInfo(Blocks.MANGROVE_FENCE);
        removeMaterialInfo(Blocks.CRIMSON_FENCE);
        removeMaterialInfo(Blocks.WARPED_FENCE);
        removeMaterialInfo(Blocks.BAMBOO_FENCE);
        removeMaterialInfo(Blocks.CHERRY_FENCE);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCBlocks.WOODS.get(wood).get(Wood.BlockType.FENCE).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M)));
        }

        // Калитки
        removeMaterialInfo(Blocks.OAK_FENCE_GATE);
        removeMaterialInfo(Blocks.BIRCH_FENCE_GATE);
        removeMaterialInfo(Blocks.SPRUCE_FENCE_GATE);
        removeMaterialInfo(Blocks.JUNGLE_FENCE_GATE);
        removeMaterialInfo(Blocks.DARK_OAK_FENCE_GATE);
        removeMaterialInfo(Blocks.ACACIA_FENCE_GATE);
        removeMaterialInfo(Blocks.MANGROVE_FENCE_GATE);
        removeMaterialInfo(Blocks.CRIMSON_FENCE_GATE);
        removeMaterialInfo(Blocks.WARPED_FENCE_GATE);
        removeMaterialInfo(Blocks.BAMBOO_FENCE_GATE);
        removeMaterialInfo(Blocks.CHERRY_FENCE_GATE);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCBlocks.WOODS.get(wood).get(Wood.BlockType.FENCE).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 3)));
        }

        // Двери
        removeMaterialInfo(Items.ACACIA_DOOR);
        removeMaterialInfo(Items.BIRCH_DOOR);
        removeMaterialInfo(Items.JUNGLE_DOOR);
        removeMaterialInfo(Items.OAK_DOOR);
        removeMaterialInfo(Items.SPRUCE_DOOR);
        removeMaterialInfo(Items.DARK_OAK_DOOR);
        removeMaterialInfo(Items.MANGROVE_DOOR);
        removeMaterialInfo(Items.CRIMSON_DOOR);
        removeMaterialInfo(Items.WARPED_DOOR);
        removeMaterialInfo(Items.BAMBOO_DOOR);
        removeMaterialInfo(Items.CHERRY_DOOR);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCBlocks.WOODS.get(wood).get(Wood.BlockType.DOOR).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 2), new MaterialStack(GTMaterials.Iron, M / 9)));
        }

        // Кнопки
        removeMaterialInfo(Blocks.OAK_BUTTON);
        removeMaterialInfo(Blocks.BIRCH_BUTTON);
        removeMaterialInfo(Blocks.SPRUCE_BUTTON);
        removeMaterialInfo(Blocks.JUNGLE_BUTTON);
        removeMaterialInfo(Blocks.DARK_OAK_BUTTON);
        removeMaterialInfo(Blocks.ACACIA_BUTTON);
        removeMaterialInfo(Blocks.MANGROVE_BUTTON);
        removeMaterialInfo(Blocks.CRIMSON_BUTTON);
        removeMaterialInfo(Blocks.WARPED_BUTTON);
        removeMaterialInfo(Blocks.BAMBOO_BUTTON);
        removeMaterialInfo(Blocks.CHERRY_BUTTON);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCBlocks.WOODS.get(wood).get(Wood.BlockType.BUTTON).get().asItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M / 9)));
        }

        // Лодки
        removeMaterialInfo(Items.OAK_BOAT);
        removeMaterialInfo(Items.BIRCH_BOAT);
        removeMaterialInfo(Items.SPRUCE_BOAT);
        removeMaterialInfo(Items.JUNGLE_BOAT);
        removeMaterialInfo(Items.DARK_OAK_BOAT);
        removeMaterialInfo(Items.ACACIA_BOAT);
        removeMaterialInfo(Items.MANGROVE_BOAT);
        removeMaterialInfo(Items.BAMBOO_RAFT);
        removeMaterialInfo(Items.CHERRY_BOAT);

        for (var wood : Wood.values()) {
            ChemicalHelper.registerMaterialInfo(TFCItems.BOATS.get(wood).get(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 5)));
        }

        // Сундуки
        removeMaterialInfo(Blocks.CHEST);
        removeMaterialInfo(Blocks.TRAPPED_CHEST);

        // Верстаки
        removeMaterialInfo(Blocks.CRAFTING_TABLE);

        /// ============================ Камень ============================ ///

        // Каменные ступени
        removeMaterialInfo(Blocks.STONE_STAIRS);
        removeMaterialInfo(Blocks.SANDSTONE_STAIRS);
        removeMaterialInfo(Blocks.RED_SANDSTONE_STAIRS);
        removeMaterialInfo(Blocks.STONE_BRICK_STAIRS);
        ChemicalHelper.registerMaterialInfo(Blocks.QUARTZ_STAIRS, new ItemMaterialInfo(new MaterialStack(GTMaterials.NetherQuartz, M * 4)));
        ChemicalHelper.registerMaterialInfo(Blocks.BRICK_STAIRS, new ItemMaterialInfo(new MaterialStack(GTMaterials.Brick, M * 4)));
        ChemicalHelper.registerMaterialInfo(Blocks.NETHER_BRICK_STAIRS, new ItemMaterialInfo(new MaterialStack(GTMaterials.Netherrack, M * 4)));

        // Каменные полублоки
        removeMaterialInfo(Blocks.STONE_SLAB);
        removeMaterialInfo(Blocks.SANDSTONE_SLAB);
        removeMaterialInfo(Blocks.RED_SANDSTONE_SLAB);
        removeMaterialInfo(Blocks.COBBLESTONE_SLAB);
        removeMaterialInfo(Blocks.BRICK_SLAB);
        removeMaterialInfo(Blocks.STONE_BRICK_SLAB);
        //        ChemicalHelper.registerMaterialInfo(Blocks.NETHER_BRICK_SLAB, new ItemMaterialInfo(new MaterialStack(GTMaterials.Netherrack, M * 2)));
        //        ChemicalHelper.registerMaterialInfo(Blocks.QUARTZ_SLAB, new ItemMaterialInfo(new MaterialStack(GTMaterials.NetherQuartz, M * 2)));
        //        ChemicalHelper.registerMaterialInfo(Blocks.SMOOTH_QUARTZ_SLAB, new ItemMaterialInfo(new MaterialStack(GTMaterials.NetherQuartz, M * 2)));

        // Каменная кнопка
        removeMaterialInfo(Blocks.STONE_BUTTON);

        // Нажимные плиты
        removeMaterialInfo(Blocks.STONE_PRESSURE_PLATE);
        //        ChemicalHelper.registerMaterialInfo(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, new ItemMaterialInfo(new MaterialStack(GTMaterials.Gold, M), new MaterialStack(GTMaterials.Steel, M)));
        //        ChemicalHelper.registerMaterialInfo(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M), new MaterialStack(GTMaterials.Steel, M)));

        /// ============================ Ванильная броня ============================ ///

        removeMaterialInfo(Items.CHAINMAIL_HELMET);
        removeMaterialInfo(Items.CHAINMAIL_CHESTPLATE);
        removeMaterialInfo(Items.CHAINMAIL_LEGGINGS);
        removeMaterialInfo(Items.CHAINMAIL_BOOTS);

        removeMaterialInfo(Items.IRON_HELMET);
        removeMaterialInfo(Items.IRON_CHESTPLATE);
        removeMaterialInfo(Items.IRON_LEGGINGS);
        removeMaterialInfo(Items.IRON_BOOTS);
        removeMaterialInfo(Items.IRON_HORSE_ARMOR);

        removeMaterialInfo(Items.GOLDEN_HELMET);
        removeMaterialInfo(Items.GOLDEN_CHESTPLATE);
        removeMaterialInfo(Items.GOLDEN_LEGGINGS);
        removeMaterialInfo(Items.GOLDEN_BOOTS);
        removeMaterialInfo(Items.GOLDEN_HORSE_ARMOR);

        removeMaterialInfo(Items.DIAMOND_HELMET);
        removeMaterialInfo(Items.DIAMOND_CHESTPLATE);
        removeMaterialInfo(Items.DIAMOND_LEGGINGS);
        removeMaterialInfo(Items.DIAMOND_BOOTS);
        removeMaterialInfo(Items.DIAMOND_HORSE_ARMOR);

        /// ============================ Ванильные инструменты ============================ ///

        removeMaterialInfo(Items.WOODEN_SHOVEL);
        removeMaterialInfo(Items.WOODEN_PICKAXE);
        removeMaterialInfo(Items.WOODEN_AXE);
        removeMaterialInfo(Items.WOODEN_HOE);
        removeMaterialInfo(Items.WOODEN_SWORD);

        removeMaterialInfo(Items.STONE_SHOVEL);
        removeMaterialInfo(Items.STONE_PICKAXE);
        removeMaterialInfo(Items.STONE_AXE);
        removeMaterialInfo(Items.STONE_HOE);
        removeMaterialInfo(Items.STONE_SWORD);

        removeMaterialInfo(Items.IRON_SHOVEL);
        removeMaterialInfo(Items.IRON_PICKAXE);
        removeMaterialInfo(Items.IRON_AXE);
        removeMaterialInfo(Items.IRON_SWORD);
        removeMaterialInfo(Items.IRON_HOE);

        removeMaterialInfo(Items.GOLDEN_SHOVEL);
        removeMaterialInfo(Items.GOLDEN_PICKAXE);
        removeMaterialInfo(Items.GOLDEN_AXE);
        removeMaterialInfo(Items.GOLDEN_SWORD);
        removeMaterialInfo(Items.GOLDEN_HOE);

        removeMaterialInfo(Items.DIAMOND_SHOVEL);
        removeMaterialInfo(Items.DIAMOND_PICKAXE);
        removeMaterialInfo(Items.DIAMOND_AXE);
        removeMaterialInfo(Items.DIAMOND_SWORD);
        removeMaterialInfo(Items.DIAMOND_HOE);

        /// ============================ Металл ============================ ///

        /// ============================ Другое ============================ ///

//        tfg$removeMaterialInfo(Items.WHEAT);
//        // ChemicalHelper.registerMaterialInfo(Items.CHEST_MINECART, new ItemMaterialInfo(new MaterialStack(GTMaterials.Iron, M * 5), new MaterialStack(GTMaterials.Wood, M * 8)));
//
//        ChemicalHelper.registerMaterialInfo(Items.IRON_DOOR, new ItemMaterialInfo(new MaterialStack(Iron, M)));
//
//        ChemicalHelper.registerMaterialInfo(Items.BUCKET, new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.RedSteel, M),
//                new MaterialStack(GTMaterials.BlueSteel, M)));
//
//        tfg$removeMaterialInfo(Blocks.ANVIL);
//        tfg$removeMaterialInfo(Blocks.CHIPPED_ANVIL);
//        tfg$removeMaterialInfo(Blocks.DAMAGED_ANVIL);
//
//        tfg$removeMaterialInfo(Items.COMPASS);
//
//        tfg$removeMaterialInfo(Blocks.FURNACE);
//        tfg$removeMaterialInfo(Blocks.STONE_BRICKS);
//        tfg$removeMaterialInfo(Blocks.COBBLESTONE);
//        tfg$removeMaterialInfo(Blocks.MOSSY_COBBLESTONE);
    }


    private static void removeMaterialInfo(ItemLike itemLike) {
        if (ChemicalHelper.ITEM_MATERIAL_INFO.remove(itemLike) == null) {
            TerraFirmaGreg.LOGGER.warn("Не произведено удаление унификации: {}", itemLike.asItem());
        }
    }

}

//        /* TFC */
//        for (var woodType : net.dries007.tfc.common.blocks.wood.Wood.values()) {
//            for (var blockType : net.dries007.tfc.common.blocks.wood.Wood.BlockType.values()) {
//                if (blockType == net.dries007.tfc.common.blocks.wood.Wood.BlockType.LOG ||
//                        blockType == net.dries007.tfc.common.blocks.wood.Wood.BlockType.STRIPPED_LOG ||
//                        blockType == net.dries007.tfc.common.blocks.wood.Wood.BlockType.WOOD ||
//                        blockType == net.dries007.tfc.common.blocks.wood.Wood.BlockType.STRIPPED_WOOD) continue;
//
//                var block = TFCBlocks.WOODS.get(woodType).get(blockType);
//                if (block == null) continue;
//                var stack = new ItemStack(block.get());
//                if (stack.isEmpty()) continue;
//
//                if (blockType == net.dries007.tfc.common.blocks.wood.Wood.BlockType.TRAPPED_CHEST) {
//                    ChemicalHelper.registerMaterialInfo(stack.getItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Wood, M * 8), new MaterialStack(GTMaterials.Iron, M / 2)));
//                } else if (blockType == net.dries007.tfc.common.blocks.wood.Wood.BlockType.BOOKSHELF) {
//                    ChemicalHelper.registerMaterialInfo(stack.getItem(), new ItemMaterialInfo(new MaterialStack(GTMaterials.Paper, M * 9), new MaterialStack(GTMaterials.Wood, M * 6)));
//                } else {
//                    ChemicalHelper.registerMaterialInfo(stack.getItem(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//                }
//
//            }
//
//            ChemicalHelper.registerMaterialInfo(TFCItems.BOATS.get(woodType).get().asItem(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(TFCItems.LUMBER.get(woodType).get().asItem(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(TFCItems.CHEST_MINECARTS.get(woodType).get().asItem(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//
//            for (var metalType : Metal.Default.values()) {
//                var material = TFGHelpers.getMaterial(metalType.getSerializedName());
//                if (material == null) continue;
//
//                var block = TFCBlocks.CEILING_HANGING_SIGNS.get(woodType).get(metalType);
//                if (block == null) continue;
//                var stack = new ItemStack(block.get());
//                if (stack.isEmpty()) continue;
//
//                ChemicalHelper.registerMaterialInfo(stack.getItem(), new ItemMaterialInfo(
//                        new MaterialStack(Wood, M),
//                        new MaterialStack(material, M / 9)
//                ));
//            }
//        }
//
//        ChemicalHelper.registerMaterialInfo(TFCItems.BRASS_MECHANISMS.get(), new ItemMaterialInfo(new MaterialStack(Brass, M / 2)));
//        ChemicalHelper.registerMaterialInfo(TFCBlocks.GRILL.get().asItem(), new ItemMaterialInfo(new MaterialStack(Iron, M * 2)));
//
//        /* FirmaLife */
//        for (var woodType : net.dries007.tfc.common.blocks.wood.Wood.values()) {
//            ChemicalHelper.registerMaterialInfo(FLBlocks.JARBNETS.get(woodType).get().asItem(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(FLBlocks.FOOD_SHELVES.get(woodType).get().asItem(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(FLBlocks.HANGERS.get(woodType).get().asItem(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//        }
//
//        for (var type : GreenhouseWrapper.values()) {
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.DOOR).get().asItem(), new ItemMaterialInfo(
//                new MaterialStack(type.getMaterial(), M),
//                new MaterialStack(Glass, M)
//            ));
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PANEL_ROOF).get().asItem(), new ItemMaterialInfo(
//                    new MaterialStack(type.getMaterial(), M / 2),
//                    new MaterialStack(Glass, M / 3)
//            ));
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PANEL_WALL).get().asItem(), new ItemMaterialInfo(
//                    new MaterialStack(type.getMaterial(), M / 2),
//                    new MaterialStack(Glass, M / 3)
//            ));
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.PORT).get().asItem(), new ItemMaterialInfo(
//                    new MaterialStack(type.getMaterial(), M / 8),
//                    new MaterialStack(Glass, M / 2),
//                    new MaterialStack(Copper, M / 8)
//            ));
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.ROOF).get().asItem(), new ItemMaterialInfo(
//                    new MaterialStack(type.getMaterial(), M / 3),
//                    new MaterialStack(Glass, M / 3)
//            ));
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.ROOF_TOP).get().asItem(), new ItemMaterialInfo(
//                    new MaterialStack(type.getMaterial(), M / 6),
//                    new MaterialStack(Glass, M / 3)
//            ));
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.TRAPDOOR).get().asItem(), new ItemMaterialInfo(
//                    new MaterialStack(type.getMaterial(), M / 6),
//                    new MaterialStack(Glass, M / 2)
//            ));
//
//            ChemicalHelper.registerMaterialInfo(FLBlocks.GREENHOUSE_BLOCKS.get(type.getGreenhouse()).get(Greenhouse.BlockType.WALL).get().asItem(), new ItemMaterialInfo(
//                    new MaterialStack(type.getMaterial(), M / 2),
//                    new MaterialStack(Glass, M / 3)
//            ));
//        }
//
//        ChemicalHelper.registerMaterialInfo(FLBlocks.COPPER_PIPE.get().asItem(), new ItemMaterialInfo(
//                new MaterialStack(Copper, M / 8)
//        ));

/* FirmaCiv */
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.SEXTANT.get(), new ItemMaterialInfo(new MaterialStack(Brass, M * 2), new MaterialStack(Glass, M)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.UNFINISHED_SEXTANT.get(), new ItemMaterialInfo(new MaterialStack(Brass, M * 2)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.NAV_CLOCK.get(), new ItemMaterialInfo(new MaterialStack(Brass, M * 4), new MaterialStack(Glass, M * 2)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.UNFINISHED_NAV_CLOCK.get(), new ItemMaterialInfo(new MaterialStack(Brass, M * 4)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.BAROMETER.get(), new ItemMaterialInfo(new MaterialStack(Brass, M * 2), new MaterialStack(Glass, M)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.UNFINISHED_BAROMETER.get(), new ItemMaterialInfo(new MaterialStack(Brass, M * 2)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.FIRMACIV_COMPASS.get(), new ItemMaterialInfo(new MaterialStack(Iron, M / 9), new MaterialStack(Glass, M / 9)));
//        ChemicalHelper.registerMaterialInfo(FirmacivBlocks.OARLOCK.get().asItem(), new ItemMaterialInfo(new MaterialStack(Iron, M * 2)));
//        ChemicalHelper.registerMaterialInfo(FirmacivBlocks.CLEAT.get().asItem(), new ItemMaterialInfo(new MaterialStack(Steel, M * 2)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.ANCHOR.get().asItem(), new ItemMaterialInfo(new MaterialStack(Steel, M * 4)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.CANNON.get().asItem(), new ItemMaterialInfo(new MaterialStack(Iron, M * 13)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.CANNON_BARREL.get().asItem(), new ItemMaterialInfo(new MaterialStack(Iron, M * 4)));
//        ChemicalHelper.registerMaterialInfo(FirmacivItems.CANNONBALL.get().asItem(), new ItemMaterialInfo(new MaterialStack(Iron, M * 2)));

/* AstikoCarts */
//        for (var woodType : net.dries007.tfc.common.blocks.wood.Wood.values()) {
//            ChemicalHelper.registerMaterialInfo(AstikorItems.WHEEL_TFC.get(woodType).get(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(AstikorItems.SUPPLY_CART_TFC.get(woodType).get(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(AstikorItems.PLOW_TFC.get(woodType).get(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(AstikorItems.ANIMAL_CART_TFC.get(woodType).get(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//            ChemicalHelper.registerMaterialInfo(AstikorItems.POSTILION_TFC.get(woodType).get(), new ItemMaterialInfo(new MaterialStack(Wood, M)));
//        }
//}

//    /**
//     * Изменяет состав железной двери до 1 слитка железа.
//     * */
//    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/data/chemical/ChemicalHelper;registerMaterialInfo(Lnet/minecraft/world/level/ItemLike;Lcom/gregtechceu/gtceu/api/data/chemical/material/stack/ItemMaterialInfo;)V", ordinal = 93), remap = false)
//    private static void tfg$init$IronDoor1(ItemLike item, ItemMaterialInfo materialInfo) {
//        ChemicalHelper.registerMaterialInfo(item, new ItemMaterialInfo(
//                new MaterialStack(Iron, M)));
//    }
//
//    /**
//     * Изменяет состав железной двери до 1 слитка железа.
//     * */
//    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/data/chemical/ChemicalHelper;registerMaterialInfo(Lnet/minecraft/world/level/ItemLike;Lcom/gregtechceu/gtceu/api/data/chemical/material/stack/ItemMaterialInfo;)V", ordinal = 94), remap = false)
//    private static void tfg$init$IronDoor2(ItemLike item, ItemMaterialInfo materialInfo) {
//        ChemicalHelper.registerMaterialInfo(item, new ItemMaterialInfo(
//                new MaterialStack(Iron, M)));
//    }
//
//    /**
//     * Изменяет состав ведра до 1 слитка красной и синей стали.
//     * */
//    @Redirect(method = "init", at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/api/data/chemical/ChemicalHelper;registerMaterialInfo(Lnet/minecraft/world/level/ItemLike;Lcom/gregtechceu/gtceu/api/data/chemical/material/stack/ItemMaterialInfo;)V", ordinal = 211), remap = false)
//    private static void tfg$init$Bucket(ItemLike item, ItemMaterialInfo materialInfo) {
//        ChemicalHelper.registerMaterialInfo(item, new ItemMaterialInfo(
//                new MaterialStack(GTMaterials.RedSteel, M),
//                new MaterialStack(GTMaterials.BlueSteel, M)));
//    }
//
