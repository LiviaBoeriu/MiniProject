
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
public class IngredientStorage {
    
    /***
     * the list of the stored items
     */
    ArrayList<Ingredient> ingredients;
    
    /***
     * the list of the item categories
     */
    ArrayList<String> categories;
    
    /***
     * the list of the selected ingredients
     */
    ArrayList<String> selectedIngredients;
    
    /***
     * Create an empty storage
     */
    public IngredientStorage() {
        this.ingredients = new ArrayList<>();
        this.categories =  new ArrayList<>(); 
        this.selectedIngredients = new ArrayList<>();
    }
    
    /***
     * Add an ingredient to the storage
     * @param ingredient name of ingredient
     */
    public void add(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    /***
     * Add a category to the storage
     * @param category name of ingredient
     */
    public void addCategory(String category) {
        this.categories.add(category);
    }
    
    /***
     * Add a ingredient to the selectedIngredients array
     * @param ingredient name of ingredient
     */
    public void addSelectedIngridient(String ingredient) {
        this.selectedIngredients.add(ingredient);
    }
    
    /***
     * Remove a ingredient from the selectedIngredients array
     * @param ingredient name of ingredient
     */
    public void removeSelectedIngridient(String ingredient) {
        this.selectedIngredients.remove(ingredient);
    }
    
    /***
     * Remove a ingredient from the selectedIngredients array
     * @param ingredient name of ingredient
     * @return a boolean which shows if the ingredient is selected
     */
    public boolean isSelected(String ingredient) {
        boolean exists = false;
        
        for (int i = 0; i < selectedIngredients.size(); i++) {
            if (selectedIngredients.get(i).equals(ingredient)) {
                exists = true;
                break;
            }
        }
        
        return exists;
    }
    

    /***
     * Method for returning an array list of ingredients of a certain type
     * @param type the type of the ingredient
     * @return returns the array of ingredients of that type
     */
    public ArrayList<Ingredient> getIngredientsByType(String type){
        ArrayList<Ingredient> ingredientsType = new ArrayList<>();
        
        for(int i = 0; i < ingredients.size(); i++) {
            Ingredient currentIngredient = ingredients.get(i);
            if(currentIngredient.type.toLowerCase().equals(type)) {
                ingredientsType.add(currentIngredient);
            }
        }
        return ingredientsType;
    }
}
