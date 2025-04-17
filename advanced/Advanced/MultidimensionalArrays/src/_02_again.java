import java.util.Scanner;

public class _02_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);

        int numberCheck = scanner.nextInt();

        checkNumberPosition(matrix, numberCheck);

    }

    public static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

    public static void checkNumberPosition(int[][] matrix, int number) {
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
