package p01_Database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTests {

    private static final Integer[] NUMBERS = {2, 23, 54};
    private static final Integer[] EMPTY_NUMBERS = new Integer[0];
    private static final Integer[] HUGE_NUMBERS = new Integer[17];

    private static final Integer VALID_ELEMENT = 15;
    private static final Integer INVALID_ELEMENT = null;
    private static Database database;


    @BeforeEach
    public void setup() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testConstructorCreateValidObject() {
        Assertions.assertArrayEquals(NUMBERS, database.getElements());
    }

    @Test
    public void testConstructorThrowsExceptionForEmptyArray() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                new Database(EMPTY_NUMBERS));
    }

    @Test()
    public void testConstructorThrowsExceptionForHugeArray(){
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                new Database(HUGE_NUMBERS));
    }

    @Test
    public void testAddInvalidElement() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                database.add(INVALID_ELEMENT));
    }

    @Test
    public void testAddValidNumber() throws OperationNotSupportedException {
        database.add(VALID_ELEMENT);
        Assertions.assertEquals(NUMBERS.length + 1, database.getElements().length);

    }

    @Test
    public void testRemoveElementFromValidDatabase() throws OperationNotSupportedException {
        database.remove();
        Assertions.assertEquals(NUMBERS.length - 1, database.getElements().length);
        Assertions.assertEquals(NUMBERS[NUMBERS.length - 2], database.getElements()[database.getElements().length - 1]);
    }

    @Test
    public void testRemoveElementFromEmptyDatabase() throws OperationNotSupportedException {
        int iterations = database.getElements().length;
        for (int i = 1; i <= iterations; i++) {
            database.remove();
        }
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                database.remove());
    }

}
