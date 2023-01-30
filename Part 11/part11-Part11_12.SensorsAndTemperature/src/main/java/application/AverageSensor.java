package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor{
    private List<Sensor> sensor;
    private List<Integer> averageList;

    public AverageSensor() {
        this.sensor = new ArrayList<>();
        this.averageList = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensor.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.averageList;
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor1 : sensor) {
            if (sensor1.isOn() == false)
                return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        this.sensor.stream().forEach(v -> v.setOn());
    }

    @Override
    public void setOff() {
        this.sensor.stream().forEach(v -> v.setOff());
    }

    @Override
    public int read() {
        if (this.sensor.isEmpty() || this.isOn() == false)
            throw new IllegalStateException();
        
        int avg = (int) this.sensor.stream().mapToInt(v -> v.read()).average().getAsDouble();
        averageList.add(avg);
        return avg;
    }
}
