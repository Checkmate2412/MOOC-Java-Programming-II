import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (shoppingCart.containsKey(product))
            this.shoppingCart.get(product).increaseQuantity();
        else
            this.shoppingCart.put(product, new Item(product, 1, price)); 
    }
    
    public int price() {
        int total = 0;
        
        for (Item item : shoppingCart.values())
            total += item.price();
        return total;
    }
    
    public void print() {
        for (Item item : shoppingCart.values())
            System.out.println(item);
    }
}
