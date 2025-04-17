package Demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarGarage {

    private String name;
    private boolean isFull = false;
    private int capacity;
    private List<Car> cars;

    public CarGarage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        if (!isFull) {
            this.cars.add(car);
        } else {
            System.out.printf("%s is full. %s can not get in. Try again later.%n", this.name, car.getBrand());
        }

        if (capacity == this.cars.size()) {
            this.isFull = true;
        }
    }

    public String getMostPowerfulCar() {

        Car mostPowerfulCar = this.cars.stream().max(Comparator.comparing(Car::getHorsepower)).get();

        return String.format("%s is the most powerful car with %dhp.", mostPowerfulCar.getBrand(), mostPowerfulCar.getHorsepower());
    }

    public Car getCarByModel(String brand) {

        return this.cars.stream().filter(tank -> tank.getBrand().equals(brand)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.cars.size();
    }

}
