import java.util.ArrayDeque;
import java.util.Scanner;

public class _08_again {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> forwards = new ArrayDeque<>();
        ArrayDeque<String> backwards = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (backwards.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forwards.push(backwards.peek());
                    backwards.pop();
                    System.out.println(backwards.peek());
                }
            } else if (input.equals("forward")) {
                if (forwards.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forwards.peek());
                    backwards.push(forwards.pop());
                }
            } else {
                System.out.println(input);
                backwards.push(input);
                forwards.clear();
            }
            input = scanner.nextLine();
        }
    }
}
