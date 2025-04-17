public class MainZoo {
    public static void main(String[] args) {

        Lion lion = new Lion("Slavcho", 12, "yellow");
        Giraffe giraffe = new Giraffe("Gosho", 22, 7);
        Elephant elephant = new Elephant("Pesho", 50, 2);

        ZooSystem zooSystem = new ZooSystem();

        // добавяме всички животни в ZooSystem
        zooSystem.addAnimal(lion);
        zooSystem.addAnimal(giraffe);
        zooSystem.addAnimal(elephant);

        System.out.println();
        System.out.printf("The number of animals in the Zoo is %d.%n", zooSystem.getNumberOfAnimals());
        System.out.println();

        System.out.println("toString() method:");
        System.out.println(lion.toString());
        System.out.println(giraffe.toString());
        System.out.println(elephant.toString());

        System.out.println();

        System.out.println("eat() method:");
        lion.eat();
        giraffe.eat();
        elephant.eat();

        System.out.println();

        System.out.println("roar() method:");
        lion.roar();
        // elephant.roar() xxx   нямат този метод
        // giraffe.roar() xxx    нямат този метод

        System.out.println();
        System.out.println("Giraffe extends method toString from class Animal:");
        System.out.println(giraffe.info());

    }
}
