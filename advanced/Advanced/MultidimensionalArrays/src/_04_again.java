import java.util.Arrays;
import java.util.Scanner;

public class _04_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);

        // print results
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(findSumOfMatrix(matrix));
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = currentRow;
        }
    }

    private static int findSumOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int number : row) {
                sum += number;
            }
        }
        return sum;
    }
}
