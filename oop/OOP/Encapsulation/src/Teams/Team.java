package Teams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> people;

    public Team(String name, List<Person> people) {
        this.name = name;
        this.people = people;
    }

    // така можем да запазим стойностите в списъка
    public List<Person> getPeople() {
//        return new ArrayList<>(people); // по този начин няма как да променяме списъка
        return Collections.unmodifiableList(people); // но тук ще хвърли грешка
    }
}
