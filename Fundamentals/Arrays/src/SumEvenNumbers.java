import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringsArr = input.split(" ");
        int[] integersArr = Arrays.stream(stringsArr)
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;

        for (int j : integersArr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }

        System.out.println(sum);
    }
}
