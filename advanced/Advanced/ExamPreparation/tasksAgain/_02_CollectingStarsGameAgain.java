import java.util.Arrays;
import java.util.Scanner;

public class _02_CollectingStarsGameAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        fillMatrix(scanner, size, matrix);

        // [row, col] - 'P'
        int[] playerPosition = getPlayerPosition(matrix);
        int playerRow = playerPosition[0];
        int playerCol = playerPosition[1];

        int collectedStars = 2;
        boolean allCollected = false;
        boolean loose = false;

        while (collectedStars < 10) {

            String direction = scanner.nextLine(); // left, right, up, down,

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
                newRow = 0;
                newCol = 0;
            }

            char newPosition = matrix[newRow][newCol];

            if (newPosition == '*') {
                collectedStars++;
                matrix[playerRow][playerCol] = '.';
                matrix[newRow][newCol] = 'P';
                if (collectedStars == 10) {
                    allCollected = true;
                }
                playerRow = newRow;
                playerCol = newCol;
            } else if (newPosition == '#') {
                collectedStars--;
                if (collectedStars == 0) {
                    loose = true;
                    break;
                }
            } else if (newPosition == '.') {
                matrix[playerRow][playerCol] = '.';
                matrix[newRow][newCol] = 'P';
                playerRow = newRow;
                playerCol = newCol;
            }
        }

        if (loose) {
            System.out.println("Game over! You are out of any stars.");
            System.out.printf("Your final position is [%d, %d]%n", playerRow, playerCol);
            printMatrix(matrix);
        }

        if (allCollected) {
            System.out.println("You won! You have collected 10 stars.");
            System.out.printf("Your final position is [%d, %d]%n", playerRow, playerCol);
            printMatrix(matrix);
        }
    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
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

    private static void fillMatrix(Scanner scanner, int size, char[][] field) {
        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < size; j++) {
                field[i][j] = input[j].charAt(0);
            }
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            System.out.println(String.join(" ", Arrays.toString(chars).replaceAll("[\\[\\],]", "")));
        }
    }

}
