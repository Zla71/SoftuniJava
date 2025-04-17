import java.util.Scanner;

public class _04_MaximalSum3x3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);
        findBiggestSumMatrix(matrix, rows, cols);
    }

    private static void findBiggestSumMatrix(int[][] matrix, int rows, int cols) {
        int biggestSubMatrixSum = 0;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sumOfMatrix = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sumOfMatrix > biggestSubMatrixSum) {
                    biggestSubMatrixSum = sumOfMatrix;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.printf("Sum = %d%n", biggestSubMatrixSum);
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1] + " " + matrix[startRow][startCol + 2]);
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1] + " " + matrix[startRow + 1][startCol + 2]);
        System.out.println(matrix[startRow + 2][startCol] + " " + matrix[startRow + 2][startCol + 1] + " " + matrix[startRow + 2][startCol + 2]);
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
