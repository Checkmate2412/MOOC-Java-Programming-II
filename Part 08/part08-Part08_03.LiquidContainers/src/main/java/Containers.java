
public class Containers {
    private int amount;

    public Containers() {
        this.amount = 0;
    }

    public int getAmount() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount >= 0) {
            this.amount += amount;  
            if (this.amount > 100)
                this.amount = 100; 
        }
    }
    
    public void move(Containers contain2, int amount) {
        if (amount >= 0 && this.amount != 0) {
            if (this.amount < amount)
                amount = this.amount;
            
            this.remove(amount);
            contain2.add(amount);
        }
    }
    
    public void remove(int amount) {
        this.amount -= amount;     
        if (this.amount < 0)
            this.amount = 0;
    }
}
