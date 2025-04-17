package Demo;


// // Checked Exception - той е пряк наследник на Exception
public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
