/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listing14_4;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 *
 * @author af0054085
 */
public class Listing14_4 extends Application {
    @Override
    public void start(Stage primaryStage){
        //Create a new circle and set its properties
       
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(100);
        circle.setStroke(Color.BURLYWOOD);
        circle.setFill(Color.ALICEBLUE);
        
        //create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        
        //create a scene and place it in the stage
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
