package automotiveRepairShopFirst;

public class Vehicle {

    private String VIN;
    private  int mileage;
    private String damage;

    public Vehicle(String VIN, int mileage, String damage) {
        this.VIN = VIN;
        this.mileage = mileage;
        this.damage = damage;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getVIN() {
        return VIN;
    }

    public int getMileage() {
        return mileage;
    }

    public String getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return String.format("Damage: %s, Vehicle: %s (%d km)", this.damage, this.VIN, this.mileage);
    }
}
