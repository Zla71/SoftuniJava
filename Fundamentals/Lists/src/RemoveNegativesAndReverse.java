import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        boolean isEmpty = false;

        for (Integer number : numbers) {
            if (number >= 0) {
                result.add(number);
            }
        }
        if (result.isEmpty()) {
            isEmpty = true;
        }

        if (isEmpty) {
            System.out.println("empty");
        } else {
            Collections.reverse(result);
            System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
