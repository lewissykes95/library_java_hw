import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;

    private Book book;
    private Book book1;
    private Book book2;

    private Borrower borrower;

    @Before
    public void setUp() {
        library = new Library(10);
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book1 = new Book("Lord of the Rings", "JRR Tolken", "Fantasy" );
        book2 = new Book("Game of Thrones", "George RR Martin", "Fantasy");
        borrower = new Borrower("David");
    }

    @Test
    public void amountOfBooks() {
        assertEquals(0, library.bookAmount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.bookAmount());
    }

    @Test
    public void checkCapacityToAddBook() {
        library.addBook(book);
        library.addBook(book1);
        assertTrue(library.stockUp(book));
    }

    @Test
    public void checkBookAvailable() {
        assertFalse(library.checkInStock(book));
    }

    @Test
    public void checkBookAvailable_true() {
        library.addBook(book);
        assertTrue(library.checkInStock(book));
    }

    @Test
    public void canLendBook() {
        library.addBook(book);

        library.loanBook(book, borrower);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookAmount());
        assertFalse(library.checkInStock(book));


    }
}
