package com.statecontrolled.abandonedunderground.datagen.loot;

import java.util.Set;

import com.statecontrolled.abandonedunderground.block.AUBlocks;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

public class AUBlockLootTables extends BlockLootSubProvider {

    protected AUBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(AUBlocks.SMALL_WHITE_TILES.get());
        this.dropSelf(AUBlocks.CRACKED_SMALL_WHITE_TILES.get());
        this.dropSelf(AUBlocks.DIRTY_SMALL_WHITE_TILES.get());
        this.dropSelf(AUBlocks.MOSSY_SMALL_WHITE_TILES.get());
        this.dropSelf(AUBlocks.CHISELED_SMALL_WHITE_TILE.get());

        this.dropSelf(AUBlocks.WHITE_TILES.get());
        this.dropSelf(AUBlocks.CRACKED_WHITE_TILES.get());
        this.dropSelf(AUBlocks.DIRTY_WHITE_TILES.get());
        this.dropSelf(AUBlocks.MOSSY_WHITE_TILES.get());
        this.dropSelf(AUBlocks.CHISELED_WHITE_TILE.get());

        this.dropSelf(AUBlocks.SMALL_BLACK_TILES.get());
        this.dropSelf(AUBlocks.CRACKED_SMALL_BLACK_TILES.get());
        this.dropSelf(AUBlocks.DIRTY_SMALL_BLACK_TILES.get());
        this.dropSelf(AUBlocks.MOSSY_SMALL_BLACK_TILES.get());
        this.dropSelf(AUBlocks.CHISELED_SMALL_BLACK_TILE.get());

        this.dropSelf(AUBlocks.BLACK_TILES.get());
        this.dropSelf(AUBlocks.CRACKED_BLACK_TILES.get());
        this.dropSelf(AUBlocks.DIRTY_BLACK_TILES.get());
        this.dropSelf(AUBlocks.MOSSY_BLACK_TILES.get());
        this.dropSelf(AUBlocks.CHISELED_BLACK_TILE.get());

        this.dropSelf(AUBlocks.CONCRETE_PLATFORM.get());
        this.dropSelf(AUBlocks.CRACKED_CONCRETE_PLATFORM.get());
        this.dropSelf(AUBlocks.DIRTY_CONCRETE_PLATFORM.get());
        this.dropSelf(AUBlocks.MOSSY_CONCRETE_PLATFORM.get());
        this.dropSelf(AUBlocks.LINED_CONCRETE_PLATFORM.get());

        this.dropSelf(AUBlocks.METAL_GRATE_FLOOR.get());
        this.dropSelf(AUBlocks.STEEL_FLOOR_PLATE.get());
        this.dropSelf(AUBlocks.SMOOTH_METAL_FLOOR.get());

        this.dropSelf(AUBlocks.SMOOTH_LIGHT.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return AUBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    /**
     * Creates ore drops that are like those of Copper Ore.
     * @param oreBlock  the ore block
     * @param droppedItem   the item that is dropped when the block is mined
     * @return  A supplier
     **/
    private LootTable.Builder createVariableOreDrops(Block oreBlock, Item droppedItem) {
        return createSilkTouchDispatchTable(oreBlock,
            this.applyExplosionDecay(oreBlock, LootItem.lootTableItem(droppedItem)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 5.0f)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
            )
        );
    }

}
