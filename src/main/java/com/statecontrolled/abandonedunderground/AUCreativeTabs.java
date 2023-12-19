package com.statecontrolled.abandonedunderground;

import java.util.logging.Level;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.item.AUItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

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

                        output.accept(AUBlocks.SMOOTH_LIGHT.get());

                        output.accept(AUBlocks.METAL_GRATE_FLOOR.get());
                        output.accept(AUBlocks.STEEL_PLATE_FLOOR.get());
                        output.accept(AUBlocks.SMOOTH_METAL_FLOOR.get());

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
