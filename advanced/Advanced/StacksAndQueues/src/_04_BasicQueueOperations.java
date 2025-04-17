import java.util.*;

public class _04_BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] initialValues = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numbersToOffer = initialValues[0];
        int numbersToPoll = initialValues[1];
        int numberCheck = initialValues[2];

        Deque<Integer> queue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(queue::offer);

        for (int i = 0; i < numbersToPoll; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(numberCheck)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}
