package com.statecontrolled.abandonedunderground.item;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbandonedUnderground.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ABANDONDED_UNDERGROUND_TAB = CREATIVE_MODE_TABS.register("abandonedunderground_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SMALL_WHITE_TILES.get()))
                    .title(Component.translatable("creativetab.abandonedunderground_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.SMALL_WHITE_TILES.get());

                        output.accept(ModBlocks.SMALL_WHITE_TILES.get());
                        output.accept(ModBlocks.CRACKED_SMALL_WHITE_TILES.get());
                        output.accept(ModBlocks.DIRTY_SMALL_WHITE_TILES.get());
                        output.accept(ModBlocks.MOSSY_SMALL_WHITE_TILES.get());
                        output.accept(ModBlocks.CHISELED_SMALL_WHITE_TILE.get());

                        output.accept(ModBlocks.WHITE_TILES.get());
                        output.accept(ModBlocks.CRACKED_WHITE_TILES.get());
                        output.accept(ModBlocks.DIRTY_WHITE_TILES.get());
                        output.accept(ModBlocks.MOSSY_WHITE_TILES.get());
                        output.accept(ModBlocks.CHISELED_WHITE_TILE.get());

                        output.accept(ModBlocks.SMALL_BLACK_TILES.get());
                        output.accept(ModBlocks.CRACKED_SMALL_BLACK_TILES.get());
                        output.accept(ModBlocks.DIRTY_SMALL_BLACK_TILES.get());
                        output.accept(ModBlocks.MOSSY_SMALL_BLACK_TILES.get());
                        output.accept(ModBlocks.CHISELED_SMALL_BLACK_TILE.get());

                        output.accept(ModBlocks.BLACK_TILES.get());
                        output.accept(ModBlocks.CRACKED_BLACK_TILES.get());
                        output.accept(ModBlocks.DIRTY_BLACK_TILES.get());
                        output.accept(ModBlocks.MOSSY_BLACK_TILES.get());
                        output.accept(ModBlocks.CHISELED_BLACK_TILE.get());

                        output.accept(ModBlocks.CONCRETE_PLATFORM.get());
                        output.accept(ModBlocks.CRACKED_CONCRETE_PLATFORM.get());
                        output.accept(ModBlocks.DIRTY_CONCRETE_PLATFORM.get());
                        output.accept(ModBlocks.MOSSY_CONCRETE_PLATFORM.get());
                        output.accept(ModBlocks.LINED_CONCRETE_PLATFORM.get());

                        output.accept(ModBlocks.SMOOTH_LIGHT.get());

                        output.accept(ModBlocks.METAL_GRATE_FLOOR.get());
                        output.accept(ModBlocks.STEEL_FLOOR_PLATE.get());
                        output.accept(ModBlocks.SMOOTH_METAL_FLOOR.get());

                    }).build());

    private ModCreativeTabs() {
        ;
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
