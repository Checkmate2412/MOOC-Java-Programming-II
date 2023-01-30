import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices, stocks;

    public Warehouse() {
        prices = new HashMap<>();
        stocks = new HashMap<>();
    }
 
    public void addProduct(String product, int price, int stock) {      
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.stocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (!(this.stocks.containsKey(product)))
            return false;
        
        if (this.stocks.get(product) == 0)
            return false;
        
        this.stocks.put(product, this.stocks.get(product) - 1);
        return true;
    }
    
    public Set<String> products() {
        return this.prices.keySet();
    }
}
