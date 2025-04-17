import java.util.*;
import java.util.stream.Collectors;

public class _01_RapidCourier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // STACK - take last
        ArrayDeque<Integer> packagesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(packagesStack::push);

        // QUEUE - take first
        ArrayDeque<Integer> couriersQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(couriersQueue::offer);

        int totalWeightPackages = 0;

        while (!packagesStack.isEmpty() && !couriersQueue.isEmpty()) {

            int currentPackageWeight = packagesStack.pop();
            int currentCourierCapacity = couriersQueue.poll();

            if (currentCourierCapacity >= currentPackageWeight) {
                if (currentCourierCapacity > currentPackageWeight) {
                    currentCourierCapacity -= currentPackageWeight * 2;
                    if (currentCourierCapacity > 0) {
                        couriersQueue.offer(currentCourierCapacity);
                    }
                }
                totalWeightPackages += currentPackageWeight;
            } else {
                currentPackageWeight -= currentCourierCapacity;
                packagesStack.push(currentPackageWeight);
                totalWeightPackages += currentCourierCapacity;
            }
        }

        System.out.printf("Total weight: %d kg%n", totalWeightPackages);

        if (packagesStack.isEmpty() && couriersQueue.isEmpty()) {
            System.out.println("Congratulations, all packages were delivered successfully by the couriers today.");
        }
        if (!packagesStack.isEmpty() && couriersQueue.isEmpty()) {
            List<Integer> reversedStack = new ArrayList<>(packagesStack);
            Collections.reverse(reversedStack);
            String output = reversedStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Unfortunately, there are no more available couriers to deliver the following packages: " + output);
        }

        if (!couriersQueue.isEmpty() && packagesStack.isEmpty()) {
            String output = couriersQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("Couriers are still on duty: %s but there are no more packages to deliver.", output);
        }
    }
}
