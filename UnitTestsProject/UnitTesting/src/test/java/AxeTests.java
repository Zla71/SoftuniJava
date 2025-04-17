import org.example.rpg_lab.Axe;
import org.example.rpg_lab.Dummy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AxeTests {

    // Ще тествам:
    // 1. Ако имам брадва с 10 точки издръжливост и атакувам - тогава точките ще станат 9
    @Test
    public void whenAxeHas10PointsDurabilityAndAttack_thenPointsWillBecome9() {

        // 3-A pattern - теоретични невидими граници, 3 смислени компонента

        // Given
        // Arrange - подготвям обектите, от които имам необходимост
        Axe axe = new Axe(2, 10);

        // When
        // Act - изпълни действието, което ще тестваш
        axe.attack(new Dummy(5, 5));

        // Then
        // Assert - изпълнява проверските
        Assertions.assertEquals(9, axe.getDurabilityPoints());

    }
    // 2. Ако имам брадва с 0 точки издръжливост и атакувам - получавам грешка IllegalStateException
    @Test
    public void whenAxeHas0PointsDurabilityAndAttack_thenExpectIllegalStateException() {

        Axe axe = new Axe(2, 0);

        //проверява дали даден код хвърля грешка
        // 2 аргумента - класа на грешката, кода, който ще хвърли тази грешка
        Assertions.assertThrows(IllegalStateException.class, () ->
            axe.attack(new Dummy(5, 5))
        );
    }

    @Test
    public void testAxeConstructor() {
        Axe axe = new Axe(2, 10);

        Assertions.assertEquals(2, axe.getAttackPoints());
        Assertions.assertEquals(10, axe.getDurabilityPoints());
    }

}
