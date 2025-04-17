import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.Collectors;

public class _05_ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(numbersList);

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isNotDivisibleByN = number -> number % n != 0;
        Consumer<Integer> print = number -> System.out.print(number + " ");

        numbersList.stream()
                .filter(isNotDivisibleByN)
                .forEach(print);
    }
}
