public class Item {
//    private Map<String, Integer> unitPrice, quantity;
    private String product;
    private int unitPrice, qty;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
    
    public int price() {
        return this.unitPrice * this.qty;           
    }
    
    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }  
}
