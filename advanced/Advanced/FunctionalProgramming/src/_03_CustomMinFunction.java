import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _03_CustomMinFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> getSmallest = array -> {
            int smallest = Integer.MAX_VALUE;
            for (Integer num : array) {
                if (num < smallest) {
                    smallest = num;
                }
            }
            return smallest;
        };

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Integer smallestNumber = getSmallest.apply(numbers);

        System.out.println(smallestNumber);
    }
}
