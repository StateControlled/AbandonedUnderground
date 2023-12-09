package com.statecontrolled.abandonedunderground.tags;

import java.util.logging.Level;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class AUTags {
    private AUTags() {
        ;
    }

    /**
     * For creating custom block tags
     */
    public static class AUBlockTags {
        public static final TagKey<Block> CONCRETE_BLOCK_TAG = tag("minecraft_concrete_blocks");

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AbandonedUnderground.MOD_ID, name));
        }
    }

    /**
     * For creating custom item tags
     */
    public static class AUItemTags {
        public static final TagKey<Item> CONCRETE_ITEM_TAG = tag("minecraft_concrete_items");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(AbandonedUnderground.MOD_ID, name));
        }
    }
}
