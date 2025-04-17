public class Car {

    private String model;
    private double fuel;
    private double fuelCostPerKm;
    private int distance;

    public Car(String model, double fuel, double fuelCostPerKm) {
        this.model = model;
        this.fuel = fuel;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distance = 0;
    }

    public String getModel() {
        return this.model;
    }

    public void drive(int kmToDrive) {

        double requiredFuel = kmToDrive * this.fuelCostPerKm;
        if (this.fuel >= requiredFuel) {
            this.fuel -= requiredFuel;
            this.distance += kmToDrive;

        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    // този метод показва по какъв начин ще изглежда обект от този клас във формата на текст
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuel, this.distance);
    }
}
