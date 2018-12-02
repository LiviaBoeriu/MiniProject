/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Livia
 */
public class MiniProject extends Application{
    
    public static IngredientStorage storage = new IngredientStorage();
    
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

        Ingredient carrot = new Ingredient("carrot", "vegetable");
        Ingredient apple = new Ingredient("apple", "fruit");
        Ingredient strawberry = new Ingredient("strawberry", "fruit");
        Ingredient tomato = new Ingredient("tomato", "vegetable");
        Ingredient beetroot = new Ingredient("beetroot", "vegetable");
        
        storage.add(carrot);
        storage.add(tomato);
        storage.add(beetroot);
        storage.add(apple);
        storage.add(strawberry);
        
        storage.addCategory("vegetable");
        storage.addCategory("fruit");
        
        launch(args);
    }
    
    public static IngredientStorage getStorage() {
        return storage;
    }
    
}
