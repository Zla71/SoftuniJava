import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        boolean check = true;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") || day.equals("Friday")) {
            if (product.equals("banana")) {
                price = quantity * 2.5;
            }
            else if (product.equals("apple")) {
                price = quantity * 1.2;
            }
            else if (product.equals("orange")) {
                price = quantity * 0.85;
            }
            else if (product.equals("grapefruit")) {
                price = quantity * 1.45;
            }
            else if (product.equals("kiwi")) {
                price = quantity * 2.7;
            }
            else if (product.equals("pineapple")) {
                price = quantity * 5.5;
            }
            else if (product.equals("grapes")) {
                price = quantity * 3.85;
            }
            else {
                System.out.println("error");
                check = false;
            }
        }

        else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (product.equals("banana")) {
                price = quantity * 2.7;
            }
            else if (product.equals("apple")) {
                price = quantity * 1.25;
            }
            else if (product.equals("orange")) {
                price = quantity * 0.90;
            }
            else if (product.equals("grapefruit")) {
                price = quantity * 1.60;
            }
            else if (product.equals("kiwi")) {
                price = quantity * 3;
            }
            else if (product.equals("pineapple")) {
                price = quantity * 5.6;
            }
            else if (product.equals("grapes")) {
                price = quantity * 4.2;
            }
            else {
                System.out.println("error");
                check = false;
            }
        }
        else {
            System.out.println("error");
            check = false;
        }
        if (check) {
            System.out.printf("%.2f", price);
        }

    }
}
