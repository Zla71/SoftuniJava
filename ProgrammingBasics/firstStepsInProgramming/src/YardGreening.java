import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double squares = Double.parseDouble(scanner.nextLine());
        double price = squares * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;

        //  The final price is: {крайна цена на услугата} lv.
        //  The discount is: {отстъпка} lv.

        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);

    }
}
