package com.statecontrolled.abandonedunderground.datagen;

import java.util.concurrent.CompletableFuture;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.datagen.blocks.AUBlockStateProvider;
import com.statecontrolled.abandonedunderground.datagen.blocks.AUBlockTagGenerator;
import com.statecontrolled.abandonedunderground.datagen.items.AUItemModelProvider;
import com.statecontrolled.abandonedunderground.datagen.items.AUItemTagGenerator;
import com.statecontrolled.abandonedunderground.datagen.loot.AULootTableProvider;
import com.statecontrolled.abandonedunderground.datagen.recipe.AUBlockRecipeProvider;
import com.statecontrolled.abandonedunderground.datagen.recipe.AUItemRecipeProvider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AbandonedUnderground.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AUDataGenerator {
    private AUDataGenerator() {
        ;
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new AUItemRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), new AUBlockRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), AULootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new AUBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new AUItemModelProvider(packOutput, existingFileHelper));

        AUBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
            new AUBlockTagGenerator(packOutput, lookupProvider, existingFileHelper)
        );

        generator.addProvider(event.includeServer(),
            new AUItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper)
        );
    }

}
