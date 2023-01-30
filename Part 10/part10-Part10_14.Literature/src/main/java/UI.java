
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class UI {
    private Scanner scan;
    private ArrayList<Book> books;

    public UI(Scanner scan) {
        this.scan = scan;
        this.books = new ArrayList<>();
    }
    
    public void start() {
        while (true) {            
            System.out.println("Input the name of the book, empty stops: ");
            String title = scan.nextLine();
            
            if (title.isEmpty())
                break;
            
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scan.nextLine());
            this.books.add(new Book(title, age));
        }
        this.print();
    }
    
    private void print() {
        System.out.println("");
        System.out.println(this.books.size() + " books in total." + 
                "\n\nBooks:");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(this.books, comparator);
        this.books.forEach(v -> System.out.println(v));
    }
}
