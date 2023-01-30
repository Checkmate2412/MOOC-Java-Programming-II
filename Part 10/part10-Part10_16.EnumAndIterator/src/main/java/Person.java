
public class Person {
    private String name;
    private Education educ;

    public Person(String name, Education educ) {
        this.name = name;
        this.educ = educ;
    }
    
    public Education getEducation() {
        return this.educ;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.educ;
    }
}
