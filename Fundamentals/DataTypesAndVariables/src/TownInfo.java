import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        //"Town {town name} has population of {population} and area {area} square km.".

        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int squareMeters = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",
                townName, population, squareMeters);
    }
}
