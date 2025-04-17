import java.util.Arrays;
import java.util.Scanner;

public class _05_MatrixShuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, scanner);

        while (true) {
            String[] commandArr = scanner.nextLine().split("\\s+");
            String currentCommand = commandArr[0];

            if (currentCommand.equals("END")) {
                break;
            }

            if (!currentCommand.equals("swap") || commandArr.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }
            int firstRow = Integer.parseInt(commandArr[1]);
            int firstCol = Integer.parseInt(commandArr[2]);
            int secondRow = Integer.parseInt(commandArr[3]);
            int secondCol = Integer.parseInt(commandArr[4]);

            if (firstRow < 0 || firstRow >= matrix.length
                    || firstCol < 0 || firstCol >= matrix[0].length
                    || secondRow < 0 || secondRow >= matrix.length
                    || secondCol < 0 || secondCol >= matrix[0].length) {
                System.out.println("Invalid input!");
                continue;
            }

            String firstElement = matrix[firstRow][firstCol];
            String secondElement = matrix[secondRow][secondCol];

            matrix[firstRow][firstCol] = secondElement;
            matrix[secondRow][secondCol] = firstElement;

            printMatrix(matrix);
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] currentRow = scanner.nextLine().split("\\s+");
            matrix[row] = currentRow;
        }
    }
}

