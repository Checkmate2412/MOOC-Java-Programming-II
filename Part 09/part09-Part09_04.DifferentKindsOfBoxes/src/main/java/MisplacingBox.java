
import java.util.HashMap;


public class MisplacingBox extends Box {
    private HashMap<String, Item> item;

    public MisplacingBox() {
        this.item = new HashMap<>();
    }
    
    @Override
    public void add(Item item) {
        this.item.put(item.getName(), item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
