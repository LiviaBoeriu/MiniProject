
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Livia Boeriu
 */
public class VegetarianRecipe extends Recipe{
    
    /**
     * Constructor for the recipe object
     * @param name the name of the recipe
     * @param ingredients the list of ingredients in a recipe
     * @param mainIngredient the mainIngredient of the recipe
     * @param time the time necessary for cooking the recipe
     * @param description the description of the recipe
     */
    public VegetarianRecipe(String name, ArrayList<Ingredient> ingredients, Ingredient mainIngredient,int time, String description) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.time = time;
        this.mainIngredient = mainIngredient;
    }

    /**
     * Method for suggesting ingredient that would with the recipe
     * @return the suggestion for the specific recipe
     */
    @Override
    public String getSuggestion() {
        String suggestion = "";
        switch(this.mainIngredient.name) {
            case "salad": suggestion +=  "Suggestion 1 ";
                break;
            case "potato": suggestion += "Suggestion 2 ";
                break;
            case "carrot": suggestion += "Suggestion 3 ";
                break;
            default: suggestion += "";    
            
        } 
        return suggestion;
    } 
    
}
