import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTests {


    // Тестове:
    // обикновен void метод с анотация @Test
    // - името на този метод трябва да е много описателно

    // ще тествам:
    // 1: ако добавя 2 и 2, трябва да получа 4
    @Test
    public void whenSumTwoAndTwo_thenExpectResultFour() {

        int resultSum = Calculator.sum(2, 2);
        int expectedValue = 4;

        // проверявам дали резултата от този метод е това, което очаквам
        // Assertions
        Assertions.assertEquals(expectedValue, resultSum);
    }

    // 2: ако добавя 8 и 2, трябва да получа 10
    @Test
    public void whenSumEightAndTwo_thenExpectResultTen() {
        int result = Calculator.sum(8, 2);

        // първо очакваната стойност, а след това резултата
        Assertions.assertEquals(10, result);
    }

    // параметеризирани тестове --- parameterized tests
    @ParameterizedTest
    @MethodSource("calculatorParameters") // ---> public static Stream<Arguments> calculatorParameters()
    public void whenSumTwoNumbers_thenExpectCorrectResult(int a, int b, int expectedResult) {
        int actualResult = Calculator.sum(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> calculatorParameters() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(2, 4, 6),
                Arguments.of(4, 4, 8),
                Arguments.of(4, 6, 10)
        );
    }



}
