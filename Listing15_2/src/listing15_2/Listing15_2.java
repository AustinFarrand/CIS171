
package listing15_2;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
/**
 *
 * @author af0054085
 */
public class Listing15_2 extends Application {
    private CirclePane circlePane = new CirclePane();
    
    @Override
    public void start(Stage primaryStage){
        
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);
        
        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHandler());
                
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);
        
        Scene scene = new Scene(borderPane, 200,150);
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    class EnlargeHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            circlePane.enlarge();
        }
    }
    
    class ShrinkHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            circlePane.shrink();
        }
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
    class CirclePane extends StackPane{
        private Circle circle = new Circle(50);
        
        public CirclePane(){
            getChildren().add(circle);
            circle.setStroke(Color.ORANGE);
            circle.setFill(Color.YELLOW);
        }
        
        public void enlarge(){
            circle.setRadius(circle.getRadius() + 10);
        }
        
        public void shrink(){
            circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2: circle.getRadius());
        }
    }
    
}
