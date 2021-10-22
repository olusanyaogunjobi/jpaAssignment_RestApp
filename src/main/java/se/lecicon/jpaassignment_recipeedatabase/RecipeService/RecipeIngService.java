package se.lecicon.jpaassignment_recipeedatabase.RecipeService;

import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import java.util.Collection;

public interface RecipeIngService {

    RecipeIngredient create (RecipeIngredient recipeIngredient);
    RecipeIngredient findByIngredientId(String recipeIngredientId);
    Collection<RecipeIngredient> findAll();
    RecipeIngredient update (RecipeIngredient recipeIngredient);
    void delete (String recipeIngredientId);
}
