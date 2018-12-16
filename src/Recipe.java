import java.util.ArrayList;

/**
 * This class is an abstract class which provides the structure for the recipe type of object
 * In here there are methods for getting the details of the recipe such as 
 * name and description.
 * @author Livia Boeriu
 */
public abstract class Recipe {
    
    String name;
    ArrayList<Ingredient> ingredients;
    String description;
    int time;
    Ingredient mainIngredient;
    int spiciness;
    
     /**
     * Abstract method for getting the suggestion from the switch case
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
     * Method for setting the spiciness of the recipe
     * @param spiciness the string representing the description of the recipe
     */
    public void setSpiciness(int spiciness) {
        this.spiciness = spiciness;
    }
    
    /**
     * Method for getting the level of spiciness of a recipe
     * @return spiciness the integer representing the spiciness of the recipe
     */
    public int getSpiciness() {
        return spiciness;
    }
    
    /**
     * Method for getting the description of the recipe
     * @return the description list of the recipe
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Method for getting the cooking time of a recipe
     * @return time the integer representing the time in minutes needed for cooking
     */
    public int getTime() {
        return time;
    }
    
}
