import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;

    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
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
    public void loanBook(Book book, Borrower borrower) {
        if(this.books.contains(book)){
            this.books.remove(book);
            borrower.addBook(book);
        }
    }

    public boolean checkInStock(Book book) {
        if(this.books.contains(book)){
            return true;
        }else {
            return false;
        }
    }
}
