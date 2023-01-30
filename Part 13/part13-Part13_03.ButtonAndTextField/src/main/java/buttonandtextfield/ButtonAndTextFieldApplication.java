package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage){
        Button button = new Button("Button");
        TextField textField = new TextField("TextField");        
        
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(textField);
        flowPane.getChildren().add(button);
        
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }
}
