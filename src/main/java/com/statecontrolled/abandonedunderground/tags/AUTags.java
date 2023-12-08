package com.statecontrolled.abandonedunderground.tags;

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
        //public static final TagKey<Block> AU_BLOCK_TAG = tag("name");

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AbandonedUnderground.MOD_ID, name));
        }
    }

    /**
     * For creating custom item tags
     */
    public static class AUItemTags {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(AbandonedUnderground.MOD_ID, name));
        }
    }
}
