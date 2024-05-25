package su.terrafirmagreg.core.mixins.common.gtceu.recipes;

import com.gregtechceu.gtceu.data.recipe.MaterialInfoLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import su.terrafirmagreg.core.compat.gtceu.data.TFGMaterialInfoLoader;

@Mixin(value = MaterialInfoLoader.class, remap = false)
public abstract class MaterialInfoLoaderMixin {

    @Inject(method = "init", at = @At(value = "TAIL"), remap = false)
    private static void tfg$init(CallbackInfo ci) {
        TFGMaterialInfoLoader.init();
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
    }

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
}
