import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double vacation = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendingDays = 0;

        while (true) {

            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (command.equals("save")) {
                budget += money;
                spendingDays = 0;
            } else if (command.equals("spend")) {
                budget -= money;
                spendingDays++;
                if (budget < 0) {
                    budget = 0;
                }
            }

            days++;

            if (spendingDays == 5) {
                System.out.printf("You can't save the money.%n%d", days);
                break;
            }

            if (budget >= vacation) {
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
        }
    }
}
