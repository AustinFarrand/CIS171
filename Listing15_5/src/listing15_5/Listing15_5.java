
package listing15_5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Listing15_5 extends Application {
    @Override
    public void start(Stage primaryStage){
        Text text = new Text(200, 200, "Programming is fun");
        Pane pane = new Pane(text);
        
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);
        
        btUp.setOnAction((ActionEvent e) -> {
            text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
        });
        
        btDown.setOnAction((e) -> {
            text.setY(text.getY() < pane.getHeight() ? 
            text.getY() + 5 : pane.getHeight());
        });
        
        btLeft.setOnAction(e -> {
        text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
        });
    
        btRight.setOnAction(e ->
        text.setX(text.getX() < pane.getWidth() - 100?
        text.getX() + 5 : pane.getWidth() - 100)
        );
                
        Scene scene = new Scene(borderPane, 400, 350);
        primaryStage.setTitle("AnonymousHandlerDemo"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
