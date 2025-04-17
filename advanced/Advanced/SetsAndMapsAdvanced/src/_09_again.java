import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _09_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList());

        numbers.sort(Comparator.reverseOrder());

        if (numbers.size() < 3) {
            numbers.forEach(number -> System.out.printf("%d ", number));
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d ", numbers.get(i));
            }
        }
    }
}
