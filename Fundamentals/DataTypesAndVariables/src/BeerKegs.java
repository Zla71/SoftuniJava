import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double biggestKegValue = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double size = (Math.PI * (radius * radius) * height);
            if (size > biggestKegValue) {
                biggestKegValue = size;
                biggestKeg = model;
            }
        }

        System.out.println(biggestKeg);
    }
}
