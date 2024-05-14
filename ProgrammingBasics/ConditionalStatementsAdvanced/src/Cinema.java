import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (type.equals("Premiere")) {
            price = 12 * rows * columns;
        }
        else if (type.equals("Normal")) {
            price = 7.5 * rows * columns;
        }
        else if (type.equals("Discount")) {
            price = 5 * rows * columns;
        }

        System.out.printf("%.2f leva", price);
    }
}
