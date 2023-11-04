package exception.terrafirmagreg.compat.gregtech;

/**
 * Используем это, потому что в gtceu стоун
 * */
public class TFGStoneTypes {
    public static void init()
    {
        /*
        for (Material material : GTRegistries.MATERIALS.values())
        {
            if (material.hasProperty(PropertyKey.ORE))
            {
                var blockName = String.format("ore/%s", material.getName());

                TerraFirmaGreg.REGISTRATE.get()
                        .block(blockName, CustomBlock::new)
                        .blockstate((ctx, prov) -> prov.simpleBlock(ctx.get(), prov.models()
                                .withExistingParent(blockName, prov.modLoc("block/ore"))
                                .texture("overlay", prov.modLoc("block/ore"))
                                .renderType("cutout_mipped")
                        ))
                        .tag(BlockTags.ACACIA_LOGS)
                        .color(() -> () -> (blockState, level, blockPos, index) -> material.getMaterialRGB())
                        //.item()
                        //.build()
                        .register();
            }
        }*/
    }
}
