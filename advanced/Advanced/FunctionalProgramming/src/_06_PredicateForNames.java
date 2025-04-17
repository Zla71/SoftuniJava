import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _06_PredicateForNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = List.of(scanner.nextLine().split("\\s+"));

        Predicate<String> checkName = name -> name.length() <= n;

        List<String> filteredNames = names.stream()
                .filter(checkName)
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);

    }
}
