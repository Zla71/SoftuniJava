import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07_FindTheSmallestElementAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestNumberFunc = listOfNumbers -> Collections.min(listOfNumbers);

        Integer minValue = findSmallestNumberFunc.apply(inputList);

        System.out.println(inputList.lastIndexOf(minValue)); // връща последната поява за този елемент
    }
}