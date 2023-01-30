
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();
    }
    
    public void add(String task) {
        this.toDo.add(task);
    }
    
    public void print() {
        for (String string : toDo) {
            System.out.println((this.toDo.indexOf(string) + 1) + ": " + string);
        }
    }
    
    public void remove(int number) {
        this.toDo.remove(number - 1);
    }
}
