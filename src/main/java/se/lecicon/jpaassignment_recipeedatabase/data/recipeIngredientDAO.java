package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import java.util.Collection;

public interface recipeIngredientDAO {

    RecipeIngredient create (RecipeIngredient recipeIngredient);
    RecipeIngredient findByIngredientId(String recipeIngredientId);
    RecipeIngredient findAll();
    RecipeIngredient update (RecipeIngredient recipeIngredient);
    void delete (String recipeIngredientId);
}
