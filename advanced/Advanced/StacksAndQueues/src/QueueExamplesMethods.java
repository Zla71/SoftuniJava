import java.util.*;

public class QueueExamplesMethods {
    public static void main(String[] args) {

        // create a Queue - първия влязал е първия излязъл
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        System.out.println("Initial empty Queue: " + queue);
        System.out.println("--------------------------------------------");

        // offer() - добавя елементи към опашката
        queue.offer(111);
        queue.offer(222);
        queue.offer(333);
        queue.offer(444);
        queue.offer(555);

        System.out.println("Queue after offer method: " + queue);
        System.out.println("--------------------------------------------");

        // poll() - премахва и връща елемента, който е най-отпред в опашката, връща false, ако опашката е празна
        int polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after polled element: " + queue);
        System.out.println("--------------------------------------------");

        // isEmpty() - връща булева променлива true/false
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty? " + isEmpty);
        System.out.println("--------------------------------------------");

        // peak() - връща елемента, който е най-отпред в опашката без да го премахва
        int peakedElement = queue.peek();
        System.out.println("Top peeked element: " + peakedElement);
        System.out.println("--------------------------------------------");

        // size() - връща дължината на опашката
        int sizeQueue = queue.size();
        System.out.println("Size (length) of Queue is: " + sizeQueue);
        System.out.println("--------------------------------------------");

        // element() - връща елемента, който е най-отпред на опашката, но не го премахва от нея
        int headElement = queue.element();
        System.out.println("Head element of Queue: " + headElement);
        System.out.println("Queue after returning of head element: " + queue);
        System.out.println("--------------------------------------------");

        // contains() - проверява дали даден елемент се намира в опашката и връща булева променлива
        boolean isInQueue = queue.contains(777);
        boolean isThisInQueue = queue.contains(333);
        System.out.println("Is 777 in Queue? " + isInQueue);
        System.out.println("Is 123 in Queue? " + isThisInQueue);
        System.out.println("Actual Queue: " + queue);
        System.out.println("--------------------------------------------");

        // toArray() - конвертира опашката в масив
        Object[] array = queue.toArray();
        System.out.println("Array of Queue: " + java.util.Arrays.toString(array));
        System.out.println("--------------------------------------------");

        // iterator() - връща итератор върху елементите от опашката
        java.util.Iterator<Integer> iterator = queue.iterator();
        System.out.println("Elements in Queue printed by using iterator: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println("--------------------------------------------");

        // for-each loop, цикъл в опашката
        System.out.println("Elements in Queue printed by using for-each loop");
        for (Integer element : queue) {
            System.out.println(element);
        }
        System.out.println("--------------------------------------------");

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

        // clear() - изтрива елементите в опашката
        queue.clear();
        System.out.println("Queue after clear method: " + queue);
    }
}
