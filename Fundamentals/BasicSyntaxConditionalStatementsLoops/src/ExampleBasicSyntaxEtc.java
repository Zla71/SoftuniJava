import java.util.Scanner;


public class ExampleBasicSyntaxEtc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();
        int counter = Integer.parseInt(scanner.nextLine());

        System.out.println(myName);

        for (int i = 1; i <= counter; i++) {
            System.out.printf("%s %d\n", myName, i);
        }

        // trim String
        String trimString = "     Hello, world";
        System.out.println(trimString);
        System.out.println(trimString.trim());
    }
}