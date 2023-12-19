package com.statecontrolled.abandonedunderground;

import java.io.IOException;
import java.util.UUID;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.statecontrolled.abandonedunderground.block.AUBlocks;
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
    public static final Logger LOGGER = Logger.getLogger(AbandonedUnderground.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("abandoned_underground.log", false);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            LOGGER.setLevel(Level.FINE);
            String ID = UUID.randomUUID().toString();
            LOGGER.log(Level.INFO, ID + " : Init Logger");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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
