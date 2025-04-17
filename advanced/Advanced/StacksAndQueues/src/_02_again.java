import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] input = scanner.nextLine().split("\\s+");
        Collections.addAll(stack, input);

        while (stack.size() != 1) {
            int firstNumber = Integer.parseInt(stack.pop());
            String symbol = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            if (symbol.equals("+")) {
                stack.push(String.valueOf(firstNumber + secondNumber));
            } else if (symbol.equals("-")) {
                stack.push(String.valueOf(firstNumber - secondNumber));
            }
        }
        System.out.println(stack.pop());
    }
}
