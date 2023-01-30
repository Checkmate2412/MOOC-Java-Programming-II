package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {
    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext graphic = canvas.getGraphicsContext2D();
        
        graphic.setFill(Color.BLACK);
        graphic.fillRect(80, 40, 40, 40);
        graphic.fillRect(200, 40, 40, 40);
        
        graphic.fillRect(40, 160, 40, 40);
        graphic.fillRect(240, 160, 40, 40);
        
        graphic.fillRect(80, 200, 160, 40);
        
        layout.setCenter(canvas);
//        canvas.setOnMouseDragged((event) -> {
//            double x = event.getX();
//            double y = event.getSceneY();
//            graphic.setFill(color.getValue());
//            graphic.fillOval(x, y, 4, 4);
//        });
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

}
