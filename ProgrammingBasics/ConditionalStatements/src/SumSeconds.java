import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int result = first + second + third;
        int minutes = result / 60;
        int seconds = result % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }
        else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
