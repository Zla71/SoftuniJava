import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double initialSum = 0;

        while (!command.equals("Start")) {
            double number = Double.parseDouble(command);
            if (number == 0.1 || number == 0.2 || number == 0.5 || number == 1 || number == 2) {
                initialSum += number;
            } else {
                System.out.printf("Cannot accept %.2f%n", number);
            }
            command = scanner.nextLine();
        }

        while (true) {
            String secondCommand = scanner.nextLine();

            if (secondCommand.equals("End")) {
                break;
            }

            switch (secondCommand) {
                case "Nuts":
                    if (initialSum >= 2) {
                        initialSum -= 2;
                        System.out.printf("Purchased %s%n", secondCommand);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (initialSum >= 0.7) {
                        initialSum -= 0.7;
                        System.out.printf("Purchased %s%n", secondCommand);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (initialSum >= 1.5) {
                        initialSum -= 1.5;
                        System.out.printf("Purchased %s%n", secondCommand);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (initialSum >= 0.8) {
                        initialSum -= 0.8;
                        System.out.printf("Purchased %s%n", secondCommand);
                    } else {
                        System.out.println("Sorry, not enough money%n");
                    }
                    break;
                case "Coke":
                    if (initialSum >= 1) {
                        initialSum -= 1;
                        System.out.printf("Purchased %s%n", secondCommand);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", initialSum);
    }
}
