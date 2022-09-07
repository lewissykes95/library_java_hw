import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;

    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int bookAmount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean stockUp(Book book) {
        if(this.books.size() <= this.capacity) {
            this.books.add(book);
            return true;
        } else {
            return false;
        }
    }
}
