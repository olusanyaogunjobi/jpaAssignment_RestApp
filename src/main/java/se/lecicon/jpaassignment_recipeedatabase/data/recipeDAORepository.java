package se.lecicon.jpaassignment_recipeedatabase.data;

import org.springframework.transaction.annotation.Transactional;
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
                        "SELECT r FROM Recipe r WHERE UPPER(r.recipeName) LIKE UPPER(CONCAT('%',:recipeName,'%')) " +
                                "OR " +
                                "UPPER(r.recipeName) LIKE UPPER(CONCAT('%', :name, '%')) ", Recipe.class)
                .setParameter("recipeName", recipeName)
                .getResultList();
    }

    @Override
    @Transactional
    public Collection<Recipe> findByIngredientName(String ingredientName) {
        return entityManager.createQuery("SELECT r FROM Recipe  r WHERE r.recipeName", Recipe.class)
                .setParameter("ingredientName", ingredientName)
                .getResultList();
    }

    @Override
    @Transactional
    public Collection<Recipe> findByRecipeCategory(RecipeCategory recipeCategory) {
        return null;
    }

    @Override
    @Transactional
    public Collection<Recipe> findByRecipeCategoryMatch(String recipeCategory) {
        return entityManager.createQuery(
                        "SELECT r FROM Recipe r WHERE UPPER(r.RecipeCategory) LIKE UPPER(CONCAT('%',:RecipeCategory,'%')) ",Recipe.class)
                .setParameter("recipeCategory", recipeCategory)
                .getResultList();
    }
}
