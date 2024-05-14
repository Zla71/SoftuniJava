import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nailon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceMaterials = ((nailon + 2) * 1.5) + ((paint + (paint * 0.1)) * 14.5) + (razreditel * 5) + 0.4;
        double labor = (priceMaterials * 0.3) * hours;
        double finalPrice = priceMaterials + labor;
        System.out.println(finalPrice);
    }
}
