import java.util.Scanner;

public class _02_EscapeTheMazeAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        readMatrix(matrix, scanner);

        // [row, col] - 'P'
        int[] travellerPosition = getTravellerPosition(matrix);
        int travellerRow = travellerPosition[0];
        int travellerCol = travellerPosition[1];

        int initialHealth = 100;
        boolean isDead = false;

        while (true) {

            String direction = scanner.nextLine();

            int newRow = travellerRow;
            int newCol = travellerCol;

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

            if (isInvalidIndex(newRow, size) || isInvalidIndex(newCol, size)) {
                continue;
            }

            char newPosition = matrix[newRow][newCol];

            matrix[travellerRow][travellerCol] = '-';
            matrix[newRow][newCol] = 'P';
            travellerRow = newRow;
            travellerCol = newCol;

            if (newPosition == 'X') {
                break;
            } else if (newPosition == 'M') {
                initialHealth -= 40;
                if (initialHealth <= 0) {
                    isDead = true;
                    initialHealth = 0;
                    break;
                }

            } else if (newPosition == 'H') {
                initialHealth += 15;
                if (initialHealth > 100) {
                    initialHealth = 100;
                }
            }
        }

        if (isDead) {
            System.out.println("Player is dead. Maze over!");
        } else {
            System.out.println("Player escaped the maze. Danger passed!");
        }

        System.out.printf("Player's health: %d units%n", initialHealth);

        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

    private static int[] getTravellerPosition(char[][] matrix) {

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

    private static void readMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;
        }
    }
}
