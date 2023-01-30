public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void sleep() {
        System.out.println(this.name + " sleeps");
    }
    
    private void eat() {
        System.out.println(this.name + " eats");
    }
}
