package com.statecontrolled.abandonedunderground.datagen.blocks;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.tags.AUTags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AUBlockTagGenerator extends BlockTagsProvider{

    public AUBlockTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(AUTags.AUBlockTags.CONCRETE_BLOCK_TAG)
                .add(
                    Blocks.BLACK_CONCRETE,
                    Blocks.BLUE_CONCRETE,
                    Blocks.BROWN_CONCRETE,
                    Blocks.CYAN_CONCRETE,
                    Blocks.GRAY_CONCRETE,
                    Blocks.GREEN_CONCRETE,
                    Blocks.LIGHT_BLUE_CONCRETE,
                    Blocks.LIGHT_GRAY_CONCRETE,
                    Blocks.LIME_CONCRETE,
                    Blocks.MAGENTA_CONCRETE,
                    Blocks.ORANGE_CONCRETE,
                    Blocks.PINK_CONCRETE,
                    Blocks.PURPLE_CONCRETE,
                    Blocks.RED_CONCRETE,
                    Blocks.WHITE_CONCRETE,
                    Blocks.YELLOW_CONCRETE
                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(
                AUBlocks.BRIGHT_WHITE_BLOCK.get(),

                AUBlocks.SMALL_WHITE_TILES.get(),
                AUBlocks.CRACKED_SMALL_WHITE_TILES.get(),
                AUBlocks.DIRTY_SMALL_WHITE_TILES.get(),
                AUBlocks.MOSSY_SMALL_WHITE_TILES.get(),
                AUBlocks.CHISELED_SMALL_WHITE_TILES.get(),

                AUBlocks.WHITE_TILES.get(),
                AUBlocks.CRACKED_WHITE_TILES.get(),
                AUBlocks.DIRTY_WHITE_TILES.get(),
                AUBlocks.MOSSY_WHITE_TILES.get(),
                AUBlocks.CHISELED_WHITE_TILES.get(),

                AUBlocks.SMALL_BLACK_TILES.get(),
                AUBlocks.CRACKED_SMALL_BLACK_TILES.get(),
                AUBlocks.DIRTY_SMALL_BLACK_TILES.get(),
                AUBlocks.MOSSY_SMALL_BLACK_TILES.get(),
                AUBlocks.CHISELED_SMALL_BLACK_TILES.get(),

                AUBlocks.BLACK_TILES.get(),
                AUBlocks.CRACKED_BLACK_TILES.get(),
                AUBlocks.DIRTY_BLACK_TILES.get(),
                AUBlocks.MOSSY_BLACK_TILES.get(),
                AUBlocks.CHISELED_BLACK_TILES.get(),

                AUBlocks.CONCRETE_PLATFORM.get(),
                AUBlocks.CRACKED_CONCRETE_PLATFORM.get(),
                AUBlocks.DIRTY_CONCRETE_PLATFORM.get(),
                AUBlocks.MOSSY_CONCRETE_PLATFORM.get(),

                AUBlocks.CONCRETE_ROAD_DASHED_LINE.get(),
                AUBlocks.CONCRETE_ROAD_SOLID_LINE.get(),
                AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get(),

                AUBlocks.SMOOTH_LIGHT.get(),

                AUBlocks.METAL_GRATE_FLOOR.get(),
                AUBlocks.STEEL_PLATE_FLOOR.get(),
                AUBlocks.SMOOTH_METAL_FLOOR.get(),

                AUBlocks.CORRUGATED_METAL.get(),
                AUBlocks.RUSTED_CORRUGATED_METAL.get(),
                AUBlocks.MOSSY_CORRUGATED_METAL.get(),

                AUBlocks.BLACK_ASPHALT.get(),
                AUBlocks.BLACK_ASPHALT_YELLOW_LINE.get(),
                AUBlocks.BLACK_ASPHALT_WHITE_LINE.get(),
                AUBlocks.CRACKED_BLACK_ASPHALT.get(),
                AUBlocks.GRAY_ASPHALT.get(),
                AUBlocks.GRAY_ASPHALT_YELLOW_LINE.get(),
                AUBlocks.GRAY_ASPHALT_WHITE_LINE.get(),
                AUBlocks.CRACKED_GRAY_ASPHALT.get(),

                AUBlocks.RUSTED_METAL_GRATE_FLOOR.get(),
                AUBlocks.RUSTED_STEEL_PLATE_FLOOR.get(),
                AUBlocks.MOSSY_STEEL_PLATE_FLOOR.get(),
                AUBlocks.RUSTED_SMOOTH_METAL_FLOOR.get(),
                AUBlocks.MOSSY_SMOOTH_METAL_FLOOR.get(),

                AUBlocks.SIDEWALK.get(),
                AUBlocks.CRACKED_SIDEWALK.get(),
                AUBlocks.MOSSY_SIDEWALK.get(),
                AUBlocks.DIRTY_SIDEWALK.get(),
                AUBlocks.SIDEWALK_PANEL.get(),
                AUBlocks.CRACKED_SIDEWALK_PANEL.get(),
                AUBlocks.MOSSY_SIDEWALK_PANEL.get(),
                AUBlocks.DIRTY_SIDEWALK_PANEL.get(),

                AUBlocks.BLACK_FLUORESCENT_LIGHT.get(),
                AUBlocks.BLUE_FLUORESCENT_LIGHT.get(),
                AUBlocks.BROWN_FLUORESCENT_LIGHT.get(),
                AUBlocks.CYAN_FLUORESCENT_LIGHT.get(),
                AUBlocks.GRAY_FLUORESCENT_LIGHT.get(),
                AUBlocks.GREEN_FLUORESCENT_LIGHT.get(),
                AUBlocks.LIGHT_BLUE_FLUORESCENT_LIGHT.get(),
                AUBlocks.LIGHT_GRAY_FLUORESCENT_LIGHT.get(),
                AUBlocks.LIME_FLUORESCENT_LIGHT.get(),
                AUBlocks.MAGENTA_FLUORESCENT_LIGHT.get(),
                AUBlocks.ORANGE_FLUORESCENT_LIGHT.get(),
                AUBlocks.PINK_FLUORESCENT_LIGHT.get(),
                AUBlocks.PURPLE_FLUORESCENT_LIGHT.get(),
                AUBlocks.RED_FLUORESCENT_LIGHT.get(),
                AUBlocks.WHITE_FLUORESCENT_LIGHT.get(),
                AUBlocks.YELLOW_FLUORESCENT_LIGHT.get()
            );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
            .add(
                AUBlocks.SMALL_WHITE_TILES.get(),
                AUBlocks.CRACKED_SMALL_WHITE_TILES.get(),
                AUBlocks.DIRTY_SMALL_WHITE_TILES.get(),
                AUBlocks.MOSSY_SMALL_WHITE_TILES.get(),
                AUBlocks.CHISELED_SMALL_WHITE_TILES.get(),

                AUBlocks.WHITE_TILES.get(),
                AUBlocks.CRACKED_WHITE_TILES.get(),
                AUBlocks.DIRTY_WHITE_TILES.get(),
                AUBlocks.MOSSY_WHITE_TILES.get(),
                AUBlocks.CHISELED_WHITE_TILES.get(),

                AUBlocks.SMALL_BLACK_TILES.get(),
                AUBlocks.CRACKED_SMALL_BLACK_TILES.get(),
                AUBlocks.DIRTY_SMALL_BLACK_TILES.get(),
                AUBlocks.MOSSY_SMALL_BLACK_TILES.get(),
                AUBlocks.CHISELED_SMALL_BLACK_TILES.get(),

                AUBlocks.BLACK_TILES.get(),
                AUBlocks.CRACKED_BLACK_TILES.get(),
                AUBlocks.DIRTY_BLACK_TILES.get(),
                AUBlocks.MOSSY_BLACK_TILES.get(),
                AUBlocks.CHISELED_BLACK_TILES.get(),

                AUBlocks.SMOOTH_LIGHT.get(),
                AUBlocks.BLACK_FLUORESCENT_LIGHT.get(),
                AUBlocks.BLUE_FLUORESCENT_LIGHT.get(),
                AUBlocks.BROWN_FLUORESCENT_LIGHT.get(),
                AUBlocks.CYAN_FLUORESCENT_LIGHT.get(),
                AUBlocks.GRAY_FLUORESCENT_LIGHT.get(),
                AUBlocks.GREEN_FLUORESCENT_LIGHT.get(),
                AUBlocks.LIGHT_BLUE_FLUORESCENT_LIGHT.get(),
                AUBlocks.LIGHT_GRAY_FLUORESCENT_LIGHT.get(),
                AUBlocks.LIME_FLUORESCENT_LIGHT.get(),
                AUBlocks.MAGENTA_FLUORESCENT_LIGHT.get(),
                AUBlocks.ORANGE_FLUORESCENT_LIGHT.get(),
                AUBlocks.PINK_FLUORESCENT_LIGHT.get(),
                AUBlocks.PURPLE_FLUORESCENT_LIGHT.get(),
                AUBlocks.RED_FLUORESCENT_LIGHT.get(),
                AUBlocks.WHITE_FLUORESCENT_LIGHT.get(),
                AUBlocks.YELLOW_FLUORESCENT_LIGHT.get()
            );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
            .add(
                AUBlocks.CONCRETE_PLATFORM.get(),
                AUBlocks.CRACKED_CONCRETE_PLATFORM.get(),
                AUBlocks.DIRTY_CONCRETE_PLATFORM.get(),
                AUBlocks.MOSSY_CONCRETE_PLATFORM.get(),

                AUBlocks.CONCRETE_ROAD_DASHED_LINE.get(),
                AUBlocks.CONCRETE_ROAD_SOLID_LINE.get(),
                AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get(),

                AUBlocks.METAL_GRATE_FLOOR.get(),
                AUBlocks.STEEL_PLATE_FLOOR.get(),
                AUBlocks.SMOOTH_METAL_FLOOR.get(),
                AUBlocks.CORRUGATED_METAL.get(),
                AUBlocks.RUSTED_CORRUGATED_METAL.get(),
                AUBlocks.MOSSY_CORRUGATED_METAL.get(),

                AUBlocks.BLACK_ASPHALT.get(),
                AUBlocks.BLACK_ASPHALT_YELLOW_LINE.get(),
                AUBlocks.BLACK_ASPHALT_WHITE_LINE.get(),
                AUBlocks.CRACKED_BLACK_ASPHALT.get(),
                AUBlocks.GRAY_ASPHALT.get(),
                AUBlocks.GRAY_ASPHALT_YELLOW_LINE.get(),
                AUBlocks.GRAY_ASPHALT_WHITE_LINE.get(),
                AUBlocks.CRACKED_GRAY_ASPHALT.get(),

                AUBlocks.RUSTED_METAL_GRATE_FLOOR.get(),
                AUBlocks.RUSTED_STEEL_PLATE_FLOOR.get(),
                AUBlocks.MOSSY_STEEL_PLATE_FLOOR.get(),
                AUBlocks.RUSTED_SMOOTH_METAL_FLOOR.get(),
                AUBlocks.MOSSY_SMOOTH_METAL_FLOOR.get(),

                AUBlocks.SIDEWALK.get(),
                AUBlocks.CRACKED_SIDEWALK.get(),
                AUBlocks.MOSSY_SIDEWALK.get(),
                AUBlocks.DIRTY_SIDEWALK.get(),
                AUBlocks.SIDEWALK_PANEL.get(),
                AUBlocks.CRACKED_SIDEWALK_PANEL.get(),
                AUBlocks.MOSSY_SIDEWALK_PANEL.get(),
                AUBlocks.DIRTY_SIDEWALK_PANEL.get()
            );

        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        //this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
    }
}
