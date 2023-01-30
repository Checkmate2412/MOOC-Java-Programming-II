package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{
    HashMap<String, HashMap<Integer, Double>> values;

    public PartiesApplication() {
        this.values = dataRead();
    }
    
    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
           
        this.values.entrySet().stream().forEach((v) -> {
            XYChart.Series data = new XYChart.Series();  
            data.setName(v.getKey());
            
            v.getValue().entrySet().stream().forEach((v1) -> {
                 data.getData().add(new XYChart.Data
                    (v1.getKey(), v1.getValue()));
            
            });
            lineChart.getData().add(data);
        });
        
        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();
    }

    public HashMap<String, HashMap<Integer, Double>> dataRead() {
        HashMap<String, HashMap<Integer, Double>> data = new HashMap();
        ArrayList<Integer> yearList = new ArrayList();
        
        try (Scanner scanFile = new Scanner(Paths.get("partiesdata.tsv"))) {
            String year = scanFile.nextLine();
            String[] yearData = year.split("\t");
            
            for (int i = 1; i < yearData.length; i++)
                yearList.add(Integer.valueOf(yearData[i]));
  
            while (scanFile.hasNextLine()) {
                HashMap<Integer, Double> insideData = new HashMap();
                String row = scanFile.nextLine();
                String[] rowData = row.split("\t");
                
                for (int i = 1; i < rowData.length; i++) {
                    if (!rowData[i].equals("-"))
                        insideData.put(yearList.get(i - 1), 
                            Double.valueOf(rowData[i]));
                }     
                
                data.put(rowData[0], insideData);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return data;
    }
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}
