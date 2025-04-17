package StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TreeSet подрежда обектите в себе си, като в естественият им вид е От най-малко към най-голямо
        // за това ще сложим компараторите при попълването на сетовете

        // тук ще имаме хора сравнени с компаратора за възраст използвайки класа PersonAgeComparator
        TreeSet<Person> byAgeOrdered = new TreeSet<>(new PersonAgeComparator());

        // тук хората ще са сравнени по име, използвайки класа PersonNameComparator
        TreeSet<Person> byNameOrdered = new TreeSet<>(new PersonNameComparator());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);

            Person person = new Person(name, age);

            // добавяме хората в двата сета
            byAgeOrdered.add(person);
            byNameOrdered.add(person);
        }

        byNameOrdered.forEach(System.out::println);
        byAgeOrdered.forEach(System.out::println);
    }
}
