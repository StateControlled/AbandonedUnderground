package com.statecontrolled.abandonedunderground.datagen.loot;

import java.util.List;
import java.util.Set;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class AULootTableProvider {

    private AULootTableProvider() {
        ;
    }

    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, Set.of(), List.of(
            new LootTableProvider.SubProviderEntry(AUBlockLootTables::new, LootContextParamSets.BLOCK))
        );
    }

}
