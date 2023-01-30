package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean status;

    public TemperatureSensor() {
        this.status = false;
    }
     
    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if (this.status == true) {
            int num = new Random().nextInt(61);
            if (num >= 30)
                num -= 60; 
            return num;
        } else 
            throw new IllegalStateException();     
    }    
}
