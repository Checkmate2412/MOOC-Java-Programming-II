
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TodoList todoList = new TodoList();
        UserInterface ui = new UserInterface(todoList, scan);
        ui.start();
    }
}
