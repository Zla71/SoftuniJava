import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        int[] firstIntegerArr = Arrays.stream(firstArr).mapToInt(Integer::parseInt).toArray();
        int[] secondIntegerArr = Arrays.stream(secondArr).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int index = -1;
        boolean identical = false;

        for (int i = 0; i < firstIntegerArr.length; i++) {
            if (firstIntegerArr[i] == secondIntegerArr[i]) {
                sum += firstIntegerArr[i];
                identical = true;
            } else {
                index = i;
                identical = false;
                break;
            }
        }

        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
