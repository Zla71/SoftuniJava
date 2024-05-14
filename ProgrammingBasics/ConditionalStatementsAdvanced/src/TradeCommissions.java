import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean check = true;

        if (city.equals("Sofia")) {
            if (amount >= 0 && amount <= 500) {
                commission = amount * 0.05;
            }
            else if (amount > 500 && amount <= 1000) {
                commission = amount * 0.07;
            }
            else if (amount > 1000 && amount <= 10000) {
                commission = amount * 0.08;
            }
            else if (amount < 0 ) {
                System.out.println("error");
                check = false;
            }
            else {
                commission = amount * 0.12;
            }
        }

        else if (city.equals("Varna")) {
            if (amount >= 0 && amount <= 500) {
                commission = amount * 0.045;
            }
            else if (amount > 500 && amount <= 1000) {
                commission = amount * 0.075;
            }
            else if (amount > 1000 && amount <= 10000) {
                commission = amount * 0.1;
            }
            else if (amount < 0 ) {
                System.out.println("error");
                check = false;
            }
            else {
                commission = amount * 0.13;
            }
        }

        else if (city.equals("Plovdiv")) {
            if (amount >= 0 && amount <= 500) {
                commission = amount * 0.055;
            }
            else if (amount > 500 && amount <= 1000) {
                commission = amount * 0.08;
            }
            else if (amount > 1000 && amount <= 10000) {
                commission = amount * 0.12;
            }
            else if (amount < 0 ) {
                System.out.println("error");
                check = false;
            }
            else {
                commission = amount * 0.145;
            }
        }
        else {
            System.out.println("error");
            check = false;
        }
        if (check) {
            System.out.printf("%.2f", commission);
        }

    }
}
