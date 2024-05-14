import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String currentString = scanner.nextLine();

        while (!currentString.equals("Stop")) {
            System.out.println(currentString);

            currentString = scanner.nextLine();
        }
    }
}
