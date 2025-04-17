package Demo;

public class Car {

    private String brand;
    private int horsepower;

    public Car(String brand, int horsepower) {
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("%s with %dhp.", this.brand, this.horsepower);
    }

}
