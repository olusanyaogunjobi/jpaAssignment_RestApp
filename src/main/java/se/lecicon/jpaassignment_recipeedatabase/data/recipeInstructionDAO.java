package se.lecicon.jpaassignment_recipeedatabase.data;

import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeInstruction;

import java.util.Collection;

public interface recipeInstructionDAO {

    RecipeInstruction create (RecipeInstruction recipeInstruction);
    RecipeInstruction findByInstructionId(String recipeInstructionId);
    Collection<RecipeInstruction> findAll();
    RecipeInstruction update (RecipeInstruction recipeInstruction);
    void delete (String recipeInstructionId);
}
