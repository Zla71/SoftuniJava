import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class _03_CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Function<String, Boolean> startWithUpperFunction = word -> Character.isUpperCase(word.charAt(0));
        Predicate<String> startWithUpperCase = word -> Character.isUpperCase(word.charAt(0));

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startWithUpperCase)
                .toList();

        System.out.println(words.size());
        words.forEach(word -> System.out.println(word));

    }
}
