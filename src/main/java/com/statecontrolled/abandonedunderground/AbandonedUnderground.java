package com.statecontrolled.abandonedunderground;

import java.io.IOException;
import java.util.UUID;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.item.AUItems;
import com.statecontrolled.abandonedunderground.item.painting.AUPaintings;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * AbandonedUnderground is a mod for Minecraft that adds a new dimension of the same name.
 * @author StateControlled
 **/
@Mod(AbandonedUnderground.MOD_ID)
public class AbandonedUnderground {
    public static final String MOD_ID = "abandonedunderground";
    public static final Logger LOGGER = Logger.getLogger(AbandonedUnderground.class.getName());

    // Initialize logging function
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

    /**
     * Main. Initialize all registry objects.
     **/
    public AbandonedUnderground() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AUCreativeTabs.register(modEventBus);
        AUBlocks.register(modEventBus);
        AUItems.register(modEventBus);
        AUPaintings.register(modEventBus);

        // Register for server and other game events
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
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
