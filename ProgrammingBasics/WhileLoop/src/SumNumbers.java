import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int initialNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (true) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

            if (sum >= initialNumber) {
                break;
            }
        }
        System.out.println(sum);
    }
}
