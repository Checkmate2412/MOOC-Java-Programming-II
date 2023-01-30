package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) {
        VBox vBox = new VBox();
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        vBox.getChildren().addAll(textField, button, label);
        
        button.setOnAction((event) -> {
            label.setText(textField.getText());  
        });
        
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }

}
