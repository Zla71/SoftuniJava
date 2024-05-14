import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String secondWord : secondArr) {
            for (String firstWord : firstArr) {
                if (secondWord.equals(firstWord)) {
                    System.out.printf("%s ", secondWord);
                    break;
                }
            }
        }
    }
}
