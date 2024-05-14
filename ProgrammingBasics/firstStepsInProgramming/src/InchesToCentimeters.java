import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double centimeters = Double.parseDouble(scanner.nextLine());
        double result = centimeters * 2.54;

        System.out.println(result);
    }
}
