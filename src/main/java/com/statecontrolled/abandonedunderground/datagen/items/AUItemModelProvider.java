package com.statecontrolled.abandonedunderground.datagen.items;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.item.AUItems;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AUItemModelProvider extends ItemModelProvider {

    public AUItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AbandonedUnderground.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        registerSimpleItem(AUItems.DIMENSIONAL_THREAD_MODULATOR);
        registerSimpleItem(AUItems.GLASS_DISC);

        registerSimpleBlockItem(AUBlocks.WHITE_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.MOSSY_WHITE_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.DIRTY_WHITE_TILE_STAIRS);

        registerSimpleBlockItem(AUBlocks.BLACK_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.MOSSY_BLACK_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.DIRTY_BLACK_TILE_STAIRS);

        registerSimpleBlockItem(AUBlocks.SMALL_WHITE_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.MOSSY_SMALL_WHITE_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.DIRTY_SMALL_WHITE_TILE_STAIRS);

        registerSimpleBlockItem(AUBlocks.SMALL_BLACK_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.MOSSY_SMALL_BLACK_TILE_STAIRS);
        registerSimpleBlockItem(AUBlocks.DIRTY_SMALL_BLACK_TILE_STAIRS);

        registerSimpleBlockItem(AUBlocks.CONCRETE_PLATFORM_STAIRS);
        registerSimpleBlockItem(AUBlocks.MOSSY_CONCRETE_PLATFORM_STAIRS);
        registerSimpleBlockItem(AUBlocks.DIRTY_CONCRETE_PLATFORM_STAIRS);

        registerSimpleBlockItem(AUBlocks.STEEL_PLATE_STAIRS);
        registerSimpleBlockItem(AUBlocks.SMOOTH_METAL_STAIRS);

        registerSimpleBlockItem(AUBlocks.WHITE_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.DIRTY_WHITE_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.MOSSY_WHITE_TILE_SLAB);

        registerSimpleBlockItem(AUBlocks.BLACK_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.DIRTY_BLACK_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.MOSSY_BLACK_TILE_SLAB);

        registerSimpleBlockItem(AUBlocks.SMALL_WHITE_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.DIRTY_SMALL_WHITE_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.MOSSY_SMALL_WHITE_TILE_SLAB);

        registerSimpleBlockItem(AUBlocks.SMALL_BLACK_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.DIRTY_SMALL_BLACK_TILE_SLAB);
        registerSimpleBlockItem(AUBlocks.MOSSY_SMALL_BLACK_TILE_SLAB);

        registerSimpleBlockItem(AUBlocks.CONCRETE_PLATFORM_SLAB);
        registerSimpleBlockItem(AUBlocks.DIRTY_CONCRETE_PLATFORM_SLAB);
        registerSimpleBlockItem(AUBlocks.MOSSY_CONCRETE_PLATFORM_SLAB);

        registerSimpleBlockItem(AUBlocks.CONCRETE_ROAD_DOUBLE_LINE_SLAB);
        registerSimpleBlockItem(AUBlocks.CONCRETE_ROAD_DASHED_LINE_SLAB);
        registerSimpleBlockItem(AUBlocks.CONCRETE_ROAD_SOLID_LINE_SLAB);

        registerSimpleBlockItem(AUBlocks.STEEL_PLATE_SLAB);
        registerSimpleBlockItem(AUBlocks.SMOOTH_METAL_SLAB);

    }

    /**
     * Creates models for a given item. For items like coal, diamonds, or food items.
     * @param item the item
     */
    private void registerSimpleItem(RegistryObject<Item> item) {
        withExistingParent(getRegistryObjectPath(item),
                new ResourceLocation("item/generated"))
                .texture("layer0",
                    new ResourceLocation(AbandonedUnderground.MOD_ID, "item/" + getRegistryObjectPath(item))
                );
    }

    /**
     * Creates models for blocks. It is not necessary to use this for blocks that have no special form (e.g., dirt).
     * @param block the block
     **/
    // evenSimplerBlockItem()
    private void registerSimpleBlockItem(RegistryObject<Block> block) {
        withExistingParent(AbandonedUnderground.MOD_ID + ":" + getForgeRegistryBlockObjectPath(block),
                modLoc("block/" + getForgeRegistryBlockObjectPath(block)));
    }

    /**
     * Gets the path of a given registry object by first calling {@code getId} and then {@code getPath}.
     * @param registryObject    the object to locate
     * @return  The path to the object as a string
     */
    private String getRegistryObjectPath(RegistryObject<?> registryObject) {
        return registryObject.getId().getPath();
    }

    /**
     * Gets the path of a {@code ForgeRegistry} object. This method is specific to blocks.
     * @param block the object to locate
     * @return  The path to the object as a string
     **/
    private String getForgeRegistryBlockObjectPath(RegistryObject<Block> block) {
        if (!block.isPresent()) {
            throw new NullPointerException("Block cannot be found");
        }
        return ForgeRegistries.BLOCKS.getKey(block.get()).getPath();
    }
}
