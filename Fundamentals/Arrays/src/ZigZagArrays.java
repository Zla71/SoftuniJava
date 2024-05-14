import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
            String[] currentArr = scanner.nextLine().split(" ");
            String firstElement = currentArr[0];
            String secondElement = currentArr[1];

            if ((i + 1) % 2 == 0) {
                secondArr[i] = firstElement;
                firstArr[i] = secondElement;

            } else {
                secondArr[i] = secondElement;
                firstArr[i] = firstElement;
            }
        }

        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
