package se.lecicon.jpaassignment_recipeedatabase.RecipeService;

import se.lecicon.jpaassignment_recipeedatabase.model.Ingredient;

public interface IngredientService {

    Ingredient findById (int ingredientId);
    Ingredient create (Ingredient ingredientId);
    Ingredient findByName (String ingredientName);
    Ingredient findByIngredientName (Ingredient ingredient);
    Void delete (int ingredientId);
    Ingredient update (Ingredient ingredient);
}
