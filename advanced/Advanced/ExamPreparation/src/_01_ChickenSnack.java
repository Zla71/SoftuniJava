import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _01_ChickenSnack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //9 5 8 18 stack (LIFO)
        //18 12 10 5 queue (FIFO)

        // първи ред с парите на Хенри
        ArrayDeque<Integer> myMoneyStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(myMoneyStack::push);

        // втори ред с цените на храната
        ArrayDeque<Integer> foodPriceQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(foodPriceQueue::offer);

        int foodNumber = 0;

        while (!myMoneyStack.isEmpty() && !foodPriceQueue.isEmpty()) {

            int currentMoney = myMoneyStack.pop();
            int currentPrice = foodPriceQueue.poll();

            if (currentPrice == currentMoney) {
                foodNumber++;
            } else if (currentMoney > currentPrice) {
                foodNumber++;
                if (!foodPriceQueue.isEmpty() || !myMoneyStack.isEmpty()) {
                    // 9 (парите на Хенри) - 4 (цената на храната) = 5 (ресто)
                    int change = currentMoney - currentPrice;
                    int nextMoneyAmount = myMoneyStack.pop();
                    myMoneyStack.push(nextMoneyAmount + change);
                }
            }
        }

        if (foodNumber > 1 && foodNumber < 4) {
            System.out.printf("Henry ate: %d foods.", foodNumber);
        } else if (foodNumber >= 4) {
            System.out.printf("Gluttony of the day! Henry ate %d foods.", foodNumber);
        } else if (foodNumber == 1) {
            System.out.printf("Henry ate: 1 food.");
        } else {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }

    }
}
