import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May") || month.equals("October")) {

            priceStudio = nights * 50;
            priceApartment = nights * 65;

             if (nights > 7 && nights <= 14) {
                priceStudio = (nights * 50) * 0.95;
            }
            if (nights > 14) {
                priceStudio = (nights * 50) * 0.7;
                priceApartment = (nights * 65) * 0.9;
            }
        }
        if (month.equals("June") || month.equals("September")) {

            priceStudio = nights * 75.2;
            priceApartment = nights * 68.7;

            if (nights > 14) {
                priceStudio = (nights * 75.2) * 0.8;
                priceApartment = (nights * 68.7) * 0.9;
            }
        }
        if (month.equals("July") || month.equals("August")) {

            priceStudio = nights * 76;
            priceApartment = nights * 77;

            if (nights > 14) {
                priceApartment = (nights * 77) * 0.9;
            }

        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceApartment, priceStudio);

    }
}
