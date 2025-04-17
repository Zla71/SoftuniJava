import java.util.Scanner;

public class _06_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        fillMatrix(matrix, scanner);

        findFirstDiagonal(matrix);
        System.out.println();
        findSecondDiagonal(matrix);
    }

    private static void findSecondDiagonal(int[][] matrix) {
        int col = 0;
        for (int row = matrix.length -1; row >= 0; row--) {
            System.out.print(matrix[row][col] + " ");
            col++;
        }
    }

    private static void findFirstDiagonal(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][row] + " ");
        }
    }

    public static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
