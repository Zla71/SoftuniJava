import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationSecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define the array and the number of rotations
        String[] stringArray = scanner.nextLine().split(" ");
        int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());;

        // Perform rotations
        rotateArray(intArray, rotations);

        // Print the resulting array
        printArray(intArray);
    }

    // Method to perform rotations on the array
    public static void rotateArray(int[] arr, int rotations) {
        int n = arr.length;
        // Perform rotations
        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
