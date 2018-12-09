
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class holds the recipes in the program and has methods such ass
 * add a recipe tot the list and get the array list of recipes.
 * @author Livia Boeriu
 */
public class RecipeGlossary {
    ArrayList<Recipe> recipes = new ArrayList<>();
    
    public RecipeGlossary() {
        this.recipes = recipes;
    }
    
    /***
     *  Add a recipe to the arrayList of recipes
     * @param recipe the name of the recipe
     */
    public void add(Recipe recipe) {
        recipes.add(recipe);
    }
    
    /***
     *  Get method which returns the array of recipes in the glossary
     *  @return the array of recipes
     */
    public ArrayList<Recipe> getAll() {
        return recipes;
    }
}
