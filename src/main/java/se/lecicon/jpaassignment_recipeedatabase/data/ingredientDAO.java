package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.Ingredient;
import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;

import java.util.Collection;

public interface ingredientDAO {

    Ingredient findById (int ingredientId);
    Ingredient create (Ingredient ingredientId);
    Ingredient findByName (String ingredientName);
    Ingredient findByIngredientName (Ingredient ingredient);
    Void delete (int ingredientId);
    Ingredient update (Ingredient ingredient);


}
