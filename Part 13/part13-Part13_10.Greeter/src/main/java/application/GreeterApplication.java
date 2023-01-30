package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        Label label1 = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button button1 = new Button("Start");
        
        gridPane.add(label1, 0, 0);
        gridPane.add(textField, 0, 1);
        gridPane.add(button1, 0, 2);
        
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPrefSize(300, 180);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20));        
        
        StackPane stackPane = new StackPane();
        Label welcomeLabel = new Label();
        stackPane.setPrefSize(300, 180);
        stackPane.setAlignment(Pos.CENTER);
        stackPane.getChildren().add(welcomeLabel);
        
        Scene greet = new Scene(gridPane);
        Scene welcome = new Scene(stackPane);
        
        button1.setOnAction((event) -> {
            welcomeLabel.setText("Welcome " + textField.getText() + "!");
            stage.setScene(welcome);
        });
        
        stage.setScene(greet);
        stage.show();
    }
}
