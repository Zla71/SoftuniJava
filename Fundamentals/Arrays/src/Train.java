import java.util.Scanner;
import java.util.stream.IntStream;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] myArr = new int[n];

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            myArr[i] = currentNumber;
        }

        for (int j : myArr) {
            System.out.printf("%d ", j);
        }

        int sum = IntStream.of(myArr).sum();
        System.out.printf("%n%d", sum);
    }
}
