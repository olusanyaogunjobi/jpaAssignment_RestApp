package se.lecicon.jpaassignment_recipeedatabase.data;

import org.springframework.transaction.annotation.Transactional;
import se.lecicon.jpaassignment_recipeedatabase.model.Ingredient;
import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeCategory;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class recipeDAORepository implements recipeDAO{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public Collection<Recipe> findByName(String recipeName) {
        return entityManager.createQuery(
                        "SELECT r FROM Recipe r WHERE UPPER(r.recipeName) LIKE UPPER(CONCAT('%',:recipeName,'%')) ", Recipe.class)
                .setParameter("recipeName", recipeName)
                .getResultList();
    }

    @Override
    public Recipe create(Recipe recipe) {

        entityManager.persist(recipe);
        return recipe;
    }

    @Override
    @Transactional
    public Collection<Recipe> findByIngredientName(String ingredientName) {  // change to string
        return entityManager.createQuery(
                "SELECT i FROM Ingredient i WHERE(i.ingredientName) LIKE UPPER (CONCAT('%',:ingredientName,'%'))", Recipe.class)
                .setParameter("ingredientName", ingredientName)
                .getResultList();

    }

    @Override
    @Transactional
    public Collection<Recipe> findByRecipeCategory(String recipeCategory) {

        return entityManager.createQuery("SELECT r FROM Recipe r WHERE(r.recipeName) LIKE UPPER(CONCAT('%',:recipeCategory,'%'))", Recipe.class)
                .setParameter("recipeCategory", recipeCategory)
                .getResultList();
    }

    @Override
    @Transactional
    public Collection<Recipe> findByRecipeCategoryMatch(String recipeCategory) {
        return entityManager.createQuery(
                        "SELECT r FROM Recipe r",Recipe.class).getResultList();

    }

    @Override
    public Void delete(String recipeId) {
        entityManager.remove(recipeId);
        return null;
    }

    @Override
    public Recipe update(Recipe recipe) {
        return entityManager.merge(recipe);
    }
}
