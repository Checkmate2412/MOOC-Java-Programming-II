package application;

import java.util.ArrayList;

public class Logic {

    public ArrayList<Double> savings(double savings) {
        ArrayList<Double> savingsData = new ArrayList();
        savings *= 12;
        savingsData.add(0, 0.0);
        
        for (int i = 1; i < 31; i++) 
            savingsData.add(i, (savings) * i);
        
        return savingsData;       
    }
    
    public ArrayList<Double> interest(double savings, double interest) {
        ArrayList<Double> interestData = new ArrayList();
        interest /= 100;
        double yearSavings = savings * 12;
        double yearlySavings = yearSavings;
        interestData.add(0, 0.0); 
        
        for (int i = 1; i < 31; i++) {
            double inputSavings = yearlySavings * interest;
            yearlySavings += inputSavings;
            interestData.add(i, yearlySavings);
            yearlySavings += yearSavings;
        }
        
        return interestData;
    }
}
