package Library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", 2005);
        Book book2 = new Book("Habbit", 2002, "Zlati", "Gosho");

        Library library = new Library(book1, book2);

        for (Book book : library) {
            System.out.println(book.getTitle() + " " + book.getYear());
        }
    }
}
