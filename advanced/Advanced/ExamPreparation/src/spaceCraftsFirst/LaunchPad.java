package spaceCraftsFirst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LaunchPad {

    private String name;
    private int capacity;
    private List<Spacecraft> spacecrafts;

    public LaunchPad(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.spacecrafts = new LinkedList<>();
    }

    public void addSpacecraft(Spacecraft spacecraft) {
        if (this.capacity == 0) {
            System.out.println("This launchpad is at full capacity!");
        } else {
            this.spacecrafts.add(spacecraft);
            this.capacity--;
        }


    }

    public boolean removeSpacecraft(String name) {
        return this.spacecrafts.removeIf(spacecraft -> spacecraft.getName().equals(name));
    }

    public String getHeaviestSpacecraft() {
        Spacecraft spacecraft = this.spacecrafts.stream().max(Comparator.comparing(Spacecraft::getWeight)).get();
        return String.format("%s - %dkg.", spacecraft.getName(), spacecraft.getWeight());
    }

    public Spacecraft getSpacecraft(String name) {
        return this.spacecrafts.stream().filter(spacecraft -> spacecraft.getName().equals(name)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.spacecrafts.size();
    }

    public List<Spacecraft> getSpacecraftsByMissionType(String missionType) {
        List<Spacecraft> result = new ArrayList<>();

        for (Spacecraft spacecraft : this.spacecrafts) {
            if (spacecraft.getMissionType().equals(missionType)) {
                result.add(spacecraft);
            }
        }

        if (result.isEmpty()) {
            System.out.println("There are no spacecrafts to respond this criteria.");
        }

        return result;
    }

    public String getStatistics() {

        StringBuilder sb = new StringBuilder();
        int counter = 1;

        sb.append(String.format("Spacecrafts launched from %s:%n", this.name));

        if (!this.spacecrafts.isEmpty()) {
            for (Spacecraft spacecraft : this.spacecrafts) {
                sb.append(String.format("%d. %s%n", counter, spacecraft.getName()));
                counter++;
            }
        } else {
            sb.append("none");
        }



        return sb.toString().trim();
    }
}
