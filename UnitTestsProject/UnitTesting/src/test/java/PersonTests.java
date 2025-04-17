import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTests {

    @Test
    public void typeNameZlati_thenExpectResultZlati() {
        Person person = new Person("Zlati", 34);

        String expectedName = "Zlati";

        Assertions.assertEquals(expectedName, person.getName());
    }

}