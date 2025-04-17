import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _01_ReverseNumbersWithAStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        Deque<Integer> stack = new ArrayDeque<>();

        for (String element : input) {
            stack.push(Integer.valueOf(element));
        }

        for (Integer element : stack) {
            System.out.printf("%s ", element);
        }
    }
}
