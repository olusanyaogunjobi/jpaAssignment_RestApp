package se.lecicon.jpaassignment_recipeedatabase.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class RecipeInstruction {
    @Id
    private String instructionId;
    private String instruction;

    public RecipeInstruction() {
    }

    public RecipeInstruction(String instructionId, String instruction) {
        this.instructionId = instructionId;
        this.instruction = instruction;
    }

    public RecipeInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeInstruction)) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return getInstruction().equals(that.getInstruction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstruction());
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "instructionId='" + instructionId + '\'' +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
