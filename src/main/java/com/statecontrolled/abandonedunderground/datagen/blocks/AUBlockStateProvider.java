package com.statecontrolled.abandonedunderground.datagen.blocks;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AUBlockStateProvider extends BlockStateProvider {

    public AUBlockStateProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        auSimpleCubicBlock(AUBlocks.SMALL_WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.CRACKED_SMALL_WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.DIRTY_SMALL_WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.MOSSY_SMALL_WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.CHISELED_SMALL_WHITE_TILES);

        auSimpleCubicBlock(AUBlocks.WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.CRACKED_WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.DIRTY_WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.MOSSY_WHITE_TILES);
        auSimpleCubicBlock(AUBlocks.CHISELED_WHITE_TILES);

        auSimpleCubicBlock(AUBlocks.SMALL_BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.CRACKED_SMALL_BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.DIRTY_SMALL_BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.MOSSY_SMALL_BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.CHISELED_SMALL_BLACK_TILES);

        auSimpleCubicBlock(AUBlocks.BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.CRACKED_BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.DIRTY_BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.MOSSY_BLACK_TILES);
        auSimpleCubicBlock(AUBlocks.CHISELED_BLACK_TILES);

        auSimpleCubicBlock(AUBlocks.CONCRETE_PLATFORM);
        auSimpleCubicBlock(AUBlocks.CRACKED_CONCRETE_PLATFORM);
        auSimpleCubicBlock(AUBlocks.DIRTY_CONCRETE_PLATFORM);
        auSimpleCubicBlock(AUBlocks.MOSSY_CONCRETE_PLATFORM);

        // block side front top
        auBlockItem(AUBlocks.CONCRETE_ROAD_DASHED_LINE);
        horizontalBlock(AUBlocks.CONCRETE_ROAD_DASHED_LINE.get(),           // block
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()),             // side
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()),             // front
                blockTexture(AUBlocks.CONCRETE_ROAD_DASHED_LINE.get()));    // top

        auBlockItem(AUBlocks.CONCRETE_ROAD_SOLID_LINE);
        horizontalBlock(AUBlocks.CONCRETE_ROAD_SOLID_LINE.get(),
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()),
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()),
                blockTexture(AUBlocks.CONCRETE_ROAD_SOLID_LINE.get()));

        auBlockItem(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE);
        horizontalBlock(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get(),
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()),
                blockTexture(AUBlocks.CONCRETE_PLATFORM.get()),
                blockTexture(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get()));

        auSimpleCubicBlock(AUBlocks.SMOOTH_LIGHT);

        auSimpleCubicBlock(AUBlocks.METAL_GRATE_FLOOR);
        auSimpleCubicBlock(AUBlocks.STEEL_PLATE_FLOOR);
        auSimpleCubicBlock(AUBlocks.SMOOTH_METAL_FLOOR);

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

    protected void auSimpleCubicBlock(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }

    protected void auBlockItem(RegistryObject<Block> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile("abandonedunderground:block/" + blockPathHelper(block)));
    }

    private String blockPathHelper(RegistryObject<Block> registryBlockObject) {
        return ForgeRegistries.BLOCKS.getKey(registryBlockObject.get()).getPath();
    }
}
