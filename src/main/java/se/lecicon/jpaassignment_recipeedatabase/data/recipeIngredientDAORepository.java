package se.lecicon.jpaassignment_recipeedatabase.data;

import org.springframework.transaction.annotation.Transactional;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeIngredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;


public class recipeIngredientDAORepository implements recipeIngredientDAO{
    @PersistenceContext
    EntityManager entityManager;

    public recipeIngredientDAORepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public RecipeIngredient create(RecipeIngredient recipeIngredient) {
        entityManager.persist(recipeIngredient);
        return recipeIngredient;
    }

    @Override
    @Transactional
    public RecipeIngredient findByIngredientId(String recipeIngredientId) {
        return entityManager.find(RecipeIngredient.class,recipeIngredientId);
    }

    @Override
    @Transactional
    public Collection<RecipeIngredient> findAll() {
        Query query = entityManager.createQuery("SELECT R FROM RecipeIngredient r");
        return query.getResultList();
    }

    @Override
    @Transactional
    public RecipeIngredient update(RecipeIngredient recipeIngredient) {
        return entityManager.merge(recipeIngredient) ;
    }

    @Override
    @Transactional
    public void delete(String recipeIngredientId) {

        entityManager.remove(recipeIngredientId);

    }
}
