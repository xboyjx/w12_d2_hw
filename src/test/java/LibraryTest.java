import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library("Dunfermline Library", 3);
        book1 = new Book("Lord of the rings", "J.R.R Tolkein", "Fantasy");
        book2 = new Book("The Hobbit", "J.R.R Tolkein", "Fantasy");
        book3 = new Book("Ender's Game", "Orson Scott Card", "Sci-Fi");
        book4 = new Book("Star Wars", "George Lucas", "Sci-fi");
    }

    @Test
    public void libraryHasName(){
        assertEquals("Dunfermline Library", library.getName());
    }

    @Test
    public void bookListStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooktoList(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBeyondCapacity(){
        for(int i = 0; i<50; i++){
            library.addBook(book1);
        }
        assertEquals(3, library.bookCount());
    }

}


