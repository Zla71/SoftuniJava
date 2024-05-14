import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int bigPens = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double price = pens * 5.8 + bigPens * 7.2 + water * 1.2;

        double priceWithDiscount = price - (price * ((double) discount / 100));
        System.out.println(priceWithDiscount);

    }
}
