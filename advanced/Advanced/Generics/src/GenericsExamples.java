import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExamples {
    public static void main(String[] args) {

        // поставям тип на generic параметъра
        ArrayList<String> myList = new ArrayList<>();

        // 1. Type safety
        // при извикването на всеки метод add ще бъде заменено със String ...... E -> String

        // 2. Code Reuse
        // дава ни възможност един код да бъде преизползван

        myList.add("Ivan");
        myList.add("Gosho");

        // използва се същият метод add, ако нашият списък е с Integer на пример


        // пример за създаване на метод, който работи с всякакъв вид обекти
        Example<String> exampleString = new Example<>();
        System.out.println(exampleString.toString("Gosho"));

        Example<Integer> exampleInt = new Example<>();
        System.out.println(exampleInt.toString(120));

        Example<Double> exampleDouble = new Example<>();
        System.out.println(exampleDouble.toString(7.77));


        //////////////////////////////////// Wild Card ////////////////////////////////////

        // параметър от незнаен тип

        List<Integer> numbers = new ArrayList<>(List.of(5, 10, 15, 20));
        List<String> namesExample = new ArrayList<>(List.of("Zlati", "Tanya", "Pavel"));

        // List<?> list

        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.reverse(namesExample);
        System.out.println(namesExample);

        print(namesExample);
        print(numbers);

    }

    // wild card example method - приемат се какъвто и да е тип данни <?> ... работи с обекти
    public static void print (List<?> list) {

        // в рамките на този метод, елементите мога да ги третирам само като тип Object
        for (Object o : list) {
            System.out.println(o);
        }
    }

    // ? - какъвто и да е тип данни
    // ? extends Number - какъвто и да е тип данни, но той трябва да наследник на класа Number - upper bound
    // ? extends Number - какъвто и да е тип данни, но той трябва да наследник на класа Number - lower bound
    public static void printNumber(List<? extends Number> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}