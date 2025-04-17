import Demo.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTests {

    // да тествам конструктора
    // да тествам марката и модела
    // да тествам toString() метода

    @Test
    public void testCarConstructor() {
        Car mercedes = new Car("Mercedes", 450);

        Assertions.assertEquals("Mercedes", mercedes.getBrand());
        Assertions.assertEquals(450, mercedes.getHorsepower());
    }

    @Test
    public void whenCreateCarMercedesWith450Hp_thenToStringShowsInformationAboutCar() {
        Car mercedes = new Car("Mercedes", 450);

        Assertions.assertEquals("Mercedes with 450hp.", mercedes.toString());

    }

}
