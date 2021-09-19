package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeCategory;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import java.util.List;

public class recipeDAORepository implements recipeDAO{


    @Override
    public Recipe findByName(String recipeName) {
        return null;
    }

    @Override
    public List<RecipeIngredient> findByIngredientName(RecipeIngredient recipeIngredient) {
        return null;
    }

    @Override
    public List<RecipeCategory> findByRecipeCategory(RecipeCategory recipeCategory) {
        return null;
    }

    @Override
    public List<RecipeCategory> findByRecipeCategoryMatch(RecipeCategory recipeCategory) {
        return null;
    }
}
