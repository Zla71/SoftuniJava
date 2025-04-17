package sharkHauntFirst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basin {

    private String name;
    private int capacity;
    private List<Shark> sharks;

    public Basin(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.sharks = new ArrayList<>();
    }

    public void addShark(Shark shark) {
        if (capacity > 0) {
            this.sharks.add(shark);
        } else {
            System.out.println("This basin is at full capacity!");
        }
    }

    public boolean removeShark(String kind) {
        return this.sharks.removeIf(shark -> shark.getKind().equals(kind));
    }

    public Shark getLargestShark() {

        return this.sharks.stream().max(Comparator.comparing(Shark::getLength)).get();
    }

    public Shark getShark(String kind) {
        return this.sharks.stream().filter(shark -> shark.getKind().equals(kind)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.sharks.size();
    }

    public int getAverageLength() {
        int result = 0;
        for (Shark shark : this.sharks) {
            result += shark.getLength();
        }

        return result / this.sharks.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Sharks in %s:%n", this.name));
        for (Shark shark : this.sharks) {
            sb.append(shark.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString().trim();
    }


}
