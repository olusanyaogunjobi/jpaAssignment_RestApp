package se.lecicon.jpaassignment_recipeedatabase.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class RecipeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String category;

    @ManyToMany(
            cascade = {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "recipe_recipe_category",
            joinColumns = @JoinColumn(name = "recipe_category_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )//many to many
    private List<Recipe> recipes;

    public RecipeCategory() {
    }

    public RecipeCategory(int categoryId, String category, List<Recipe> recipes) {
        this.categoryId = categoryId;
        this.category = category;
        this.recipes = recipes;
    }

    public RecipeCategory(String category, List<Recipe> recipes) {
        this.category = category;
        this.recipes = recipes;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeCategory)) return false;
        RecipeCategory that = (RecipeCategory) o;
        return getCategory().equals(that.getCategory()) && getRecipes().equals(that.getRecipes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategory(), getRecipes());
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "categoryId=" + categoryId +
                ", category='" + category + '\'' +
                ", recipes=" + recipes +
                '}';
    }
}
