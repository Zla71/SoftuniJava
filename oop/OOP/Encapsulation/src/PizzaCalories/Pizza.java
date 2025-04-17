package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setToppings(int numberOfToppings) {
        //"Number of toppings should be in range [0..10].".
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        // списъка ще бъде с брой топинги
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    private void setName(String name) {
        // "Pizza name should be between 1 and 15 symbols.".
        if (name == null || name.isEmpty() || name.isBlank() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {

        // 1. начин
//        double sumCalToppings = 0;
//
//        for (Topping topping : toppings) {
//            sumCalToppings += topping.calculateCalories();
//        }
//
//        return this.dough.calculateCalories() + sumCalToppings;


        // 2. начин
        return this.dough.calculateCalories() + toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }

}
