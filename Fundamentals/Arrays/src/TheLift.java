import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] currentState = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maximumState = 4;
        int maxSize = currentState.length * maximumState;
        int generalSumCurrentPeople = 0;

        for (int people = 0; people < currentState.length; people++) {
            int currentPeople = 0;
            int sumCurrentPeople = 0;

            int availablePlaces = maximumState - currentState[people];
            if (currentState[people] < maximumState){
                if (peopleWaiting >= availablePlaces) {
                    currentPeople = availablePlaces;
                } else  {
                    currentPeople = peopleWaiting;
                }

                currentState[people] += currentPeople;
                peopleWaiting -= currentPeople;

            } else {
                continue;
            }

            for (int j : currentState) {
                sumCurrentPeople += j;
            }

            if (sumCurrentPeople == maxSize || peopleWaiting == 0) {
                generalSumCurrentPeople = sumCurrentPeople;
                break;
            }
        }

        if (peopleWaiting == 0 && generalSumCurrentPeople < maxSize) {
            System.out.println("The lift has empty spots!");
            for (int j : currentState) {
                System.out.printf("%d ", j);
            }
        } else if (peopleWaiting > 0 && generalSumCurrentPeople == maxSize) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
            for (int j : currentState) {
                System.out.printf("%d ", j);
            }
        } else {
            for (int j : currentState) {
                System.out.printf("%d ", j);
            }
        }

    }
}
