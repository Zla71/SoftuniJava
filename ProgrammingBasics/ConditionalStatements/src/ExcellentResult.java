import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int note = Integer.parseInt(scanner.nextLine());

        if (note >= 5) {
            System.out.print("Excellent!");
        }
    }
}
