import java.util.Arrays;
import java.util.Scanner;

public class _02_PositionsOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(); // полезно е да се използва, когато имаме входни данни 1 2 3 4 -- без запетаи
        int cols = scanner.nextInt();

        // 1. създавам матрица
        int[][] matrix = new int[rows][cols];

        // 2. пълня матрицата
        fillMatrix(matrix, scanner);

        int number = scanner.nextInt();
        boolean isNumberFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    isNumberFound = true;
                }
            }
        }
        if (!isNumberFound) {
            System.out.println("not found");
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
