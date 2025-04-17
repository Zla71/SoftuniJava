import java.util.*;
import java.util.stream.Collectors;

public class _01_WildSurvival {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // QUEUE - take first
        ArrayDeque<Integer> beesQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(beesQueue::offer);

        // Stack - take last
        ArrayDeque<Integer> beeEaterStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(beeEaterStack::push);

        while (!beesQueue.isEmpty() && !beeEaterStack.isEmpty()) {
            int currentBees = beesQueue.poll();
            int currentBeeEater = beeEaterStack.pop();

            while (currentBees > 0 && currentBeeEater > 0) {
                if (currentBeeEater * 7 <= currentBees) {
                    currentBees -= currentBeeEater * 7;
                    currentBeeEater = 0;
                } else {
                    currentBeeEater -= (currentBees / 7);
                    currentBees = 0;
                }
            }

            if (currentBees > 0 && currentBeeEater == 0) {
                beesQueue.offer(currentBees);
            } else if (currentBees == 0 && currentBeeEater > 0) {
                beeEaterStack.push(currentBeeEater);
            }
        }

        System.out.println("The final battle is over!");
        if (beesQueue.isEmpty() && beeEaterStack.isEmpty()) {
            System.out.println("But no one made it out alive!");
        } else if (!beesQueue.isEmpty()) {
            System.out.println("Bee groups left: " + beesQueue.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        } else {
            List<Integer> reversedBeeEater = new ArrayList<>(beeEaterStack);
            Collections.reverse(reversedBeeEater);
            System.out.println("Bee-eater groups left: " + reversedBeeEater.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
    }
}
