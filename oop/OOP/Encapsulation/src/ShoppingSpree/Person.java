package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) { // name.trim().isEmpty()
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() > money) {
//            String message = "%s can't afford %s".formatted(name, product.getName());
            String message = String.format("%s can't afford %s", name, product.getName());
            throw new IllegalArgumentException(message);
        }
        this.products.add(product);
        money -= product.getCost();
//        System.out.printf("%s bought %s".formatted(name, product.getName()));
        System.out.printf("%s bought %s",name, product.getName());
    }

    public String getName() {
        return name;
    }



}
