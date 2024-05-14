import java.util.Scanner;

public class BasketbalEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = Integer.parseInt(scanner.nextLine());

        double shoes = price * 0.6;
        double clothes = shoes * 0.8;
        double ball = clothes * 0.25;
        double accessories = ball * 0.2;

        double finalPrice = shoes + clothes + ball + accessories + price;
        System.out.println(finalPrice);
    }
}
