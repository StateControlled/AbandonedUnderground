package com.statecontrolled.abandonedunderground.datagen.blocks;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class AUBlockStateProvider extends BlockStateProvider {

    public AUBlockStateProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(AUBlocks.SMALL_WHITE_TILES);
        blockWithItem(AUBlocks.CRACKED_SMALL_WHITE_TILES);
        blockWithItem(AUBlocks.DIRTY_SMALL_WHITE_TILES);
        blockWithItem(AUBlocks.MOSSY_SMALL_WHITE_TILES);
        blockWithItem(AUBlocks.CHISELED_SMALL_WHITE_TILES);

        blockWithItem(AUBlocks.WHITE_TILES);
        blockWithItem(AUBlocks.CRACKED_WHITE_TILES);
        blockWithItem(AUBlocks.DIRTY_WHITE_TILES);
        blockWithItem(AUBlocks.MOSSY_WHITE_TILES);
        blockWithItem(AUBlocks.CHISELED_WHITE_TILES);

        blockWithItem(AUBlocks.SMALL_BLACK_TILES);
        blockWithItem(AUBlocks.CRACKED_SMALL_BLACK_TILES);
        blockWithItem(AUBlocks.DIRTY_SMALL_BLACK_TILES);
        blockWithItem(AUBlocks.MOSSY_SMALL_BLACK_TILES);
        blockWithItem(AUBlocks.CHISELED_SMALL_BLACK_TILES);

        blockWithItem(AUBlocks.BLACK_TILES);
        blockWithItem(AUBlocks.CRACKED_BLACK_TILES);
        blockWithItem(AUBlocks.DIRTY_BLACK_TILES);
        blockWithItem(AUBlocks.MOSSY_BLACK_TILES);
        blockWithItem(AUBlocks.CHISELED_BLACK_TILES);

        blockWithItem(AUBlocks.CONCRETE_PLATFORM);
        blockWithItem(AUBlocks.CRACKED_CONCRETE_PLATFORM);
        blockWithItem(AUBlocks.DIRTY_CONCRETE_PLATFORM);
        blockWithItem(AUBlocks.MOSSY_CONCRETE_PLATFORM);

        blockWithItem(AUBlocks.CONCRETE_ROAD_DASHED_LINE);
        blockWithItem(AUBlocks.CONCRETE_ROAD_SOLID_LINE);
        blockWithItem(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE);

        blockWithItem(AUBlocks.SMOOTH_LIGHT);

        blockWithItem(AUBlocks.METAL_GRATE_FLOOR);
        blockWithItem(AUBlocks.STEEL_PLATE_FLOOR);
        blockWithItem(AUBlocks.SMOOTH_METAL_FLOOR);

        stairsBlock((StairBlock) AUBlocks.WHITE_TILE_STAIRS.get(),
                blockTexture(AUBlocks.WHITE_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.MOSSY_WHITE_TILE_STAIRS.get(),
                blockTexture(AUBlocks.MOSSY_WHITE_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.DIRTY_WHITE_TILE_STAIRS.get(),
                blockTexture(AUBlocks.DIRTY_WHITE_TILES.get()));

        stairsBlock((StairBlock) AUBlocks.BLACK_TILE_STAIRS.get(),
                blockTexture(AUBlocks.BLACK_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.MOSSY_BLACK_TILE_STAIRS.get(),
                blockTexture(AUBlocks.MOSSY_BLACK_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.DIRTY_BLACK_TILE_STAIRS.get(),
                blockTexture(AUBlocks.DIRTY_BLACK_TILES.get()));

        stairsBlock((StairBlock) AUBlocks.SMALL_WHITE_TILE_STAIRS.get(),
                blockTexture(AUBlocks.SMALL_WHITE_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.MOSSY_SMALL_WHITE_TILE_STAIRS.get(),
                blockTexture(AUBlocks.MOSSY_SMALL_WHITE_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.DIRTY_SMALL_WHITE_TILE_STAIRS.get(),
                blockTexture(AUBlocks.DIRTY_SMALL_WHITE_TILES.get()));

        stairsBlock((StairBlock) AUBlocks.SMALL_BLACK_TILE_STAIRS.get(),
                blockTexture(AUBlocks.SMALL_BLACK_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.MOSSY_SMALL_BLACK_TILE_STAIRS.get(),
                blockTexture(AUBlocks.MOSSY_SMALL_BLACK_TILES.get()));
        stairsBlock((StairBlock) AUBlocks.DIRTY_SMALL_BLACK_TILE_STAIRS.get(),
                blockTexture(AUBlocks.DIRTY_SMALL_BLACK_TILES.get()));

        stairsBlock((StairBlock) AUBlocks.CONCRETE_PLATFORM_STAIRS.get(),
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()));
        stairsBlock((StairBlock) AUBlocks.MOSSY_CONCRETE_PLATFORM_STAIRS.get(),
                blockTexture(AUBlocks.MOSSY_CONCRETE_PLATFORM.get()));
        stairsBlock((StairBlock) AUBlocks.DIRTY_CONCRETE_PLATFORM_STAIRS.get(),
                blockTexture(AUBlocks.DIRTY_CONCRETE_PLATFORM.get()));

        stairsBlock((StairBlock) AUBlocks.STEEL_PLATE_STAIRS.get(),
                blockTexture(AUBlocks.STEEL_PLATE_FLOOR.get()));
        stairsBlock((StairBlock) AUBlocks.SMOOTH_METAL_STAIRS.get(),
                blockTexture(AUBlocks.SMOOTH_METAL_FLOOR.get()));



        slabBlock((SlabBlock) AUBlocks.WHITE_TILE_SLAB.get(),
                blockTexture(AUBlocks.WHITE_TILES.get()), blockTexture(AUBlocks.WHITE_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.DIRTY_WHITE_TILE_SLAB.get(),
                blockTexture(AUBlocks.DIRTY_WHITE_TILES.get()), blockTexture(AUBlocks.DIRTY_WHITE_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.MOSSY_WHITE_TILE_SLAB.get(),
                blockTexture(AUBlocks.MOSSY_WHITE_TILES.get()), blockTexture(AUBlocks.MOSSY_WHITE_TILES.get()));

        slabBlock((SlabBlock) AUBlocks.BLACK_TILE_SLAB.get(),
                blockTexture(AUBlocks.BLACK_TILES.get()), blockTexture(AUBlocks.BLACK_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.DIRTY_BLACK_TILE_SLAB.get(),
                blockTexture(AUBlocks.DIRTY_BLACK_TILES.get()), blockTexture(AUBlocks.DIRTY_BLACK_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.MOSSY_BLACK_TILE_SLAB.get(),
                blockTexture(AUBlocks.MOSSY_BLACK_TILES.get()), blockTexture(AUBlocks.MOSSY_BLACK_TILES.get()));

        slabBlock((SlabBlock) AUBlocks.SMALL_WHITE_TILE_SLAB.get(),
                blockTexture(AUBlocks.SMALL_WHITE_TILES.get()), blockTexture(AUBlocks.SMALL_WHITE_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.DIRTY_SMALL_WHITE_TILE_SLAB.get(),
                blockTexture(AUBlocks.DIRTY_SMALL_WHITE_TILES.get()), blockTexture(AUBlocks.DIRTY_SMALL_WHITE_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.MOSSY_SMALL_WHITE_TILE_SLAB.get(),
                blockTexture(AUBlocks.MOSSY_SMALL_WHITE_TILES.get()), blockTexture(AUBlocks.MOSSY_SMALL_WHITE_TILES.get()));

        slabBlock((SlabBlock) AUBlocks.SMALL_BLACK_TILE_SLAB.get(),
                blockTexture(AUBlocks.SMALL_BLACK_TILES.get()), blockTexture(AUBlocks.SMALL_BLACK_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.DIRTY_SMALL_BLACK_TILE_SLAB.get(),
                blockTexture(AUBlocks.DIRTY_SMALL_BLACK_TILES.get()), blockTexture(AUBlocks.DIRTY_SMALL_BLACK_TILES.get()));
        slabBlock((SlabBlock) AUBlocks.MOSSY_SMALL_BLACK_TILE_SLAB.get(),
                blockTexture(AUBlocks.MOSSY_SMALL_BLACK_TILES.get()), blockTexture(AUBlocks.MOSSY_SMALL_BLACK_TILES.get()));

        slabBlock((SlabBlock) AUBlocks.CONCRETE_PLATFORM_SLAB.get(),
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()), blockTexture(AUBlocks.CONCRETE_PLATFORM.get()));
        slabBlock((SlabBlock) AUBlocks.DIRTY_CONCRETE_PLATFORM_SLAB.get(),
                blockTexture(AUBlocks.DIRTY_CONCRETE_PLATFORM.get()), blockTexture(AUBlocks.DIRTY_CONCRETE_PLATFORM.get()));
        slabBlock((SlabBlock) AUBlocks.MOSSY_CONCRETE_PLATFORM_SLAB.get(),
                blockTexture(AUBlocks.MOSSY_CONCRETE_PLATFORM.get()), blockTexture(AUBlocks.MOSSY_CONCRETE_PLATFORM.get()));

        slabBlock((SlabBlock) AUBlocks.CONCRETE_ROAD_DOUBLE_LINE_SLAB.get(),
                blockTexture(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get()), blockTexture(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get()));
        slabBlock((SlabBlock) AUBlocks.CONCRETE_ROAD_DASHED_LINE_SLAB.get(),
                blockTexture(AUBlocks.CONCRETE_ROAD_DASHED_LINE.get()), blockTexture(AUBlocks.CONCRETE_ROAD_DASHED_LINE.get()));
        slabBlock((SlabBlock) AUBlocks.CONCRETE_ROAD_SOLID_LINE_SLAB.get(),
                blockTexture(AUBlocks.CONCRETE_ROAD_SOLID_LINE.get()), blockTexture(AUBlocks.CONCRETE_ROAD_SOLID_LINE.get()));

        slabBlock((SlabBlock) AUBlocks.STEEL_PLATE_SLAB.get(),
                blockTexture(AUBlocks.STEEL_PLATE_FLOOR.get()), blockTexture(AUBlocks.STEEL_PLATE_FLOOR.get()));
        slabBlock((SlabBlock) AUBlocks.SMOOTH_METAL_SLAB.get(),
                blockTexture(AUBlocks.SMOOTH_METAL_FLOOR.get()), blockTexture(AUBlocks.SMOOTH_METAL_FLOOR.get()));
    }

    private void blockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
