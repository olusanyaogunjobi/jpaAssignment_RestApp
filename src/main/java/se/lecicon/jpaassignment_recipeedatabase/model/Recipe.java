package se.lecicon.jpaassignment_recipeedatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipeId;
    private String recipeName;
    private List<RecipeIngredient> recipeIngredients;
    private RecipeInstruction instruction;
    private List<RecipeCategory> categories;
}
