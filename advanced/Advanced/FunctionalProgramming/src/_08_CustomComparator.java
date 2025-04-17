import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_CustomComparator {
    public static void main(String[] args) {

        // comparator: Ламбда израз, който приема 2 аргумента и връща цяло число (-1, 0, 1)
        // sorted(-1) = няма да има размяна
        // sorted(0) = няма да има размяна
        // sorted(1) = ще размени елементите

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> specialSort = (first, second) -> {

            // първото нечетно, а второто четно -> разменям числата

            if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }

            // първото е четно, а второто нечетно -> не разменям числата
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            }

            // първото е четно и второто четно
            // първото е нечетно и второто нечетно

            // default comparator implementation за числа работи като подрежда числата в нарастващ ред
            // първото > второто = 1 --> разменя
            // първото < второто = -1 --> не ги разменя
            // първото = второто = 0 --> не ги разменя
            return first.compareTo(second);
        };

        numbers.stream()
                .sorted(specialSort)
                .forEach(number -> System.out.print(number + " "));
    }
}
