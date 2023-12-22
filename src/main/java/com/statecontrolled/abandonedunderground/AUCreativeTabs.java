package com.statecontrolled.abandonedunderground;

import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.item.AUItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * Sets up the Creative Mode tab for the AbandonedUnderground.
 **/
public class AUCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbandonedUnderground.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ABANDONED_UNDERGROUND_TAB = CREATIVE_MODE_TABS.register("abandonedunderground_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AUBlocks.SMALL_WHITE_TILES.get()))
                    .title(Component.translatable("creativetab.abandonedunderground_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(AUItems.DIMENSIONAL_THREAD_MODULATOR.get());

                        output.accept(AUBlocks.SMALL_WHITE_TILES.get());
                        output.accept(AUBlocks.CRACKED_SMALL_WHITE_TILES.get());
                        output.accept(AUBlocks.DIRTY_SMALL_WHITE_TILES.get());
                        output.accept(AUBlocks.MOSSY_SMALL_WHITE_TILES.get());
                        output.accept(AUBlocks.CHISELED_SMALL_WHITE_TILES.get());

                        output.accept(AUBlocks.WHITE_TILES.get());
                        output.accept(AUBlocks.CRACKED_WHITE_TILES.get());
                        output.accept(AUBlocks.DIRTY_WHITE_TILES.get());
                        output.accept(AUBlocks.MOSSY_WHITE_TILES.get());
                        output.accept(AUBlocks.CHISELED_WHITE_TILES.get());

                        output.accept(AUBlocks.SMALL_BLACK_TILES.get());
                        output.accept(AUBlocks.CRACKED_SMALL_BLACK_TILES.get());
                        output.accept(AUBlocks.DIRTY_SMALL_BLACK_TILES.get());
                        output.accept(AUBlocks.MOSSY_SMALL_BLACK_TILES.get());
                        output.accept(AUBlocks.CHISELED_SMALL_BLACK_TILES.get());

                        output.accept(AUBlocks.BLACK_TILES.get());
                        output.accept(AUBlocks.CRACKED_BLACK_TILES.get());
                        output.accept(AUBlocks.DIRTY_BLACK_TILES.get());
                        output.accept(AUBlocks.MOSSY_BLACK_TILES.get());
                        output.accept(AUBlocks.CHISELED_BLACK_TILES.get());

                        output.accept(AUBlocks.CONCRETE_PLATFORM.get());
                        output.accept(AUBlocks.CRACKED_CONCRETE_PLATFORM.get());
                        output.accept(AUBlocks.DIRTY_CONCRETE_PLATFORM.get());
                        output.accept(AUBlocks.MOSSY_CONCRETE_PLATFORM.get());

                        output.accept(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get());
                        output.accept(AUBlocks.CONCRETE_ROAD_SOLID_LINE.get());
                        output.accept(AUBlocks.CONCRETE_ROAD_DASHED_LINE.get());

                        output.accept(AUBlocks.METAL_GRATE_FLOOR.get());
                        output.accept(AUBlocks.RUSTED_METAL_GRATE_FLOOR.get());

                        output.accept(AUBlocks.STEEL_PLATE_FLOOR.get());
                        output.accept(AUBlocks.RUSTED_STEEL_PLATE_FLOOR.get());
                        output.accept(AUBlocks.MOSSY_STEEL_PLATE_FLOOR.get());

                        output.accept(AUBlocks.SMOOTH_METAL_FLOOR.get());
                        output.accept(AUBlocks.RUSTED_SMOOTH_METAL_FLOOR.get());
                        output.accept(AUBlocks.MOSSY_SMOOTH_METAL_FLOOR.get());

                        output.accept(AUBlocks.CORRUGATED_METAL.get());
                        output.accept(AUBlocks.RUSTED_CORRUGATED_METAL.get());
                        output.accept(AUBlocks.MOSSY_CORRUGATED_METAL.get());

                        output.accept(AUBlocks.BLACK_ASPHALT.get());
                        output.accept(AUBlocks.BLACK_ASPHALT_YELLOW_LINE.get());
                        output.accept(AUBlocks.BLACK_ASPHALT_WHITE_LINE.get());
                        output.accept(AUBlocks.CRACKED_BLACK_ASPHALT.get());
                        output.accept(AUBlocks.GRAY_ASPHALT.get());
                        output.accept(AUBlocks.GRAY_ASPHALT_YELLOW_LINE.get());
                        output.accept(AUBlocks.GRAY_ASPHALT_WHITE_LINE.get());
                        output.accept(AUBlocks.CRACKED_GRAY_ASPHALT.get());

                        output.accept(AUBlocks.SIDEWALK.get());
                        output.accept(AUBlocks.CRACKED_SIDEWALK.get());
                        output.accept(AUBlocks.MOSSY_SIDEWALK.get());
                        output.accept(AUBlocks.DIRTY_SIDEWALK.get());
                        output.accept(AUBlocks.SIDEWALK_PANEL.get());
                        output.accept(AUBlocks.CRACKED_SIDEWALK_PANEL.get());
                        output.accept(AUBlocks.MOSSY_SIDEWALK_PANEL.get());
                        output.accept(AUBlocks.DIRTY_SIDEWALK_PANEL.get());

                        output.accept(AUBlocks.SMOOTH_LIGHT.get());

                        output.accept(AUBlocks.FLUORESCENT_LIGHT_BLACK.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_BLUE.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_BROWN.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_CYAN.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_GRAY.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_GREEN.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_LIGHT_BLUE.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_LIGHT_GRAY.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_LIME.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_MAGENTA.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_ORANGE.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_PINK.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_PURPLE.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_RED.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_WHITE.get());
                        output.accept(AUBlocks.FLUORESCENT_LIGHT_YELLOW.get());

                        ///////////////////////////////////////////////////////

                        output.accept(AUBlocks.SMALL_WHITE_TILE_STAIRS.get());
                        output.accept(AUBlocks.DIRTY_SMALL_WHITE_TILE_STAIRS.get());
                        output.accept(AUBlocks.MOSSY_SMALL_WHITE_TILE_STAIRS.get());

                        output.accept(AUBlocks.WHITE_TILE_STAIRS.get());
                        output.accept(AUBlocks.DIRTY_WHITE_TILE_STAIRS.get());
                        output.accept(AUBlocks.MOSSY_WHITE_TILE_STAIRS.get());

                        output.accept(AUBlocks.SMALL_BLACK_TILE_STAIRS.get());
                        output.accept(AUBlocks.DIRTY_SMALL_BLACK_TILE_STAIRS.get());
                        output.accept(AUBlocks.MOSSY_SMALL_BLACK_TILE_STAIRS.get());

                        output.accept(AUBlocks.BLACK_TILE_STAIRS.get());
                        output.accept(AUBlocks.DIRTY_BLACK_TILE_STAIRS.get());
                        output.accept(AUBlocks.MOSSY_BLACK_TILE_STAIRS.get());

                        output.accept(AUBlocks.CONCRETE_PLATFORM_STAIRS.get());
                        output.accept(AUBlocks.DIRTY_CONCRETE_PLATFORM_STAIRS.get());
                        output.accept(AUBlocks.MOSSY_CONCRETE_PLATFORM_STAIRS.get());

                        output.accept(AUBlocks.STEEL_PLATE_STAIRS.get());
                        output.accept(AUBlocks.SMOOTH_METAL_STAIRS.get());

                        ///////////////////////////////////////////////////////

                        output.accept(AUBlocks.SMALL_WHITE_TILE_SLAB.get());
                        output.accept(AUBlocks.DIRTY_SMALL_WHITE_TILE_SLAB.get());
                        output.accept(AUBlocks.MOSSY_SMALL_WHITE_TILE_SLAB.get());

                        output.accept(AUBlocks.WHITE_TILE_SLAB.get());
                        output.accept(AUBlocks.DIRTY_WHITE_TILE_SLAB.get());
                        output.accept(AUBlocks.MOSSY_WHITE_TILE_SLAB.get());

                        output.accept(AUBlocks.SMALL_BLACK_TILE_SLAB.get());
                        output.accept(AUBlocks.DIRTY_SMALL_BLACK_TILE_SLAB.get());
                        output.accept(AUBlocks.MOSSY_SMALL_BLACK_TILE_SLAB.get());

                        output.accept(AUBlocks.BLACK_TILE_SLAB.get());
                        output.accept(AUBlocks.DIRTY_BLACK_TILE_SLAB.get());
                        output.accept(AUBlocks.MOSSY_BLACK_TILE_SLAB.get());

                        output.accept(AUBlocks.CONCRETE_PLATFORM_SLAB.get());
                        output.accept(AUBlocks.DIRTY_CONCRETE_PLATFORM_SLAB.get());
                        output.accept(AUBlocks.MOSSY_CONCRETE_PLATFORM_SLAB.get());

                        output.accept(AUBlocks.CONCRETE_ROAD_SOLID_LINE_SLAB.get());
                        output.accept(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE_SLAB.get());
                        output.accept(AUBlocks.CONCRETE_ROAD_DASHED_LINE_SLAB.get());

                        output.accept(AUBlocks.STEEL_PLATE_SLAB.get());
                        output.accept(AUBlocks.SMOOTH_METAL_SLAB.get());

                    }).build());

    private AUCreativeTabs() {
        ;
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
