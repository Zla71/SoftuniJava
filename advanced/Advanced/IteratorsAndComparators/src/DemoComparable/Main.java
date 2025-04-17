package DemoComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Zlati", 7, 4.56);
        Cat cat2 = new Cat("Gosho", 5, 3.52);
        Cat cat3 = new Cat("Pesho", 13, 5.07);

        List<Cat> cats = Arrays.asList(cat1, cat2, cat3);

        // подредба по възходящ ред
        Collections.sort(cats);

        // подредба по низходящ ред
        Collections.sort(cats.reversed());

        for (Cat cat : cats) {
            System.out.printf("Name: %s, Age: %d years, Weight: %.2fkg%n", cat.getName(), cat.getAge(), cat.getWeight());
        }

        // можем да използваме TreeSet, който сортира елементите, използвайки compareTo() метода
        TreeSet<Cat> catsSet = new TreeSet<>();

        // проверявам дали адресите в паметтас на двата обекта са равни
        System.out.println(cat1.equals(cat2));


    }
}
