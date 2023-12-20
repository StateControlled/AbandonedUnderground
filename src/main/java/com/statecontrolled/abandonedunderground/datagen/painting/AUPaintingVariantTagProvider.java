package com.statecontrolled.abandonedunderground.datagen.painting;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AUPaintingVariantTagProvider extends PaintingVariantTagsProvider {

    public AUPaintingVariantTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PaintingVariantTags.PLACEABLE)
            .addOptional(new ResourceLocation(AbandonedUnderground.MOD_ID, "control_panel_1"))
            .addOptional(new ResourceLocation(AbandonedUnderground.MOD_ID, "control_panel_2"))
            .addOptional(new ResourceLocation(AbandonedUnderground.MOD_ID, "control_panel_3"))
            .addOptional(new ResourceLocation(AbandonedUnderground.MOD_ID, "control_panel_4"))
            .addOptional(new ResourceLocation(AbandonedUnderground.MOD_ID, "control_panel_5"));
    }
}
