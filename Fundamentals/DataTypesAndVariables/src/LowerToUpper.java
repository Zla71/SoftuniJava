import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char currentChar = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(currentChar)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
