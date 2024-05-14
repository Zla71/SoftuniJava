import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double finalSum = (videoCards * 250) +
                (((videoCards * 250) * 0.35) * processors) +
                (((videoCards * 250) * 0.1) * ramMemory);

        if (videoCards > processors) {
            finalSum *= 0.85;
        }

        if (budget >= finalSum) {
            System.out.printf("You have %.2f leva left!", (budget - finalSum));
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", (finalSum - budget));
        }

    }
}
