import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int litersInTank = 0;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (litersInTank + currentLiters > capacity) {
                System.out.println("Insufficient capacity!");
                continue;
            } else {
                litersInTank += currentLiters;
            }
        }
        System.out.println(litersInTank);
    }
}
