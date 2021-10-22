package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeCategory;

import java.util.Collection;

public interface recipeCategoryDAO {

    Recipe create(RecipeCategory recipeCategory);

    Collection<RecipeCategory> findByCategoryName(String category);

    Collection<Recipe> findByRecipeCategory(String recipeCategory);

    Collection<Recipe> findByRecipeCategoryId(Integer categoryId);

    Void delete(Integer categoryId);

    Recipe update(Integer categoryId);
}