package magazineFirst;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Magazine {

    private String type;
    private int capacity;
    private List<Cloth> data;

    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new LinkedList<>();
    }

    public void addCloth(Cloth cloth) {
        if (this.data.size() < capacity) {
            this.data.add(cloth);
        }
    }

    public boolean removeCloth(String color) {
        return this.data.removeIf(cloth -> cloth.getColor().equals(color));
    }

    public Cloth getSmallestCloth() {
        return this.data.stream().min(Comparator.comparing(Cloth::getSize)).get();
    }

    public Cloth getCloth(String color) {
        return this.data.stream().filter(cloth -> cloth.getColor().equals(color)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {


        String firstLine = String.format("%s magazine contains:%n", this.type);
        String output = this.data.stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator()));
        return firstLine + output;
    }

}
