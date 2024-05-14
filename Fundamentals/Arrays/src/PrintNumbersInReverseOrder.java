import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] myArr = new int[n];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = Integer.parseInt(scanner.nextLine());

        }

        for (int i = myArr.length - 1; i >= 0; i--) {

            System.out.printf("%d ", myArr[i]);

        }
    }
}
