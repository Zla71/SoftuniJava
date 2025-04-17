package Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) throws IOException, InvalidAgeException {

        try { // try to run this code
            System.out.println(10 / 0); // impossible example
        } catch (ArithmeticException arithmeticException) { // run this code when there is an exception
            System.out.println("It's impossible to delete by zero!");  // It's impossible to delete by zero!
        } finally { // Always run this code
            System.out.println("This will be printed always!"); // винаги ще се изпълни
        }

        int numberExample = 5;

//        // program will stop
//        if (numberExample < 6) {
//            throw new IllegalArgumentException("Number should be minimum 6");
//            // Exception in thread "main" java.lang.IllegalArgumentException: Number should be minimum 5
//        }



//        try {
//            Integer.parseInt("za");
//        } catch (IllegalArgumentException e) {
//            // обработвам грешката
//            System.out.println(e.getMessage());
//            // хвърлям грешката и програмата приключва своето действие!
//            throw e;
//        } finally { // винаги ще принтира този ред, независимо дали съм хванал грешка, или не
//            System.out.println("Program finished");
//        }

        // метода хвърля грешка  throws IOException

//        BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));
//        writer.write("example");

        // Throwing exceptions

        // създаване на наши класове, които хвърлят грешки

        int personAge = -15;

        // само обекти от Throwable класа и инстанции на дъщерните класове могат да се хвърлят от Java виртуалната машина
        if (personAge < 0) {
                // хвърлям exception, който е наследник на класа Exception
            throw new InvalidAgeRuntimeException("Age should be a positive number!"); // Exception in thread "main" Demo.InvalidAgeException: Age should be a positive number!
                                                                                    // at Demo.MainDemo.main(MainDemo.java:52)
        }

        // при този клас InvalidAgeException трябва да сложа ексепшъна горе в метода, за да може да обработи грешката
        if (personAge < 0) {
            throw new InvalidAgeException();
        }

        // когато мой клас наследи:
        // RuntimeException -> unchecked exception - не задължаваме метода да обработи тази грешка
        // Exception -> check exception - задължава метода да обработи грешката
    }
}
