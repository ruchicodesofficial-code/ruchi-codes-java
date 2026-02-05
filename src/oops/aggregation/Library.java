package oops.aggregation;

import java.util.List;

public class Library {
    List<Book> Books;

    public Library(List<Book> books) {
        Books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "Books=" + Books +
                '}';
    }
}
