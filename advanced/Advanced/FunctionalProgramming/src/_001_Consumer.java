import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _001_Consumer {
    public static void main(String[] args) {

        // Consumer<приема>        | .accept(аргумент) --> не връща резултат

        List<String> namesList = List.of("Zlati", "Tanya", "Pavel");

        Consumer<String> printName = name -> System.out.println("Name is " + name);
        namesList.forEach(printName);


        System.out.println("-----------------------------------------------------------");

        List<String> brandsList = Arrays.asList("Mercedes", "BMW", "AUDI", "Toyota", "Volkswagen");

        Consumer<List<String>> convertToUpperCase = brands -> {
            for (int i = 0; i < brands.size(); i++) {
                brands.set(i, brandsList.get(i).toUpperCase());
            }
        };

        convertToUpperCase.accept(brandsList);
        brandsList.forEach(System.out::println);


        System.out.println("-----------------------------------------------------------");

        List<String> cities = List.of("Burgas", "Sofia", "Sozopol", "Sandanski");

        Consumer<String> printCityName = city -> System.out.println(city);
        Consumer<String> printCityLength = city -> System.out.println("Length: " + city.length());

        cities.forEach(printCityName.andThen(printCityLength));


        System.out.println("-----------------------------------------------------------");

    }
}
