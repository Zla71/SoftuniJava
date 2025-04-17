import java.util.*;
import java.util.stream.Collectors;

public class _08_CustomComparatorAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // List of integer values
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // Custom comparator
        Comparator<Integer> evenOddComparator = (a, b) -> {
            // If both numbers are even or both are odd, sort normally
            if ((a % 2 == 0) && (b % 2 == 0) || (a % 2 != 0) && (b % 2 != 0)) {
                return a - b;
            }
            // Otherwise, sort even numbers before odd numbers
            return (a % 2 == 0) ? -1 : 1;
        };

        // Sorting using Arrays.sort()
        numbers.sort(evenOddComparator);

        // Print the sorted list as space-separated numbers
        String result = numbers.stream()
                .map(String::valueOf) // Convert each number to a String
                .collect(Collectors.joining(" ")); // Join with space

        // Print the sorted array
        System.out.println(result);
    }
}