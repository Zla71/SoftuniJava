import java.util.Arrays;
import java.util.Scanner;


public class MultiExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        int[] arrayTwoExample = {32, 432, 65, 76};

        array[0] = 1;

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        int[] arrayTwo = new int[7];
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayTwo));

        // for each
        for (int number : arrayTwo) {
            System.out.println(number);
        }

        // 2-D arrays - MATRIX --- rows 3; columns 4 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int[][] matrix = new int[3][4];
        int[][] matrixTwo = {
                {29, 45, 50, 76},
                {23, 54, 56, 23},
                {12, 54, 31, 32}
        };

        // populate matrix
        matrix[0][2] = 25;
        matrix[1][0] = 77;
        matrix[2][3] = 12;

        matrix[0] = new int[]{23, 43, 98, 33};
        System.out.println("Row 0 in matrix is with length: " + matrix[0].length);

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(matrixTwo));

        // print a particular element
        System.out.println(matrixTwo[0][1]);
        System.out.println(matrixTwo[2][3]);

        System.out.println();

        // iterations
        // matrix.length - дава ни броя на редовете
        for (int row = 0; row < matrixTwo.length; row++) {
            for (int col = 0; col < matrixTwo[row].length; col++) {
                System.out.print(matrixTwo[row][col] + " ");
            }
            System.out.println();

        }

        isInBounds(matrixTwo, 5, 6);

    }

    /**
    Check if row or column index is valid
     @param matrix current matrix
     @param row given row
     @param col given column
    */
    private static void isInBounds(int[][] matrix, int row, int col) {
        if (row >= 0 && row < matrix.length && 0 >= col && col < matrix[row][col]) {
            System.out.println("valid index");
        } else {
            System.out.println("invalid index");
        }
    }
}