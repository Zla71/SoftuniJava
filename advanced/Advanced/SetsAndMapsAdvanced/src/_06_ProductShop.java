import java.util.*;

public class _06_ProductShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashMap<String, String>> shop = new TreeMap<>();

        while (true) {
            String[] commandArr = scanner.nextLine().split(", ");
            String shopName = commandArr[0];

            if (shopName.equals("Revision")) {
                printInformation(shop);
                break;
            }

            String product = commandArr[1];
            String price = commandArr[2];

            // добавя магазина, ако го няма със стойност срещу ключа празен LinkedHashMap
            shop.putIfAbsent(shopName, new LinkedHashMap<>());

            // магазина вече е в TreeMap-а shop и сега добавя продукта и неговата цена в LinkedHashMap-а
            shop.get(shopName).putIfAbsent(product, price);
        }
    }

    private static void printInformation(Map<String, LinkedHashMap<String, String>> shop) {
        for (Map.Entry<String, LinkedHashMap<String, String>> entry : shop.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            for (Map.Entry<String, String> nestedEntry : entry.getValue().entrySet()) {
                String currentProduct = nestedEntry.getKey();
                double currentPrice = Double.parseDouble(nestedEntry.getValue());
                System.out.printf("Product: %s, Price: %.1f%n", currentProduct, currentPrice);
            }
        }
    }
}
