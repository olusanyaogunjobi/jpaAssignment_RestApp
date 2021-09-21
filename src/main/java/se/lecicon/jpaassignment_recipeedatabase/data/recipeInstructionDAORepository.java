package se.lecicon.jpaassignment_recipeedatabase.data;

import org.springframework.transaction.annotation.Transactional;
import se.lecicon.jpaassignment_recipeedatabase.model.RecipeInstruction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

public class recipeInstructionDAORepository implements recipeInstructionDAO{

    @PersistenceContext
    EntityManager entityManager;

    public recipeInstructionDAORepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public RecipeInstruction create(RecipeInstruction recipeInstruction) {
        entityManager.persist(recipeInstruction);
        return recipeInstruction;
    }

    @Override
    @Transactional
    public RecipeInstruction findByInstructionId(String recipeInstructionId) {
        return entityManager.find(RecipeInstruction.class, recipeInstructionId);


    }

    @Override
    @Transactional
    public Collection<RecipeInstruction> findAll() {
        Query query = entityManager.createQuery( "SELECT R FROM RecipeInstruction r");
        return query.getResultList();
    }

    @Override
    @Transactional
    public RecipeInstruction update(RecipeInstruction recipeInstruction) {
        return entityManager.merge(recipeInstruction);
    }

    @Override
    @Transactional
    public void delete(String recipeInstructionId) {

        entityManager.remove(recipeInstructionId);

    }
}
