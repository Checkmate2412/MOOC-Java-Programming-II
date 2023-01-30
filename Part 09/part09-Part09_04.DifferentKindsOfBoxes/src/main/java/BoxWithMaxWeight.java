
import java.util.HashMap;


public class BoxWithMaxWeight extends Box {
    private int capacity;
    private HashMap<String, Integer> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new HashMap<>();
    }

    @Override
    public void add(Item item) {
        int totalCapacity = item.getWeight();
        
        for (int weight:  items.values())
            totalCapacity += weight;
        if (capacity >= totalCapacity)
            this.items.put(item.getName(), item.getWeight());
        
        System.out.println(this.items.toString());
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.containsKey(item.getName());
    }
    
    
}
