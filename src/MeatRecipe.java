import java.util.ArrayList;

/**
 * This class contains the constructor and methods for the meat recipe type of objects
 * @author Livia Boeriu
 */
public class MeatRecipe extends Recipe{
    
    /**
     * Constructor for the recipe object
     * @param name the name of the recipe
     * @param ingredients the list of ingredients in a recipe
     * @param mainIngredient the mainIngredient of the recipe
     * @param time the time necessary for cooking the recipe
     * @param description the description of the recipe
     */
    public MeatRecipe(String name, ArrayList<Ingredient> ingredients, Ingredient mainIngredient,int time, String description) {
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
            case "chicken": suggestion +=  "Chicken goes well with white wine. Try a Chardonnay or Pinot Gris. ";
                break;
            case "pork": suggestion += "Recipes based on pork go well with both white and red wines. Try pairing the dish with \n Chardonnay, Pinot Noir or Riesling. ";
                break;
            case "salmon": suggestion += "Fish goes well with full-bodied white wine. Try complementing your dish with a \n White Burgundy, Viognier.";
                break;
            case "beef": suggestion += "Beef is a versatile ingredient so it goes well with many types of wine. Best combinations for you dish are: Shiraz or Cabernet \n Sauvignon.";
                break;
            case "lamb": suggestion += "Lamb based dishes are well complimented by a red wine. Try pairing with a \n Cabernet Sauvignon, Zinfandel or Merlot";
                break;
            default: suggestion += "";    
            
        } 
        return suggestion;
    } 
}
