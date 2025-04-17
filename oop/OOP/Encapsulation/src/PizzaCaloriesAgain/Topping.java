package PizzaCaloriesAgain;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            String message = String.format("Cannot place %s on top of your pizza.", this.toppingType);
            throw new IllegalArgumentException(message);
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            String message = String.format("%s weight should be in the range [1..50].", this.toppingType);
            throw new IllegalArgumentException(message);
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double coefficientTopping = 0;

        switch (this.toppingType) {
            case "Meat":
                coefficientTopping = 1.2;
                break;
            case "Veggies":
                coefficientTopping = 0.8;
                break;
            case "":

                break;
            case "Cheese":
                coefficientTopping = 1.1;
                break;
            case "Sauce":
                coefficientTopping = 0.9;
                break;
        }

        return (2 * this.weight) * coefficientTopping;
    }
}
