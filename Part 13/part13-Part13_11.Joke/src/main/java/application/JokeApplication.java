package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button jokeButton = new Button("Joke");
        Button ansButton = new Button("Answer");
        Button expButton = new Button("Explanation");
        
        menu.getChildren().addAll(jokeButton, ansButton, expButton);
        layout.setTop(menu);
        
        StackPane jokeView = view("What do you call a bear with no teeth?");
        StackPane ansView = view("A gummy bear.");
        StackPane expView = view("Nothing.");
        
        jokeButton.setOnAction((event) -> {layout.setCenter(jokeView);});
        ansButton.setOnAction((event) -> {layout.setCenter(ansView);});
        expButton.setOnAction((event) -> {layout.setCenter(expView);});
        
        layout.setCenter(jokeView);
        
        Scene main = new Scene(layout);
        stage.setScene(main);
        stage.show();
    }
    
    public StackPane view (String text) {
        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(300, 180);
        stackPane.setAlignment(Pos.CENTER);
        stackPane.getChildren().add(new Label(text));
        return stackPane;
    }
}
