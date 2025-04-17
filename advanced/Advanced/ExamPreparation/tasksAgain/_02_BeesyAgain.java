import java.util.Scanner;

public class _02_BeesyAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        readMatrix(matrix, scanner);

        // [row, col] - 'B'
        int[] beePosition = getBeePosition(matrix);
        int beeRow = beePosition[0];
        int beeCol = beePosition[1];

        int collectedNectar = 0;
        int initialEnergy = 15;
        boolean neededNectarCollected = false;
        boolean restored = false;
        boolean reachedHive = false;

        while (initialEnergy > 0) {
            initialEnergy--;

            String direction = scanner.nextLine(); // up, down, right, left

            int newRow = beeRow;
            int newCol = beeCol;

            switch (direction) {
                case "up":
                    newRow--;
                    if (newRow < 0) {
                        newRow = size - 1;
                    }
                    break;
                case "down":
                    newRow++;
                    if (newRow == size) {
                        newRow = 0;
                    }
                    break;
                case "right":
                    newCol++;
                    if (newCol == size) {
                        newCol = 0;
                    }
                    break;
                case "left":
                    newCol--;
                    if (newCol < 0) {
                        newCol = size - 1;
                    }
                    break;
            }

            char newPosition = matrix[newRow][newCol];

            if (Character.isDigit(newPosition)) {
                collectedNectar += Character.getNumericValue(newPosition);
                matrix[beeRow][beeCol] = '-';
                matrix[newRow][newCol] = 'B';
                beeRow = newRow;
                beeCol = newCol;
                if (collectedNectar >= 30) {
                    neededNectarCollected = true;
                }

            } else if (newPosition == '-') {
                matrix[beeRow][beeCol] = '-';
                matrix[newRow][newCol] = 'B';
                beeRow = newRow;
                beeCol = newCol;
            } else if (newPosition == 'H') {
                matrix[beeRow][beeCol] = '-';
                matrix[newRow][newCol] = 'B';
                reachedHive = true;
                break;
            }

            if (initialEnergy == 0 && collectedNectar > 30 && !restored) {
                initialEnergy += collectedNectar - 30;
                restored = true;
            }


        }

        if (reachedHive) {
            if (neededNectarCollected) {
                System.out.printf("Great job, Beesy! The hive is full. Energy left: %d%n", initialEnergy);
            } else {
                System.out.println("Beesy did not manage to collect enough nectar.");
            }
        } else {
            System.out.println("This is the end! Beesy ran out of energy.");
        }

        printMatrix(matrix);


    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int[] getBeePosition(char[][] matrix) {

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

    private static void readMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;
        }
    }

}
