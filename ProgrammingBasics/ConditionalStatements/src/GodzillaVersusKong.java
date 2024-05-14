import java.util.Scanner;

public class GodzillaVersusKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothesPerson = Double.parseDouble(scanner.nextLine());
        double decorMovie = budget * 0.1;
        double totalClothesPrice = statists * priceClothesPerson;

        if (statists > 150) {
            totalClothesPrice *= 0.9;
        }

        double totalSumMovie = decorMovie + totalClothesPrice;

        if (budget >= totalSumMovie) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", (budget - totalSumMovie));
        }
        else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", (totalSumMovie - budget));
        }
    }
}
