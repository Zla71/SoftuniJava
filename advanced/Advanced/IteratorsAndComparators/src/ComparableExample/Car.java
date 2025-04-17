package ComparableExample;

public class Car implements Comparable<Car> {

    private String brand;
    private String model;
    private int power;
    private int year;
    private double price;

    public Car(String brand, String model, int power, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int compareTo(Car otherCar) {

        // compared to power
//        return Integer.compare(this.power, otherCar.power);

        // compared to year
//        return Integer.compare(this.year, otherCar.year);

        // compared to price
//        return Double.compare(this.price, otherCar.price);

        // compared to brand
        return this.brand.compareTo(otherCar.brand);

    }

}
