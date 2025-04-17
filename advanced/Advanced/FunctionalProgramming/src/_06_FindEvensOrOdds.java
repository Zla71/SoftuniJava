import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1 10

        int[] bounds = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // odd/even
        String condition = scanner.nextLine();

        // create predicate
        Predicate<Integer> predicate;

        if (condition.equals("odd")) {

            predicate = number -> number % 2 != 0;
            printNumbs(bounds, predicate);
        } else {

            predicate = number -> number % 2 == 0;
            printNumbs(bounds, predicate);
        }
    }

    private static void printNumbs(int[] bounds, Predicate<Integer> condition) {
        for (int number = bounds[0]; number <= bounds[1]; number++) {
            if (condition.test(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
