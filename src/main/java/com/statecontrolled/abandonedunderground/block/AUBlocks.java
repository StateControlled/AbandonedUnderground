package com.statecontrolled.abandonedunderground.block;

import java.util.function.Supplier;

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
            () -> new AUHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CONCRETE_ROAD_DASHED_LINE = registerBlock("concrete_road_dashed_line",
            () -> new AUHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CONCRETE_ROAD_SOLID_LINE = registerBlock("concrete_road_solid_line",
            () -> new AUHorizontalBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIGHT = registerBlock("smooth_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> METAL_GRATE_FLOOR = registerBlock("metal_grate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STEEL_PLATE_FLOOR = registerBlock("steel_plate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_METAL_FLOOR = registerBlock("smooth_metal_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> CORRUGATED_METAL = registerBlock("corrugated_metal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUSTED_CORRUGATED_METAL = registerBlock("rusted_corrugated_metal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CORRUGATED_METAL = registerBlock("mossy_corrugated_metal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_ASPHALT = registerBlock("black_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_ASPHALT_YELLOW_LINE = registerBlock("black_asphalt_yellow_line",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_ASPHALT_WHITE_LINE = registerBlock("black_asphalt_white_line",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_BLACK_ASPHALT = registerBlock("cracked_black_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAY_ASPHALT = registerBlock("gray_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_ASPHALT_YELLOW_LINE = registerBlock("gray_asphalt_yellow_line",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_ASPHALT_WHITE_LINE = registerBlock("gray_asphalt_white_line",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_GRAY_ASPHALT = registerBlock("cracked_gray_asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUSTED_METAL_GRATE_FLOOR = registerBlock("rusted_metal_grate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUSTED_STEEL_PLATE_FLOOR = registerBlock("rusted_steel_plate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_STEEL_PLATE_FLOOR = registerBlock("mossy_steel_plate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUSTED_SMOOTH_METAL_FLOOR = registerBlock("rusted_smooth_metal_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SMOOTH_METAL_FLOOR = registerBlock("mossy_smooth_metal_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SIDEWALK = registerBlock("sidewalk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_SIDEWALK = registerBlock("cracked_sidewalk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SIDEWALK = registerBlock("mossy_sidewalk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_SIDEWALK = registerBlock("dirty_sidewalk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SIDEWALK_PANEL = registerBlock("sidewalk_panel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_SIDEWALK_PANEL = registerBlock("cracked_sidewalk_panel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SIDEWALK_PANEL = registerBlock("mossy_sidewalk_panel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_SIDEWALK_PANEL = registerBlock("dirty_sidewalk_panel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FLUORESCENT_LIGHT_BLACK = registerBlock("fluorescent_light_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_BLUE = registerBlock("fluorescent_light_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_BROWN = registerBlock("fluorescent_light_brown",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_CYAN = registerBlock("fluorescent_light_cyan",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_GRAY = registerBlock("fluorescent_light_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_GREEN = registerBlock("fluorescent_light_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_LIGHT_BLUE = registerBlock("fluorescent_light_light_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_LIGHT_GRAY = registerBlock("fluorescent_light_light_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_LIME = registerBlock("fluorescent_light_lime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_MAGENTA = registerBlock("fluorescent_light_magenta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_ORANGE = registerBlock("fluorescent_light_orange",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_PINK = registerBlock("fluorescent_light_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_PURPLE = registerBlock("fluorescent_light_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_RED = registerBlock("fluorescent_light_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_WHITE = registerBlock("fluorescent_light_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLUORESCENT_LIGHT_YELLOW = registerBlock("fluorescent_light_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops()));


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
