import java.util.*;
import java.util.stream.Collectors;

public class _01_BallGameAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // STACK - take last
        ArrayDeque<Integer> strengthStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(strengthStack::push);

        // QUEUE - take first
        ArrayDeque<Integer> accuracyQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(accuracyQueue::offer);

        int goals = 0;

        while (!strengthStack.isEmpty() && !accuracyQueue.isEmpty()) {

            int strength = strengthStack.peek();
            int accuracy = accuracyQueue.peek();

            int result = strength + accuracy;

            if (result == 100) {
                goals++;
                strengthStack.pop();
                accuracyQueue.poll();
            } else if (result < 100) {
                if (strength < accuracy) {
                    strengthStack.pop();
                } else if (strength > accuracy) {
                    accuracyQueue.poll();
                } else {
                    accuracyQueue.poll();
                    strengthStack.pop();
                    strengthStack.push(result);
                }
            } else {
                strength -= 10;
                strengthStack.pop();
                strengthStack.push(strength);
                accuracyQueue.poll();
                accuracyQueue.offer(accuracy);
            }
        }

        if (goals == 0) {
            System.out.println("Paul failed to score a single goal.");
        } else if (goals < 3) {
            System.out.println("Paul failed to make a hat-trick.");
        } else if (goals == 3) {
            System.out.println("Paul scored a hat-trick!");
        } else {
            System.out.println("Paul performed remarkably well!");
        }

        if (goals > 0) {
            System.out.printf("Goals scored: %d%n", goals);
        }

        if (!strengthStack.isEmpty()) {
            List<Integer> reversedStack = new ArrayList<>(strengthStack);
            Collections.reverse(reversedStack);
            String output = reversedStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Strength values left: " + output);
        }

        if (!accuracyQueue.isEmpty()) {
            String output = accuracyQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Accuracy values left: " + output);
        }


    }
}
