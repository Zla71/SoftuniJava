import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());

        // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double result = deposit + months * ((deposit * (rate / 100)) / 12);

        System.out.println(result);
    }
}
