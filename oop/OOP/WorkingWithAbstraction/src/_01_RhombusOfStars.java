import java.util.Scanner;

public class _01_RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printRow(n);
    }

    private static void printRow(int size) {

        if (size == 1) {
            System.out.println("*");
        } else {
            // горна част на ромба
            for (int row = 1; row <= size; row++) {
                printRowOfStars(row, size);
            }

            // долна част на ромба
            for (int row = size - 1; row >= 1; row--) {
                printRowOfStars(row, size);
            }
        }
    }

    private static void printRowOfStars(int row, int size) {

        int countOfWhiteSpace = size - row;

        for (int i = 1; i <= countOfWhiteSpace; i++) {
            System.out.print(" ");
        }

        for (int star = 1; star <= row; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
