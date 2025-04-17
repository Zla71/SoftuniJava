import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _01_RubberDuckDebuggers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // QUEUE - take first
        ArrayDeque<Integer> programmerTimeQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(programmerTimeQueue::offer);

        // STACK - take last
        ArrayDeque<Integer> numberOfTasksStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(numberOfTasksStack::push);

        int vaderNumber = 0;
        int thorNumber = 0;
        int blueNumber = 0;
        int yellowNumber = 0;

        while (!programmerTimeQueue.isEmpty() && !numberOfTasksStack.isEmpty()) {

            int currentTime = programmerTimeQueue.peek();
            int currentTasks = numberOfTasksStack.peek();

            int result = currentTasks * currentTime;

            if (result <= 240) {
                if (result >= 0 && result <= 60) {
                    vaderNumber++;
                } else if (result >= 61 && result <= 120) {
                    thorNumber++;
                } else if (result >= 121 && result <= 180) {
                    blueNumber++;
                } else {
                    yellowNumber++;
                }
                programmerTimeQueue.poll();
                numberOfTasksStack.pop();
            } else {
                currentTasks -= 2;
                numberOfTasksStack.pop();
                numberOfTasksStack.push(currentTasks);
                programmerTimeQueue.poll();
                programmerTimeQueue.offer(currentTime);
            }
        }

        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");
        System.out.printf("Darth Vader Ducky: %d%nThor Ducky: %d%nBig Blue Rubber Ducky: %d%nSmall Yellow Rubber Ducky: %d", vaderNumber, thorNumber, blueNumber, yellowNumber);
    }
}
