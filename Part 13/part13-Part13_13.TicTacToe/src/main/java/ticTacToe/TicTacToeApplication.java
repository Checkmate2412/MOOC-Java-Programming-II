package ticTacToe;

import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application{
    private char[][] butt;
    private char turn;
    private boolean winner;

    public TicTacToeApplication() {
        this.butt = new char[3][3];
        this.turn = 'X';
        this.winner = false;
    }
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Label topLabel = new Label("Turn: " + this.turn);
        topLabel.setFont(Font.font("Monospaced", 40));
        
        GridPane gridPane = new GridPane(); 
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                Button button = butmake(topLabel, col, row);
                gridPane.add(button, col, row);
            }
        }   
        
        borderPane.setTop(topLabel);
        borderPane.setCenter(gridPane);

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }
    
    public Button butmake(Label label, int col, int row) {
        Button but = new Button(" ");
        but.setFont(Font.font("Monospaced", 40));
        
        but.setOnAction((event) -> {
            if (!this.winner) {
                if (but.getText().equals(" ")) {
                    but.setText(String.valueOf(this.turn));
                    this.butt[row][col] = this.turn;

                    this.winner = result();

                    if (this.winner) {
                        label.setText("The end!");
                    } else {
                        if (this.turn == 'X')
                            this.turn = 'O';
                        else 
                            this.turn = 'X';
                        label.setText("Turn: " + String.valueOf(this.turn));
                    }
                }
            }
        });
        return but;
    }
    
    public boolean result() {

        //Horizontal
        for (int row = 0; row < this.butt.length; row++) {
            int count = 0;        
            for (int col = 0; col < this.butt[row].length; col++) {
                if (this.butt[row][col] == this.turn)
                    count++;
                else 
                    break;
            }   
            
            if (count == 3)
                return true;
        }
        
        //Vertical
        for (int col = 0; col < this.butt[0].length; col++) {
            int count = 0;        
            for (int row = 0; row < this.butt.length; row++) {
                if (this.butt[row][col] == this.turn)
                    count++;
                else 
                    break;
            }   
            if (count == 3)
                return true;
        } 
        
        //Diagonal
        if (this.butt[1][1] == this.turn && (
                (this.butt[0][0] == this.turn && this.butt[2][2] == this.turn) || 
                (this.butt[2][0] == this.turn && this.butt[0][2] == this.turn)))
            return true;
        
        return false;
    }
}