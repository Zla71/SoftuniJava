package DemoComparator;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    // 0 или повече автора
    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>();
        for (String author : authors) {
            this.authors.add(author);
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }
}
