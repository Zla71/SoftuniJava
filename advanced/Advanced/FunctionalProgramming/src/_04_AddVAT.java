import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_AddVAT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> prices = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Function<Double, Double> vatFunction = price -> price * 1.2;

        System.out.println("Prices with VAT:");

        Consumer<Double> printPrice = price -> System.out.printf("%.2f\n", price);

        // 1. вариант
//        for (Double price : prices) {
//            Double priceWithVat = vatFunction.apply(price);
//            System.out.printf("%.2f\n", priceWithVat);
//        }

        // 2. вариант
        prices.stream()
                .map(vatFunction)
                .forEach(printPrice);
    }
}

