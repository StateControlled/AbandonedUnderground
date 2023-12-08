package com.statecontrolled.abandonedunderground.datagen.recipe;

import java.util.List;
import java.util.function.Consumer;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class AUBlockRecipeProvider extends RecipeProvider implements IConditionBuilder {
    // Add any items that should be smeltable to this list
    private static final List<ItemLike> AU_SMELTABLES = List.of();

    public AUBlockRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.SMOOTH_LIGHT.get(), 8)
                .pattern("PPP")
                .pattern("PGP")
                .pattern("PPP")
                .define('P', Items.GLASS_PANE)
                .define('G', Items.GLOWSTONE_DUST)
                .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                .save(writer);

        /*WHITE TILES*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.WHITE_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Blocks.STONE_BRICKS)
                .define('W', Items.WHITE_DYE)
                .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(Items.WHITE_DYE))
                .save(writer);

        oreFurnaceSmelting(writer, List.of(AUBlocks.WHITE_TILES.get()), RecipeCategory.BUILDING_BLOCKS,
                AUBlocks.CRACKED_WHITE_TILES.get(), 0.1f, 300, "cracked_white_tiles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.DIRTY_WHITE_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', AUBlocks.WHITE_TILES.get())
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.MOSSY_WHITE_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .define('S', AUBlocks.WHITE_TILES.get())
                .define('M', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_WHITE_TILE.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.WHITE_TILES.get())
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        /*SMALL WHITE TILES*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.SMALL_WHITE_TILES.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.WHITE_TILES.get())
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        oreFurnaceSmelting(writer, List.of(AUBlocks.SMALL_WHITE_TILES.get()), RecipeCategory.BUILDING_BLOCKS,
                AUBlocks.CRACKED_SMALL_WHITE_TILES.get(), 0.1f, 300, "cracked_small_white_tiles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.DIRTY_SMALL_WHITE_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_WHITE_TILES.get())
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.MOSSY_SMALL_WHITE_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_WHITE_TILES.get())
                .define('M', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_SMALL_WHITE_TILE.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_WHITE_TILES.get())
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        /*BLACK TILES*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.BLACK_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SWS")
                .pattern("SSS")
                .define('S', Blocks.STONE_BRICKS)
                .define('W', Items.BLACK_DYE)
                .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(Items.BLACK_DYE))
                .save(writer);

        oreFurnaceSmelting(writer, List.of(AUBlocks.BLACK_TILES.get()), RecipeCategory.BUILDING_BLOCKS,
                AUBlocks.CRACKED_BLACK_TILES.get(), 0.1f, 300, "cracked_black_tiles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.DIRTY_BLACK_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', AUBlocks.BLACK_TILES.get())
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.MOSSY_BLACK_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .define('S', AUBlocks.BLACK_TILES.get())
                .define('M', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_BLACK_TILE.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.BLACK_TILES.get())
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        /*SMALL BLACK TILES*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.SMALL_BLACK_TILES.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.BLACK_TILES.get())
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        oreFurnaceSmelting(writer, List.of(AUBlocks.SMALL_BLACK_TILES.get()), RecipeCategory.BUILDING_BLOCKS,
                AUBlocks.CRACKED_SMALL_BLACK_TILES.get(), 0.1f, 300, "cracked_small_black_tiles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.DIRTY_SMALL_BLACK_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_BLACK_TILES.get())
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.MOSSY_SMALL_BLACK_TILES.get(), 8)
                .pattern("SSS")
                .pattern("SMS")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_BLACK_TILES.get())
                .define('M', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_SMALL_BLACK_TILE.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_BLACK_TILES.get())
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

    }

    /**
     * Creates a furnace smelting recipe.
     **/
    private static void oreFurnaceSmelting(Consumer<FinishedRecipe> finishedRecipeConsumer, List<ItemLike> ingredients,
                RecipeCategory category, ItemLike result, float droppedExperience, int cookingTime, String group) {

        createRecipe(finishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, ingredients, category, result,
                droppedExperience, cookingTime, group, "_from_smelting");
    }

    /**
     * Creates a blast furnace smelting recipe.
     */
    private static void oreBlastSmelting(Consumer<FinishedRecipe> finishedRecipeConsumer, List<ItemLike> ingredients,
                RecipeCategory category, ItemLike result, float droppedExperience, int cookingTime, String group) {

        createRecipe(finishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, ingredients, category, result,
                droppedExperience, cookingTime, group, "_from_blasting");
    }

    private static void createRecipe(Consumer<FinishedRecipe> finishedRecipe, RecipeSerializer<? extends AbstractCookingRecipe> cookingSerializer,
                List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float droppedExperience, int cookingTime, String group, String recipeName) {
        for (ItemLike item : ingredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(item), category, result, droppedExperience, cookingTime, cookingSerializer)
                    .group(group).unlockedBy(getHasName(item), has(item))
                    .save(finishedRecipe, AbandonedUnderground.MOD_ID + ":" + getItemName(result) + recipeName + "_" + getItemName(item));
        }
    }
}
