package com.statecontrolled.abandonedunderground.jeicompat;

import javax.annotation.Nonnull;

import org.jetbrains.annotations.NotNull;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;

public class AUJEI implements IModPlugin {

    /**
     * Needs public constructor
     **/
    public AUJEI() {
        ;
    }

    @Override
    @Nonnull
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(AbandonedUnderground.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {

    }

    /**
     * Allows JEI to recognize custom GUIs and show recipes when a relevant area in the GUI is clicked.
     **/
    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {

    }
}
