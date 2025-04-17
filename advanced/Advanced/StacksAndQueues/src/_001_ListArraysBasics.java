import java.util.Arrays;
import java.util.List;

public class _001_ListArraysBasics {
    public static void main(String... args) {

        // populate list with integers
        List<Integer> numbersList = Arrays.asList(1,2,3,4);

        String numbers = "1 2 3 4 5 6";

        int[] arrayOne = {1, 2, 3, 4, 5};

        // populate array with integers from a string
        int[] intArray = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("intArray: " + Arrays.toString(intArray));

        String values = "2 8 30 25 40 72 -2 44 56";

        // populate list with strings from a string
        List<String> items = Arrays.stream(values.split(" "))
                .toList();

        System.out.println("items: " + items);

        // populate list with integers from a string
        List<Integer> intList = Arrays.stream(values.split(" "))
                .map(Integer::parseInt)
                .toList();

        System.out.println("intList: " + intList);

        System.out.println();

        // practice of boolean returned from a method with if statement
        for (int i = 1; i < 11; i++) {
            String result = evenOdd(i) ? "Even" : "Odd";
            System.out.printf("Number %s is %s%n", i, result);
        }

        // practice do and if statement on one line
        System.out.println();
        boolean keepGoing = true;
        int result = 15, meters = 10;

        do {
            meters--;
            if (meters == 8) keepGoing = false;
            result -= 2;

        } while (keepGoing);

        System.out.println(result);

    }

    public static boolean evenOdd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
