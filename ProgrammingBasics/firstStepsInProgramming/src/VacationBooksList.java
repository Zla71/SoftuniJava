import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int book = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = book / pages;
        int result = hours / days;

        System.out.println(result);
    }
}
