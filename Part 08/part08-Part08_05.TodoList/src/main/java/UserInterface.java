
import java.util.Scanner;


public class UserInterface {
    private Scanner scan;
    private TodoList toDo;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.scan = scan;
        this.toDo = todoList;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String cmd = scan.nextLine();
            
            if (cmd.equals("stop"))
                break;
            
            if (cmd.equals("add")) 
                this.add();
            else if (cmd.equals("list"))
                this.toDo.print();
            else if (cmd.equals("remove"))
                this.remove();
        }
    }
    
    public void add() {
        System.out.println("To add: ");
        String input = scan.nextLine();
        this.toDo.add(input);
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int num = Integer.valueOf(scan.nextLine());
        this.toDo.remove(num);
    }
}
