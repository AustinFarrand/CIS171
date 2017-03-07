
package listing14_7;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
/**
 *
 * @author af0054085
 */
public class Listing14_7 extends Application{
    @Override
    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue;");
        pane.getChildren().add(btOK);
        
        //change the pane styles
        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray");
        
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle(("NodeStyleRotateDemo"));
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
