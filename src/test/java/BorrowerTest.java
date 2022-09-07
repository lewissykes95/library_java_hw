import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;



    @Before
    public void setUp() {
        borrower = new Borrower("David");
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
    }

    @Test
    public void testBookCount() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void testCanAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }


}
