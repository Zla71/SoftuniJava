import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_DeliveryBoy {
    public static void main(String[] args) {

        // ПРАВОЪГЪЛНА МАТРИЦА!!!! n = 6, m = 7

        Scanner scanner = new Scanner(System.in);

        List<Integer> sizeElements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        int n = sizeElements.get(0);
        int m = sizeElements.get(1);

        char[][] matrix = fillMatrix(n, m, scanner);

        // [row, col] - 'B'
        int[] initialDeliveryBoyPosition = getDeliveryBoyPosition(matrix);
        int boyRow = initialDeliveryBoyPosition[0];
        int boyCol = initialDeliveryBoyPosition[1];

        boolean obstacle = false;

        while (true) {

            String direction = scanner.nextLine();

            int newRow = boyRow;
            int newCol = boyCol;

            switch (direction) {
                case "up":
                    newRow--;
                    break;
                case "down":
                    newRow++;
                    break;
                case "right":
                    newCol++;
                    break;
                case "left":
                    newCol--;
                    break;
            }

            // Проверявам дали индекса за ред и колона са невалидни
            if (isInvalidIndex(newRow, n) || isInvalidIndex(newCol, m)) {

                System.out.println("The delivery is late. Order is canceled.");

                int initialRow = initialDeliveryBoyPosition[0];
                int initialCol = initialDeliveryBoyPosition[1];
                matrix[initialRow][initialCol] = ' ';
                printMatrix(matrix);
                break;
            }

            char newPosition = matrix[newRow][newCol];

            if (newPosition == '-' || newPosition == '.') {
                matrix[newRow][newCol] = '.';
            } else if (newPosition == 'P') {
                matrix[newRow][newCol] = 'R';
                System.out.println("Pizza is collected. 10 minutes for delivery.");
            } else if (newPosition == '*') {
                obstacle = true;
            } else if (newPosition == 'A') {
                System.out.println("Pizza is delivered on time! Next order...");
                matrix[newRow][newCol] = 'P';
                printMatrix(matrix);
                break;
            }

            if (!obstacle) {
                boyRow = newRow;
                boyCol = newCol;
            }

            obstacle = false;
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

    private static char[][] fillMatrix(int n, int m, Scanner scanner) {
        char[][] matrix = new char[n][];
        for (int row = 0; row < n; row++) {
            char[] input = scanner.nextLine().toCharArray();
            matrix[row] = input;

            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == 'B') {
                }
            }
        }
        return matrix;
    }

    private static int[] getDeliveryBoyPosition(char[][] matrix) {

        int[] position = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'B') {
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }


}
