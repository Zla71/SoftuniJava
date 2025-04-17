import org.example.LuckyWheel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

public class LuckyWheelTests {


    // 1. Ако заложа 5 лева и получа 100                    - тогава печеля 500 лева
    @Test
    public void whenRisk5LevaAndLuckyNumberIs100_thenWin500Leva() {

        // new Random()                     - обикновен обект
        // Mockito.mock(Random.class)       - мокнат обект, който лесно мога да манипулирам
        Random random = Mockito.mock(Random.class);
        LuckyWheel luckyWheel = new LuckyWheel(random);

        // казваме на рандом да избере точно 100
        Mockito.when(random.nextInt()).thenReturn(100);

        int win = luckyWheel.riskAndWin(5);
        Assertions.assertEquals(500, win);
    }

    // 2. Ако заложа 5 лева и получа 2                      - тогава печеля 10 лева
    @Test
    public void whenRisk5LevaAndLuckyNumberIs2_thenWin10Leva() {
        Random random = Mockito.mock(Random.class);
        LuckyWheel luckyWheel = new LuckyWheel(random);

        // казваме на рандом да избере точно 2
        Mockito.when(random.nextInt()).thenReturn(2);

        int win = luckyWheel.riskAndWin(5);
        Assertions.assertEquals(10, win);
    }

    // 3. Ако заложа 5 лева и получа различно от 2 и 100    - тогава печеля 4 лева
    @Test
    public void whenRisk5LevaAndLuckyNumberIsRandom_thenLose1Leva() {
        Random random = Mockito.mock(Random.class);
        LuckyWheel luckyWheel = new LuckyWheel(random);

        Mockito.when(random.nextInt()).thenReturn(33);

        int win = luckyWheel.riskAndWin(5);
        Assertions.assertEquals(4, win);
    }
}
