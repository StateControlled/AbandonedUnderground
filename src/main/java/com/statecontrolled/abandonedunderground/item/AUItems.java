package com.statecontrolled.abandonedunderground.item;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AUItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AbandonedUnderground.MOD_ID);

//    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
//            () -> new Item(new Item.Properties()));

    private AUItems() {
        ;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
