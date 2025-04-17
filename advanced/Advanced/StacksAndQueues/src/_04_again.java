import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _04_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<String> stack = new ArrayDeque<>();

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == '(') {
                stack.push(String.valueOf(index));

            } else if (input.charAt(index) == ')') {
                int startIndex = Integer.parseInt(stack.pop());
                System.out.println(input.substring(startIndex, index + 1));
            }
        }
    }
}
