import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_BlindMansBuff {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> sizeElements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        int n = sizeElements.get(0);
        int m = sizeElements.get(1);

        char[][] matrix = fillMatrix(n, m, scanner);

        // [row, col] - 'B'
        int[] playerPosition = getPlayerPosition(matrix);
        int playerRow = playerPosition[0];
        int playerCol = playerPosition[1];

        int coughOpponents = 0;
        int moves = 0;
        boolean obstacle = false;

        while (coughOpponents < 3) {

            String direction = scanner.nextLine(); // up, down, right, left, Finish

            if (direction.equals("Finish")) {
                break;
            }

            int newRow = playerRow;
            int newCol = playerCol;

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
                continue;
            }

            char newPosition = matrix[newRow][newCol];

            if (newPosition == 'O') {
                obstacle = true;
            } else if (newPosition == '-') {
                matrix[playerRow][playerCol] = '-';
                matrix[newRow][newCol] = 'B';

            } else if (newPosition == 'P') {
                coughOpponents++;
                matrix[playerRow][playerCol] = '-';
                matrix[newRow][newCol] = 'B';
            }

            if (!obstacle) {
                moves++;
                matrix[playerRow][playerCol] = '-';
                matrix[newRow][newCol] = 'B';
                playerRow = newRow;
                playerCol = newCol;
            }

            obstacle = false;
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d", coughOpponents, moves);
    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

    private static int[] getPlayerPosition(char[][] matrix) {

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

    private static char[][] fillMatrix(int n, int m, Scanner scanner) {
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input[j].charAt(0);
            }
        }
        return matrix;
    }
}
