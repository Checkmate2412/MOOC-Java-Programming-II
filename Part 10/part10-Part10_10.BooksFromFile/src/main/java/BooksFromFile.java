
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file) {
        List<Book> book = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(v -> v.split(","))
                    .map(split -> new Book(split[0], Integer.valueOf(split[1]), 
                            Integer.valueOf(split[2]), split[3]))
                    .forEach(books -> book.add(books));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return book;
    }
}
