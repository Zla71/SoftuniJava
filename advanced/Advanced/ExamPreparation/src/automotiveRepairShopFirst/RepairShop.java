package automotiveRepairShopFirst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RepairShop {

    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (this.vehicles.size() < capacity) {
            this.vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin) {
        return this.vehicles.removeIf(vehicle -> vehicle.getVIN().equals(vin));
    }

    public int getCount() {
        return this.vehicles.size();
    }

    public Vehicle getLowestMileage() {
        return this.vehicles.stream().min(Comparator.comparing(Vehicle::getMileage)).get();
    }

    public String report() {

        String output = this.vehicles.stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator()));

        return "Vehicles in the preparatory:" + System.lineSeparator() + output;
    }
}
