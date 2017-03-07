package exercise15_29;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.animation.PathTransition;
import javafx.scene.shape.Line;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.Timeline;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
/**
 *
 * @author Austin
 */
public class Exercise15_29 extends Application {
     @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button pause = new Button("pause");
        Button resume = new Button("resume");
        hBox.getChildren().add(pause);
        hBox.getChildren().add(resume);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);
        
        ImageView car = new ImageView("image/car.png");
        pane.getChildren().add(car);
        
        PathTransition carPath = new PathTransition(Duration.millis(3000), new Line(-100,300,420,300), car);       
        carPath.setCycleCount(Timeline.INDEFINITE);
        carPath.play();
        
        pause.setOnMousePressed(e -> carPath.pause());
        resume.setOnMousePressed(e -> carPath.play());
        Scene scene = new Scene(borderPane, 700, 500);
        
        scene.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.UP){
                carPath.setRate(carPath.getCurrentRate() + 1);
            }
            else if(e.getCode() == KeyCode.DOWN){
                carPath.setRate(carPath.getCurrentRate() - 1);
            } 
        });
        
        
        primaryStage.setTitle("Race Car Racing");
        primaryStage.setScene(scene);
        primaryStage.show();
     
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
}