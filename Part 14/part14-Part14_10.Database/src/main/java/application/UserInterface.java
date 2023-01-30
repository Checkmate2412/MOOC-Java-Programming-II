package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            
            if (command.equals("1")) {
                this.list();
            } else if (command.equals("2")) {
                this.add();
            } else if (command.equals("3")) {
                this.done();
            } else if (command.equals("4")) {
                this.remove();
            } 
        }

        System.out.println("Thank you!");
    }
    
    public void list() throws SQLException {
        System.out.println("Listing the database contents");
        database.list().stream().forEach((v) -> System.out.println(v));
        
    }

    public void add() throws SQLException {
        System.out.println("Adding a new todo");
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter description");
        String description = scanner.nextLine();
        this.database.add(new Todo(name, description, false));
    }
    
    public void done() throws SQLException {
        System.out.println("Which to do should be marked as done (give the id)?");
        int id = Integer.valueOf(scanner.nextLine());
        this.database.markAsDone(id);
    }
    
    public void remove() throws SQLException {
        System.out.println("Which todo should be removed (give the id)?");
        int id = Integer.valueOf(scanner.nextLine());
        this.database.remove(id);
    }
}
