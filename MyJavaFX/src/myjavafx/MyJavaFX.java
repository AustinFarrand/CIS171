
package myjavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 *
 * @author af0054085
 */
public class MyJavaFX extends Application {
    @Override 
    public void start(Stage primaryStage){
        // create a scene and place a button in the scene
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("My JavaFX");
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
