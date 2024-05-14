import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = scanner.nextInt();
        int dolls = scanner.nextInt();
        int teddyBears = scanner.nextInt();
        int minions = scanner.nextInt();
        int trucks = scanner.nextInt();

        double finalPrice = puzzles * 2.6 + dolls * 3 + teddyBears * 4.10 + minions * 8.2 + trucks * 2;
        int toysCount = puzzles + dolls + teddyBears + minions + trucks;

        if (toysCount >= 50) {
            finalPrice *= 0.75;
        }
        finalPrice *= 0.9;

        if (finalPrice >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", (finalPrice - excursionPrice));
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", (excursionPrice - finalPrice));
        }
    }
}
