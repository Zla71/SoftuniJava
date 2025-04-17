import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> enginesList = new ArrayList<>();
        List<Car> carsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            // V8-101 220 50
            String[] engineData = scanner.nextLine().split("\\s+");
            String model = engineData[0];
            String power = engineData[1];
            String displacement = "n/a";
            String efficiency = "n/a";
            if (engineData.length == 4) {
                displacement = engineData[2];
                efficiency = engineData[3];
            } else if (engineData.length == 3) {

                // check if first character is digit
                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = engineData[2];
                } else {
                    efficiency = engineData[2];
                }
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            enginesList.add(engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {

            // FordFocus V4-33 1300 Silver
            String[] carData = scanner.nextLine().split("\\s+");

            String carModel = carData[0];
            String engineModel = carData[1];
            String carWeight = "n/a";
            String carColor = "n/a";

            if (carData.length == 4) {
                carWeight = carData[2];
                carColor = carData[3];
            } else if (carData.length == 3) {
                if (Character.isDigit(carData[2].charAt(0))) {
                    carWeight = carData[2];
                } else {
                    carColor = carData[2];
                }
            }

            Engine engine = getEngineByModel(enginesList, engineModel);

            Car car = new Car(carModel, engine, carWeight, carColor);

            carsList.add(car);
        }

        // print result
        for (Car car : carsList) {
            System.out.println(car);
        }
    }

    private static Engine getEngineByModel(List<Engine> enginesList, String engineModel) {

        for (Engine engine : enginesList) {
            if (engine.getModel().equals(engineModel)) {
                return engine;
            }
        }
        return null;
    }
}