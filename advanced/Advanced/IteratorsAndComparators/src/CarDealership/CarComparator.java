package CarDealership;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    public int compare(Car car1, Car car2) {

        return Integer.compare(car1.getYear(), car2.getYear());
    }
}
