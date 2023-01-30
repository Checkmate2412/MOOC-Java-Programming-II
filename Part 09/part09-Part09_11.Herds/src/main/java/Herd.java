
import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Organism> organism;

    public Herd() {
        organism = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.organism.add((Organism) movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Organism organism1 : organism)
            organism1.move(dx, dy);
    }   

    @Override
    public String toString() {
        String printString = "";
        for (Organism organism1 : organism) 
            printString += organism1 + "\n";
        return printString;
    }
    
    
}
