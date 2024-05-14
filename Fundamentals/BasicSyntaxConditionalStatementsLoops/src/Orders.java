import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;

        for (int i = 1; i <= n; i++) {
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            double result = (days * capsules) * priceCapsule;
            finalPrice += result;

            System.out.printf("The price for the coffee is: $%.2f%n", result);
        }

        System.out.printf("Total: $%.2f", finalPrice);
    }
}
