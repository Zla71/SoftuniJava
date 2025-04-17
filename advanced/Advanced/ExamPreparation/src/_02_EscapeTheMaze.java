import java.util.Scanner;

public class _02_EscapeTheMaze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        readMatrix(matrix, scanner);

        // [row, col] - 'P'
        int[] playerPosition = getPlayerPosition(matrix);
        int playerRow = playerPosition[0];
        int playerCol = playerPosition[1];
        int playerHealth = 100;

        while (true) {

            String direction = scanner.nextLine(); // up, down, right, left

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
            if (isInvalidIndex(newRow, size) || isInvalidIndex(newCol, size)) {
                continue;
            }

            char newPosition = matrix[newRow][newCol];
            matrix[playerRow][playerCol] = '-';
            matrix[newRow][newCol] = 'P';
            playerRow = newRow;
            playerCol = newCol;

            // Условия за изход:
            // 1. Да стигна клетка с 'X'
            // 2. Героят да загине в матрицата (playerHealth <= 0)

            if (newPosition == 'X') {
                System.out.println("Player escaped the maze. Danger passed!");
                System.out.printf("Player's health: %d units\n", playerHealth);
                printMatrix(matrix);
                return;
            } else if (newPosition == 'M') {
                playerHealth -= 40;
                if (playerHealth <= 0) {
                    System.out.println("Player is dead. Maze over!");
                    System.out.println("Player's health: 0 units");
                    printMatrix(matrix);
                    return;
                }
            } else if (newPosition == 'H') {
                playerHealth += 15;
                if (playerHealth > 100) {
                    playerHealth = 100;
                }
            }
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int[] getPlayerPosition(char[][] matrix) {

        int[] position = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P') {
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

    private static void readMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;
        }
    }
}
