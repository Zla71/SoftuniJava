import java.util.Scanner;

public class SkiTripError {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String typeSaloon = scanner.nextLine();
        String note = scanner.nextLine();
        double result = 0;

        if (typeSaloon.equals("room for one person")) {
            result = nights * 18;
            if (note.equals("positive")) {
                result *= 1.25;
            } else if (note.equals("negative")) {
                result *= 0.9;
            }
        } else if (typeSaloon.equals("apartment")) {
            result = nights * 25;
            if (nights < 10) {
                result *= 0.7;
            } else if (nights <= 15) {
                result *= 0.65;
            }
            else {
                result *= 0.5;
            }
            if (note.equals("positive")) {
                result *= 1.25;
            } else if (note.equals("negative")) {
                result *= 0.9;
            }
        } else if (typeSaloon.equals("president apartment")) {
            result = nights * 35;
            if (nights < 10) {
                result *= 0.9;
            } else if (nights <= 15) {
                result *= 0.85;
            }
            else {
                result *= 0.7;
            }
            if (note.equals("positive")) {
                result *= 1.25;
            } else if (note.equals("negative")) {
                double resultNegativeNote = nights * 35;
                resultNegativeNote *= 0.9;
                double negativeValue = (result - resultNegativeNote) / 10;

                result += (Math.abs(negativeValue));

            }
        }
        System.out.printf("%.2f", result);
    }
}
