package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {
    
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window){
        FlowPane flowPane = new FlowPane();
        Label label1 = new Label("Label");
        Button button1 = new Button("Button");
        
        flowPane.getChildren().add(label1);
        flowPane.getChildren().add(button1);
        
        Scene scene = new Scene(flowPane);
        window.setScene(scene);
        window.show();
    }
}
