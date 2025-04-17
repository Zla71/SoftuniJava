import java.util.Scanner;

public class _02_FishingCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        readMatrix(matrix, scanner);

        int[] fisherPosition = getFisherPosition(matrix);

        int fisherRow = fisherPosition[0];
        int fisherCol = fisherPosition[1];

        int collectedFish = 0;

        boolean shipSank = false;

        while (true) {

            String direction = scanner.nextLine(); // up, down, right, left

            if (direction.equals("collect the nets")) {
                break;
            }

            int newRow = fisherRow;
            int newCol = fisherCol;

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

            char newPosition = matrix[newRow][newCol];

            matrix[fisherRow][fisherCol] = '-';
            matrix[newRow][newCol] = 'S';
            fisherRow = newRow;
            fisherCol = newCol;

            if (newPosition == 'W') {
                System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [%d,%d]"
                        , newRow, newCol);
                shipSank = true;
                break;
            } else {
                // проверяваме дали текущото място е цифра, или '-'
                collectedFish += Character.isDigit(newPosition) ?
                        Character.getNumericValue(newPosition) :
                        0;
            }
        }

        if (!shipSank) {
            if (collectedFish < 20) {
                int neededFish = 20 - collectedFish;
                System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.%n"
                        , neededFish);
            } else {
                System.out.println("Success! You managed to reach the quota!");
            }

            System.out.printf("Amount of fish caught: %d tons.%n", collectedFish);
            printMatrix(matrix);
        }
    }

    private static void readMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;
        }
    }

    private static int[] getFisherPosition(char[][] matrix) {

        int[] position = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'S') {
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
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
