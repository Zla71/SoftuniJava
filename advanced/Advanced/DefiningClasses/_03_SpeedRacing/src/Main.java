import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            // AudiA4 23 0.3
            String[] carInfo = scanner.nextLine().split("\\s+");

            String model = carInfo[0];
            double fuel = Double.parseDouble(carInfo[1]);
            double fuelCostPerKm = Double.parseDouble(carInfo[2]);

            Car car = new Car(model, fuel, fuelCostPerKm);

            cars.add(car);

        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String model = input.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(input.split("\\s+")[2]);

            Car car = getCarByModel(cars, model);
            car.drive(kmToDrive);

            input = scanner.nextLine();
        }

//        for (Car car : cars) {
//            System.out.println(car.toString());
//        }

        // автоматично извиква метода toString()
        cars.forEach(car -> System.out.println(car));

    }

    private static Car getCarByModel(List<Car> cars, String model) {
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }
}