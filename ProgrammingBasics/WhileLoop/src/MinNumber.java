import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Stop")) {
                break;
            }

            int currentNum = Integer.parseInt(command);

            if (currentNum < minNum) {
                minNum = currentNum;
            }
        }
        System.out.println(minNum);
    }
}
