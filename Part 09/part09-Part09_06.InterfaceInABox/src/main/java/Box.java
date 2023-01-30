
import java.util.ArrayList;


public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> pack;

    public Box(double capacity) {
        this.pack = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Packable packable) {
        double tWeight = packable.weight() + this.weight(); 
        
        if (this.capacity > tWeight) 
            this.pack.add(packable);
    }
    
    @Override
    public double weight() {
        double totalWeight = 0;
       
        for (Packable packable1 : pack) 
            totalWeight += packable1.weight();
        return totalWeight;
    }  

    @Override
    public String toString() {
        return "Box: " + this.pack.size() + 
                " items, total weight " + this.weight() + " kg";
    }
      
}
