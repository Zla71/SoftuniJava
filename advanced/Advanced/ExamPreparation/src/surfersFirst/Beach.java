package surfersFirst;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Beach {
    private String name;
    private int surfboardsForRent;
    private List<Surfer> surfers;

    public Beach(String name, int surfboardsForRent) {
        this.name = name;
        this.surfboardsForRent = surfboardsForRent;
        this.surfers = new ArrayList<>();
    }

    public String addSurfer(Surfer surfer) {
        if (!surfer.getOwnsASurfBoard()) {
            if (this.surfboardsForRent == 0) {
                return "There are no free surfboards.";

            } else if (surfer.getMoney() < 50) {
                return String.format("%s has not enough money to rent a surfboard.", surfer.getName());

            } else {
                surfer.setMoney(surfer.getMoney() - 50);
                this.surfboardsForRent--;
                this.surfers.add(surfer);
                return String.format("Surfer %s added.", surfer.getName());

            }
        } else {
            this.surfers.add(surfer);
            return String.format("Surfer %s added.", surfer.getName());

        }
    }

    public boolean removeSurfer(String name) {

        // потърси сърфист с подаденото име, ако намериш го изтрий от писъка и върни true, ако ли не - върни false
        return this.surfers.removeIf(surfer -> surfer.getName().equals(name));
    }

    public String getMostExperiencedSurfer() {

        if (this.surfers.isEmpty()) {
            return "There are no surfers.";
        }

        Surfer surfer = this.surfers.stream().max(Comparator.comparing(Surfer::getExperience)).get();

        return String.format("%s is most experienced surfer with %d years experience.", surfer.getName(), surfer.getExperience());
    }

    public Surfer getSurfer(String name) {
        return this.surfers.stream().filter(surfer -> surfer.getName().equals(name)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.surfers.size();
    }

    public String getSurfersWithPersonalSurfboards() {
        if (this.surfers.isEmpty()) {
            return "There are no surfers.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Surfers who have their own surfboards: ");

        for (Surfer surfer : this.surfers) {
            if (surfer.getOwnsASurfBoard()) {
                sb.append(String.format("%s, ", surfer.getName()));
            }
        }

        return sb.substring(0, sb.length() - 2);
    }

    public String getReport() {
        if (this.surfers.isEmpty()) {
//            return "There are no surfers.";
            return String.format("There are no surfers on %s beach.", this.name);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Beach %s was visited by the following surfers:", this.name));
        sb.append(System.lineSeparator());
        int surferNumber = 1;
        for (Surfer surfer : this.surfers) {
            if (surfer.getExperience() > 0) {
                sb.append(String.format("%d. %s with %d years experience.%n", surferNumber, surfer.getName(), surfer.getExperience()));
            } else {
                sb.append(String.format("%d %s with no experience.", surferNumber, surfer.getName()));
            }
            surferNumber++;
        }

        return sb.toString().trim();
    }
}
