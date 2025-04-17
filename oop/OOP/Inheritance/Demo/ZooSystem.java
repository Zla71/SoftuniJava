import java.util.ArrayList;
import java.util.List;


public class ZooSystem {

    private List<Animal> animals;

    public ZooSystem() {
        this.animals = new ArrayList<>();
    }

    protected void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    protected int getNumberOfAnimals() {
        return this.animals.size();
    }



}
