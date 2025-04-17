package vintageLocosFirst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainStation {

    private String name;
    private int capacity;
    private int railGauge;
    private List<Locomotive> locomotives;

    public TrainStation(String name, int capacity, int railGauge) {
        this.name = name;
        this.capacity = capacity;
        this.railGauge = railGauge;
        this.locomotives = new ArrayList<>();
    }

    public void addLocomotive(Locomotive locomotive) {

        if (locomotives.size() == this.capacity) {
            System.out.println("This train station is full!");
            return;
        }

        if (locomotive.getGauge() != this.railGauge) {
            int gaugeDiff = Math.abs(locomotive.getGauge() - this.railGauge);
            System.out.printf("The rail gauge of this station does not match the locomotive gauge! Difference: %d mm.%n", gaugeDiff);
            return;
        }

        this.locomotives.add(locomotive);
    }

    public boolean removeLocomotive(String name) {

        // потърси локомотив с подаденото име, ако намериш го изтрий от писъка и върни true, ако ли не - върни false
        return this.locomotives.removeIf(locomotive -> locomotive.getName().equals(name));
    }

    public String getFastestLocomotive() {

        if (this.locomotives.isEmpty()) {
            return "There are no locomotives.";
        }

        // Намирам локомотив с най-голяма скорост
        Locomotive locomotive = this.locomotives.stream().max(Comparator.comparing(Locomotive::getMaxSpeed)).get();

        return String.format("%s is the fastest locomotive with a maximum speed of %d km/h.", locomotive.getName(), locomotive.getMaxSpeed());
    }

    public Locomotive getLocomotive(String name) {
        return this.locomotives.stream().filter(locomotive -> locomotive.getName().equals(name)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.locomotives.size();
    }

    public String getOldestLocomotive() {
        if (this.locomotives.isEmpty()) {
            return "There are no locomotives.";
        }

        Locomotive oldestLocomotive = this.locomotives.stream().min(Comparator.comparing(Locomotive::getBuildDate)).get();

        return oldestLocomotive.getName();
    }

    public String getStatistics() {

        if (this.locomotives.isEmpty()) {
            return String.format("There are no locomotives departing from %s station.", this.name);
        }

        StringBuilder result = new StringBuilder();
        result.append(String.format("Locomotives departed from %s:%n", this.name));
        int numberOfLocomotive = 1;
        for (Locomotive locomotive : this.locomotives) {
            result.append(String.format("%d. %s%n", numberOfLocomotive, locomotive.getName()));
            numberOfLocomotive++;
        }

        return result.toString().trim();
    }
}
