import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int movieLength = Integer.parseInt(scanner.nextLine());
        int lunchTime = Integer.parseInt(scanner.nextLine());

        double eating = lunchTime * 0.125;
        double relax = lunchTime * 0.25;

        double leftTime = lunchTime - eating - relax;

        if (leftTime >= movieLength) {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",
                    movieName, (int) Math.ceil(leftTime - movieLength));
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",
                    movieName, (int) Math.ceil(movieLength - leftTime));
        }
    }
}
