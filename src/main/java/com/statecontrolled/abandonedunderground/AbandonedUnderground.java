package com.statecontrolled.abandonedunderground;

import com.mojang.logging.LogUtils;
import com.statecontrolled.abandonedunderground.block.ModBlocks;
import com.statecontrolled.abandonedunderground.item.ModItems;

import net.minecraft.client.Minecraft;
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
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AbandonedUnderground.MOD_ID)
public class AbandonedUnderground {
    static {
        final Logger LOGGER = LogUtils.getLogger();
    }

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "abandonedunderground";
    // Directly reference a slf4j logger

    public AbandonedUnderground() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);



        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LogUtils.getLogger().info("COMMON SETUP");
    }

    /**
     * Add items to creative mode tabs
     **/
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ;
    }

    /**
     * Do something when the server starts
     **/
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LogUtils.getLogger().info("Server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    /**
     * Some client setup code
     **/
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            LogUtils.getLogger().info("CLIENT SETUP MINECRAFT NAME : {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
