

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); 
        cart.add("milk",3); 
        System.out.println(cart.price());
    }
}
