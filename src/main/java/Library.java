import java.util.ArrayList;

public class Library {

    private String name;
    private int bookCapacity;
    private ArrayList<Book> books;

    public Library(String name, int bookCapacity) {
        this.name = name;
        this.bookCapacity = bookCapacity;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int bookCount(){
        return books.size();
    }

    public void addBook(Book book){
        if(books.size() < bookCapacity) {
            books.add(book);
        }
    }
}
