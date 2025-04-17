package PizzaCaloriesAgain;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (name == null || name.isBlank() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
//        double sumCalories = 0;
//
//        for (Topping topping : toppings) {
//            sumCalories += topping.calculateCalories();
//        }

//        return sumCalories + dough.calculateCalories();

        double sumToppingCalories = toppings.stream().mapToDouble(Topping::calculateCalories).sum();
        double sumDoughCalories = dough.calculateCalories();

        return sumDoughCalories + sumToppingCalories;
    }
}
