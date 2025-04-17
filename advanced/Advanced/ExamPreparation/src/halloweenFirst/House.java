package halloweenFirst;

import java.util.ArrayList;
import java.util.List;

public class House {

    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addKid(Kid kid) {
        if (this.data.size() < this.capacity) {
            this.data.add(kid);
        }
    }

    public boolean removeKid(String name) {
        return this.data.removeIf(kid -> kid.getName().equals(name));
    }

    public Kid getKid(String street) {
        return this.data.stream().filter(kid -> kid.getStreet().equals(street)).findFirst().orElse(null);
    }

    public int getAllKids() {
        return this.data.size();
    }

    public String getStatistics() {

        StringBuilder sb = new StringBuilder();
        sb.append(" Children who visited a house for candy:");
        sb.append(System.lineSeparator());

        for (Kid kid : this.data) {
            sb.append(String.format("%s from %s street%n", kid.getName(), kid.getStreet()));
        }

        return sb.toString().trim();
    }
}
