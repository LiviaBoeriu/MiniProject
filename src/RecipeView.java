import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * This class provides the view for the recipes contained in the project.
 * @author Livia Boeriu
 */
public class RecipeView extends BorderPane {
    
    static VBox list = new VBox();

    /**
     * Method for creating and setting an image to the first button with the pepper
     */
    public static ImageView setImageView1(){
        Image blackChilly = new Image("/images/chillyBlack.png");
        ImageView chillyImageView = new ImageView();
        chillyImageView.setImage(blackChilly);
        chillyImageView.setFitWidth(30);
        chillyImageView.setPreserveRatio(true);
        return chillyImageView;
    }
    
    /**
     *  Method for creating and setting an image to the second button with the pepper
     */
    public static ImageView setImageView2(){
        Image blackChilly = new Image("/images/chillyBlack.png");
        ImageView chillyImageView = new ImageView();
        chillyImageView.setImage(blackChilly);
        chillyImageView.setFitWidth(30);
        chillyImageView.setPreserveRatio(true);
        return chillyImageView;
    }
    
    /**
     * Method for creating and setting an image to the third button with the pepper
     */
    public static ImageView setImageView3(){
        Image blackChilly = new Image("/images/chillyBlack.png");
        ImageView chillyImageView = new ImageView();
        chillyImageView.setImage(blackChilly);
        chillyImageView.setFitWidth(30);
        chillyImageView.setPreserveRatio(true);
        return chillyImageView;
    }
    
    /**
     * Method for creating and setting an image to the first button with the pepper
     */
    public static ImageView setImageViewRed(){
        Image blackChilly = new Image("/images/chilly.png");
        ImageView chillyImageView = new ImageView();
        chillyImageView.setImage(blackChilly);
        chillyImageView.setFitWidth(30);
        chillyImageView.setPreserveRatio(true);
        return chillyImageView;
    }
    
    /**
     * Method to get the VBox wrapper in order to put elements from the recipe view on it
     * @return the main list wrapper
     */
    public static VBox getListWrapper() {
        return list;
    }
    
    //Handler for the first pepper button
    public static class pepperHandler1 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event){
            RecipeGlossary glossary = MiniProject.getGlossary();
            Button pepper = (Button) event.getSource(); //clicked button
            Parent recipeWrapper = pepper.getParent().getParent().getParent(); //RecipeWrapper
            Parent buttonContainer = pepper.getParent(); //Hbox
            Recipe recipe = glossary.getRecipeByName(recipeWrapper.getId()); //RecipeObject
            HBox container = ((HBox)buttonContainer); //HBox element
            
            int spicinessLevel = recipe.getSpiciness();
            if(spicinessLevel == 0) {
                ImageView pepperView = setImageViewRed();
                pepper.setGraphic(pepperView);
            } else {
                for(int i = 0; i < 3; i++) {
                    Node currentButton = container.getChildren().get(i); //HBox node
                    Button currentPepper = ((Button)currentButton); //create button for that node
                    if(i == 0) {
                        ImageView pepperView = setImageViewRed();
                        currentPepper.setGraphic(pepperView);
                    } else {
                        ImageView pepperView = setImageView1();
                        currentPepper.setGraphic(pepperView);
                    }
                }
            }  
            recipe.setSpiciness(1);
            System.out.println(recipe.getSpiciness());
        }
    }
    
    //Handler for the second pepper button 
    public static class pepperHandler2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event){
            RecipeGlossary glossary = MiniProject.getGlossary();
            Button pepper = (Button) event.getSource(); //clicked button
            Parent recipeWrapper = pepper.getParent().getParent().getParent(); //RecipeWrapper
            Parent buttonContainer = pepper.getParent(); //Hbox
            Recipe recipe = glossary.getRecipeByName(recipeWrapper.getId()); //RecipeObject
            HBox container = ((HBox)buttonContainer); //HBox element
            
            int spicinessLevel = recipe.getSpiciness();
            if(spicinessLevel == 0) {
                for(int i = 0; i < 2; i++) {
                    Node currentButton = container.getChildren().get(i); //HBox node
                    Button currentPepper = ((Button)currentButton); //create button for that node
                    ImageView pepperView = setImageViewRed();
                    currentPepper.setGraphic(pepperView);
                }
            } else {
                for(int i = 0; i < 3; i++) {
                    Node currentButton = container.getChildren().get(i); //HBox node
                    Button currentPepper = ((Button)currentButton); //create button for that node
                    if(i < 2) {
                        ImageView pepperView = setImageViewRed();
                        currentPepper.setGraphic(pepperView);
                    } else {
                        ImageView pepperView = setImageView1();
                        currentPepper.setGraphic(pepperView);
                    }
                }
            }
            recipe.setSpiciness(2);
            System.out.println(recipe.getSpiciness());
        }
    }
    
    //Handler for the second pepper button
    public static class pepperHandler3 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event){
            RecipeGlossary glossary = MiniProject.getGlossary();
            Button pepper = (Button) event.getSource(); //clicked button
            Parent recipeWrapper = pepper.getParent().getParent().getParent(); //RecipeWrapper
            Parent buttonContainer = pepper.getParent(); //Hbox
            Recipe recipe = glossary.getRecipeByName(recipeWrapper.getId()); //RecipeObject
            HBox container = ((HBox)buttonContainer); //HBox element
            
            int spicinessLevel = recipe.getSpiciness();
            if(spicinessLevel == 0) {
                for(int i = 0; i < 3; i++) {
                    Node currentButton = container.getChildren().get(i); //HBox node
                    Button currentPepper = ((Button)currentButton); //create button for that node
                    ImageView pepperView = setImageViewRed();
                    currentPepper.setGraphic(pepperView);
                }
            } else {
                for(int i = 0; i < 3; i++) {
                    Node currentButton = container.getChildren().get(i); //HBox node
                    Button currentPepper = ((Button)currentButton); //create button for that node
                    if(i < 3) {
                        ImageView pepperView = setImageViewRed();
                        currentPepper.setGraphic(pepperView);
                    } else {
                        ImageView pepperView = setImageView1();
                        currentPepper.setGraphic(pepperView);
                    }
                }
            } 
            
            recipe.setSpiciness(3);
            System.out.println(recipe.getSpiciness());
        }
    }
    
    /**
     * The constructor for the recipeView in which the glossary and recipe list are called
     * and the elements are set to the main container
     */
    public RecipeView() {
        list.setSpacing(10);
        ScrollPane scrollPane = new ScrollPane(list);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        
        //get recipes
        RecipeGlossary glossary = MiniProject.getGlossary();
        ArrayList<Recipe> recipeList = glossary.recipes;
        
        createRecipeView(recipeList);

        this.setCenter(scrollPane);
        scrollPane.getStyleClass().add("scrollPane");
        this.getStyleClass().add("recipeView");
    }
    
    /**
     * Method for creating the recipe list view, because it needs to be called every time
     * you select a new ingredient
     * @param recipes 
     */
    public static void createRecipeView(ArrayList<Recipe> recipes) {
        VBox list = getListWrapper();

        list.getChildren().clear();
        
        //for every recipe create a wrapper
        for(int i = 0; i < recipes.size(); i++) {
            Recipe currentRecipe = recipes.get(i);
            
            //create the main wrapper
            BorderPane recipeWrapper = new BorderPane();
            //create wrapper for title and time
            BorderPane recipeInfo = new BorderPane();
            //create border pane for the bottom part of the recipe
            BorderPane bottomSuggestionBox = new BorderPane();
            
            recipeWrapper.getStyleClass().add("recipeWrapper");
            recipeWrapper.setId(currentRecipe.name);
            recipeInfo.getStyleClass().add("recipeInfo");
            
            Label recipeName = new Label(currentRecipe.name);
            Label recipeTime = new Label(Integer.toString(currentRecipe.time) + " minutes");
            
            //create box for recipe details
            VBox recipeDetails = new VBox();
            recipeDetails.setSpacing(4);
            
            String ingredients = "Ingredients: ";
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
            HBox suggestion = new HBox();
            Label suggestionLabel = new Label(currentRecipe.getSuggestion());
            suggestionLabel.getStyleClass().add("suggestion");
            suggestion.getChildren().add(suggestionLabel);
            suggestion.setAlignment(Pos.TOP_LEFT);
            
            //create the pepper images for spiciness
            HBox pepperHolder = new HBox();
            pepperHolder.setId("pepperHolder");
            //create buttons for spiciness
            Button pepperPicture1 = new Button("");
            pepperPicture1.setId("pepperPicture1");
            Button pepperPicture2 = new Button("");
            pepperPicture2.setId("pepperPicture2");
            Button pepperPicture3 = new Button("");
            pepperPicture3.setId("pepperPicture3");
            
            //set cursor for the buttons when hovering
            pepperPicture1.setCursor(Cursor.HAND);
            pepperPicture2.setCursor(Cursor.HAND);
            pepperPicture3.setCursor(Cursor.HAND);
            
            //clear the formatting on the buttons
            pepperPicture1.getStyleClass().clear();
            pepperPicture2.getStyleClass().clear();
            pepperPicture3.getStyleClass().clear();
            
            //Setting the images for the buttons
            ImageView imageView1 = setImageView1();
            ImageView imageView2 = setImageView2();
            ImageView imageView3 = setImageView3();
            pepperPicture1.setGraphic(imageView1);
            pepperPicture2.setGraphic(imageView2);
            pepperPicture3.setGraphic(imageView3);
            
            //assign handler to the button
            pepperPicture1.setOnAction(new pepperHandler1());
            pepperPicture2.setOnAction(new pepperHandler2());
            pepperPicture3.setOnAction(new pepperHandler3());
            
            //putting the buttons on the HBox
            pepperHolder.getChildren().addAll(pepperPicture1, pepperPicture2, pepperPicture3);
            
            //set things on bottomSuggestionBox
            bottomSuggestionBox.setCenter(suggestion);
            bottomSuggestionBox.setRight(pepperHolder);
            
            //set the elements to the top of the top container
            recipeInfo.setLeft(recipeName);
            recipeInfo.setRight(recipeTime);
            
            //set the elements for the recipe in the top and center of the container
            recipeWrapper.setCenter(recipeDetails);
            recipeWrapper.setTop(recipeInfo);
            recipeWrapper.setBottom(bottomSuggestionBox);
            
            list.getChildren().add(recipeWrapper);
        }
    } 
}
