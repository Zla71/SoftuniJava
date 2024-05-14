import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int pointsTournaments = 0;
        int wins = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String status = scanner.nextLine();

            switch (status) {
                case "W":
                    pointsTournaments += 2000;
                    wins++;
                    break;
                case "F":
                    pointsTournaments += 1200;
                    break;
                case "SF":
                    pointsTournaments += 720;
                    break;

            }
        }
        double percentWins = ((double) wins / tournamentsCount) * 100;
        System.out.printf("Final points: %d%n", initialPoints + pointsTournaments);
        System.out.printf("Average points: %d%n", pointsTournaments / tournamentsCount);
        System.out.printf("%.2f%%", percentWins);
    }
}
