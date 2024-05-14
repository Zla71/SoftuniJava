import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lilyAge = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int sumMoney = 0;
        int numberOfToys = 0;
        int currentAmount = 0;

        for (int i = 1; i <= lilyAge ; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    sumMoney += 10;
                    currentAmount += 10;
                } else {
                    sumMoney += currentAmount + 10;
                    currentAmount += 10;
                }

            } else {
                numberOfToys += 1;
            }
        }
        int brotherMoney = lilyAge / 2;
        int resultMoney = ((numberOfToys * toyPrice) + sumMoney) - brotherMoney;

        if (resultMoney >= washingMachinePrice) {
            double diff = resultMoney - washingMachinePrice;
            System.out.printf("Yes! %.2f", diff);
        }
         else {
            double diff = washingMachinePrice - resultMoney;
            System.out.printf("No! %.2f", diff);
        }

    }
}
