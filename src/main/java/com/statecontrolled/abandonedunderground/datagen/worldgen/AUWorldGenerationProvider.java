package com.statecontrolled.abandonedunderground.datagen.worldgen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.worldgen.AbandonedUndergroundDimension;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

public class AUWorldGenerationProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.LEVEL_STEM, AbandonedUndergroundDimension::bootstrapStem)
            .add(Registries.DIMENSION_TYPE, AbandonedUndergroundDimension::bootstrapType);

    public AUWorldGenerationProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(AbandonedUnderground.MOD_ID));
    }
}
