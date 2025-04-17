import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _06_RecursiveFibonacciStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Long> stack = new ArrayDeque<>();

        stack.push(0L);
        stack.push(1L);

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 2) {
            System.out.println(1);
        }

        for (int i = 0; i < n; i++) {

            // n - 1
            long numOne = stack.pop();
            // n - 2
            long numTwo = stack.pop();

            // back numberOne into the stack
            stack.push(numOne);
            // calculate numberTwo
            stack.push(numOne + numTwo);
        }

        System.out.println(stack.peek());
    }
}
