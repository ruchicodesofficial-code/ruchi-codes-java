package oops.aggregation;

public class Book {
    String title;
    Book(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
