import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Stop")) {
                break;
            }

            int currentNum = Integer.parseInt(command);

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        System.out.println(maxNum);
    }
}
