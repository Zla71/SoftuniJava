import Demo.InvalidAgeRuntimeException;

public class ExceptionsAndErrorHandlingExamples {
    public static void main(String[] args) {

        // examples in Demo.MainDemo

//        int[] numbers = new int[5];
//        System.out.println(numbers[5]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

//        int number = Integer.parseInt(null); // Exception in thread "main" java.lang.NumberFormatException: Cannot parse null string
//        System.out.println(number);

        // Класа Throwable Class е бащата на всички exception-и ----------

        // 1. Error - examples StackOverflowError, OutOfMemoryError

        // този тип грешки не са предназначени за обработка

        // examples:

//        List<int[]> numbers = new ArrayList<>();
//
//        while (true) {                                 // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//                                                       // at ExceptionsAndErrorHandlingExamples.main(ExceptionsAndErrorHandlingExamples.java:21)
//            numbers.add(new int[1000000]);
//        }

//        a(); // Exception in thread "main" java.lang.StackOverflowError
             // at ExceptionsAndErrorHandlingExamples.a(ExceptionsAndErrorHandlingExamples.java:34)

        // 2. Exception - можем да ги обработим

//        System.out.println(10 / 0);  // Exception in thread "main" java.lang.ArithmeticException: / by zero

//        try {
//            System.out.println(10 / 0);                             // It's impossible to delete by zero!
//        } catch (ArithmeticException arithmeticException) {
//            System.out.println("It's impossible to delete by zero!");
//        }


    // examples in Demo.MainDemo

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

        // 2. a) Throwing exceptions

        int personAge = -15;

        // само обекти от Throwable класа и инстанции на дъщерните класове могат да се хвърлят от Java виртуалната машина
        if (personAge < 0) {
            throw new InvalidAgeRuntimeException("Age should be positive number"); // Exception in thread "main" Demo.InvalidAgeException: Age should be positive number
                                                                            // at ExceptionsAndErrorHandlingExamples.main(ExceptionsAndErrorHandlingExamples.java:65)
        }


    }

    public static void a() {
        a();
    }
}