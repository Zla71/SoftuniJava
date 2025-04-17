package Polymorphism_Exercises.Wild_Farm_03.Animals;

import Polymorphism_Exercises.Wild_Farm_03.Foods.Food;
import Polymorphism_Exercises.Wild_Farm_03.Foods.Meat;

public class Zebra extends Mammal {

    public Zebra(String animalName, String type, double weight, String livingRegion) {
        super(animalName, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
    
}
