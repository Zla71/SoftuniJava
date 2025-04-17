import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class _01_ConsumerPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> inputNamesList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Consumer<String> result = name -> System.out.println(name);

        inputNamesList.forEach(result);

    }
}
