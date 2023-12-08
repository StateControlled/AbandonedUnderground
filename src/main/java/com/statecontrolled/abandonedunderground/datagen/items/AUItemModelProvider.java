package com.statecontrolled.abandonedunderground.datagen.items;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class AUItemModelProvider extends ItemModelProvider {

    public AUItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    private void registerSimpleItem(RegistryObject<Item> item) {
        withExistingParent(getRegistryObjectPath(item),
                new ResourceLocation("item/generated"))
                .texture("layer0",
                    new ResourceLocation(AbandonedUnderground.MOD_ID, "item/" + getRegistryObjectPath(item))
                );
    }

    private String getRegistryObjectPath(RegistryObject<?> registryObject) {
        return registryObject.getId().getPath();
    }
}
