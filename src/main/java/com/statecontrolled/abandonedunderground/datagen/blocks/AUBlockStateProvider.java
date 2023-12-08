package com.statecontrolled.abandonedunderground.datagen.blocks;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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
        blockWithItem(AUBlocks.LINED_CONCRETE_PLATFORM);

        blockWithItem(AUBlocks.SMOOTH_LIGHT);

        blockWithItem(AUBlocks.METAL_GRATE_FLOOR);
        blockWithItem(AUBlocks.STEEL_PLATE_FLOOR);
        blockWithItem(AUBlocks.SMOOTH_METAL_FLOOR);
    }

    private void blockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
