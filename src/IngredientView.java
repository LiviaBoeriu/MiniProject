
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Livia Boeriu
 */
public class IngredientView extends BorderPane {
    
    VBox list = new VBox();  
 
    /**
     * Constructor for creating the sidebar list with the ingredients
     */
    public IngredientView() {       
        list.setSpacing(10);
        
        this.setPrefWidth(308);
        this.setCenter(list);
        this.getStyleClass().add("ingredientView");
        
        IngredientStorage storage = MiniProject.getStorage();
        
        ArrayList<String> storageCategories = storage.categories;
        
        for(int i = 0; i < storageCategories.size(); i++) {
            String currentCategory = storageCategories.get(i);
            ArrayList<Ingredient> categoryIngredients = storage.getIngredientsByType(currentCategory);
            
            BorderPane category = new BorderPane();
            Label label = new Label(currentCategory);
            TilePane categoryIngredientsContainer = new TilePane();
            
            label.getStyleClass().add("categoryTitle");
            category.setTop(label);
            category.setBottom(categoryIngredientsContainer);
            category.getStyleClass().add("ingredientCard");
            categoryIngredientsContainer.getStyleClass().add("categoryIngredients");
            
            for(int j = 0; j < categoryIngredients.size(); j++) {
                Ingredient currentIngredient = categoryIngredients.get(j);
                
                Label ingredientName = new Label(currentIngredient.name);
                ingredientName.getStyleClass().add("ingredientName");
                ingredientName.setMinWidth(70);

                EventHandler<MouseEvent> labelClickedHandler = new EventHandler<MouseEvent> () {
                    @Override
                    public void handle(MouseEvent event) {
                        Object node = event.getSource(); //returns the object that generated the event
                        Label ingredient = (Label)node;
                        
                        String ingredientName = ingredient.getText();
                        
                        if (!storage.isSelected(ingredientName)) {
                            storage.addSelectedIngridient(ingredientName);
                            ingredient.getStyleClass().add("selected");
                        } else {
                            storage.removeSelectedIngridient(ingredientName);
                            ingredient.getStyleClass().remove("selected");
                        }
                        
                        RecipeGlossary glossary = MiniProject.getGlossary();
                        ArrayList<Recipe> filteredRecipes = glossary.filterRecipes(storage.selectedIngredients);
                        RecipeView.createRecipeView(filteredRecipes);
                    }
                };

                ingredientName.addEventHandler(MouseEvent.MOUSE_CLICKED, labelClickedHandler);
                
                categoryIngredientsContainer.getChildren().add(ingredientName);
            }
            
            list.getChildren().add(category);
        }
    }
}
