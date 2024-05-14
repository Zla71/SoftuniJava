import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String article = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (city.equals("Sofia")) {
            if (article.equals("coffee")) {
                price = quantity * 0.5;
            }
            else if (article.equals("water")) {
                price = quantity * 0.8;
            }
            else if (article.equals("beer")) {
                price = quantity * 1.2;
            }
            else if (article.equals("sweets")) {
                price = quantity * 1.45;
            }
            else if (article.equals("peanuts")) {
                price = quantity * 1.6;
            }
        }

        else if (city.equals("Plovdiv")) {
            if (article.equals("coffee")) {
                price = quantity * 0.4;
            }
            else if (article.equals("water")) {
                price = quantity * 0.7;
            }
            else if (article.equals("beer")) {
                price = quantity * 1.15;
            }
            else if (article.equals("sweets")) {
                price = quantity * 1.3;
            }
            else if (article.equals("peanuts")) {
                price = quantity * 1.5;
            }
        }

        else if (city.equals("Varna")) {
            if (article.equals("coffee")) {
                price = quantity * 0.45;
            }
            else if (article.equals("water")) {
                price = quantity * 0.7;
            }
            else if (article.equals("beer")) {
                price = quantity * 1.1;
            }
            else if (article.equals("sweets")) {
                price = quantity * 1.35;
            }
            else if (article.equals("peanuts")) {
                price = quantity * 1.55;
            }
        }
        System.out.println(price);
    }
}
