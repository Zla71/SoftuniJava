import java.util.Scanner;

public class _02_TheSquirrel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        char[][] matrix = new char[size][size];

        readMatrix(matrix, scanner);

        // [row, col] - 's'
        int[] squirrelPosition = getJetPosition(matrix);
        int squirrelRow = squirrelPosition[0];
        int squirrelCol = squirrelPosition[1];


        int hazelnuts = 0;
        boolean allCollected = false;
        boolean squirrelOut = false;
        boolean trapped = false;
        boolean showInfo = true;

        for (int i = 0; i < commands.length; i++) {
            String direction = commands[i];

            int newRow = squirrelRow;
            int newCol = squirrelCol;

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
                squirrelOut = true;
                showInfo = false;
                matrix[squirrelRow][squirrelCol] = '*';
                break;
            }

            char newPosition = matrix[newRow][newCol];

            if (newPosition == 'h') {
                hazelnuts++;
                matrix[squirrelRow][squirrelCol] = '*';
                matrix[newRow][newCol] = 's';
                squirrelRow = newRow;
                squirrelCol = newCol;
                if (hazelnuts == 3) {
                    allCollected = true;
                    break;
                }
            } else if (newPosition == '*') {
                matrix[squirrelRow][squirrelCol] = '*';
                matrix[newRow][newCol] = 's';
                squirrelRow = newRow;
                squirrelCol = newCol;
            } else if (newPosition == 't') {
                trapped = true;
                showInfo = false;
                matrix[squirrelRow][squirrelCol] = '*';
                break;
            }

        }

        if (squirrelOut) {
            System.out.println("The squirrel is out of the field.");
        }

        if (trapped) {
            System.out.println("Unfortunately, the squirrel stepped on a trap...");
        }

        if (showInfo) {
            if (allCollected) {
                System.out.println("Good job! You have collected all hazelnuts!");
            } else {
                System.out.println("There are more hazelnuts to collect.");
            }
        }

        System.out.printf("Hazelnuts collected: %d", hazelnuts);

        printMatrix(matrix);


    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int[] getJetPosition(char[][] matrix) {

        int[] position = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 's') {
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
