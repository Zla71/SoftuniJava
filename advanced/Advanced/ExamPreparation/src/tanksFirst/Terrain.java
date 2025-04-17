package tanksFirst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Terrain {

    private String type;
    private List<Tank> tanks;
    private int area;

    public Terrain(String type, int area) {
        this.type = type;
        this.area = area;
        this.tanks = new ArrayList<>();
    }

    public String addTank(Tank tank) {

        if (tanks.stream().anyMatch(t -> t.getBrand().equals(tank.getBrand()) && t.getModel().equals(tank.getModel()))) {
            return "Tank with this brand and model already exists!";
        }

        if (this.type.equals("Swamp") && tank.getWeight() > 14000) {
            return String.format("This %s is too heavy for this terrain!", tank.getBrand());
        }

        tanks.add(tank);
        return String.format("Tank %s %s added.", tank.getBrand(), tank.getModel());
    }

    public boolean removeTank(String brand, String model) {
        Tank tank = this.tanks.stream().filter(t -> t.getBrand().equals(brand) && t.getModel().equals(model)).findFirst().orElse(null);
        this.tanks.remove(tank);
        return tank != null;
    }

    public String getTanksByBarrelCaliberMoreThan(int barrelCaliber) {
        List<String> foundTanks = new ArrayList<>();
        for (Tank tank : this.tanks) {
            if (tank.getBarrelCaliber() > barrelCaliber) {
                foundTanks.add(tank.getBrand());
            }
        }

        if (foundTanks.isEmpty()) {
            return "There are no tanks with the specified caliber.";
        } else {
            String result = String.format("Tanks with caliber more than %dmm: ", barrelCaliber);
            String output = foundTanks.stream().map(String::valueOf).collect(Collectors.joining(", "));
            return result + output;
        }

    }

    public Tank getTankByBrandAndModel(String brand, String model) {
        return this.tanks.stream().filter(tank -> tank.getBrand().equals(brand) && tank.getModel().equals(model)).findFirst().orElse(null);
    }

    public String getTheMostArmoredTank() {
        Tank tank = this.tanks.stream().max(Comparator.comparing(Tank::getArmor)).get();
        return String.format("%s %s is the most armored tank with %dmm. armor thickness.", tank.getBrand(), tank.getModel(), tank.getArmor());
    }

    public int getCount() {
        return this.tanks.size();
    }

    public String getStatistics() {

        if (this.tanks.isEmpty()) {
            return String.format("There are no tanks in the %s.", this.type.toLowerCase());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Tanks located in the %s:%n", this.type.toLowerCase()));
            for (Tank tank : this.tanks) {
                sb.append(String.format("-- %s %s%n", tank.getBrand(), tank.getModel()));
            }
            return sb.toString().trim();
        }
    }

}
