import java.util.*;
import java.util.stream.Collectors;

public class _01_WildSurvivalAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // QUEUE - take first
        ArrayDeque<Integer> defendersQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(defendersQueue::offer);

        // STACK - take last
        ArrayDeque<Integer> attackersStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(attackersStack::push);

        while (!attackersStack.isEmpty() && !defendersQueue.isEmpty()) {

            int currentDefender = defendersQueue.poll();
            int currentAttacker = attackersStack.pop();

            while (currentDefender > 0 && currentAttacker > 0) {
                if (currentAttacker * 7 <= currentDefender) {
                    currentDefender -= currentAttacker * 7;
                    currentAttacker = 0;
                } else {
                    currentAttacker -= (currentDefender / 7);
                    currentDefender = 0;
                }
            }

            if (currentDefender > 0 && currentAttacker == 0) {
                defendersQueue.offer(currentDefender);
            } else if (currentDefender == 0 && currentAttacker > 0) {
                attackersStack.push(currentAttacker);
            }
        }

        System.out.println("The final battle is over!");

        if (attackersStack.isEmpty() && defendersQueue.isEmpty()) {
            System.out.println("But no one made it out alive!");
        }

        if (!defendersQueue.isEmpty()) {
            String output = defendersQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Bee groups left: " + output);
        }

        if (!attackersStack.isEmpty()) {
            List<Integer> reversedStack = new ArrayList<>(attackersStack);
            Collections.reverse(reversedStack);
            String output = reversedStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Bee-eater groups left: " + output);
        }

    }
}
