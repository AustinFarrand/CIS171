package javaapplication14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.util.Random;
/**
 *Developer: Austin Farrand
 * Date: 2/4/17
 * Project: Exercise 14_7
 * @author Austin
 */
public class JavaApplication14 extends Application {

    @Override
    public void start(Stage primaryStage){
    FlowPane pane = new FlowPane();
    pane.setPadding(new Insets(10,10,10,10));
    pane.setHgap(5);//sets gap between text fields below.
    pane.setVgap(5);
      
    for(int i = 0; i < 100; i++){ //For loop creates the text fields
        Random number = new Random();
        int generatedNumber = number.nextInt(2);      
        TextField tfMi = new TextField();       
        tfMi.setText(Integer.toString(generatedNumber));//Converts the 0 or 1 to a string and sets each one to a text field.
        tfMi.setPrefColumnCount(1);       
        pane.getChildren().addAll(tfMi);
    }
   
    Scene scene = new Scene(pane,325,325); //size of pane determines number of rows and columns.
    primaryStage.setTitle("Exercise14_7");
    primaryStage.setScene(scene);
    primaryStage.show();
    
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

