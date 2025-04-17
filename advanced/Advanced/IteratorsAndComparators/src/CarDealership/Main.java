package CarDealership;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "S550", 430, 58000, 2021);
        Car car2 = new Car("BMW", "750i", 405, 60000, 2022);
        Car car3 = new Car("Audi", "A8", 390, 52000, 2020);

        CarDealership sofAuto = new CarDealership(car1, car2, car3);

        ///////////////////////// пример за Iterator/Iterable
        System.out.println("Example for Iterator/Iterable:");
        System.out.println("Print each car by iterating through class Car:");
        for (Car car : sofAuto) {
            System.out.print(car);
        }

        System.out.println();

        ///////////////////////// пример за Comparable
        List<Car> cars = Arrays.asList(car1, car2, car3);

        // сортиране по horsepower във възходящ ред
        Collections.sort(cars);

        System.out.println("Example for Comparable:");
        System.out.println("Sorted by horsepower by ascending order:");
        for (Car car : cars) {
            System.out.print(car);
        }

        System.out.println();

        // сортиране по horsepower в низходящ ред
        Collections.sort(cars.reversed());

        System.out.println("Sorted by horsepower by descending order:");
        for (Car car : cars) {
            System.out.print(car);
        }

        System.out.println();

        ///////////////////////// пример за Comparator

        CarComparator carComparator = new CarComparator();

        int result = carComparator.compare(car1, car3);

        System.out.println("Example for Comparator class:");
        if (result == 0) {
            System.out.println(car1 + " is the same year as " + car3);
        } else if (result < 0) {
            System.out.println(car1 + " is older than " + car3);
        } else {
            System.out.println(car3 + " is older than " + car1);
        }
    }
}
