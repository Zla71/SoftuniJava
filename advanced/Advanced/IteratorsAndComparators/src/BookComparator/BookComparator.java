package BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {

        // 1. book title.
        // 2. year of publishing a book.

        int result = book1.getTitle().compareTo(book2.getTitle());
        if (result == 0) {

            result = Integer.compare(book1.getYear(), book2.getYear());
        }

        return result;
    }
}
