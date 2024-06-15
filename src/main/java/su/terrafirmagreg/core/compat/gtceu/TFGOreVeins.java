package su.terrafirmagreg.core.compat.gtceu;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.worldgen.generator.indicators.SurfaceIndicatorGenerator;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.DikeVeinGenerator;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.VeinedVeinGenerator;
import net.minecraft.util.valueproviders.UniformInt;
import su.terrafirmagreg.core.common.data.TFGTags;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTOres.create;

public final class TFGOreVeins {

    public static void register() {

        /* Переопределение всех руд, которые спавнятся на земле в камне */

        create(GTCEu.id("apatite_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(10, 80)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.STONE::defaultBlockState))
                                .layer(l -> l.weight(3).mat(Apatite).size(2, 4))
                                .layer(l -> l.weight(2).mat(TricalciumPhosphate).size(1, 1))
                                .layer(l -> l.weight(1).mat(Pyrochlore).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Apatite)
                        .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                )
        );

        create(GTCEu.id("cassiterite_vein"), vein -> vein
                .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(80)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(10, 80)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .veinedVeinGenerator(generator -> generator
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Tin, 4))
                        .rareBlock(new VeinedVeinGenerator.VeinBlockDefinition(Cassiterite, 2))
                        .rareBlockChance(0.33f)
                        .veininessThreshold(0.1f)
                        .maxRichnessThreshold(0.175f)
                        .minRichness(0.4f)
                        .maxRichness(0.7f)
                        .edgeRoundoffBegin(3)
                        .maxEdgeRoundoff(0.1f)
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Cassiterite)
                )
        );

        create(GTCEu.id("coal_vein"), vein -> vein
                .clusterSize(UniformInt.of(38, 44)).density(0.25f).weight(80)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(10, 140)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                .layer(l -> l.weight(3).mat(Coal).size(2, 4))
                                .layer(l -> l.weight(3).mat(Coal).size(2, 4))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Coal)
                )
        );

        create(GTCEu.id("copper_tin_vein"), vein -> vein
                .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(50)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-10, 160)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .veinedVeinGenerator(generator -> generator
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Chalcopyrite, 5))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Zeolite, 2))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Cassiterite, 2))
                        .rareBlock(new VeinedVeinGenerator.VeinBlockDefinition(Realgar, 1))
                        .rareBlockChance(0.05f)
                        .veininessThreshold(0.1f)
                        .maxRichnessThreshold(0.175f)
                        .minRichness(0.4f)
                        .maxRichness(0.7f)
                        .edgeRoundoffBegin(3)
                        .maxEdgeRoundoff(0.1f)
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Chalcopyrite)
                )
        );

        create(GTCEu.id("galena_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-15, 45)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.Stone::defaultBlockState))
                                .layer(l -> l.weight(3).mat(Galena).size(2, 4))
                                .layer(l -> l.weight(2).mat(Silver).size(1, 1))
                                .layer(l -> l.weight(1).mat(Lead).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Galena)
                )
        );

        create(GTCEu.id("garnet_tin_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(80)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(30, 60)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.SAND::defaultBlockState))
                                .layer(l -> l.weight(3).mat(CassiteriteSand).size(2, 4))
                                .layer(l -> l.weight(2).mat(GarnetSand).size(1, 1))
                                .layer(l -> l.weight(2).mat(Asbestos).size(1, 1))
                                .layer(l -> l.weight(1).mat(Diatomite).size(1, 1))
                                .build())
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(GarnetSand)
                )
        );

        create(GTCEu.id("garnet_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-10, 50)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .dikeVeinGenerator(generator -> generator
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(GarnetRed, 3, -10, 50))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(GarnetYellow, 2, -10, 50))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Amethyst, 2, -10, 22))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Opal, 1, 18, 50))
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(GarnetRed)
                        .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                )
        );

        create(GTCEu.id("iron_vein"), vein -> vein
                .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(120)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-10, 60)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .veinedVeinGenerator(generator -> generator
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Goethite, 5))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(YellowLimonite, 2))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Hematite, 2))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Malachite, 1))
                        .veininessThreshold(0.1f)
                        .maxRichnessThreshold(0.175f)
                        .minRichness(0.4f)
                        .maxRichness(0.7f)
                        .edgeRoundoffBegin(3)
                        .maxEdgeRoundoff(0.1f)
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Goethite)
                )
        );

        create(GTCEu.id("lubricant_vein"), vein -> vein
                .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(0, 50)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                .layer(l -> l.weight(3).mat(Soapstone).size(2, 4))
                                .layer(l -> l.weight(2).mat(Talc).size(1, 1))
                                .layer(l -> l.weight(2).mat(GlauconiteSand).size(1, 1))
                                .layer(l -> l.weight(1).mat(Pentlandite).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Talc)
                )
        );

        create(GTCEu.id("magnetite_vein_ow"), vein -> vein
                .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(80)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(10, 60)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                .layer(l -> l.weight(3).mat(Magnetite).size(2, 4))
                                .layer(l -> l.weight(2).mat(VanadiumMagnetite).size(1, 1))
                                .layer(l -> l.weight(1).mat(Gold).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Magnetite)
                )
        );

        create(GTCEu.id("mineral_sand_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(80)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(15, 60)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.SAND::defaultBlockState))
                                .layer(l -> l.weight(3).mat(BasalticMineralSand).size(2, 4))
                                .layer(l -> l.weight(2).mat(GraniticMineralSand).size(1, 1))
                                .layer(l -> l.weight(2).mat(FullersEarth).size(1, 1))
                                .layer(l -> l.weight(1).mat(Gypsum).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(BasalticMineralSand)
                )
        );

        create(GTCEu.id("nickel_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-10, 60)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.STONE::defaultBlockState))
                                .layer(l -> l.weight(3).mat(Garnierite).size(2, 4))
                                .layer(l -> l.weight(2).mat(Nickel).size(1, 1))
                                .layer(l -> l.weight(2).mat(Cobaltite).size(1, 1))
                                .layer(l -> l.weight(1).mat(Pentlandite).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Nickel)
                )
        );

        create(GTCEu.id("salts_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(50)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(30, 70)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.STONE::defaultBlockState))
                                .layer(l -> l.weight(3).mat(RockSalt).size(2, 4))
                                .layer(l -> l.weight(2).mat(Salt).size(1, 1))
                                .layer(l -> l.weight(1).mat(Lepidolite).size(1, 1))
                                .layer(l -> l.weight(1).mat(Spodumene).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Salt)
                )
        );

        create(GTCEu.id("oilsands_vein"), vein -> vein
                .clusterSize(UniformInt.of(25, 29)).density(0.3f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(30, 80)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                .layer(l -> l.weight(3).mat(Oilsands).size(2, 4))
                                .layer(l -> l.weight(2).mat(Oilsands).size(1, 1))
                                .layer(l -> l.weight(1).mat(Oilsands).size(1, 1))
                                .layer(l -> l.weight(1).mat(Oilsands).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Oilsands)
                )
        );

        /* Переопределение всех руд, которые спавнятся на земле в глубинном сланце */

        create(GTCEu.id("copper_vein"), vein -> vein
                .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(80)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-40, 10)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .veinedVeinGenerator(generator -> generator
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Chalcopyrite, 5))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Iron, 2))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Pyrite, 2))
                        .oreBlock(new VeinedVeinGenerator.VeinBlockDefinition(Copper, 2))
                        .veininessThreshold(0.1f)
                        .maxRichnessThreshold(0.175f)
                        .minRichness(0.4f)
                        .maxRichness(0.7f)
                        .edgeRoundoffBegin(3)
                        .maxEdgeRoundoff(0.1f)
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Copper)
                )
        );

        create(GTCEu.id("diamond_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-65, -30)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                .layer(l -> l.weight(3).mat(Graphite).size(2, 4))
                                .layer(l -> l.weight(2).mat(Diamond).size(1, 1))
                                .layer(l -> l.weight(1).mat(Coal).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Diamond)
                        .density(0.1f)
                        .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                        .radius(2)
                )
        );

        create(GTCEu.id("lapis_vein"), vein -> vein
                .clusterSize(UniformInt.of(40, 52)).density(0.25f).weight(40)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-60, 10)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .dikeVeinGenerator(generator -> generator
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Lazurite, 3, -60, 10))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Sodalite, 2, -50, 0))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Lapis, 2, -50, 0))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Calcite, 1, -40, 10))
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Lapis)
                        .density(0.15f)
                        .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                        .radius(3)
                )
        );

        create(GTCEu.id("manganese_vein_ow"), vein -> vein
                .clusterSize(UniformInt.of(50, 64)).density(0.25f).weight(20)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-30, 0)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .dikeVeinGenerator(generator -> generator
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Grossular, 3, -50, -5))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Spessartine, 2, -40, -15))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Pyrolusite, 2, -40, -15))
                        .withBlock(new DikeVeinGenerator.DikeBlockDefinition(Tantalite, 1, -30, -5))
                        .minYLevel(-50).maxYLevel(-5)
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Grossular)
                        .radius(3)
                )
        );

        create(GTCEu.id("mica_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(20)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-40, -10)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.STONE::defaultBlockState))
                                .layer(l -> l.weight(3).mat(Kyanite).size(2, 4))
                                .layer(l -> l.weight(2).mat(Mica).size(1, 1))
                                .layer(l -> l.weight(2).mat(Bauxite).size(1, 1))
                                .layer(l -> l.weight(1).mat(Pollucite).size(1, 1))
                        )
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Mica)
                        .radius(3)
                )
        );

        create(GTCEu.id("olivine_vein"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(20)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-20, 10)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.STONE::defaultBlockState))
                                .layer(l -> l.weight(3).mat(Bentonite).size(2, 4))
                                .layer(l -> l.weight(2).mat(Magnetite).size(1, 1))
                                .layer(l -> l.weight(2).mat(Olivine).size(1, 1))
                                .layer(l -> l.weight(1).mat(GlauconiteSand).size(1, 1))
                                .build())
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Olivine)
                        .density(0.15f)
                        .radius(3)
                )
        );

        create(GTCEu.id("redstone_vein_ow"), vein -> vein
                .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(60)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-65, -10)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                .layer(l -> l.weight(3).mat(Redstone).size(2, 4))
                                .layer(l -> l.weight(2).mat(Ruby).size(1, 1))
                                .layer(l -> l.weight(1).mat(Cinnabar).size(1, 1))
                                .build())
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Redstone)
                )
        );

        create(GTCEu.id("sapphire_vein"), vein -> vein
                .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(60)
                .layer(TFGWorldGenLayers.EARTH_GEN_LAYER)
                .heightRangeUniform(-40, 0)
                .biomes(TFGTags.Biomes.IsTFCOverworld)
                .layeredVeinGenerator(generator -> generator
                        .buildLayerPattern(pattern -> pattern
                                // .layer(l -> l.weight(2).state(Blocks.STONE::defaultBlockState))
                                .layer(l -> l.weight(3).mat(Almandine).size(2, 4))
                                .layer(l -> l.weight(2).mat(Pyrope).size(1, 1))
                                .layer(l -> l.weight(1).mat(Sapphire).size(1, 1))
                                .layer(l -> l.weight(1).mat(GreenSapphire).size(1, 1))
                                .build())
                )
                .surfaceIndicatorGenerator(indicator -> indicator
                        .surfaceRock(Sapphire)
                        .density(0.15f)
                        .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                        .radius(3)
                )
        );
    }

}
