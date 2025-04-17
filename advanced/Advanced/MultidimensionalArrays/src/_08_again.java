import java.util.Arrays;
import java.util.Scanner;

public class _08_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        fillMatrix(matrix, scanner);

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int valueToReplace = matrix[indexes[0]][indexes[1]];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == valueToReplace) {
                    int value = getSum(matrix, row, col, valueToReplace);
                    System.out.print(value + " ");
                } else {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     This is a method which populates the rows and columns with given values of the given matrix
     @param matrix is the current matrix
     @param scanner is a class which can take input from console
     */
    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = currentRow;
        }
    }

    /**
    This is a method which checks if the indexes are in bound
     @param matrix is the current matrix
     @param row is the current row
     @param col is the current col
     @return boolean
     */
    private static boolean isBound(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    /**
     This is a method checks if the condition is correct and calculates the result
     @param matrix is the current matrix
     @param row is the current row
     @param col is the current col
     @param valueToReplace is the value which should be replaced
     @return int
     */
    private static int getSum(int[][] matrix, int row, int col, int valueToReplace) {
        int sum = 0;
        // up
        if (isBound(matrix, row - 1, col) && matrix[row - 1][col] != valueToReplace) {
            sum += matrix[row - 1][col];
        }
        // down
        if (isBound(matrix, row + 1, col) && matrix[row + 1][col] != valueToReplace) {
            sum += matrix[row + 1][col];
        }
        // left
        if (isBound(matrix, row, col - 1) && matrix[row][col - 1] != valueToReplace) {
            sum += matrix[row][col - 1];
        }
        // right
        if (isBound(matrix, row, col + 1) && matrix[row][col + 1] != valueToReplace) {
            sum += matrix[row][col + 1];
        }
        return sum;
    }
}
