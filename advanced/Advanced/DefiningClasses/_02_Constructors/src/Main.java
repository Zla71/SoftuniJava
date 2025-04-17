import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");

            if (info.length == 3) {
                String brand = info[0];
                String model = info[1];
                int horsePower = Integer.parseInt(info[2]);

                Car car = new Car(brand, model, horsePower);
                System.out.println(car.carInfo());

            } else {
                String brand = info[0];

                Car car = new Car(brand);
                System.out.println(car.carInfo());
            }
        }
    }
}