import java.util.*;

public class _03_MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            if (command[0].equals("1")) {
                stack.push(Integer.parseInt(command[1]));
            } else if (command[0].equals("2")) {
                stack.pop();
            } else if (command[0].equals("3")) {
                System.out.println(Collections.max(stack));

            }
        }
    }
}
