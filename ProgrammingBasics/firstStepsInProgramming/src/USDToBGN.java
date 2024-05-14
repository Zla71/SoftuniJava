import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        // 1 USD = 1.79549 BGN.

        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());

        double result = usd * 1.79549;

        System.out.println(result);
    }
}
