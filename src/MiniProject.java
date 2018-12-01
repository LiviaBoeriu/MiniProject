/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Livia
 */
public class MiniProject extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane mainWindow = new BorderPane();
        
        Scene scene = new Scene(mainWindow, 1000, 800);
        
        primaryStage.setTitle("Bar Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           launch(args);
    }
    
}
