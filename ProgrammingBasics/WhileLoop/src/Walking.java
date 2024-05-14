import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int totalWalkingSteps = 0;
        String input = scanner.nextLine();

        while (!input.equals("Going home")) {

            int steps = Integer.parseInt(input);
            totalWalkingSteps += steps;

            if (totalWalkingSteps >= goal) {
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            totalWalkingSteps += stepsToHome;

        }

        if (totalWalkingSteps >= goal) {
            int diff = totalWalkingSteps - 10000;
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);
        } else {
            int diff = 10000 - totalWalkingSteps;
            System.out.printf("%d more steps to reach goal.", diff);
        }

    }
}
