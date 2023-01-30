package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        HBox hBox = new HBox();
        
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");
        
        hBox.setSpacing(20);
        hBox.getChildren().addAll(letters, words, longest);
        
        TextArea textArea = new TextArea();
        textArea.textProperty().addListener((change, old, updated) -> {
            String[] inputs = updated.split(" ");
            int letterCount = updated.length();
            int wordCount = inputs.length;
            String longWord = Arrays.stream(inputs)
                    .sorted((word1, word2) -> word2.length() - word1.length())
                    .findFirst()
                    .get();
            
            letters.setText("Letters: " + letterCount);
            words.setText("Words: " + wordCount);
            longest.setText("The longest word is: " + longWord);
        });
        
        layout.setBottom(hBox);
        layout.setCenter(textArea);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

}
