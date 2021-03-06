/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listing14_9;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author af0054085
 */
public class Listing14_9 extends Application{
    @Override
    public void start(Stage primaryStage){
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("http://www.cs.armstrong.edu/liang/image/us.gif");
        pane.getChildren().add(new ImageView(image));
        
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);
        
        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);
        
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show Image");
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
