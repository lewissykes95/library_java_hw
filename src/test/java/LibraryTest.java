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
        library = new Library();
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
        assertEquals(1, library.bookAmount());
    }

    @Test
    public void checkCapacityToAddBook() {
        assertTrue(library.stockUp(book));
    }
}
