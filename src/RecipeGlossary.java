import java.util.ArrayList;

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
    
    /**
     * Getting the recipe from the glossary by it's name
     * @param name a string parameter called name
     * @return return the recipe by the string of the name
     */
    public Recipe getRecipeByName(String name) {
        Recipe recipeByName = recipes.get(0);
        ArrayList<Recipe> recipes = this.getAll();
        
        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).name.equalsIgnoreCase(name)) {
                recipeByName = recipes.get(i);
                break;
            }
        }
        return recipeByName;
    }
    
    /**
     * Filters the recipes in the glossary by the ingredients selected
     * @param selectedIngredients an array to hold the selected ingredients
     * @return returns the recipes after the filtering 
     */
    public ArrayList<Recipe> filterRecipes(ArrayList<String> selectedIngredients) {
        System.out.println(selectedIngredients.size());
        if(selectedIngredients.isEmpty()) {
            return this.getAll();
        } 
        
        ArrayList<Recipe> filteredRecipes = new ArrayList<>();
        
        for (int i = 0; i < this.recipes.size(); i++) {
            Recipe currentRecipe = this.recipes.get(i);
            ArrayList<Ingredient> currentRecipeIngredients = currentRecipe.getIngredients();
            boolean hasAllIngredients = false;
            
            for (int j = 0; j < selectedIngredients.size(); j++) {
                boolean hasIngredient = false;
                
                for (int k = 0; k < currentRecipeIngredients.size(); k++) {
                    if(selectedIngredients.get(j).equals(currentRecipeIngredients.get(k).name)) {
                        hasIngredient = true;
                        break;
                    }
                }
                
                // if the current item from 'selectedIngredients' is not in the recipeIngredients
                // we break the loop because there's no point to continue
                if (!hasIngredient) {
                    break;
                }
                
                
                // if we got to the last item that means that all the items prior to this one
                // are found in the list
                // if this ingredient is in the list aswell, we can say that the recipe has
                // all the ingredients
                if (j == selectedIngredients.size() - 1 && hasIngredient) {
                    hasAllIngredients = true;
                }
            }
            
            if (hasAllIngredients) {
                filteredRecipes.add(currentRecipe);
            }
        }
        return filteredRecipes;
    }
}
