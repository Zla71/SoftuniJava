package Car;

public class Seat implements Car {

    private String model;
    private String color;

    private int horsepower;
    private String countryProduced;

    public Seat(String model, String color, int horsepower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsepower;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }

    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.getModel(), this.countryProduced(), TIRES);
    }
}
