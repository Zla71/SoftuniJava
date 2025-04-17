package CarDealership;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int power;
    private double price;
    private int year;

    public Car(String brand, String model, int power, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    public int getYear() {
        return year;
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

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("Brand: %s; Model: %s; Horsepower: %d; Price: %.2f; Year:%d%n"
                , this.brand, this.model, this.power, this.price, this.year);
    }

    public int compareTo(Car otherCar) {
        return Integer.compare(this.power, otherCar.power);
    }

}
