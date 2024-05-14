import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMeals = Integer.parseInt(scanner.nextLine());
        int fishMeals = Integer.parseInt(scanner.nextLine());
        int vegiMeals = Integer.parseInt(scanner.nextLine());
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        double price = (chickenMeals * 10.35) + (fishMeals * 12.4) + (vegiMeals * 8.15);
        double desertPrice = price * 0.2;
        double finalPrice = price + desertPrice + 2.5;

        System.out.println(finalPrice);

    }
}
