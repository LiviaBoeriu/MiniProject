
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
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
public class RecipeView extends BorderPane {
    
    VBox list = new VBox();
    Label test = new Label("Test");
    
    public RecipeView() {
        
        list.getChildren().add(test);
        
        this.setCenter(list);
        this.getStyleClass().add("recipeView");
    }
}
