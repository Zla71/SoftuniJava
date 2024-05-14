import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumEven = 0;
        int sumOdd = 0;
        String[] stringArr = input.split(" ");

        int[] integerArr = Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();
        for (int j : integerArr) {
            if (j % 2 == 0) {
                sumEven += j;
            } else {
                sumOdd += j;
            }
        }

        System.out.printf("%d", sumEven - sumOdd);
    }
}
