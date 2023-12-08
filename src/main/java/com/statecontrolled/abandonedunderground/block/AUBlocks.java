package com.statecontrolled.abandonedunderground.block;

import java.util.function.Supplier;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.item.AUItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AUBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AbandonedUnderground.MOD_ID);

    public static final RegistryObject<Block> SMALL_WHITE_TILES = registerBlock("small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_SMALL_WHITE_TILES = registerBlock("cracked_small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_SMALL_WHITE_TILES = registerBlock("dirty_small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SMALL_WHITE_TILES = registerBlock("mossy_small_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_SMALL_WHITE_TILE = registerBlock("chiseled_small_white_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_TILES = registerBlock("white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_WHITE_TILES = registerBlock("cracked_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_WHITE_TILES = registerBlock("dirty_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_WHITE_TILES = registerBlock("mossy_white_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_WHITE_TILE = registerBlock("chiseled_white_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMALL_BLACK_TILES = registerBlock("small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_SMALL_BLACK_TILES = registerBlock("cracked_small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_SMALL_BLACK_TILES = registerBlock("dirty_small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SMALL_BLACK_TILES = registerBlock("mossy_small_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_SMALL_BLACK_TILE = registerBlock("chiseled_small_black_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TILES = registerBlock("black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_BLACK_TILES = registerBlock("cracked_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_BLACK_TILES = registerBlock("dirty_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_BLACK_TILES = registerBlock("mossy_black_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_BLACK_TILE = registerBlock("chiseled_black_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CONCRETE_PLATFORM = registerBlock("concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CONCRETE_PLATFORM = registerBlock("cracked_concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRTY_CONCRETE_PLATFORM = registerBlock("dirty_concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CONCRETE_PLATFORM = registerBlock("mossy_concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LINED_CONCRETE_PLATFORM = registerBlock("lined_concrete_platform",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_LIGHT = registerBlock("smooth_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> METAL_GRATE_FLOOR = registerBlock("metal_grate_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STEEL_FLOOR_PLATE = registerBlock("steel_floor_plate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_METAL_FLOOR = registerBlock("smooth_metal_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));

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
