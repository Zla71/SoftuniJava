package ShoppingSpreeAgain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        String[] peopleData = scanner.nextLine().split(";");
        String[] productData = scanner.nextLine().split(";");

        for (String currentPerson : peopleData) {
            String name = currentPerson.split("=")[0];
            int money = Integer.parseInt(currentPerson.split("=")[1]);
            Person person = new Person(name, money);
            people.add(person);
        }

        for (String currentProduct : productData) {
            String name = currentProduct.split("=")[0];
            int cost = Integer.parseInt(currentProduct.split("=")[1]);
            Product product = new Product(name, cost);
            products.add(product);
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            String personName = command.split("\\s+")[0];
            String productName = command.split("\\s+")[1];

            Person currentPerson = people.stream().filter(p -> p.getName().equals(personName)).findFirst().get();
            Product currentProduct = products.stream().filter(p -> p.getName().equals(productName)).findFirst().get();

            currentPerson.buyProduct(currentProduct);

            command = scanner.nextLine();
        }

    }
}
