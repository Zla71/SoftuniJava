package Demo;

public class Main {

    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", 450);
        Car bmw = new Car("BMW", 408);
        Car audi = new Car("AUDI", 399);
        Car toyota = new Car("Toyota", 250);
        Car nissan = new Car("Nissan", 220);
        Car hyundai = new Car("Hyundai", 199);

        CarGarage overdrive = new CarGarage("Overdrive", 5);

        overdrive.addCar(mercedes);
        overdrive.addCar(bmw);
        overdrive.addCar(toyota);

        System.out.println(overdrive.getCount());

        overdrive.addCar(audi);
        overdrive.addCar(nissan);
        overdrive.addCar(hyundai);

        System.out.println(overdrive.getCount());

        System.out.println(overdrive.getMostPowerfulCar());

        Car chosenMercedes = overdrive.getCarByModel("Mercedes");
        Car chosenSkoda = overdrive.getCarByModel("Skoda");

        System.out.println(chosenMercedes);
        System.out.println(chosenSkoda);


    }
}
