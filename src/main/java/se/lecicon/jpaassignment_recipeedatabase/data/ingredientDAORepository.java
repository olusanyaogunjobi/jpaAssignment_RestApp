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
    @Transactional
    @Override
    public Ingredient findByNameWithAnySearchString(String ingredientName) {
        return null;
    }

    @Override
    public Ingredient findByName(String ingredientName) {
        return null;
    }


}
