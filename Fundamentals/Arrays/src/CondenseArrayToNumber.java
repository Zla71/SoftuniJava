import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (numbersArr.length > 1) {
            int[] condensedArray = new int[numbersArr.length - 1];
            for (int i = 0; i < condensedArray.length; i++) {
                condensedArray[i] = numbersArr[i] + numbersArr[i + 1];
            }
            numbersArr = condensedArray;
        }

        System.out.println(numbersArr[0]);
    }
}
