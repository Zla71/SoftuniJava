import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_MouseInTheKitchen {

    static int totalCheese = 0;

    public static void main(String[] args) {

        // ПРАВОЪГЪЛНА МАТРИЦА
        // n = 5, m = 7

        //**M*
        //T@@*
        //CC@*
        //**@@
        //**CC

        Scanner scanner = new Scanner(System.in);

        List<Integer> sizeElements = Arrays.stream(scanner.nextLine().split(","))
                .map(Integer::parseInt)
                .toList();

        int n = sizeElements.get(0);
        int m = sizeElements.get(1);

        char[][] matrix = fillMatrix(n, m, scanner);

        // [row, col] - 'M'
        int[] mousePosition = getMousePosition(matrix);
        int mouseRow = mousePosition[0];
        int mouseCol = mousePosition[1];

        boolean wall = false;


        while (true) {
            String command = scanner.nextLine();

            if (command.equals("danger")) {
                System.out.println("Mouse will come back later!");
                break;
            }

            int newRow = mouseRow;
            int newCol = mouseCol;

            switch (command) {
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

                System.out.println("No more cheese for tonight!");
                matrix[mouseRow][mouseCol] = 'M';
                printMatrix(matrix);
                break;
            }

            char newPosition = matrix[newRow][newCol];

            if (newPosition == 'C') {
                matrix[mouseRow][mouseCol] = '*';
                matrix[newRow][newCol] = 'M';
                totalCheese--;
                if (totalCheese == 0) {
                    System.out.println("Happy mouse! All the cheese is eaten, good night!");
                    printMatrix(matrix);
                    break;
                }

            } else if (newPosition == 'T') {
                matrix[mouseRow][mouseCol] = '*';
                matrix[newRow][newCol] = 'M';
                System.out.println("Mouse is trapped!");
                printMatrix(matrix);
                break;
            } else if (newPosition == '@') {
                wall = true;
            }


            if (!wall) {
                matrix[mouseRow][mouseCol] = '*';
                matrix[newRow][newCol] = 'M';
                // мишката се мести на новата позиция, а след него остава '*'
                mouseRow = newRow;
                mouseCol = newCol;
            }

            wall = false;
        }
    }

    public static boolean isInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

    private static int[] getMousePosition(char[][] matrix) {

        int[] position = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'M') {
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    private static char[][] fillMatrix(int n, int m, Scanner scanner) {
        char[][] matrix = new char[n][];
        for (int row = 0; row < n; row++) {
            char[] input = scanner.nextLine().toCharArray();
            matrix[row] = input;

            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == 'C') {
                    totalCheese++;
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }
}
