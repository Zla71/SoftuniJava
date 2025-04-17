import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class _001_Predicate {
    public static void main(String[] args) {

        // Predicate<приема>       | .test(аргумент)   --> връща BOOLEAN

        List<String> namesList = List.of("Zlati", "Tatyana", "Pavel", "Toshko", "Tisho", "Toshkov");

        Predicate<String> statsWithT = name -> name.startsWith("T");
        Function<String, String> toUpperCase = name -> name.toUpperCase(); // добавяне на функция за проба
        Predicate<String> specificLength = name -> name.length() > 6;


        List<String> filteredNames = namesList.stream()
                .filter(statsWithT) // премахване на имената Zlati & Pavel
                .filter(specificLength) // добавяне на още един филтър за дължина, който премахва Toshko & Tisho
                .map(toUpperCase) // добавяне на функция, която прави имената с главни букви TATYANA & TOSHKOV
                .collect(Collectors.toList()); // създава колекцията

        filteredNames.forEach(System.out::println); // принтира всяко име след филтрите и промените


        System.out.println("-----------------------------------------------------------");

        List<Integer> numbersList = List.of(1, 2 ,3, 4, 5, 6, 7);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> evenNumbersList = numbersList.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.print("Even numbers of numberList are: ");
        evenNumbersList.forEach(number -> System.out.print(number + " "));
        System.out.println();


        System.out.println("-----------------------------------------------------------");
        System.out.println("Пример с комбиниране на условия");

        List<String> brandsList = Arrays.asList("Mercedes", "BMW", "AUDI", "Toyota", "Volkswagen"
                , "Tata", "Maserati", "Malaguti"
                , "Momo", "Mazda", "McLaren", "MG"
                , "Mini", "Mitsubishi");

        Predicate<String> startsWithM = brand -> brand.startsWith("M");
        Predicate<String> brandLength = brand -> brand.length() > 5;
        Function<String, String> brandToUpperCase = brand -> brand.toUpperCase();
        Function<String, String> addInformation = brand -> String.format("%s sold", brand);

        List<String> filteredBrands = brandsList.stream()
                .filter(startsWithM.and(brandLength))
                .map(brandToUpperCase.andThen(addInformation))
                .collect(Collectors.toList());


        filteredBrands.forEach(brand -> System.out.println(brand.toUpperCase()));
    }
}
