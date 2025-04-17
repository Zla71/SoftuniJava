import java.util.Arrays;
import java.util.List;

public class GenericMethodsExamples {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zlati", "Tanya", "Pavel");
        List<Integer> ages = Arrays.asList(34, 35, 4);
        List<Double> decimalsList = Arrays.asList(2.5, 3.6, 7.3);

        System.out.println("Print names list");
        print(names);

        System.out.println("Print ages list");
        print(ages);

        System.out.println("Print decimals list");
        print(decimalsList);

        System.out.println("Print names with ages");
        printAllInfo(names, ages);

    }




    // метод, който приема списък, с какъвто и да е тип обекти
    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    // метод, който приема два списъка, с какъвто и да е тип обекти
    public static void printAllInfo(List<?> names, List<?> ages) {
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s is %s years old.%n", names.get(i), ages.get(i));
        }
    }
}
