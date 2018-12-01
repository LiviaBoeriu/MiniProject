
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
public class DessertRecipe extends Recipe {
   
    /**
     * Constructor for the recipe object
     * @param name the name of the recipe
     * @param ingredients the list of ingredients in a recipe
     * @param mainIngredient the mainIngredient of the recipe
     * @param time the time necessary for cooking the recipe
     * @param description the description of the recipe
     */
    public DessertRecipe(String name, ArrayList<Ingredient> ingredients, Ingredient mainIngredient, int time, String description) {
        this.name = name;
        this.ingredients = ingredients;
        this.mainIngredient = mainIngredient;
        this.time = time;
        this.description = description;
    }
    
    /**
     * Method for suggesting ingredient that would with the recipe
     * @return the suggestion for the specific recipe
     */
        @Override
    public String getSuggestion() {
        String suggestion = "Dessert - ";
        switch(this.mainIngredient.name) {
            case "chocolate": suggestion +=  "Suggestion 1 ";
                break;
            case "berries": suggestion += "Suggestion 2 ";
                break;
            case "icecream": suggestion += "Suggestion 3 ";
                break;
            default: suggestion += "";    
            
        } 
        return suggestion;
    }
}
