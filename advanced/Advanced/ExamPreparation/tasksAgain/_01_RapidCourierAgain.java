import java.util.*;
import java.util.stream.Collectors;

public class _01_RapidCourierAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // STACK - take last
        ArrayDeque<Integer> packagesWeightStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(packagesWeightStack::push);

        // QUEUE - take first
        ArrayDeque<Integer> couriersCapacityQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(couriersCapacityQueue::offer);

        int totalWeight = 0;

        while (!packagesWeightStack.isEmpty() && !couriersCapacityQueue.isEmpty()) {
            int currentWeight = packagesWeightStack.peek();
            int currentCapacity = couriersCapacityQueue.peek();

            if (currentCapacity >= currentWeight) {
                if (currentCapacity > currentWeight) {
                    currentCapacity -= currentWeight * 2;
                    if (currentCapacity > 0) {
                        couriersCapacityQueue.poll();
                        couriersCapacityQueue.offer(currentCapacity);
                    } else {
                        couriersCapacityQueue.poll();
                    }
                    totalWeight += currentWeight;
                    packagesWeightStack.pop();
                } else {
                    couriersCapacityQueue.poll();
                    totalWeight += currentWeight;
                    packagesWeightStack.pop();
                }
            } else {
                currentWeight -= currentCapacity;
                packagesWeightStack.pop();
                packagesWeightStack.push(currentWeight);
                couriersCapacityQueue.poll();
                totalWeight += currentCapacity;
            }

        }

        System.out.printf("Total weight: %d kg%n", totalWeight);

        if (packagesWeightStack.isEmpty() && couriersCapacityQueue.isEmpty()) {
            System.out.println("Congratulations, all packages were delivered successfully by the couriers today.");
        }

        if (!packagesWeightStack.isEmpty() && couriersCapacityQueue.isEmpty()) {
            List<Integer> reversedStack = new ArrayList<>(packagesWeightStack);
            Collections.reverse(reversedStack);
            String output = reversedStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Unfortunately, there are no more available couriers to deliver the following packages: " + output);
        }

        if (packagesWeightStack.isEmpty() && !couriersCapacityQueue.isEmpty()) {
            String output = couriersCapacityQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Couriers are still on duty: " + output + "but there are no more packages to deliver.");
        }

    }
}
