package com.statecontrolled.abandonedunderground.item.painting;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AUPaintings {
    public static final DeferredRegister<PaintingVariant> AU_PAINTINGS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, AbandonedUnderground.MOD_ID);

    public static final RegistryObject<PaintingVariant> CONTROL_PANEL_1 = AU_PAINTINGS.register("control_panel_1",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> CONTROL_PANEL_2 = AU_PAINTINGS.register("control_panel_2",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> CONTROL_PANEL_3 = AU_PAINTINGS.register("control_panel_3",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> CONTROL_PANEL_4 = AU_PAINTINGS.register("control_panel_4",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> CONTROL_PANEL_5 = AU_PAINTINGS.register("control_panel_5",
            () -> new PaintingVariant(32, 16));

    private AUPaintings() {
        ;
    }

    public static void register(IEventBus eventBus) {
        AU_PAINTINGS.register(eventBus);
    }
}
