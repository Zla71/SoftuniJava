import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class _02_SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();

        // отпечатай брой на числата в списъка
        int numbersCount = numbers.size();

        // сумата на 1числата в списъка
        Function<List<Integer>, Integer> sumNumbers = numbersList -> {
            int sum = 0;
            for (Integer number : numbersList) {
                sum += number;
            }
            return sum;
        };

        int sum = sumNumbers.apply(numbers);
        System.out.println("Count = " + numbersCount);
        System.out.println("Sum = " + sum);
    }
}
