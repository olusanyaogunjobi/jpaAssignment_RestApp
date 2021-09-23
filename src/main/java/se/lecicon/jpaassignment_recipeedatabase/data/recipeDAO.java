package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeCategory;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import java.util.Collection;
import java.util.List;

public interface recipeDAO {

    Collection<Recipe> findByName (String recipeName);
    Recipe create (Recipe recipe);
    Collection<Recipe> findByIngredientName (String ingredientName);
    Collection<Recipe> findByRecipeCategory(String recipeCategory);
    Collection<Recipe> findByRecipeCategoryMatch (String category);
    Void delete (String recipeId);
    Recipe update (Recipe recipe);

}
