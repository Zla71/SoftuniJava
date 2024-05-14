import java.util.Scanner;

public class ExamplesForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.printf("row %d%n", i);
        }
    }
}
// за да спрем фор цикъла трябва да напишем RETURN, а не BREAK!!!