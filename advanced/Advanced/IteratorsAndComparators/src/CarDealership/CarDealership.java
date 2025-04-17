package CarDealership;

import java.util.Iterator;

public class CarDealership implements Iterable<Car>{

    private Car[] cars;

    // Car... -> VARARGS
    public CarDealership(Car... cars) {
        this.cars = cars;
    }

    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator<Car> {

        int index = 0;

        public boolean hasNext() {
            return index < cars.length;
        }

        public Car next() {
            Car car = cars[index];
            index++;
            return car;
        }
    }
}
