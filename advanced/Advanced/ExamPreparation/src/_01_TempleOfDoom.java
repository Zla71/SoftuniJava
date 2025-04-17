import java.util.*;
import java.util.stream.Collectors;

public class _01_TempleOfDoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //QUEUE - take FIRST
        ArrayDeque<Integer> toolsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(toolsQueue::offer);

        // STACK - take LAST
        ArrayDeque<Integer> substancesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(substancesStack::push);

        // LIST - find ANY
        List<Integer> challengesList = new ArrayList<>(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList());

        boolean lost = false;

        while (!substancesStack.isEmpty() && !toolsQueue.isEmpty()) {

            int currentTool = toolsQueue.poll();
            int currentSubstance = substancesStack.pop();

            int result = currentSubstance * currentTool;

            if (challengesList.contains(result)) {
                challengesList.remove(Integer.valueOf(result));
            } else {
                currentTool++;
                toolsQueue.offer(currentTool);

                currentSubstance--;
                if (currentSubstance > 0) {
                    substancesStack.push(currentSubstance);
                }
            }


            if (substancesStack.isEmpty() || toolsQueue.isEmpty() && !challengesList.isEmpty()) {
                System.out.println("Harry is lost in the temple. Oblivion awaits him.");
                lost = true;
                break;
            }
        }

        if (!lost) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }

        if (!toolsQueue.isEmpty()) {

            String output = toolsQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));

            System.out.printf("Tools: %s%n", output);
        }

        if (!substancesStack.isEmpty()) {

            List<Integer> reversedStack = new ArrayList<>(substancesStack);
            Collections.reverse(reversedStack);
            String output = reversedStack.stream().map(String::valueOf).collect(Collectors.joining(", "));

            System.out.printf("Substances: %s%n", output);
        }

        if (!challengesList.isEmpty()) {

            String output = challengesList.stream().map(String::valueOf).collect(Collectors.joining(", "));

            System.out.printf("Challenges: %s%n", output);
        }

    }
}
