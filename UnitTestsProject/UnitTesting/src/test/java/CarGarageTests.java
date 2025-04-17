import Demo.Car;
import Demo.CarGarage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CarGarageTests {

    @Test
    public void testCarGarageConstructor() {
        CarGarage overdrive = new CarGarage("Overdrive", 5);
        Assertions.assertEquals("Overdrive", overdrive.getName());
        Assertions.assertEquals(5, overdrive.getCapacity());
        Assertions.assertFalse(overdrive.isFull());
        Assertions.assertTrue(overdrive.getCars().isEmpty());
    }

    // tests for all methods
    @Test
    public void testWhenAddCars_thenGarageIsFull() {
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
        overdrive.addCar(audi);
        overdrive.addCar(nissan);
        overdrive.addCar(hyundai);

        Assertions.assertTrue(overdrive.isFull());
    }

    @Test
    public void testCreateGarageOverdrive_thenCheckNameIsCorrect() {
        CarGarage overdrive = new CarGarage("Overdrive", 5);
        Assertions.assertEquals("Overdrive", overdrive.getName());
    }

    @Test
    public void testPut4CarsInGarage_thenCheckTheNumberIs4() {

        Car mercedes = new Car("Mercedes", 450);
        Car bmw = new Car("BMW", 408);
        Car audi = new Car("AUDI", 399);
        Car toyota = new Car("Toyota", 250);

        CarGarage overdrive = new CarGarage("Overdrive", 5);

        overdrive.addCar(mercedes);
        overdrive.addCar(bmw);
        overdrive.addCar(toyota);
        overdrive.addCar(audi);

        Assertions.assertEquals(4, overdrive.getCount());
    }

    @Test
    public void testPutMultipleCarsMercedesMostPowerful_thenMercedesIsMostPowerful() {
        Car mercedes = new Car("Mercedes", 450);
        Car bmw = new Car("BMW", 408);
        Car audi = new Car("AUDI", 399);

        CarGarage overdrive = new CarGarage("Overdrive", 5);

        overdrive.addCar(mercedes);
        overdrive.addCar(bmw);
        overdrive.addCar(audi);

        Assertions.assertEquals("Mercedes is the most powerful car with 450hp.", overdrive.getMostPowerfulCar());
    }

    @Test
    public void testFindCarByBrandMercedes_thenReturnMercedes() {
        Car mercedes = new Car("Mercedes", 450);
        Car bmw = new Car("BMW", 408);
        Car toyota = new Car("Toyota", 250);

        CarGarage overdrive = new CarGarage("Overdrive", 5);

        overdrive.addCar(mercedes);
        overdrive.addCar(bmw);
        overdrive.addCar(toyota);

        Assertions.assertEquals(mercedes, overdrive.getCarByModel("Mercedes"));
        Assertions.assertNull(overdrive.getCarByModel("Ford"));

    }

}
