import java.util.*;

public class _03_VoinaNumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerCards = new LinkedHashSet<>();

        // попълване на първия сет с числа
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(number -> firstPlayerCards.add(number));
//        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(firstPlayerCards::add);

        Set<Integer> secondPlayerCards = new LinkedHashSet<>();

        // попълване на втория сет с числа
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(number -> secondPlayerCards.add(number));
//        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(secondPlayerCards::add);

        int rounds = 50;

        while (rounds > 0 && !firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {

            // итератора с метод next() дава следващия елемент, докато има такива в колекцията
            int firstPlayerCard =  firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstPlayerCard);

            // итератора с метод next() дава следващия елемент, докато има такива в колекцията
            int secondPlayerCard =  secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard) {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }

            rounds--;
        }

        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            System.out.println("First player win!");
        } else if (firstPlayerCards.size() < secondPlayerCards.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
