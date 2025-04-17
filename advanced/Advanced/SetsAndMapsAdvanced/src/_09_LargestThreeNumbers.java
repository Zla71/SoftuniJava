import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _09_LargestThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .toList();


        if (sorted.size() < 3) {
            sorted.forEach(number -> System.out.printf("%d ", number));
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d ", sorted.get(i));
            }
        }
    }
}
