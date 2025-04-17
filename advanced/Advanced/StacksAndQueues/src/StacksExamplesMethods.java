import java.util.*;

public class StacksExamplesMethods {
    public static void main(String[] args) {

        // create a stack - последния влязазъл е първия излязъл
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        System.out.println("Initial empty stack after creation");
        System.out.println(stack);
        System.out.println("--------------------------------------------");

        // push() - добавя елементи най-отзад на стека
        stack.push(1);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(5);
        System.out.println("Stack after push operation");
        System.out.println(stack);
        System.out.println("--------------------------------------------");

        // pop() - премахва елемента, който е най-отзад в стека
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop operation");
        System.out.println(stack);
        System.out.println("--------------------------------------------");

        // peek() - взема елемента, който е най-отзад на стака без да го премахва
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        System.out.println("Stack after peek operation");
        System.out.println(stack);
        System.out.println("--------------------------------------------");

        // empty() - проверява дали стака е празен
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);
        System.out.println("--------------------------------------------");

        // addFirst() - добавя елемент най-отпред в стака
        stack.addFirst(256);
        System.out.println("Stack after addFirst operation");
        System.out.println(stack);
        System.out.println("--------------------------------------------");

        // addLast() - добавя елемент най-отзад в стака
        stack.addLast(888);
        System.out.println("Stack after addLast operation");
        System.out.println(stack);
        System.out.println("--------------------------------------------");

        // contains() - връща булева променлива true/false, ако съдържа подадения елемент
        boolean contains = stack.contains(888);
        System.out.println("Stack contains 888? " + contains);
        System.out.println("--------------------------------------------");

        // clone() - клонира стака
        Object clonedStack = stack.clone();
        System.out.println("Cloned stack: " + clonedStack);
        System.out.println("--------------------------------------------");

        // getFirst() - връща първия елемент в стака
        int getFirst = stack.getFirst();
        System.out.println("First element in Stack: " + getFirst);
        System.out.println("--------------------------------------------");

        // getLast() - връща първия елемент в стака
        int getLast = stack.getLast();
        System.out.println("Last element in Stack: " + getLast);
        System.out.println("--------------------------------------------");

        // toString() - прави стака на стринг
        String stringStack = stack.toString();
        System.out.println("String of Stack: " + stringStack);
        System.out.println("--------------------------------------------");

        // size() - връща дължината на стака
        int stackSize = stack.size();
        System.out.println("Size of Stack is: " + stackSize);
        System.out.println("--------------------------------------------");

        // for each loop в стака
        System.out.println("Print element by element in stack through for each loop");
        for (Integer element : stack) {
            System.out.println(element);
        }
        System.out.println("--------------------------------------------");

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

        // clear() - изчиства стака, след тази операция стака е празен
        stack.clear();
        System.out.println("Stack after clear operation");
        System.out.println(stack);


    }
}
