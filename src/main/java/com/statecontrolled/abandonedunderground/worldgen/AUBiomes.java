package com.statecontrolled.abandonedunderground.worldgen;

import java.awt.Color;

import org.checkerframework.checker.units.qual.C;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

/**
 * This class defines Abandoned Underground's biomes.
 **/
public class AUBiomes {
    public static final ResourceKey<Biome> INFINITE_HALLWAYS = register("infinite_hallways");
    public static final ResourceKey<Biome> LOST_TUNNELS = register("lost_tunnels");
    public static final ResourceKey<Biome> UNENDING_PASSAGES = register("unending_passages");
    public static final ResourceKey<Biome> DISPLACED_SEWERS = register("displaced_sewers");

    private AUBiomes() {
        ;
    }

    public static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(AbandonedUnderground.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<Biome> context) {
        context.register(INFINITE_HALLWAYS, initInfiniteHallways(context));
        context.register(LOST_TUNNELS, initLostTunnels(context));
        context.register(UNENDING_PASSAGES, initUnendingPassages(context));
        context.register(DISPLACED_SEWERS, initDisplacedSewers(context));
    }

    /**
     * For Infinite Hallways biome
     **/
    private static Biome initInfiniteHallways(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder mobSpawnBuilder = new MobSpawnSettings.Builder();
        mobSpawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 6, 2, 4));

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        //globalWorldGeneration(biomeBuilder);

        Color water = new Color(0x7898b8);
        Color waterFog = new Color(0x4d8dad);
        Color skyColor = new Color(0x3fb9e6);
        Color fogColor = new Color(0x585858);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.8f)
                .temperature(0.15f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(mobSpawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(water.getRGB())
                        .waterFogColor(waterFog.getRGB())
                        .skyColor(skyColor.getRGB())
                        .fogColor(fogColor.getRGB())
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()
                ).build();
    }

    /**
     * For Lost Tunnels biome
     **/
    private static Biome initLostTunnels(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder mobSpawnBuilder = new MobSpawnSettings.Builder();
        mobSpawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 6, 2, 4));

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        //globalWorldGeneration(biomeBuilder);

        Color water = new Color(0x98c9f5);
        Color waterFog = new Color(0x5d97bd);
        Color skyColor = new Color(0x3fb9e6);
        Color fogColor = new Color(0x585858);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.8f)
                .temperature(0.15f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(mobSpawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(water.getRGB())
                        .waterFogColor(waterFog.getRGB())
                        .skyColor(skyColor.getRGB())
                        .fogColor(fogColor.getRGB())
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()
                ).build();
    }

    /**
     * For Unending Passages biome
     **/
    private static Biome initUnendingPassages(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder mobSpawnBuilder = new MobSpawnSettings.Builder();
        mobSpawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 6, 2, 4));

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        //globalWorldGeneration(biomeBuilder);

        Color water = new Color(0x198c9f);
        Color waterFog = new Color(0x2d679d);
        Color skyColor = new Color(0x3fb9e6);
        Color fogColor = new Color(0x585858);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.8f)
                .temperature(0.15f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(mobSpawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(water.getRGB())
                        .waterFogColor(waterFog.getRGB())
                        .skyColor(skyColor.getRGB())
                        .fogColor(fogColor.getRGB())
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()
                ).build();
    }

    /**
     * For Displaced Sewers biome
     **/
    private static Biome initDisplacedSewers(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder mobSpawnBuilder = new MobSpawnSettings.Builder();
        mobSpawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 6, 2, 4));

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        //globalWorldGeneration(biomeBuilder);

        Color water = new Color(0x689995);
        Color waterFog = new Color(0x4d878d);
        Color skyColor = new Color(0x3fb9e6);
        Color fogColor = new Color(0x585858);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.8f)
                .temperature(0.15f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(mobSpawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(water.getRGB())
                        .waterFogColor(waterFog.getRGB())
                        .skyColor(skyColor.getRGB())
                        .fogColor(fogColor.getRGB())
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()
                ).build();
    }

    private static void globalWorldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }
}
