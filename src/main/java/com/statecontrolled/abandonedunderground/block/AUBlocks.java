package com.statecontrolled.abandonedunderground.block;

import java.util.function.Supplier;
import java.util.logging.Level;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.item.AUItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Holder class for blocks added by the AbandonedUnderground.
 **/
public class AUBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AbandonedUnderground.MOD_ID);

    /*BLOCKS*/
    public static final RegistryObject<Block> SMALL_WHITE_TILES = registerBlock("small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_SMALL_WHITE_TILES = registerBlock("cracked_small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_SMALL_WHITE_TILES = registerBlock("dirty_small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SMALL_WHITE_TILES = registerBlock("mossy_small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_SMALL_WHITE_TILES = registerBlock("chiseled_small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_TILES = registerBlock("white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_WHITE_TILES = registerBlock("cracked_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_WHITE_TILES = registerBlock("dirty_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_WHITE_TILES = registerBlock("mossy_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_WHITE_TILES = registerBlock("chiseled_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMALL_BLACK_TILES = registerBlock("small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_SMALL_BLACK_TILES = registerBlock("cracked_small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_SMALL_BLACK_TILES = registerBlock("dirty_small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SMALL_BLACK_TILES = registerBlock("mossy_small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_SMALL_BLACK_TILES = registerBlock("chiseled_small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TILES = registerBlock("black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_BLACK_TILES = registerBlock("cracked_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_BLACK_TILES = registerBlock("dirty_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_BLACK_TILES = registerBlock("mossy_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_BLACK_TILES = registerBlock("chiseled_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CONCRETE_PLATFORM = registerBlock("concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CONCRETE_PLATFORM = registerBlock("cracked_concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_CONCRETE_PLATFORM = registerBlock("dirty_concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CONCRETE_PLATFORM = registerBlock("mossy_concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CONCRETE_ROAD_DOUBLE_LINE = registerBlock("concrete_road_double_line",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CONCRETE_ROAD_DASHED_LINE = registerBlock("concrete_road_dashed_line",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CONCRETE_ROAD_SOLID_LINE = registerBlock("concrete_road_solid_line",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIGHT = registerBlock("smooth_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> METAL_GRATE_FLOOR = registerBlock("metal_grate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STEEL_PLATE_FLOOR = registerBlock("steel_plate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_METAL_FLOOR = registerBlock("smooth_metal_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    /*STAIRS*/
    public static final RegistryObject<Block> WHITE_TILE_STAIRS = registerBlock("white_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.WHITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MOSSY_WHITE_TILE_STAIRS = registerBlock("mossy_white_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.WHITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_WHITE_TILE_STAIRS = registerBlock("dirty_white_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.WHITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));

    public static final RegistryObject<Block> BLACK_TILE_STAIRS = registerBlock("black_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.BLACK_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MOSSY_BLACK_TILE_STAIRS = registerBlock("mossy_black_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.BLACK_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_BLACK_TILE_STAIRS = registerBlock("dirty_black_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.BLACK_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));

    public static final RegistryObject<Block> SMALL_WHITE_TILE_STAIRS = registerBlock("small_white_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.WHITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MOSSY_SMALL_WHITE_TILE_STAIRS = registerBlock("mossy_small_white_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.WHITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_SMALL_WHITE_TILE_STAIRS = registerBlock("dirty_small_white_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.WHITE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));

    public static final RegistryObject<Block> SMALL_BLACK_TILE_STAIRS = registerBlock("small_black_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.BLACK_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MOSSY_SMALL_BLACK_TILE_STAIRS = registerBlock("mossy_small_black_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.BLACK_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_SMALL_BLACK_TILE_STAIRS = registerBlock("dirty_small_black_tile_stairs",
            () -> new StairBlock(() -> AUBlocks.BLACK_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));

    public static final RegistryObject<Block> CONCRETE_PLATFORM_STAIRS = registerBlock("concrete_platform_stairs",
            () -> new StairBlock(() -> AUBlocks.CONCRETE_PLATFORM.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MOSSY_CONCRETE_PLATFORM_STAIRS = registerBlock("mossy_concrete_platform_stairs",
            () -> new StairBlock(() -> AUBlocks.CONCRETE_PLATFORM.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_CONCRETE_PLATFORM_STAIRS = registerBlock("dirty_concrete_platform_stairs",
            () -> new StairBlock(() -> AUBlocks.CONCRETE_PLATFORM.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));

    public static final RegistryObject<Block> STEEL_PLATE_STAIRS = registerBlock("steel_plate_stairs",
            () -> new StairBlock(() -> AUBlocks.STEEL_PLATE_FLOOR.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> SMOOTH_METAL_STAIRS = registerBlock("smooth_metal_stairs",
            () -> new StairBlock(() -> AUBlocks.SMOOTH_METAL_FLOOR.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)));

    /*SLABS*/
    public static final RegistryObject<Block> WHITE_TILE_SLAB = registerBlock("white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_WHITE_TILE_SLAB = registerBlock("dirty_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MOSSY_WHITE_TILE_SLAB = registerBlock("mossy_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));

    public static final RegistryObject<Block> BLACK_TILE_SLAB = registerBlock("black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_BLACK_TILE_SLAB = registerBlock("dirty_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MOSSY_BLACK_TILE_SLAB = registerBlock("mossy_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));

    public static final RegistryObject<Block> SMALL_WHITE_TILE_SLAB = registerBlock("small_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_SMALL_WHITE_TILE_SLAB = registerBlock("dirty_small_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MOSSY_SMALL_WHITE_TILE_SLAB = registerBlock("mossy_small_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));

    public static final RegistryObject<Block> SMALL_BLACK_TILE_SLAB = registerBlock("small_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_SMALL_BLACK_TILE_SLAB = registerBlock("dirty_small_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MOSSY_SMALL_BLACK_TILE_SLAB = registerBlock("mossy_small_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));

    public static final RegistryObject<Block> CONCRETE_PLATFORM_SLAB = registerBlock("concrete_platform_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_CONCRETE_PLATFORM_SLAB = registerBlock("dirty_concrete_platform_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MOSSY_CONCRETE_PLATFORM_SLAB = registerBlock("mossy_concrete_platform_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));

    public static final RegistryObject<Block> CONCRETE_ROAD_DOUBLE_LINE_SLAB = registerBlock("concrete_road_double_line_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> CONCRETE_ROAD_DASHED_LINE_SLAB = registerBlock("concrete_road_dashed_line_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> CONCRETE_ROAD_SOLID_LINE_SLAB = registerBlock("concrete_road_solid_line_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));

    public static final RegistryObject<Block> STEEL_PLATE_SLAB = registerBlock("steel_plate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> SMOOTH_METAL_SLAB = registerBlock("smooth_metal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));

    private AUBlocks() {
        ;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> result = BLOCKS.register(name, block);
        registerBlockItem(name, result);
        return result;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        AUItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
