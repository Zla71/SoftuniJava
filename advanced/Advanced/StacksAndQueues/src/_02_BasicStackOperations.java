import java.util.*;

public class _02_BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = tokens[0]; // number of elements to push into the stack
        int s = tokens[1]; // number of elements to pop from the stack
        int x = tokens[2]; // that you should check whether is present in the stack

        Deque<Integer> stack = new ArrayDeque<>();

        // add n elements to the stack
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stack::push);

        // remove s elements from the stack
        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0); // check for empty stack
        } else if (stack.contains(x)) {
            System.out.println(true); // check whether x is present
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
