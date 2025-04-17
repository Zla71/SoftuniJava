import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class _02_KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.asList(scanner.nextLine().split("\\s+"));

        Consumer<String> addSir = name -> System.out.printf("Sir %s%n", name);

        names.forEach(addSir);
    }
}
