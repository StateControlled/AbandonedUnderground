package com.statecontrolled.abandonedunderground.datagen.recipe;

import java.util.List;
import java.util.function.Consumer;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.block.AUBlocks;
import com.statecontrolled.abandonedunderground.item.AUItems;
import com.statecontrolled.abandonedunderground.tags.AUTags;

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

public class AURecipeProvider extends RecipeProvider implements IConditionBuilder {
    // Add any ores that should be smeltable to this list
    private static final List<ItemLike> AU_SMELTABLES = List.of();

    public AURecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AUItems.DIMENSIONAL_THREAD_MODULATOR.get(), 1)
                .pattern("GDG")
                .pattern("DPD")
                .pattern("GDG")
                .define('P', Items.GLASS_PANE)
                .define('D', Items.DIAMOND)
                .define('G', Items.GLOWSTONE_DUST)
                .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                .save(writer);

        /*LIGHT*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.SMOOTH_LIGHT.get(), 8)
                .pattern("PPP")
                .pattern("PGP")
                .pattern("PPP")
                .define('P', Items.GLASS_PANE)
                .define('G', Items.GLOWSTONE_DUST)
                .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                .save(writer);

        ///////////////////////////////////////////////////////////////////////
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
                .pattern("TTT")
                .pattern("TDT")
                .pattern("TTT")
                .define('T', AUBlocks.WHITE_TILES.get())
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.MOSSY_WHITE_TILES.get(), 8)
                .pattern("TTT")
                .pattern("TVT")
                .pattern("TTT")
                .define('T', AUBlocks.WHITE_TILES.get())
                .define('V', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_WHITE_TILES.get(), 8)
                .pattern("TTT")
                .pattern("T T")
                .pattern("TTT")
                .define('T', AUBlocks.WHITE_TILES.get())
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ///////////////////////////////////////////////////////////////////////
        /*SMALL WHITE TILES*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.SMALL_WHITE_TILES.get(), 4)
                .pattern("TT")
                .pattern("TT")
                .define('T', AUBlocks.WHITE_TILES.get())
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
                .pattern("SVS")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_WHITE_TILES.get())
                .define('V', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_SMALL_WHITE_TILES.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_WHITE_TILES.get())
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        ///////////////////////////////////////////////////////////////////////
        /*BLACK TILES*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.BLACK_TILES.get(), 8)
                .pattern("TTT")
                .pattern("TDT")
                .pattern("TTT")
                .define('T', Blocks.STONE_BRICKS)
                .define('D', Items.BLACK_DYE)
                .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(Items.BLACK_DYE))
                .save(writer);

        oreFurnaceSmelting(writer, List.of(AUBlocks.BLACK_TILES.get()), RecipeCategory.BUILDING_BLOCKS,
                AUBlocks.CRACKED_BLACK_TILES.get(), 0.1f, 300, "cracked_black_tiles");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.DIRTY_BLACK_TILES.get(), 8)
                .pattern("TTT")
                .pattern("TDT")
                .pattern("TTT")
                .define('T', AUBlocks.BLACK_TILES.get())
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.MOSSY_BLACK_TILES.get(), 8)
                .pattern("TTT")
                .pattern("TVT")
                .pattern("TTT")
                .define('T', AUBlocks.BLACK_TILES.get())
                .define('V', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_BLACK_TILES.get(), 8)
                .pattern("TTT")
                .pattern("T T")
                .pattern("TTT")
                .define('T', AUBlocks.BLACK_TILES.get())
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ///////////////////////////////////////////////////////////////////////
        /*SMALL BLACK TILES*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.SMALL_BLACK_TILES.get(), 4)
                .pattern("TT")
                .pattern("TT")
                .define('T', AUBlocks.BLACK_TILES.get())
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
                .pattern("SVS")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_BLACK_TILES.get())
                .define('V', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CHISELED_SMALL_BLACK_TILES.get(), 8)
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', AUBlocks.SMALL_BLACK_TILES.get())
                .unlockedBy(getHasName(AUBlocks.BLACK_TILES.get()), has(AUBlocks.BLACK_TILES.get()))
                .save(writer);

        ///////////////////////////////////////////////////////////////////////
        /*CONCRETE*/
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CONCRETE_PLATFORM.get(), 4)
                .pattern("CC")
                .pattern("CC")
                .define('C', AUTags.AUItemTags.CONCRETE_ITEM_TAG)
                .unlockedBy(getHasName(AUBlocks.WHITE_TILES.get()), has(AUBlocks.WHITE_TILES.get()))
                .save(writer);

        oreFurnaceSmelting(writer, List.of(AUBlocks.CONCRETE_PLATFORM.get()), RecipeCategory.BUILDING_BLOCKS,
                AUBlocks.CRACKED_CONCRETE_PLATFORM.get(), 0.1f, 300, "cracked_concrete_platform");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.DIRTY_CONCRETE_PLATFORM.get(), 8)
                .pattern("CCC")
                .pattern("CDC")
                .pattern("CCC")
                .define('C', AUBlocks.CONCRETE_PLATFORM.get())
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.MOSSY_CONCRETE_PLATFORM.get(), 8)
                .pattern("CCC")
                .pattern("CVC")
                .pattern("CCC")
                .define('C', AUBlocks.CONCRETE_PLATFORM.get())
                .define('V', Items.VINE)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CONCRETE_ROAD_SOLID_LINE.get(), 8)
                .pattern("CYC")
                .pattern("CYC")
                .pattern("CYC")
                .define('C', AUBlocks.CONCRETE_PLATFORM.get())
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CONCRETE_ROAD_DASHED_LINE.get(), 8)
                .pattern("CYC")
                .pattern("CCC")
                .pattern("CYC")
                .define('C', AUBlocks.CONCRETE_PLATFORM.get())
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.CONCRETE_ROAD_DOUBLE_LINE.get(), 8)
                .pattern("CCC")
                .pattern("YCY")
                .pattern("CCC")
                .define('C', AUBlocks.CONCRETE_PLATFORM.get())
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.METAL_GRATE_FLOOR.get(), 6)
                .pattern("I I")
                .pattern(" I ")
                .pattern("I I")
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.STEEL_PLATE_FLOOR.get(), 8)
                .pattern("NNN")
                .pattern("SSS")
                .define('N', Items.IRON_NUGGET)
                .define('S', Blocks.STONE_BRICKS)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, AUBlocks.SMOOTH_METAL_FLOOR.get(), 8)
                .pattern("III")
                .pattern("SSS")
                .define('I', Items.IRON_INGOT)
                .define('S', Blocks.STONE_BRICKS)
                .unlockedBy(getHasName(AUBlocks.CONCRETE_PLATFORM.get()), has(AUBlocks.CONCRETE_PLATFORM.get()))
                .save(writer);
    } // END METHOD

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
