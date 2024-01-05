package com.statecontrolled.abandonedunderground.worldgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableSet;
import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.levelgen.flat.FlatLayerInfo;
import net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorSettings;
import net.minecraft.world.level.levelgen.structure.BuiltinStructureSets;
import net.minecraft.world.level.levelgen.structure.StructureSet;

/**
 * Settings for the AbandonedUnderground Dimension
 **/
public class AbandonedUndergroundDimension {
    public static final ResourceKey<LevelStem> ABANDONEDUNDERGROUND_LEVELSTEM           = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(AbandonedUnderground.MOD_ID, "abandonedunderground_dimension"));

    public static final ResourceKey<Level> ABANDONEDUNDERGROUND_LEVEL                   = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(AbandonedUnderground.MOD_ID, "abandonedunderground_dimension"));

    public static final ResourceKey<DimensionType> ABANDONEDUNDERGROUND_DIMENSION_TYPE  = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(AbandonedUnderground.MOD_ID, "abandonedunderground_dimension"));

    private static final boolean GENERATE_MOD_STRUCTURES = false;

    private AbandonedUndergroundDimension() {
        ;
    }

    public static void bootstrapType(BootstapContext<DimensionType> context) {
        AbandonedUnderground.LOGGER.log(java.util.logging.Level.INFO, "Bootstrap Dimension Type");
        context.register(ABANDONEDUNDERGROUND_DIMENSION_TYPE, new DimensionType(
                        OptionalLong.of(6000),  // fixed time
                        true,   // hasSkylight
                        false,  // hasCeiling
                        false,  // ultrawarm
                        false,  // natural
                        1.0,    // coordinate scale
                        true,   // bedWorks
                        false,  // respawn anchor works
                        -64,    // min Y
                        384,    // height
                        320,    // logical height
                        BlockTags.INFINIBURN_OVERWORLD,
                        BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                        0.25f,  // ambient light
                        new DimensionType.MonsterSettings(false, false, ConstantInt.of(4), 4)
                )
        );
    }

    public static void bootstrapStem(BootstapContext<LevelStem> context) {
        AbandonedUnderground.LOGGER.log(java.util.logging.Level.INFO, "Bootstrap Dimension Level Stem");
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimensionTypes = context.lookup(Registries.DIMENSION_TYPE);

        HolderGetter<StructureSet> structures = context.lookup(Registries.STRUCTURE_SET);
        //HolderGetter<PlacedFeature> features = context.lookup(Registries.PLACED_FEATURE);

        FlatLayerInfo layer0 = new FlatLayerInfo(1, Blocks.BEDROCK);
        FlatLayerInfo layer1 = new FlatLayerInfo(63, Blocks.DEEPSLATE);
        //FlatLayerInfo layer2 = new FlatLayerInfo(319, Blocks.STONE);
        FlatLayerInfo layer2 = new FlatLayerInfo(63, Blocks.STONE);
        FlatLayerInfo layer3 = new FlatLayerInfo(1, Blocks.QUARTZ_BLOCK);

        List<FlatLayerInfo> layerInfo = new ArrayList<>();
        layerInfo.add(layer0); // bottom layer
        layerInfo.add(layer1);
        layerInfo.add(layer2);
        layerInfo.add(layer3); // top layer

        Set<ResourceKey<StructureSet>> vanillaUnderground = ImmutableSet.of(
                BuiltinStructureSets.MINESHAFTS,
                BuiltinStructureSets.ANCIENT_CITIES,
                BuiltinStructureSets.RUINED_PORTALS,
                BuiltinStructureSets.STRONGHOLDS
        );
        HolderSet.Direct<StructureSet> direct = HolderSet.direct(vanillaUnderground.stream().map(structures::getOrThrow).collect(Collectors.toList()));

        //Holder<Biome> biomeSet = biomeRegistry.getOrThrow(Biomes.DARK_FOREST);
        Holder<Biome> biomeSet = biomeRegistry.getOrThrow(AUBiomes.LOST_TUNNELS);

        FlatLevelGeneratorSettings settings = null;
        if (GENERATE_MOD_STRUCTURES) {
            settings = new FlatLevelGeneratorSettings(
                    Optional.empty(),
                    biomeSet,
                    List.of()
            ).withBiomeAndLayers(layerInfo, Optional.empty(), biomeSet);
        } else {
            settings = new FlatLevelGeneratorSettings(
                    Optional.of(direct),
                    biomeSet,
                    List.of()
            ).withBiomeAndLayers(layerInfo, Optional.of(direct), biomeSet);
        }

        FlatLevelSource flatlandChunkGenerator = new FlatLevelSource(settings);

        LevelStem levelStem = new LevelStem(dimensionTypes.getOrThrow(ABANDONEDUNDERGROUND_DIMENSION_TYPE), flatlandChunkGenerator);
        context.register(ABANDONEDUNDERGROUND_LEVELSTEM, levelStem);
    }

}
