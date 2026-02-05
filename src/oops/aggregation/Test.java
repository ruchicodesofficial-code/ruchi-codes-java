package oops.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("Meluha");
        Book b2 = new Book("Harry potter");

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);

        Library lib = new Library(bookList);
        System.out.println(lib.toString());
    }

}
