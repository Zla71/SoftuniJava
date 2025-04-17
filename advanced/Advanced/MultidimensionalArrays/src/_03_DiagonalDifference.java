import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);
        int primaryDiagonalSum = primaryDiagonal(matrix);
        int secondaryDiagonalSum = secondaryDiagonal(matrix);

        System.out.println(absoluteValue(primaryDiagonalSum, secondaryDiagonalSum));
    }

    private static int secondaryDiagonal(int[][] matrix) {
        int sum = 0;
        int col = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            sum += matrix[row][col];
            col++;
        }

        return sum;
    }

    private static int primaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][row];
        }

        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

    private static int absoluteValue(int numberOne, int numberTwo) {
        int number = numberOne - numberTwo;
        return (number < 0) ? -number : number;
    }
}
