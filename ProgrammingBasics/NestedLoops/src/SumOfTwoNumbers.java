import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                counter++;
                int sum = i + j;

                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, i + j);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
