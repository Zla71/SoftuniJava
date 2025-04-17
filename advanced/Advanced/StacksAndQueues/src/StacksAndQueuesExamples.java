import java.util.*;

public class StacksAndQueuesExamples {
    public static void main(String[] args) {

        // create a stack -> Last in - First Out
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // push elements to stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(123);
        stack.push(11);
        stack.push(7);

        System.out.println("Initial Stack: " + stack);

        // pop elements from stack
        int poppedElementStack = stack.pop();
        System.out.println("Popped Element: " + poppedElementStack);
        System.out.println("Stack after pop operation: " + stack);

        System.out.println("--------------------------------------------------------------------------------");

        // print max value of stack
        int maxValue = Collections.max(stack);
        System.out.println(stack);
        System.out.println("Max value in stack: " + maxValue);
        System.out.println("--------------------------------------------------------------------------------");

        // populate stack with integers from a string
        String numbersStack = "1 2 3 4 5 6";
        Deque<Integer> intStack = new ArrayDeque<>();
        Arrays.stream(numbersStack.split("\\s+"))
                .map(Integer::parseInt)
                .forEach(intStack::push);
        System.out.println("intStack after population: " + intStack);
        System.out.println("--------------------------------------------------------------------------------");

        // create a queue -> First in - First Out
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // add elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(222);
        queue.offer(32);
        queue.offer(77);

        System.out.println("Initial Queue: " + queue);

        // pop elements from the queue
        int poppedElementQueue = queue.pop();
        System.out.println("Removed Element: "+ poppedElementQueue);
        System.out.println("Queue after remove operation: " + queue);

        System.out.println("--------------------------------------------------------------------------------");

        // print max value of queue
        int maxValueQueue = Collections.max(queue);
        System.out.println(queue);
        System.out.println("Max value in Queue: " + maxValueQueue);
        System.out.println("--------------------------------------------------------------------------------");

        // populate queue with integers from a string
        String numbersQueue = "1 2 3 4 5 6";
        Deque<Integer> intQueue = new ArrayDeque<>();
        Arrays.stream(numbersQueue.split("\\s+"))
                .map(Integer::parseInt)
                .forEach(intQueue::offer);
        System.out.println("intQueue after population: " + intQueue);
        System.out.println("--------------------------------------------------------------------------------");

        // create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // add elements to the priority queue
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);

        System.out.println("Initial Priority Queue: " + priorityQueue);

        // remove elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            int removedElementPriorityQueue = priorityQueue.remove();
            System.out.println("Removed Element: " + removedElementPriorityQueue);
            System.out.println("Priority Queue after remove operation: " + priorityQueue);
        }
    }
}