import java.util.*;

public class _01_MonsterExtermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // QUEUE - take first
        ArrayDeque<Integer> monstersQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .forEach(monstersQueue::offer);

        // STACK - take last
        ArrayDeque<Integer> strikesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .forEach(strikesStack::push);

        int killedMonsters = 0;

        while (!monstersQueue.isEmpty() && !strikesStack.isEmpty()) {
            int monster = monstersQueue.peek();
            int soldier = strikesStack.peek();

            if (soldier >= monster) {
                killedMonsters++;
                soldier -= monster;

                if (soldier == 0) {
                    strikesStack.pop();
                    monstersQueue.poll();
                } else {
                    monstersQueue.poll();
                    if (strikesStack.size() == 1) {
                        strikesStack.pop();
                        strikesStack.push(soldier);
                    } else {
                        strikesStack.pop();
                        int previousStrike = strikesStack.pop();
                        strikesStack.push(previousStrike + soldier);
                    }
                }
            } else {
                monster -= soldier;
                strikesStack.pop();
                monstersQueue.poll();
                monstersQueue.offer(monster);
            }
        }

        if (monstersQueue.isEmpty()) {
            System.out.println("All monsters have been killed!");
        }
        if (strikesStack.isEmpty()) {
            System.out.println("The soldier has been defeated.");
        }

        System.out.println("Total monsters killed: " + killedMonsters);

        scanner.close();
    }
}
