import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        System.out.printf("Max number: %d%nMin number: %d", maxNumber, minNumber);
    }
}
