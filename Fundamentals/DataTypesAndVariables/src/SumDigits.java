import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int len = input.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            char symbol = input.charAt(i);
            int currentSymbol = Integer.parseInt(String.valueOf(symbol));
            sum += currentSymbol;

        }
        System.out.println(sum);
    }
}
