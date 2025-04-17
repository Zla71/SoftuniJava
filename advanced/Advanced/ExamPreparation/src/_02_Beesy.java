import java.util.Scanner;

public class _02_Beesy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int[] coordinates;


        // fill matrix and get 'B' coordinates
        coordinates = fillMatrix(scanner, size, matrix);

        int energy = 15;
        boolean isHiveReached = false;
        int nectar = 0;
        boolean isRestored = false;


        while (!isHiveReached) {

            if (energy <= 0) {
                break;
            }

            String command = scanner.nextLine();

            // move
            move(command, coordinates, matrix);

            // ако пчеличката излезе от матрицата отива на отсрещната страна
            moveBeeOppositeSideIfNeeded(coordinates, size);

            char currentSymbol = matrix[coordinates[0]][coordinates[1]];

            // check for digit -> 'H' or '-'
            if (currentSymbol == 'H') {
                isHiveReached = true;
            } else {
                // проверяваме дали текущото място е цифра, или '-'
                nectar += Character.isDigit(currentSymbol) ?
                        Character.getNumericValue(currentSymbol) :
                        0;
            }

            energy--;

            // възстановяване на енергията, ако е нужно
            if (!isRestored) {
                if (energy <= 0 && nectar > 30) {
                    int restValue = nectar - 30;
                    energy += restValue;
                    nectar -= restValue;
                    isRestored = true;
                }
            }

            matrix[coordinates[0]][coordinates[1]] = 'B';
        }

        if (isHiveReached) {
            if (nectar >= 30) {
                System.out.printf("Great job, Beesy! The hive is full. Energy left: %d%n", energy);
            } else {
                System.out.println("Beesy did not manage to collect enough nectar.");
            }
        } else {
            System.out.println("This is the end! Beesy ran out of energy.");
        }

        printMatrix(matrix);

    }

    private static void moveBeeOppositeSideIfNeeded(int[] coordinates, int size) {
        int row = coordinates[0];
        int col = coordinates[1];

        if (row < 0 ) {
            coordinates[0] = size - 1;

        } else if (row >= size) {
            coordinates[0] = 0;
        }

        if (col < 0) {
            coordinates[1] = size - 1;
        } else if (col >= size) {
            coordinates[1] = 0;
        }
    }

    private static void move(String command, int[] coordinates, char[][] matrix) {

        // слагаме '-' след всяко преместване от позиция
        matrix[coordinates[0]][coordinates[1]] = '-';

        switch (command) {
            case "up":
                // up -> row--
                coordinates[0]--;
                break;
            case "down":
                // down -> row++
                coordinates[0]++;
                break;
            case "left":
                // left -> col--
                coordinates[1]--;
                break;
            case "right":
                // right -> col++
                coordinates[1]++;
                break;
        }
    }

    private static int[] fillMatrix(Scanner scanner, int size, char[][] matrix) {

        int[] coordinates = new int[2];

        for (int row = 0; row < size; row++) {
            matrix[row] = scanner.nextLine().toCharArray();

            // search for 'B' coordinates
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 'B') {
                    coordinates[0] = row;
                    coordinates[1] = col;
                    break;
                }
            }
        }

        return coordinates;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }
}
