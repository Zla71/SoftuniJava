abstract class AnimalAbstractionClass {
    public abstract  void makeSound();

    public void sleep() {
        System.out.println("Sleeping...");
    }

}

class Dog extends AnimalAbstractionClass {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends AnimalAbstractionClass {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}


