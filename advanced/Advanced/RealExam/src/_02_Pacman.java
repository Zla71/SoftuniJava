import java.util.Scanner;

public class _02_Pacman {

    static int totalStars = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        readMatrix(matrix, scanner);

        // [row, col] - 'P'
        int[] pacmanPosition = pacmanPosition(matrix);
        int pacmanRow = pacmanPosition[0];
        int pacmanCol = pacmanPosition[1];

        int initialHealth = 100;
        int collectedStars = 0;
        boolean freeze = false;
        boolean isDead = false;

        while (true) {

            String direction = scanner.nextLine(); // up, down, right, left, END

            if (direction.equals("END")) {

                break;
            }

            int newRow = pacmanRow;
            int newCol = pacmanCol;

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
                if (newRow < 0 ) {
                    newRow = size - 1;

                } else if (newRow >= size) {
                    newRow = 0;
                }

                if (newCol < 0) {
                    newCol = size - 1;
                } else if (newCol >= size) {
                    newCol = 0;
                }
            }

            char newPosition = matrix[newRow][newCol];
            matrix[pacmanRow][pacmanCol] = '-';
            matrix[newRow][newCol] = 'P';
            pacmanRow = newRow;
            pacmanCol = newCol;

            if (newPosition == '*') {
                collectedStars++;
            } else if (newPosition == 'G') {
                if (!freeze) {
                    initialHealth -= 50;
                    if (initialHealth == 0) {
                        isDead = true;
                        break;
                    }
                } else {
                    freeze = false;
                }
            } else if (newPosition == 'F') {
                freeze = true;
            }

            if (totalStars == collectedStars) {
                break;
            }

        }

        if (isDead) {
            System.out.printf("Game over! Pacman last coordinates [%d,%d]%n", pacmanRow, pacmanCol);
        } else {
            if (collectedStars == totalStars){
                System.out.println("Pacman wins! All the stars are collected.");
            } else {
                System.out.println("Pacman failed to collect all the stars.");
            }
        }

        System.out.printf("Health: %d%n", initialHealth);

        if (totalStars > collectedStars) {
            System.out.printf("Uncollected stars: %d%n", totalStars - collectedStars);
        }

        printMatrix(matrix);

    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

    private static int[] pacmanPosition(char[][] matrix) {

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

            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == '*') {
                    totalStars++;
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

}
