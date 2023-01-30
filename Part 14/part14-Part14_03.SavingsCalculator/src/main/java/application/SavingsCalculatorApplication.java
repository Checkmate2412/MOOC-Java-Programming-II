package application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application{
    private Logic logic;

    public SavingsCalculatorApplication() {
        this.logic = new Logic();
    }
    
    @Override
    public void start(Stage stage) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        barChart.setTitle("Populations of the Nordic countries");
        barChart.setLegendVisible(false);

        XYChart.Series populations = new XYChart.Series();
        populations.getData().add(new XYChart.Data("Sweden", 10313447));
        populations.getData().add(new XYChart.Data("Denmark", 5809502));
        populations.getData().add(new XYChart.Data("Finland", 5537364));
        populations.getData().add(new XYChart.Data("Norway", 5372191));
        populations.getData().add(new XYChart.Data("Iceland", 343518));

        barChart.getData().add(populations);
        Scene view = new Scene(barChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }   
    
    public void lines(LineChart lineChart, double savings, double interest) {
        lineChart.getData().clear();
        XYChart.Series savingsLine = new XYChart.Series();
        XYChart.Series interestLine = new XYChart.Series();
        ArrayList<Double> savingsData = this.logic.savings(savings);
        ArrayList<Double> interestData = this.logic.interest(savings, interest);
        
        for (int i = 0; i < 31; i++) {
            savingsLine.getData().add(new XYChart.Data(i , 
                    savingsData.get(i)));
            interestLine.getData().add(new XYChart.Data(i , 
                    interestData.get(i)));
        }

        lineChart.getData().add(savingsLine);
        lineChart.getData().add(interestLine);
    }
    
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
}
                          