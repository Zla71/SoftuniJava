package ComparableExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", "S550", 406, 2022,156.900);
        Car bmw = new Car("BMW", "740i", 380, 2021,138.200);
        Car audi = new Car("Audi", "A8", 390, 2023,140.650);
        Car lexus = new Car("Lexus", "LS600", 395, 2024,180.800);

        List<Car> carList = Arrays.asList(mercedes, bmw, audi, lexus);

        Collections.sort(carList);

        for (Car car : carList) {
            System.out.printf("Brand: %s, Model: %s, Power: %dhp,Year: %d, Price: $%.3f%n", car.getBrand(), car.getModel(), car.getPower(), car.getYear(), car.getPrice());
        }


    }
}
