
public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (recommeded for " + this.age + " year-olds or older)";
    }
}
