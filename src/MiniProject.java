/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Livia Boeriu
 */
public class MiniProject extends Application{
    
    public static IngredientStorage storage = new IngredientStorage();
    public static RecipeGlossary glossary = new RecipeGlossary();
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //create the border pane main frame
        BorderPane mainWindow = new BorderPane();
        mainWindow.getStyleClass().add("mainView");
        
        //create an HBox for the header
        HBox header = new HBox();
        header.getStyleClass().add("header");
        
        //create a new sidebar with ingredients
        IngredientView ingredientView = new IngredientView();
                
        //create the recipe view
        RecipeView recipeView = new RecipeView();
        
        //create the text for the header
        Label headerText = new Label("Recipe Picker");
        headerText.getStyleClass().add("headerText");
        
        //add the label to the top header
        header.getChildren().add(headerText);
        
        //create set the mainWindow Border Pane as the main scene for the view
        Scene scene = new Scene(mainWindow, 1000, 800);
        
        //set the elements in the mainWindow border pane
        mainWindow.setTop(header);
        mainWindow.setLeft(ingredientView);
        mainWindow.setCenter(recipeView);
        
        //set the title of the stage
        primaryStage.setTitle("Recipe picker");
        
        //set the scene for the primary stage
        primaryStage.setScene(scene);
        
        //make the stage visible
        primaryStage.show();
        
        //link the css file with the code
        scene.getStylesheets().add("CssMiniProject.css");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngredientStorage storage = getStorage();
        RecipeGlossary glossary = getGlossary();

        Ingredient apple = new Ingredient("apple", "fruit");
        Ingredient orange = new Ingredient("orange", "fruit");
        Ingredient lemon = new Ingredient("lemon", "fruit");
        Ingredient pineapple = new Ingredient("pineapple", "fruit");
        Ingredient strawberry = new Ingredient("strawberry", "fruit");
        Ingredient tomato = new Ingredient("tomato", "vegetable");
        Ingredient beetroot = new Ingredient("beetroot", "vegetable");
        Ingredient eggplant = new Ingredient("eggplant", "vegetable");
        Ingredient onion = new Ingredient("onion", "vegetable");
        Ingredient carrot = new Ingredient("carrot", "vegetable");
        Ingredient potato = new Ingredient("potato", "vegetable");
        Ingredient garlic = new Ingredient("garlic", "vegetable");
        Ingredient corn = new Ingredient("corn", "vegetable");
        Ingredient salt = new Ingredient("salt", "spice");
        Ingredient peper = new Ingredient("peper", "spice");
        Ingredient chilly = new Ingredient("chilly", "spice");
        Ingredient basil = new Ingredient("basil", "spice");
        Ingredient cinnamon = new Ingredient("cinnamon", "spice");
        Ingredient sugar = new Ingredient("sugar", "spice");
        Ingredient vanilla = new Ingredient("vanilla", "spice");
        Ingredient egg = new Ingredient("egg", "dairy");
        Ingredient heavyCream = new Ingredient("cream", "dairy");
        Ingredient parmesan = new Ingredient("parmesan", "dairy");
        Ingredient breadcrumbs = new Ingredient("breadcrumbs", "grain");
        Ingredient chicken = new Ingredient("chicken", "meat");
        Ingredient pork = new Ingredient("pork", "meat");
        
        //fruits
        storage.add(apple);
        storage.add(orange);
        storage.add(lemon);
        storage.add(pineapple);
        storage.add(strawberry);
        //vegetables
        storage.add(tomato);
        storage.add(beetroot);
        storage.add(eggplant);
        storage.add(onion);
        storage.add(carrot);
        storage.add(potato);
        storage.add(corn);
        storage.add(garlic);
        //spices
        storage.add(salt);
        storage.add(peper);
        storage.add(chilly);
        storage.add(basil);
        storage.add(cinnamon);
        storage.add(sugar);
        storage.add(vanilla);
        //dairy
        storage.add(egg);
        storage.add(heavyCream);
        storage.add(parmesan);
        //grain
        storage.add(breadcrumbs);
        //meat
        storage.add(chicken);
        storage.add(pork);
        
        storage.addCategory("fruit");
        storage.addCategory("vegetable");
        storage.addCategory("spice");
        storage.addCategory("dairy");
        storage.addCategory("grain");
        storage.addCategory("meat");
        
        //dessert recipe
        ArrayList<Ingredient> cremeBruleeIngredients = new ArrayList<>();
        cremeBruleeIngredients.add(sugar);
        cremeBruleeIngredients.add(egg);
        cremeBruleeIngredients.add(heavyCream);
        cremeBruleeIngredients.add(vanilla);
        DessertRecipe cremeBrulee = new DessertRecipe("Creme Brulee", cremeBruleeIngredients, sugar, 180, "Simple Creme Brulee Dessert");
        
        //meat recipe
        ArrayList<Ingredient> garlicChickenIngredients = new ArrayList<>();
        garlicChickenIngredients.add(parmesan);
        garlicChickenIngredients.add(breadcrumbs);
        garlicChickenIngredients.add(garlic);
        garlicChickenIngredients.add(chicken);
        garlicChickenIngredients.add(lemon);
        MeatRecipe garlicChicken = new MeatRecipe("Garlic Chicken", garlicChickenIngredients, chicken, 40, "Crunchy garlic chicken");
        
        //add recipes to glossary
        glossary.add(cremeBrulee);
        glossary.add(garlicChicken);
        
        launch(args);
    }
    
    public static IngredientStorage getStorage() {
        return storage;
    }
    
    public static RecipeGlossary getGlossary() {
        return glossary;
    }
    
}
