package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeCategory;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import java.util.Collection;
import java.util.List;

public interface recipeDAO {

    Collection<Recipe> findByName (String recipeName);
    Collection<Recipe> findByIngredientName (String ingredientName);
    Collection<Recipe> findByRecipeCategory(String recipeCategory);
    Collection<Recipe> findByRecipeCategoryMatch (String category);

}
