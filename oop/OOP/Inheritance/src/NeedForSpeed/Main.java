package NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        FamilyCar familyCar = new FamilyCar(70, 140);
        SportCar sportCar = new SportCar(100, 600);

        System.out.println(sportCar.getFuelConsumption());
        System.out.println(sportCar.getFuel());
        sportCar.drive(10);
        System.out.println(sportCar.getFuel());
        sportCar.drive(10);
        System.out.println(sportCar.getFuel());
    }
}
