package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeCategory;

import java.util.Collection;

public class recipeCategoryDAOImpl implements recipeCategoryDAO{


    @Override
    public Recipe create(RecipeCategory recipeCategory) {
        return null;
    }

    @Override
    public Collection<RecipeCategory> findByCategoryName(String category) {
        return null;
    }

    @Override
    public Collection<Recipe> findByRecipeCategory(String recipeCategory) {
        return null;
    }

    @Override
    public Collection<Recipe> findByRecipeCategoryId(Integer categoryId) {
        return null;
    }

    @Override
    public Void delete(Integer categoryId) {
        return null;
    }

    @Override
    public Recipe update(Integer categoryId) {
        return null;
    }
}
