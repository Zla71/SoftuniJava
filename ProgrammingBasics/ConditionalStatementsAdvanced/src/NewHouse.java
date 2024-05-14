import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String typeFlowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        
        if (typeFlowers.equals("Roses")) {
            if (flowersCount > 80) {
                price = (flowersCount * 5) * 0.9;
            }
            else {
                price = flowersCount * 5;
            }
        } else if (typeFlowers.equals("Dahlias")) {
            if (flowersCount > 90) {
                price = (flowersCount * 3.8) * 0.85;
            }
            else {
                price = flowersCount * 3.8;
            }
        } else if (typeFlowers.equals("Tulips")) {
            if (flowersCount > 80) {
                price = (flowersCount * 2.8) * 0.85;
            }
            else {
                price = flowersCount * 2.8;
            }
        } else if (typeFlowers.equals("Narcissus")) {
            if (flowersCount < 120) {
                price = (flowersCount * 3) * 1.15;
            }
            else {
                price = flowersCount * 3;
            }
        } else if (typeFlowers.equals("Gladiolus")) {
            if (flowersCount < 80) {
                price = (flowersCount * 2.5) * 1.2;
            }
            else {
                price = flowersCount * 2.5;
            }
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowersCount, typeFlowers, (budget - price));
        }
        else {
            System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
        }
    }
}
