import java.util.Arrays;
import java.util.Scanner;

public class ExamplesArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create String array and print it
        String[] myArr = {"Zlati", "Rachev"};
        System.out.println("Printing stuff row 8............................");
        System.out.println(Arrays.toString(myArr));

        // create int array and loop through it, print indexes, change value of indexes
        int[] numbersArr = new int[10];
        System.out.println("Printing stuff row 13............................");
        for (int i = 0; i < numbersArr.length; i++) {
            System.out.printf("The index is %d and the value is %d%n", i, numbersArr[i]);
            numbersArr[i] = i * i;
            System.out.printf("The index is %d and the value after multiplication is %d%n", i, numbersArr[i]);
        }

        // reading arrays from the console
        System.out.println("Write an integer for number of iterations For Loop iterations: ");
        int n = Integer.parseInt(scanner.nextLine());
        int intArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(scanner.nextLine());
        }

        // read arrays from single line of code and print array
        String values = "2 8 30 25 40 72 -2 44 56";
        String[] items = values.split(" ");
        int[] arrItemsNumbers = new int[items.length];
        for (int i = 0; i < arrItemsNumbers.length; i++) {
            arrItemsNumbers[i] = Integer.parseInt(items[i]);
        }
        System.out.println("Printing stuff row 30............................");
        System.out.println(Arrays.toString(arrItemsNumbers));

        // shorter way of reading arrays from single line without a for loop
        int[] secondArrNumbers = Arrays.stream(items)
                .mapToInt(Integer::parseInt)
                .toArray();

        // printing arrays with String.join(…) or For Loop
        String[] strings = { "one", "two" };
        System.out.println("Printing stuff row 45............................");
        System.out.println(String.join(" ", strings));

        for (String string : strings) {
            System.out.printf("%s ", string);
        }

        // print an array with Foreach
        int[] numbers = {1,2,3,4,5};
        System.out.printf("%nPrinting stuff row 54............................\n");
        for (int number : numbers) {
            System.out.println(number + " ");
        }

        // if we have an array of integers to make it a string and BONUS printing a string without beginning and end
        int[] integerArr = {1, 2, 3, 4};
        String integerArrString = Arrays.toString(integerArr);
        System.out.printf("%nPrinting stuff row 61............................\n");
        System.out.printf("String -> %s\n", integerArrString);
        String output = integerArrString.substring(1, integerArrString.length() - 1);
        System.out.printf("string without '[]' -> %s", output);

    }
}