package com.statecontrolled.abandonedunderground.datagen.blocks;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;

public class AUBlockTagGenerator extends BlockTagsProvider{

    public AUBlockTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(
                AUBlocks.SMALL_WHITE_TILES.get(),
                AUBlocks.CRACKED_SMALL_WHITE_TILES.get(),
                AUBlocks.DIRTY_SMALL_WHITE_TILES.get(),
                AUBlocks.MOSSY_SMALL_WHITE_TILES.get(),
                AUBlocks.CHISELED_SMALL_WHITE_TILE.get(),

                AUBlocks.WHITE_TILES.get(),
                AUBlocks.CRACKED_WHITE_TILES.get(),
                AUBlocks.DIRTY_WHITE_TILES.get(),
                AUBlocks.MOSSY_WHITE_TILES.get(),
                AUBlocks.CHISELED_WHITE_TILE.get(),

                AUBlocks.SMALL_BLACK_TILES.get(),
                AUBlocks.CRACKED_SMALL_BLACK_TILES.get(),
                AUBlocks.DIRTY_SMALL_BLACK_TILES.get(),
                AUBlocks.MOSSY_SMALL_BLACK_TILES.get(),
                AUBlocks.CHISELED_SMALL_BLACK_TILE.get(),

                AUBlocks.BLACK_TILES.get(),
                AUBlocks.CRACKED_BLACK_TILES.get(),
                AUBlocks.DIRTY_BLACK_TILES.get(),
                AUBlocks.MOSSY_BLACK_TILES.get(),
                AUBlocks.CHISELED_BLACK_TILE.get(),

                AUBlocks.CONCRETE_PLATFORM.get(),
                AUBlocks.CRACKED_CONCRETE_PLATFORM.get(),
                AUBlocks.DIRTY_CONCRETE_PLATFORM.get(),
                AUBlocks.MOSSY_CONCRETE_PLATFORM.get(),
                AUBlocks.LINED_CONCRETE_PLATFORM.get(),

                AUBlocks.SMOOTH_LIGHT.get(),

                AUBlocks.METAL_GRATE_FLOOR.get(),
                AUBlocks.STEEL_FLOOR_PLATE.get(),
                AUBlocks.SMOOTH_METAL_FLOOR.get()
            );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
            .add(
                AUBlocks.SMALL_WHITE_TILES.get(),
                AUBlocks.CRACKED_SMALL_WHITE_TILES.get(),
                AUBlocks.DIRTY_SMALL_WHITE_TILES.get(),
                AUBlocks.MOSSY_SMALL_WHITE_TILES.get(),
                AUBlocks.CHISELED_SMALL_WHITE_TILE.get(),

                AUBlocks.WHITE_TILES.get(),
                AUBlocks.CRACKED_WHITE_TILES.get(),
                AUBlocks.DIRTY_WHITE_TILES.get(),
                AUBlocks.MOSSY_WHITE_TILES.get(),
                AUBlocks.CHISELED_WHITE_TILE.get(),

                AUBlocks.SMALL_BLACK_TILES.get(),
                AUBlocks.CRACKED_SMALL_BLACK_TILES.get(),
                AUBlocks.DIRTY_SMALL_BLACK_TILES.get(),
                AUBlocks.MOSSY_SMALL_BLACK_TILES.get(),
                AUBlocks.CHISELED_SMALL_BLACK_TILE.get(),

                AUBlocks.BLACK_TILES.get(),
                AUBlocks.CRACKED_BLACK_TILES.get(),
                AUBlocks.DIRTY_BLACK_TILES.get(),
                AUBlocks.MOSSY_BLACK_TILES.get(),
                AUBlocks.CHISELED_BLACK_TILE.get(),

                AUBlocks.SMOOTH_LIGHT.get()
            );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
            .add(
                AUBlocks.CONCRETE_PLATFORM.get(),
                AUBlocks.CRACKED_CONCRETE_PLATFORM.get(),
                AUBlocks.DIRTY_CONCRETE_PLATFORM.get(),
                AUBlocks.MOSSY_CONCRETE_PLATFORM.get(),
                AUBlocks.LINED_CONCRETE_PLATFORM.get(),

                AUBlocks.METAL_GRATE_FLOOR.get(),
                AUBlocks.STEEL_FLOOR_PLATE.get(),
                AUBlocks.SMOOTH_METAL_FLOOR.get()
            );

        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        //this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
    }
}
