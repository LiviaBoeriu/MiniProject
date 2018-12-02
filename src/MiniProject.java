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
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //create the border pane main frame
        BorderPane mainWindow = new BorderPane();
        
        //create an HBox for the header
        HBox header = new HBox();
        
        //create the text for the header
        Label headerText = new Label("Recipe Picker");
        
        //add the label to the top header
        header.getChildren().add(headerText);
        
        //create set the mainWindow Border Pane as the main scene for the view
        Scene scene = new Scene(mainWindow, 1000, 800);
        
        //set the elements in the mainWindow border pane
        mainWindow.setTop(header);
        
        //set the title of the stage
        primaryStage.setTitle("Recipe picker");
        
        //set the scene for the primary stage
        primaryStage.setScene(scene);
        
        //make the stage visible
        primaryStage.show();
   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           launch(args);
    }
    
}
