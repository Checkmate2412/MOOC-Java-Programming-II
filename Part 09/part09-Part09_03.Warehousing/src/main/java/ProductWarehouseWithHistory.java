
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); 
        this.changeHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return taken; 
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + 
                "\nHistory: " + this.changeHistory.toString() +
                "\nLargest amount of product: " + this.changeHistory.maxValue() +
                "\nSmallest amount of product: " + this.changeHistory.minValue() + 
                "\nAverage: " + this.changeHistory.average());
    }
    
    public String history() {
        return this.changeHistory.toString();
    }

}
