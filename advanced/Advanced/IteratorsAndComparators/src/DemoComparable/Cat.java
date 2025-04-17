package DemoComparable;

// искам котките да могат да се сравняват
// Интерфейс - implements Comparable, казва изрично, че тези обекти от този клас са сравними
public class Cat implements Comparable<Cat> {

    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // описвам начина, по който се сравняват 2 котки, по даден критерий
    // cat1.compareTo(cat2) -
    public int compareTo(Cat otherCat) {

        // ако метода върне положително число първият обект е по-голям от вторият, по даден критерий
        // ако метода върне отрицателно число вторият обект е по-голям от първият, по даден критерий
        // ако метода върне "0" първият обект е равен на вторият, по даден критерий


        // подробно обяснение за сравнение на котките по години
//        if (this.age == otherCat.age) {
//            return 0;
//        } else if (this.age < otherCat.age) {
//            return -1;
//        } else {
//            return 1;
//        }

        // подредба по Integer
//        return Integer.compare(this.age, otherCat.age);

        // подредба по Double
//        return Double.compare(this.weight, otherCat.weight);

        // подредба по String
        return this.name.compareTo(otherCat.name);

    }
}
