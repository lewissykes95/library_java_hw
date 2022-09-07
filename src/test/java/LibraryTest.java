import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

   Library library;

   Book book;
   Book book1;
   Book book2;


    @Before
    public void setUp() {
        library = new Library(10);
        book = new Book();
        book1 = new Book();
        book2 = new Book();
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
}
