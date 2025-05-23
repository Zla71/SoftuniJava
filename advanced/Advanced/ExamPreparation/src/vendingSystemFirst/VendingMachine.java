package vendingSystemFirst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VendingMachine {

    private int buttonCapacity;
    private List<Drink> drinks;

    public VendingMachine(int buttonCapacity) {
        this.buttonCapacity = buttonCapacity;
        this.drinks = new ArrayList<>();
    }

    public int getCount() {
        return this.drinks.size();
    }

    public void addDrink(Drink drink) {
        if (this.drinks.size() < buttonCapacity) {
            this.drinks.add(drink);
        }
    }

    public boolean removeDrink(String name) {
        return this.drinks.removeIf(drink -> drink.getName().equals(name));
    }

    public Drink getLongest() {
        return this.drinks.stream().max(Comparator.comparing(Drink::getVolume)).get();
    }

    public Drink getCheapest() {
        return this.drinks.stream().min(Comparator.comparing(Drink::getPrice)).get();
    }

    public String buyDrink(String name) {

        for (Drink drink : this.drinks) {
            if (drink.getName().equals(name)) {
                return drink.toString();
            }
        }

        return "";
    }

    public String report() {

        StringBuilder sb = new StringBuilder();
        sb.append("Drinks available:");
        sb.append(System.lineSeparator());

        for (Drink drink : this.drinks) {
            sb.append(String.format("%s%n", drink.toString()));
        }

        return sb.toString().trim();
    }

}
