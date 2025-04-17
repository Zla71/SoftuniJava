package ships;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Harbor {

    private String location;
    private int minDepth;
    private List<Ship> ships;

    public Harbor(String location, int minDepth) {
        this.location = location;
        this.minDepth = minDepth;
        this.ships = new LinkedList<>();
    }

    public String addShip(Ship ship) {
        if (ships.stream().anyMatch(ship1 -> ship1.getName().equals(ship.getName()))) {
            return "Ship with this name already exists!";
        }

        if (this.minDepth < ship.getDraft()) {
            return String.format("The ship %s cannot dock due to draft limitations!", ship.getName());
        }

        this.ships.add(ship);
        return String.format("Ship %s added to the harbor.", ship.getName());
    }

    public boolean removeShip(String name) {
        return this.ships.removeIf(surfer -> surfer.getName().equals(name));
    }

    public String getShipsByType(String type) {
        List<String> result = new ArrayList<>();

        for (Ship ship : this.ships) {
            if (ship.getType().equals(type)) {
                result.add(ship.getName());
            }
        }
        if (!result.isEmpty()) {
            String output = result.stream().map(String::valueOf).collect(Collectors.joining(", "));
            return String.format("Ships of type %s: %s", type, output);
        } else {
            return "There are no ships of the requested type.";
        }
    }

    public Ship getShipByName(String name) {
        return this.ships.stream().filter(ship -> ship.getName().equals(name)).findFirst().orElse(null);
    }

    public String getLargestShip() {
        if (this.ships.isEmpty()) {
            return "No ships in the harbor.";
        } else {

            Ship ship = this.ships.stream().max(Comparator.comparing(Ship::getTonnage)).get();

            return String.format("%s is the largest ship with a tonnage of %d tons.", ship.getName(), ship.getTonnage());
        }
    }

    public int getCount() {
        return this.ships.size();
    }

    public String getStatistics() {

        if (this.ships.isEmpty()) {
            return String.format("No ships docked in %s.", this.location);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Ships docked in %s:%n", this.location));
            for (Ship ship : this.ships) {
                sb.append(String.format("* %s%n", ship.getName()));
            }

            return sb.toString().trim();
        }
    }
}


