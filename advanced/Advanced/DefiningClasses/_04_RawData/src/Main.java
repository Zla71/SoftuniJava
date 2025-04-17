import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            double tire1Pressure = Double.parseDouble(data[5]);
            int tire1Age = Integer.parseInt(data[6]);
            double tire2Pressure = Double.parseDouble(data[7]);
            int tire2Age = Integer.parseInt(data[8]);
            double tire3Pressure = Double.parseDouble(data[9]);
            int tire3Age = Integer.parseInt(data[10]);
            double tire4Pressure = Double.parseDouble(data[11]);
            int tire4Age = Integer.parseInt(data[12]);

            // String model, Engine engine, Cargo cargo, Tire tire

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire = new Tire(tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);
            Car car = new Car(model, engine, cargo, tire);

            carsList.add(car);
        }

        String command = scanner.nextLine();

        for (Car car : carsList) {
            if (car.getCargo().getCargoType().equals(command)) {
                if (command.equals("fragile") &&
                        car.getTire().getTire1Pressure() < 1 ||
                        car.getTire().getTire2Pressure() < 1 ||
                        car.getTire().getTire3Pressure() < 1 ||
                        car.getTire().getTire4Pressure() < 1) {

                    System.out.println(car.getModel());

                } else if (command.equals("flamable") && car.getEngine().getEnginePower() > 250) {

                    System.out.println(car.getModel());
                }
            }
        }
    }
}