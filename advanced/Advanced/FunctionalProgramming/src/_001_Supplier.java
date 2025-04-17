import java.util.Random;
import java.util.function.Supplier;

public class _001_Supplier {
    public static void main(String[] args) {

        // Supplier<връща>   | .get()   --> връща резултат

        Supplier<Integer> randomInt = () -> new Random().nextInt(100);

        System.out.println("На това извикване произволното число е: " + randomInt.get());
        System.out.println("На това извикване произволното число е: " + randomInt.get());
        System.out.println("На това извикване произволното число е: " + randomInt.get());


        System.out.println("-----------------------------------------------------------");

        Supplier<String> defaultStringSupplier = () -> "Default string";

        System.out.println(defaultStringSupplier.get());
        System.out.println(defaultStringSupplier.get());
        System.out.println(defaultStringSupplier.get());

    }
}
