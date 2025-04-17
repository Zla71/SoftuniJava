import java.util.*;
import java.util.stream.Collectors;

public class _01_PiePursuit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //5 8 4 6 queue FIFO
        //3 7 2 9 stack LIFO

        // 1ви ред със състезателят колко парчета може да изяде
        Deque<Integer> contestantsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(contestantsQueue::offer);

        // 2ри ред с парчетата от всеки пай
        Deque<Integer> pieStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(pieStack::push);

        while (!contestantsQueue.isEmpty() && !pieStack.isEmpty()) {

            int contestant = contestantsQueue.poll();
            int pie = pieStack.pop();

            if (contestant >= pie) {
                contestant -= pie;
                if (contestant > 0) {
                    contestantsQueue.offer(contestant);
                }
            } else {
                pie -= contestant;

                if (!pieStack.isEmpty()) {
                    if (pie == 1) {
                        int nextPie = pieStack.pop();
                        pieStack.push(nextPie + pie);
                    } else {
                        pieStack.push(pie);
                    }
                } else {
                    pieStack.push(pie);
                }
            }
        }

        if (contestantsQueue.isEmpty() && pieStack.isEmpty()) {
            System.out.println("We have a champion!");

        } else if (pieStack.isEmpty()) {
            System.out.println("We will have to wait for more pies to be baked!");
            System.out.printf("Contestants left: %s", getQueueElements(contestantsQueue));
        } else {
            System.out.println("Our contestants need to rest!");
            System.out.printf("Pies left: %s", getStackElements(pieStack));
        }

    }

    private static String getStackElements(Deque<Integer> pieStack) {

        // descendingIterator ще ги подреди в обратен ред
        Iterator<Integer> stackIterator = pieStack.descendingIterator();
        StringBuilder sb = new StringBuilder();


        if (stackIterator.hasNext()) {
            sb.append(stackIterator.next());
        }

        while (stackIterator.hasNext()) {
            sb.append(", ");
            sb.append(stackIterator.next());
        }

        return sb.toString();
    }

    private static String getQueueElements(Deque<Integer> deque) {
        // works only for queues
        return deque.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
