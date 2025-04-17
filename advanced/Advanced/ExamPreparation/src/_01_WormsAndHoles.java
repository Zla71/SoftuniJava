import java.util.*;
import java.util.stream.Collectors;

public class _01_WormsAndHoles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // start with the LAST worm
        // STACK
        ArrayDeque<Integer> wormsSizesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(wormsSizesStack::push);

        // start with the FIRST hole
        // QUEUE
        ArrayDeque<Integer> holeSizesQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(holeSizesQueue::offer);

        int initialWormCount = wormsSizesStack.size();

        int matches = 0;

        while (!wormsSizesStack.isEmpty() && !holeSizesQueue.isEmpty()) {

            int worm = wormsSizesStack.pop();
            int hole = holeSizesQueue.poll();

            if (worm == hole) {
                matches++;
            } else {
                worm -= 3;
                if (worm > 0 ) {
                    wormsSizesStack.push(worm);
                }
            }
        }

        if (matches > 0) {
            System.out.printf("Matches: %d%n", matches);
        } else {
            System.out.println("There are no matches.");
        }

        if (wormsSizesStack.isEmpty() && initialWormCount == matches) {
            System.out.println("Every worm found a suitable hole!");
        } else if (wormsSizesStack.isEmpty() && initialWormCount > matches) {
            System.out.println("Worms left: none");
        } else if (!wormsSizesStack.isEmpty()) {
            List<Integer> reversedStack = new ArrayList<>(wormsSizesStack);
            Collections.reverse(reversedStack);
            String output = reversedStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Worms left: " + output);
        }

        if (holeSizesQueue.isEmpty()) {
            System.out.println("Holes left: none");
        } else {
            String output = holeSizesQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Holes left: " + output);
        }

    }

}
