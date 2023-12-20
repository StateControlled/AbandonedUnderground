package com.statecontrolled.abandonedunderground.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.datagen.advancement.AUAdvancementProvider;
import com.statecontrolled.abandonedunderground.datagen.blocks.AUBlockStateProvider;
import com.statecontrolled.abandonedunderground.datagen.blocks.AUBlockTagGenerator;
import com.statecontrolled.abandonedunderground.datagen.items.AUItemModelProvider;
import com.statecontrolled.abandonedunderground.datagen.items.AUItemTagGenerator;
import com.statecontrolled.abandonedunderground.datagen.painting.AUPaintingVariantTagProvider;
import com.statecontrolled.abandonedunderground.datagen.loot.AULootTableProvider;
import com.statecontrolled.abandonedunderground.datagen.recipe.AURecipeProvider;
import com.statecontrolled.abandonedunderground.datagen.worldgen.AUWorldGenerationProvider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
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
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new AURecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), AULootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new AUBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new AUItemModelProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new AUWorldGenerationProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeClient(), new AUPaintingVariantTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(),
                new ForgeAdvancementProvider(packOutput, lookupProvider, existingFileHelper,
                        List.of(new AUAdvancementProvider()))
        );

        AUBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
            new AUBlockTagGenerator(packOutput, lookupProvider, existingFileHelper)
        );

        generator.addProvider(event.includeServer(),
            new AUItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper)
        );
    }

}
