
public class Student extends Person{
    private int credit;
    
    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }

    public void study() {
        this.credit++;
    }
    
    public int credits(){
        return this.credit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credit + 
                " lololololololol";
    }
}
