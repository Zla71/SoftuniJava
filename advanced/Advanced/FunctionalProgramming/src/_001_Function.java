import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _001_Function {
    public static void main(String[] args) {

        // Function<приема, връща> | .apply(аргумент)  --> връща резултат

        List<String> namesList = List.of("Zlati", "Tatyana", "Pavel");

        Function<String, Integer> stringLength = name -> name.length();

        List<Integer> namesLength = namesList.stream()
                .map(stringLength)
                .toList();

        namesLength.forEach(length -> System.out.println(length));


        System.out.println("-----------------------------------------------------------");

        List<String> brandsList = Arrays.asList("Mercedes", "BMW", "AUDI", "Toyota", "Volkswagen");

        Function<String, String> brandsNamesToUpperCase = brandName -> brandName.toUpperCase();

        List<String> upperCaseBrands = brandsList.stream()
                .map(brandsNamesToUpperCase)
                .collect(Collectors.toList());

        upperCaseBrands.forEach(System.out::println);


        System.out.println("-----------------------------------------------------------");

        List<String> citiesNamesList = List.of("Burgas", "Sofia", "Sozopol", "Sandanski");

        Function<String, String> citiesUppercase = cityName -> cityName.toUpperCase();
        Function<String, Integer> citiesNameLength = cityName -> cityName.length();
        Function<String, Integer> upperCaseLength = citiesUppercase.andThen(citiesNameLength);

        List<Integer> upperCaseCityNameLength = citiesNamesList.stream()
                .map(upperCaseLength)
                .collect(Collectors.toList());

        upperCaseCityNameLength.forEach(System.out::println);


        System.out.println("-----------------------------------------------------------");

        Function<Integer, Integer> func = x -> x * x;
        int number = 5;
        int result = func.apply(number);
        System.out.printf("%d * %d = %d%n", number, number, result);


        System.out.println("-----------------------------------------------------------");

        Function<List<Integer>, Integer> sumNumbers = list -> {
            int sum = 0;
            for (Integer num : list) {
                sum += num;
            }
            return sum;
        };

        List<Integer> numbersList = List.of(5, 8, 10);
        System.out.println("Sum of sumNumbers: " + sumNumbers.apply(numbersList));

    }
}
