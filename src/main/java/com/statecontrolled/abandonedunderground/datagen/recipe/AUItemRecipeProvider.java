package com.statecontrolled.abandonedunderground.datagen.recipe;

import java.util.List;
import java.util.function.Consumer;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class AUItemRecipeProvider extends RecipeProvider implements IConditionBuilder {
    // Add any items that should be smeltable to this list
    private static final List<ItemLike> AU_SMELTABLES = List.of();

    public AUItemRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {

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
