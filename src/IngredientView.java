import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

/**
 * This class contains the constructor for the side bar with ingredients  
 * @author Livia Boeriu
 */
public class IngredientView extends BorderPane {
    
    VBox list = new VBox();  
 
    /**
     * Constructor for creating the side bar list with the ingredients
     */
    public IngredientView() {       
        list.setSpacing(10);
        
        this.setPrefSize(400, 500);
        this.setCenter(list);
        this.getStyleClass().add("ingredientView");
        
        IngredientStorage storage = MiniProject.getStorage();
        
        ArrayList<String> storageCategories = storage.categories;
        
        for(int i = 0; i < storageCategories.size(); i++) {
            String currentCategory = storageCategories.get(i);
            ArrayList<Ingredient> categoryIngredients = storage.getIngredientsByType(currentCategory);
            
            BorderPane category = new BorderPane();
            Label label = new Label(currentCategory);
            FlowPane categoryIngredientsContainer = new FlowPane();
            
            label.getStyleClass().add("categoryTitle");
            category.setTop(label);
            category.setCenter(categoryIngredientsContainer);
            category.getStyleClass().add("ingredientCard");
            categoryIngredientsContainer.getStyleClass().add("categoryIngredients");
            
            for(int j = 0; j < categoryIngredients.size(); j++) {
                Ingredient currentIngredient = categoryIngredients.get(j);
                
                Label ingredientName = new Label(currentIngredient.name);
                ingredientName.setCursor(Cursor.HAND);
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
