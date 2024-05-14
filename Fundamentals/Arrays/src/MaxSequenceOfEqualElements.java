import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = Integer.MIN_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int leftMaxNumber = Integer.MIN_VALUE;
        int leftMax = Integer.MIN_VALUE;
        int maxSequence = 0;

        for (int i = 0; i < numbersArr.length - 1; i++) {
            int number = numbersArr[i]; // Прочитам всяко едно число

            if (number == numbersArr[i + 1]) { // Проверявам дали е равно на числото след него
                maxSequence++;

                if (maxSequence > max) {
                    max = maxSequence;
                    maxNumber = number;
                }

                if (max < 0) {
                    max = leftMax;
                    leftMaxNumber = number;
                }
            } else {
                maxSequence = 0;
            }
        }

        if (max - leftMax == 0) {
            for (int i = 1; i <= max + 1; i++) {
                System.out.print(leftMaxNumber + " ");
            }
        } else {
            for (int i = 1; i <= max + 1; i++) {
                System.out.print(maxNumber + " ");
            }
        }
    }
}
