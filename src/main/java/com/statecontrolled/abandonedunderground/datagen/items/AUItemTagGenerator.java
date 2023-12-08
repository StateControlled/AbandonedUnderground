package com.statecontrolled.abandonedunderground.datagen.items;

import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.tags.AUTags;

public class AUItemTagGenerator extends ItemTagsProvider {

    public AUItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, blockTags, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(AUTags.AUItemTags.CONCRETE_ITEM_TAG)
                .add(
                        Blocks.BLACK_CONCRETE.asItem(),
                        Blocks.BLUE_CONCRETE.asItem(),
                        Blocks.BROWN_CONCRETE.asItem(),
                        Blocks.CYAN_CONCRETE.asItem(),
                        Blocks.GRAY_CONCRETE.asItem(),
                        Blocks.GREEN_CONCRETE.asItem(),
                        Blocks.LIGHT_BLUE_CONCRETE.asItem(),
                        Blocks.LIGHT_GRAY_CONCRETE.asItem(),
                        Blocks.LIME_CONCRETE.asItem(),
                        Blocks.MAGENTA_CONCRETE.asItem(),
                        Blocks.ORANGE_CONCRETE.asItem(),
                        Blocks.PINK_CONCRETE.asItem(),
                        Blocks.PURPLE_CONCRETE.asItem(),
                        Blocks.RED_CONCRETE.asItem(),
                        Blocks.WHITE_CONCRETE.asItem(),
                        Blocks.YELLOW_CONCRETE.asItem()
                );
    }
}
