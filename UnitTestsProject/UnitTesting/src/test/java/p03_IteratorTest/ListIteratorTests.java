package p03_IteratorTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTests {
    private static final String[] DATA = {"Peter", "Lucy", "Edmund"};
    private static final String[] SINGLE_DATA = {"Peter"};
    private static final String[] NULL_DATA = null;
    private static final String[] EMPTY_DATA = {};

    private ListIterator listIterator;

    @Before
    public void setup() throws OperationNotSupportedException {
        listIterator = new ListIterator(DATA);
    }


    @Test
    public void testConstructorInvalidElements() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                new ListIterator(NULL_DATA));
    }

    @Test
    public void testHasNextAndMove() throws OperationNotSupportedException {
        Assertions.assertTrue(listIterator.hasNext());
        Assertions.assertTrue(listIterator.move());
        Assertions.assertFalse(new ListIterator(SINGLE_DATA).move());
    }

    @Test
    public void testPrintEmptyData() {
        Assertions.assertThrows(IllegalStateException.class, () ->
                new ListIterator(EMPTY_DATA).print());
    }

    @Test
    public void testPrintElementCorrectly(){
        Assertions.assertEquals(DATA[0], listIterator.print());
    }
}
