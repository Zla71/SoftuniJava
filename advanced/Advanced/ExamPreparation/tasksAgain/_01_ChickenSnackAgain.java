import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _01_ChickenSnackAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Stack - take last
        ArrayDeque<Integer> moneyStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(moneyStack::push);


        // QUEUE - take first
        ArrayDeque<Integer> pricesQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(pricesQueue::offer);

        int boughtFood = 0;

        while (!moneyStack.isEmpty() && !pricesQueue.isEmpty()) {

            int money = moneyStack.peek();
            int price = pricesQueue.peek();

            if (money == price) {
                boughtFood++;
                moneyStack.pop();
                pricesQueue.poll();
            } else if (money > price) {
                boughtFood++;
                money -= price;
                moneyStack.pop(); // take FIRST money out of the pocket
                int nextMoney = moneyStack.pop();
                moneyStack.push(nextMoney + money);
                pricesQueue.poll();
            } else {
                moneyStack.pop();
                pricesQueue.poll();
            }

        }

        if (boughtFood == 0) {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        } else if (boughtFood == 1) {
            System.out.println("Henry ate: 1 food.");
        } else if (boughtFood < 4) {
            System.out.printf("Henry ate: %d foods.", boughtFood);
        } else {
            System.out.printf("Gluttony of the day! Henry ate %d foods.", boughtFood);
        }

    }
}
