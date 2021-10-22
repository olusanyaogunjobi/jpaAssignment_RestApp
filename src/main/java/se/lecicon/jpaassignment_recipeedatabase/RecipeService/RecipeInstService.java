package se.lecicon.jpaassignment_recipeedatabase.RecipeService;

import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;

import java.util.Collection;

public interface RecipeInstService {

    Collection<Recipe> findByName (String recipeName);
    Recipe create (Recipe recipe);
    Collection<Recipe> findByIngredientName (String ingredientName);
    Collection<Recipe> findByRecipeCategory(String recipeCategory);
    Collection<Recipe> findByRecipeCategoryMatch (String category);
    Void delete (String recipeId);
    Recipe update (Recipe recipe);
}
