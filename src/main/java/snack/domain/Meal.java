package snack.domain;

/**
 * Created by alien on 6/5/17.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * Meal prepared with ingredients
 */

public class Meal {

    private Long id;

    private String name;

    private Set<Ingredient> ingredients = new HashSet<>();

    private Set<Discount> discounts;

    private Number price;

    public Meal() {
    }

    public Meal(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Meal(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Meal add(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    public Meal add(Set<Ingredient> ingredients) {
        this.ingredients.addAll(ingredients);
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Set<Discount> discounts) {
        this.discounts = discounts;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    /*
     * If ingredient value null - assumes zero value.
     */

    public Number addIngredient(Ingredient ingredient) {
        this.price = this.price.doubleValue() + (ingredient.getValue() != null ? ingredient.getValue().doubleValue() : 0);
        return this.price;
    }

    public Number subIngredient(Ingredient ingredient) {
        this.price = this.price.doubleValue() - (ingredient.getValue() != null ? ingredient.getValue().doubleValue() : 0);
        return this.price;

    }
}
