package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeCategory;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import java.util.Collection;
import java.util.List;

public interface recipeDAO {

    Recipe findByName (String recipeName);
    List<RecipeIngredient> findByIngredientName (RecipeIngredient recipeIngredient);
    List<RecipeCategory> findByRecipeCategory(RecipeCategory recipeCategory);
    List<RecipeCategory> findByRecipeCategoryMatch (RecipeCategory recipeCategory);

}
