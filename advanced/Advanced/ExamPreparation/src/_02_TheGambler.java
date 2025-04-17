import java.util.Scanner;

public class _02_TheGambler {

    private static int money = 100;
    private static boolean isJackpotWinner = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] board = new char[size][size];

        int row = 0, col = 0;

        for (int r = 0; r < size; r++) {
            String line = scanner.nextLine();
            board[r] = line.toCharArray();
            if (line.contains("G")) {
                row = r;
                col = line.indexOf("G");
            }
        }

        String direction = scanner.nextLine();


        while (!direction.equals("end") && money > 0 && !isJackpotWinner) {

            if (direction.equals("up")) {
                movePlayerUp(row, col, board);
                row--;
            } else if (direction.equals("down")) {
                movePlayerDown(row, col, board);
                row++;
            } else if (direction.equals("left")) {
                movePlayerLeft(row, col, board);
                col--;
            } else if (direction.equals("right")) {
                movePlayerRight(row, col, board);
                col++;
            }

            direction = scanner.nextLine();

        }

        if (money <= 0) {
            System.out.println("Game over! You lost everything!");
        } else {
            if (isJackpotWinner) {
                System.out.println("You win the Jackpot!");
            }
            System.out.printf("End of the game. Total amount: %d$%n", money);
            printBoard(board);
        }

    }

    private static void movePlayerRight(int row, int col, char[][] board) {
        int nextCol = col + 1;
        if (!isInBounds(row, nextCol, board)) {
            money = -1;
            return;
        }

        char nextPosSymbol = board[row][nextCol];
        if (nextPosSymbol == 'W') {
            money += 100;
        } else if (nextPosSymbol == 'P') {
            money -= 200;
        } else if (nextPosSymbol == 'J') {
            isJackpotWinner = true;
            money += 100000;
        }

        board[row][col] = '-';
        board[row][nextCol] = 'G';
    }

    private static void movePlayerLeft(int row, int col, char[][] board) {

        int nextCol = col - 1;
        if (!isInBounds(row, nextCol, board)) {
            money = -1;
            return;
        }

        char nextPosSymbol = board[row][nextCol];
        if (nextPosSymbol == 'W') {
            money += 100;
        } else if (nextPosSymbol == 'P') {
            money -= 200;
        } else if (nextPosSymbol == 'J') {
            isJackpotWinner = true;
            money += 100000;
        }

        board[row][col] = '-';
        board[row][nextCol] = 'G';
    }

    private static void movePlayerDown(int row, int col, char[][] board) {
        int nextRow = row + 1;
        if (!isInBounds(nextRow, col, board)) {
            money = -1;
            return;
        }

        char nextPosSymbol = board[nextRow][col];
        if (nextPosSymbol == 'W') {
            money += 100;
        } else if (nextPosSymbol == 'P') {
            money -= 200;
        } else if (nextPosSymbol == 'J') {
            isJackpotWinner = true;
            money += 100000;
        }

        board[row][col] = '-';
        board[nextRow][col] = 'G';
    }

    private static void printBoard(char[][] board) {
        for (char[] chars : board) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void movePlayerUp(int row, int col, char[][] board) {
        int nextRow = row - 1;
        if (!isInBounds(nextRow, col, board)) {
            money = -1;
            return;
        }

        char nextPosSymbol = board[nextRow][col];
        if (nextPosSymbol == 'W') {
            money += 100;
        } else if (nextPosSymbol == 'P') {
            money -= 200;
        } else if (nextPosSymbol == 'J') {
            isJackpotWinner = true;
            money += 100000;
        }

        board[row][col] = '-';
        board[nextRow][col] = 'G';


    }

    public static boolean isInBounds(int r, int c, char[][] board) {
        return r >= 0 && r < board.length && c >= 0 && c < board[r].length;
    }
}



