package Animals;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Oscar", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");

        makeAnimalPresentThemself(cat);
        makeAnimalPresentThemself(dog);
    }

    public static void makeAnimalPresentThemself(Animal animal) {
        System.out.println(animal.explainSelf());
    }
}
