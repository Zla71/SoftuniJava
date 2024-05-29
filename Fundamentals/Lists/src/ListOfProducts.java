import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currentProduct = scanner.nextLine();
            products.add(currentProduct);
        }
        int number = 1;
        Collections.sort(products);
        for (String currentProduct : products) {

            System.out.printf("%d.%s%n", number, currentProduct);
            number++;
        }
    }
}
