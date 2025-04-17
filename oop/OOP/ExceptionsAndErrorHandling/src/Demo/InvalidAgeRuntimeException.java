package Demo;


// Unchecked Exception - той е пряк наследник на RuntimeException
public class InvalidAgeRuntimeException extends RuntimeException {
    public InvalidAgeRuntimeException(String message) {
        super(message);
    }

    public InvalidAgeRuntimeException() {
    }
}
