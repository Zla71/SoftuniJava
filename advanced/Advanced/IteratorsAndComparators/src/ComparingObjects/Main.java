package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            String town = input.split("\\s+")[2];

            Person person = new Person(name, town, age);
            people.add(person);

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;

        Person specialPerson = people.get(index);

        int equalCount = 0;

        for (Person person : people) {
            if (person.compareTo(specialPerson) == 0) {
                equalCount++;
            }
        }

        if (equalCount > 1) {
            System.out.printf("%d %d %d", equalCount, people.size() - equalCount, people.size());
        } else {
            System.out.println("No matches");
        }
    }
}
