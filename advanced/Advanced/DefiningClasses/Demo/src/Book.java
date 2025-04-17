public class Book {

    // 1. fields:
    private String title;
    private final String author;
    private final double price;

    // 2. constructor: creates new objects
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 3. methods: actions
    public void sell() {
        System.out.printf("Book with title %s with author %s  was sold for %.2f%n", this.getTitle(), this.author, this.price);
    }

    // set private variables
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getTitle() {
        return this.title;
    }

}

