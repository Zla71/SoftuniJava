import java.util.Scanner;

public class SequenceTwoKPlusOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int initialNumber = Integer.parseInt(scanner.nextLine());
        int beginning = 1;

        while (true) {
            System.out.println(beginning);
            beginning = beginning * 2 + 1;
            if (beginning > initialNumber) {
                break;
            }
        }
    }
}
