package se.lecicon.jpaassignment_recipeedatabase.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lecicon.jpaassignment_recipeedatabase.model.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ingredientDAORepository implements ingredientDAO{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public Ingredient findById(int ingredientId) {

        return entityManager.find(Ingredient.class, ingredientId);
    }

    @Override
    @Transactional
    public Ingredient create(Ingredient ingredientId) {
        entityManager.persist(ingredientId);
        return ingredientId;
    }

    @Override
    @Transactional
    public Ingredient findByName(String ingredientName) {

        return entityManager.createQuery(
                "SELECT i FROM Ingredient i WHERE UPPER(i.ingredientName) LIKE UPPER(CONCAT('%',:ingredientName,'%')) ", Ingredient.class)
                .setParameter("ingredientName", ingredientName)
                .getSingleResult();


        //create a query to find by name
    }

    @Override
    @Transactional
    public Ingredient findByIngredientName(Ingredient ingredient) {// query but not necessary


        
        return entityManager.find(Ingredient.class, ingredient);
        
        
    }

    @Override
    @Transactional
    public Void delete(int ingredientId) {
        entityManager.remove(ingredientId);
        return null;
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        return entityManager.merge(ingredient);
    }


}
 
