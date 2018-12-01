
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Livia
 */
public abstract class Recipe {
    
    String name;
    ArrayList<Ingredient> ingredients;
    String description;
    int time;
    Ingredient mainIngredient;
    
     /**
     * Abstract method for setting the cooking time
     */
    public abstract String getSuggestion();
    
    /**
     * Method for getting the name of the recipe
     * @return the name of the recipe
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method for getting the ingredient list of the recipe
     * @return the ingredient list of the recipe
     */
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    
    /**
     * Method for setting the description of the recipe
     * @param description the string representing the description of the recipe
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Method for getting the description of the recipe
     * @return the description list of the recipe
     */
    public String getDescription() {
        return description;
    }
    
    public int getTime() {
        return time;
    }
    
}
