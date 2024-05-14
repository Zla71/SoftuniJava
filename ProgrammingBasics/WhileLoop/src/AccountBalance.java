import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double total = 0;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("NoMoreMoney")) {
                break;
            }

            double currentSum = Double.parseDouble(command);

            if (currentSum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", currentSum);
            total += currentSum;
        }
        System.out.printf("Total: %.2f", total);
    }
}
