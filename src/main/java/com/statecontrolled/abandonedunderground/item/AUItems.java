package com.statecontrolled.abandonedunderground.item;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.item.portal.DimensionalThreadModulatorItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AUItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AbandonedUnderground.MOD_ID);

    public static final RegistryObject<Item> DIMENSIONAL_THREAD_MODULATOR = ITEMS.register("dimensional_thread_modulator",
            () -> new DimensionalThreadModulatorItem(new Item.Properties().stacksTo(1)));

    private AUItems() {
        ;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
