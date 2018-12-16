import java.util.ArrayList;

/**
 * This class contains the constructor and the methods for the vegetarian recipe type of objects.
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
            case "salad": suggestion +=  "The most important ingredient when making a salad is of course the dressing.";
                break;
            case "potato": suggestion += "Potatoes can be cooked in every way imaginable. The healthiest one though is baking or boiling them. ";
                break;
            case "carrot": suggestion += " ";
                break;
            default: suggestion += "";    
            
        } 
        return suggestion;
    } 
    
}
