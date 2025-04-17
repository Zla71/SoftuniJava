package PizzaCalories;

public class Topping {

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        //•	Meat
        //•	Veggies
        //•	Cheese
        //•	Sauce
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            String message = String.format("Cannot place %s on top of your pizza.", toppingType);
            throw new IllegalArgumentException(message);
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        // [1-50]
        if (weight < 1 || weight > 50) {
            String message = String.format("%s weight should be in the range [1..50].", toppingType);
            throw new IllegalArgumentException(message);
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        //(2 * грамаж на топинг) * коеф. на типа на топинга = брой калории за топинга
        double coefficientToppingType = 0;

        //•	Meat – 1.2;
        //•	Veggies – 0.8;
        //•	Cheese – 1.1;
        //•	Sauce – 0.9;
        switch (toppingType) {
            case "Meat":
                coefficientToppingType = 1.2;
                break;
            case "Veggies":
                coefficientToppingType = 0.8;
                break;
            case "Cheese":
                coefficientToppingType = 1.1;
                break;
            case "Sauce":
                coefficientToppingType = 0.9;
                break;
        }
        return (2 * weight) * coefficientToppingType;
    }
}
