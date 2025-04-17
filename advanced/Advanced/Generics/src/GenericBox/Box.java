package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T value) {
        this.values.add(value);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.values) {
            String formattedValue = String.format("%s: %s%n", value.getClass().getName(), value);
            sb.append(formattedValue);
        }

        return sb.toString();
    }

}
