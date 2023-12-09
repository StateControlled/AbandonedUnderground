package com.statecontrolled.abandonedunderground;

import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.item.AUCreativeTabs;
import com.statecontrolled.abandonedunderground.item.AUItems;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AbandonedUnderground.MOD_ID)
public class AbandonedUnderground {
    public static final String MOD_ID = "abandonedunderground";

    public AbandonedUnderground() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AUCreativeTabs.register(modEventBus);
        AUBlocks.register(modEventBus);
        AUItems.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events
        MinecraftForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ;
    }

    /**
     * Add items to existing creative mode tabs
     **/
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ;
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        ;
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ;
        }
    }
}
