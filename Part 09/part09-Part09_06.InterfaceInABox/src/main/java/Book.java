
import java.util.Objects;


public class Book implements Packable{
    private String author, book;
    private double weight;

    public Book(String author, String book, double weight) {
        this.author = author;
        this.book = book;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.book;
    }  
}
