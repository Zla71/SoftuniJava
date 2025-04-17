import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07_FindTheSmallestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestNumberFunc = list -> {
            int smallestNum = Integer.MAX_VALUE;
            int indexSmallestNum = 0;

            for (int i = 0; i < list.size(); i++) {
                int currentNum = list.get(i);
                if (smallestNum > currentNum) {
                    smallestNum = currentNum;
                    indexSmallestNum = i;
                } else if (currentNum == smallestNum) {
                    indexSmallestNum = i;
                }
            }
            return indexSmallestNum;
        };

        int result = findSmallestNumberFunc.apply(inputList);
        System.out.println(result);
    }
}