package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeInstruction;

public interface recipeInstructionDAO {

    RecipeInstruction create (RecipeInstruction recipeInstruction);
    RecipeInstruction findByInstructionId(String recipeInstructionId);
    RecipeInstruction findAll();
    RecipeInstruction update (RecipeInstruction recipeInstruction);
    void delete (String recipeInstructionId);
}
