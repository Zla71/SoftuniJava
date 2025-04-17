import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class softUniLabStacksQueues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // СТЕКОВЕ
        // стека е структура от данни, която подрежда елементите на купчина
        System.out.println("стек.....................");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // добавяне - .push
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack);

        // премахване - .pop  - премахване на последния добавен елемент
        int popped = stack.pop();
        System.out.println(popped);
        System.out.println(stack);

        // вземане - .peek последния добавен елемент
        int peekedStack = stack.peek();
        System.out.println(peekedStack);
        System.out.println(stack);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(10));

        System.out.println("опашка.....................");

        // ОПАШКИ
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // добавяне - .offer
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        // премахване - .poll премахване на първия добавен елемент
        int polled = queue.poll();
        System.out.println(polled);
        System.out.println(queue);

        // вземане - .peek първия добавен елемент
        int peekedQueue = queue.peek();
        System.out.println("Peeked from Queue: " + peekedQueue);


        // ПРИОРИТЕТНА ОПАШК
        System.out.println("приоритетна опашка.....................");
        PriorityQueue<String> fruits = new PriorityQueue<>();
        PriorityQueue<Integer> custom = new PriorityQueue<>(Comparator.reverseOrder());

        fruits.offer("Banana");
        fruits.offer("Apple");
        fruits.offer("Cherry");

        PriorityQueue<Integer> people = new PriorityQueue<>();
        people.offer(12);
        people.offer(36);
        people.offer(40);
        people.offer(7);

        System.out.println("Priority Queue Fruits: " + fruits);
        System.out.println("Priority Queue People: " + people);

        custom.offer(123);
        custom.offer(555);
        custom.offer(234);
        custom.offer(777);
        custom.offer(5);

        System.out.println("Priority Queue Custom: " + custom);

    }
}
