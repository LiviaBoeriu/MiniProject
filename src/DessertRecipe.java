import java.util.ArrayList;

/**
 * This class contains the constructor and method for the dessert recipe objects
 * @author Livia Boeriu
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
     * Method for suggesting in accordance with the main ingredient in the recipe
     * @return the suggestion for the specific recipe
     */
        @Override
    public String getSuggestion() {
        String suggestion = "";
        switch(this.mainIngredient.name) {
            case "chocolate": suggestion +=  "As the color of the desert gets darker, the way gets darker too. \n Keep this in mind when pairing desserts with wine. ";
                break;
            case "lemon": suggestion += "For lemon based desserts Prosseco works best. \n";
                break;
            case "icecream": suggestion += "Depending on the icecream flavour you could combine the dessert with many different drinks. \n For cherry flavours try a Pale Ale, and for caramel pair with whiskey.";
                break;
            case "vanilla": suggestion += "For vanilla based desserts try having a Martini or for non alchoolic drinks \n sparkling water.";
                break;
            default: suggestion += "";    
            
        } 
        return suggestion;
    }
}
