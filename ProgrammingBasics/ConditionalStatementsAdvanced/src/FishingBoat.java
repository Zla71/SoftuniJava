import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                if (fishmen <= 6) {
                    price *= 0.9;
                } else if (fishmen <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }
                if (fishmen % 2 == 0) {
                    price *= 0.95;
                }
                break;

            case "Summer":
                price = 4200;
                if (fishmen <= 6) {
                    price *= 0.9;
                } else if (fishmen <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }

                if (fishmen % 2 == 0) {
                    price *= 0.95;
                }
                break;

            case "Autumn":
                price = 4200;
                if (fishmen <= 6) {
                    price *= 0.9;
                } else if (fishmen <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }
                break;

            case "Winter":
                price = 2600;
                if (fishmen <= 6) {
                    price *= 0.9;
                } else if (fishmen <= 11) {
                    price *= 0.85;
                } else {
                    price *= 0.75;
                }
                if (fishmen % 2 == 0) {
                    price *= 0.95;
                }
                break;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - price));
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
        }

    }
}
