import java.util.Scanner;

public class _03_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char [][] matrixA = new char[rows][cols];
        char [][] matrixB = new char[rows][cols];

        fillMatrix(matrixA, scanner);
        fillMatrix(matrixB, scanner);

        intersectionMatrices(matrixA, matrixB);

    }

    private static void intersectionMatrices(char[][] matrixA, char[][] matrixB) {
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                if (matrixA[row][col] == matrixB[row][col]) {
                    System.out.print(matrixA[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void fillMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String currentRow = scanner.nextLine().replace(" ", "");
            char[] rowArr = currentRow.toCharArray();
            matrix[row] = rowArr;
        }
    }
}
