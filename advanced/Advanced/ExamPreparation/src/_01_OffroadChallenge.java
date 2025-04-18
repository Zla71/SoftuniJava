import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _01_OffroadChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // първоначалното гориво - Your task is to take the LAST fuel quantity
        // STACK -> push()
        ArrayDeque<Integer> fuelQuantity = new ArrayDeque<>();
        // попълване на стека
        fillArrayDeque(scanner, fuelQuantity::push);

        // допълнителният индекс - the FIRST additional consumption index
        // QUEUE -> offer()
        ArrayDeque<Integer> consumptionIndex = new ArrayDeque<>();
        // попълване на опашката
        fillArrayDeque(scanner, consumptionIndex::offer);

        // нужното гориво - FIRST amount of needed fuel
        //QUEUE -> offer()
        ArrayDeque<Integer> neededFuel = new ArrayDeque<>();
        // попълване на опашката
        fillArrayDeque(scanner, neededFuel::offer);

        int counter = 1;

        boolean reachedAltitude = true;

        while (!neededFuel.isEmpty() && reachedAltitude) {

            int fuel = fuelQuantity.pop();

            fuel = fuel - (consumptionIndex.poll() + neededFuel.poll());

            if (fuel >= 0) {
                System.out.println("John has reached: Altitude " + counter++);
            } else {
                System.out.println("John did not reach: Altitude " + counter);
                reachedAltitude = false;
            }
        }

        if (!reachedAltitude) {
            System.out.println("John failed to reach the top.");
            if (counter == 1) {
                System.out.println("John didn't reach any altitude.");
            } else {
                System.out.print("Reached altitudes: ");
                System.out.println(IntStream.range(1, counter)
                        .mapToObj(e -> "Altitude " + e)
                        .collect(Collectors.joining(", ")));
            }
        } else {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        }
    }

    public static void fillArrayDeque(Scanner scanner, Consumer<Integer> insertion) {
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(insertion::accept);
    }

}
