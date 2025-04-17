package p04_BubbleSortTest;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BubbleSortTests {

    private static final int[] NUMBERS = {23, 4, 3, 1, 7, 56, 22, 9};
    private static final int[] EXPECTED = {1, 3, 4, 7, 9, 22, 23, 56};

    @Test
    public void testBubbleSort() {
        Bubble.sort(NUMBERS);
        Assertions.assertArrayEquals(EXPECTED, NUMBERS);
    }
}
