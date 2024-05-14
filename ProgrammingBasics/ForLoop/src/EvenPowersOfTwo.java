import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i += 2) {
            if (i % 2 == 0) {
                int result = (int) Math.pow(2, i);
                System.out.println(result);
            }
        }
    }
}
