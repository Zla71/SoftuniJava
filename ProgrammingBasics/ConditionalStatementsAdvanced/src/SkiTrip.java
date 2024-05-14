import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String typeSaloon = scanner.nextLine();
        String note = scanner.nextLine();
        double result = 0;

        if (days < 10) {
            if (typeSaloon.equals("room for one person")) {
                result = nights * 18;
            } else if (typeSaloon.equals("apartment")) {
                result = (25 * 0.7) * nights;
            } else if (typeSaloon.equals("president apartment")) {
                result = (35 * 0.9) * nights;
            }
        } else if (days <= 15) {
            if (typeSaloon.equals("room for one person")) {
                result = nights * 18;
            } else if (typeSaloon.equals("apartment")) {
                result = (25 * 0.65) * nights;
            } else if (typeSaloon.equals("president apartment")) {
                result = (35 * 0.85) * nights;
            }
        }
        else {
            if (typeSaloon.equals("room for one person")) {
                result = nights * 18;
            } else if (typeSaloon.equals("apartment")) {
                result = (25 * 0.5) * nights;
            } else if (typeSaloon.equals("president apartment")) {
                result = (35 * 0.8) * nights;
            }
        }
        if (note.equals("positive")) {
            result *= 1.25;
        } else if (note.equals("negative")) {
            result *= 0.9;
        }
        System.out.printf("%.2f", result);
    }
}
