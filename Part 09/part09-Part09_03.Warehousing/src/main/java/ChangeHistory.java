
import java.util.ArrayList;


public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double max = 0; 
        for (Double historyDouble : history) {
            if (historyDouble > max)
                max = historyDouble;
        }       
        return max;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double min = this.history.get(0); 
        for (Double historyDouble : history) {
            if (historyDouble < min)
                min = historyDouble;
        }       
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        
        for (Double doubleHistory : history) {
            sum += doubleHistory;
        }
        
        return sum / this.history.size();
    }
    
    @Override
    public String toString() {
        return this.history.toString(); 
    }

}
