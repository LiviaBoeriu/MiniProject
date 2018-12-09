import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class provides the view for the recipes.
 * @author Livia Boeriu
 */
public class RecipeView extends BorderPane {
    
    VBox list = new VBox();
        
    public RecipeView() {
        list.setSpacing(10);
        
        //get recipes
        RecipeGlossary glossary = MiniProject.getGlossary();
        ArrayList<Recipe> recipeList = glossary.recipes;
        
        //for every recipe create a wrapper
        for(int i = 0; i < recipeList.size(); i++) {
            Recipe currentRecipe = recipeList.get(i);
            
            //create the main wrapper
            BorderPane recipeWrapper = new BorderPane();
            //create wrapper for title and time
            BorderPane recipeInfo = new BorderPane();
            
            recipeWrapper.getStyleClass().add("recipeWrapper");
            recipeInfo.getStyleClass().add("recipeInfo");
            
            Label recipeName = new Label(currentRecipe.name);
            Label recipeTime = new Label(Integer.toString(currentRecipe.time) + " minutes");
            
            //create box for recipe details
            VBox recipeDetails = new VBox();
            recipeDetails.setSpacing(4);
            
            String ingredients = new String("Ingredients: ");
            ArrayList<Ingredient> recipeIngredients = currentRecipe.getIngredients();
            
            //create ingredients string
            for (int j = 0; j < recipeIngredients.size(); j++) {
                ingredients += recipeIngredients.get(j).name;
                if(j != recipeIngredients.size() - 1) {
                    ingredients += ", ";
                }
            }
            
            //create labels for the recipe details
            Label recipeDescription = new Label(currentRecipe.getDescription());
            Label ingredientList = new Label(ingredients);
            
            //add the ingredients and description to the recipe details container
            recipeDetails.getChildren().addAll(ingredientList, recipeDescription);
            recipeDetails.getStyleClass().add("recipeDetails");
            
            //create label for the suggestion box
            Label suggestion = new Label(currentRecipe.getSuggestion());
            suggestion.getStyleClass().add("suggestion");
            
            //set the elements to the top of the top container
            recipeInfo.setLeft(recipeName);
            recipeInfo.setRight(recipeTime);
            
            //set the elements for the recipe in the top and center of the container
            recipeWrapper.setCenter(recipeDetails);
            recipeWrapper.setTop(recipeInfo);
            recipeWrapper.setBottom(suggestion);
            
            list.getChildren().add(recipeWrapper);
        };
        
        
        
        this.setCenter(list);
        this.getStyleClass().add("recipeView");
    }
}
