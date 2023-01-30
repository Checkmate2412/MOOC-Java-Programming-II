package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{
    Map<Integer, Integer> value;

    public ShanghaiApplication() {
        this.value = new HashMap<>();
    }

    public void addData() {
        this.value.put(2007, 73);
        this.value.put(2008, 68);
        this.value.put(2009, 72);
        this.value.put(2010, 72);
        this.value.put(2011, 74);
        this.value.put(2012, 73);
        this.value.put(2013, 76);
        this.value.put(2014, 73);
        this.value.put(2015, 67);
        this.value.put(2016, 56);
        this.value.put(2017, 56);
    }
    
    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(2007, 2017, 4);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai Ranking");
        
        XYChart.Series data = new XYChart.Series();
        data.setName("Ranking");
        
        addData();
        this.value.entrySet().stream().forEach((v) -> {
            data.getData().add(new XYChart.Data(v.getKey(), v.getValue()));
        });
        
        lineChart.getData().add(data);
        
        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
}
