
package buttondemo;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author af0054085
 */
public class ButtonDemo extends Application{
    protected Text text = new Text(50,50,"JavaFX Programming\nJavaFX programming is fun");
    
    protected BorderPane getPane(){
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left", new ImageView("image/left.gif"));
        Button btRight = new Button("Right", new ImageView("image/right.gif"));
        btRight.setContentDisplay(ContentDisplay.RIGHT);
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");
        
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        
        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
        
        return pane;
    }
    
    @Override
    public void start(Stage primaryStage){
        TextFieldDemo textFieldDemo = new TextFieldDemo(); 
        CheckBoxDemo cbDemo = new CheckBoxDemo();
        Scene scene = new Scene(textFieldDemo.getPane(), 450, 200);
        primaryStage.setTitle("ButtonDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
     public static void main(String[] args) {
    launch(args);
  }
    
}
