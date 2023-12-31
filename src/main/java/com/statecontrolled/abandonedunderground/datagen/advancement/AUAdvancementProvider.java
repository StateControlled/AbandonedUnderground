package com.statecontrolled.abandonedunderground.datagen.advancement;

import java.util.function.Consumer;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.item.AUItems;
import com.statecontrolled.abandonedunderground.worldgen.AbandonedUndergroundDimension;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.ChangeDimensionTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

public class AUAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {

    public AUAdvancementProvider() {
        ;
    }

    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement root = Advancement.Builder.advancement()
            .display(new DisplayInfo(new ItemStack(AUItems.DIMENSIONAL_THREAD_MODULATOR.get()),
                    Component.translatable("advancement.abandonedunderground.root"),
                    Component.translatable("advancement.abandonedunderground.root.description"),
                    new ResourceLocation(AbandonedUnderground.MOD_ID, "textures/block/small_white_tiles.png"),
                    FrameType.TASK,
                    true, true, false
                )
            )
            .addCriterion("has_dimensional_thread_modulator", InventoryChangeTrigger.TriggerInstance.hasItems(AUItems.DIMENSIONAL_THREAD_MODULATOR.get()))
        .save(saver, new ResourceLocation(AbandonedUnderground.MOD_ID, "abandonedunderground"), existingFileHelper);

        Advancement dimension = Advancement.Builder.advancement()
            .display(new DisplayInfo(new ItemStack(AUBlocks.SMALL_WHITE_TILES.get()),
                    Component.translatable("advancement.abandonedunderground.dim"),
                    Component.translatable("advancement.abandonedunderground.dim.description"),
                    null,
                    FrameType.TASK,
                    true, true, false
                )
            )
            .parent(root)
            .addCriterion("teleport_to_dimension", ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(AbandonedUndergroundDimension.ABANDONEDUNDERGROUND_LEVEL))
        .save(saver, new ResourceLocation(AbandonedUnderground.MOD_ID, "abandonedunderground_enter_dimension"), existingFileHelper);
    }

}
