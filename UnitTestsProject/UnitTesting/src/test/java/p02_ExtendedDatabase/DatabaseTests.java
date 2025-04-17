package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.OperationNotSupportedException;

public class DatabaseTests {
    private static final Person[] PEOPLE = {new Person(1, "Ivan"), new Person(2, "Peter"), new Person(3, "Lucy")};
    private static final Person[] EMPTY_PEOPLE = new Person[0];
    private static final Person[] HUGE_PEOPLE = new Person[17];
    private static final Person VALID_PERSON = new Person(7, "Miro");
    private static final Person INVALID_PERSON = null;
    private static final String INVALID_USERNAME = null;
    private static final Person WRONG_USER = new Person(11, "Maria");
    private static Database database;

    @Before
    public void setup() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }

    @Test
    public void testConstructorCreateValidObject() {
        Assertions.assertArrayEquals(PEOPLE, database.getElements());
    }

    @Test
    public void testConstructorThrowsExceptionForEmptyArray() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                new Database(EMPTY_PEOPLE));
    }

    @Test
    public void testConstructorThrowsExceptionForHugeArray() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                new Database(HUGE_PEOPLE));
    }

    @Test
    public void testAddValidPerson() throws OperationNotSupportedException {
        database.add(VALID_PERSON);
        Assertions.assertEquals(PEOPLE.length + 1, database.getElements().length);
        Assertions.assertEquals(database.getElements()[database.getElements().length - 1], VALID_PERSON);
    }

    @Test
    public void testAddInvalidPerson() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                database.add(INVALID_PERSON));
    }

    @Test
    public void testRemoveFromValidDatabase() throws OperationNotSupportedException {
        database.remove();
        Assertions.assertNotEquals(PEOPLE[PEOPLE.length - 1], database.getElements()[database.getElements().length - 1]);
        Assertions.assertEquals(PEOPLE.length - 1, database.getElements().length);
    }

    @Test
    public void testRemoveFromEmptyDatabase() throws OperationNotSupportedException {
        int iterations = database.getElements().length;
        for (int i = 0; i < iterations; i++) {
            database.remove();
        }
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                database.remove());
    }

    @Test
    public void testGetElements() {
        Assertions.assertArrayEquals(PEOPLE, database.getElements());
    }

    @Test
    public void testFindWithValidUsername() throws OperationNotSupportedException {
        Person person = database.findByUsername(PEOPLE[0].getUsername());
        Assertions.assertEquals(PEOPLE[0], person);
    }

    @Test
    public void testFindWithNullUsernameThrowsException() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                database.findByUsername(INVALID_USERNAME));
    }

    @Test
    public void testFindWithWrongUsernameThrowsException()  {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                database.findByUsername(WRONG_USER.getUsername()));
    }

    @Test
    public void testFindWithValidId() throws OperationNotSupportedException {
        Person person = database.findById(PEOPLE[0].getId());
        Assertions.assertEquals(PEOPLE[0], person);
    }

    @Test    public void testFindWithNotExistingId() {
        Assertions.assertThrows(OperationNotSupportedException.class, () ->
                database.findById(WRONG_USER.getId()));
    }
}
