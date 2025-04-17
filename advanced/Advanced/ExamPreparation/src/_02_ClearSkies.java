import java.util.Scanner;

public class _02_ClearSkies {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        readMatrix(matrix, scanner);

        // [row, col] - 'J'
        int[] playerPosition = getJetPosition(matrix);
        int jetRow = playerPosition[0];
        int jetCol = playerPosition[1];
        int jetArmour = 300;
        int enemyPlanes = 4;

        while (true) {

            String direction = scanner.nextLine(); // up, down, right, left

            int newRow = jetRow;
            int newCol = jetCol;

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

            char newPosition = matrix[newRow][newCol];
            if (newPosition == '-') {
                matrix[jetRow][jetCol] = '-';
                matrix[newRow][newCol] = 'J';
                jetRow = newRow;
                jetCol = newCol;
            } else if (newPosition == 'E') {
                matrix[jetRow][jetCol] = '-';
                matrix[newRow][newCol] = 'J';
                jetRow = newRow;
                jetCol = newCol;
                jetArmour -= 100;
                enemyPlanes -= 1;
                if (jetArmour == 0) {
                    System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!%n", jetRow, jetCol);
                    break;
                }
                if (enemyPlanes == 0) {
                    System.out.println("Mission accomplished, you neutralized the aerial threat!");
                    break;
                }
            } else if (newPosition == 'R') {
                matrix[jetRow][jetCol] = '-';
                matrix[newRow][newCol] = 'J';
                jetRow = newRow;
                jetCol = newCol;
                jetArmour = 300;
            }
        }

        printMatrix(matrix);
    }

    private static void readMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;
        }
    }

    private static int[] getJetPosition(char[][] matrix) {

        int[] position = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'J') {
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
