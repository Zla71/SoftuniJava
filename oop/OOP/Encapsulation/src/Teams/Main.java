package Teams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person personTwo = new Person("Zlati", 34);
        Person personOne = new Person("Tanya", 35);

        List<Person> people = new ArrayList<>();

        people.add(personOne);
        people.add(personTwo);

        Team team = new Team("SoftUni", people);

        team.getPeople().clear();
        System.out.println(team.getPeople());


    }
}
