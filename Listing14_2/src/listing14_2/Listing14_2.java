
package listing14_2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 *
 * @author af0054085
 */
public class Listing14_2 extends Application {
    @Override
    public void start(Stage primaryStage){
        //create a scene and place a button in the scene
        Scene scene = new Scene(new Button("OK"),200,250);
        primaryStage.setTitle("My JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"),100,100));
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch();
    }
    
}
