import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ourBook = scanner.nextLine();
        int countBooks = 0;


        while (true) {
            String book = scanner.nextLine();

            if (book.equals("No More Books")) {
                System.out.printf("The book you search is not here!%nYou checked %d books.", countBooks);
                break;
            }

            if (ourBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", countBooks);
                break;
            }

            countBooks += 1;


        }
    }
}
