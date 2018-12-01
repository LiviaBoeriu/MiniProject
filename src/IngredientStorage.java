
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
     * Create an empty storage
     */
    public IngredientStorage() {
        this.ingredients = new ArrayList<>();
    }
    
    /***
     * Add an ingredient to the storage
     * @param ingredient name of ingredient
     */
    public void add(Ingredient ingredient) {
        this.ingredients.add(ingredient);
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
