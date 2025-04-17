package PizzaCalories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        //	White
        //	Wholegrain

        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {

        //	Crispy
        //	Chewy
        //	Homemade
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        //[1..200]
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {

        double coefficientFlourType = 0;
        double coefficientBakingTechnic = 0;

        switch (flourType) {
            case "White":
                coefficientFlourType = 1.5;
                break;
            case "Wholegrain":
                coefficientFlourType = 1.0;
                break;
        }

        switch (bakingTechnique) {
            case "Crispy":
                coefficientBakingTechnic = 0.9;
                break;
            case "Chewy":
                coefficientBakingTechnic = 1.1;
                break;
            case "Homemade":
                coefficientBakingTechnic = 1.0;
                break;
        }

        //(2 * грамажа) * коеф. на тип на брашно * коеф. на техника за печене = брой калории за тестото
        return (2 * weight) * coefficientBakingTechnic * coefficientFlourType;
    }

}
