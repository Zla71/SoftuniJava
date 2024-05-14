import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        int len = inputString.length();

        for (int i = 0; i < len; i++) {
            char symbol = inputString.charAt(i);
            System.out.println(symbol);
        };
    }
}
