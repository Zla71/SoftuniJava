import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n * 2; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i < n) {
                leftSum += currentNumber;
            } else {
                rightSum += currentNumber;
            }
        }

// същият резултат, но с 2 цикъла
//        for (int i = 0; i < n; i++) {
//            int currentNumber = Integer.parseInt(scanner.nextLine());
//            leftSum += currentNumber;
//        }
//
//        for (int i = 0; i < n; i++) {
//            int currentNumber = Integer.parseInt(scanner.nextLine());
//            rightSum += currentNumber;
//        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        }
        else {
            int diff = leftSum - rightSum;
            System.out.printf("No, diff = %d", Math.abs(diff));
        }
    }
}
