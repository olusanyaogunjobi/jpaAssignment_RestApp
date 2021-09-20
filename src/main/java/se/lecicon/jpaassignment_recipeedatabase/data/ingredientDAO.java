package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Ingredient;

import java.util.Collection;

public interface ingredientDAO {

    Ingredient findById (int ingredientId);
    Ingredient findByName (String ingredientName);
    Ingredient findByIngredientName (Ingredient ingredient);

}
