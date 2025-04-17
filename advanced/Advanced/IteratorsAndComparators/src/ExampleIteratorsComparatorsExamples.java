import java.util.List;

public class ExampleIteratorsComparatorsExamples {
    public static void main(String[] args) {

        ////////////////////////////////////// VARIABLE ARGUMENTS //////////////////////////////////////

        // 1. ARRAY - МАСИВ
        String[] names = new String[3];
        names[0] = "Stancho";
        names[1] = "Gosho";
        names[2] = "Pesho";
        print(names);
        System.out.println();

        // 2. VARARGS = позволява ни да даваме стойности (от 0 до n)

        // правила:
        // 1. имаме право само на 1 varargs аргумент за един метод, тоест няма как да имаме private static void print(String... firstNames, String... lastNames)
        // 2. тип varargs се използва само за аргументи на методи, тоест няма как да имаме String... names = "Zlati", "Tanya"
        // 3. тип varargs се слага последен в сигнатурата на метода, тоест print(String country, String... names)
        printInfo("Bulgaria", "Zlati", "Tanya", "Pavel");
        printInfo("United Kingdom", "Tsveta", "Gerrard", "Michael");
        System.out.println();

        // метод, който получава няколко стринга и ги прави на масив
        // работа със String
        print("Gosho", "Pesho", "Ivan"); // работи като масив
        System.out.println();
        // работа с int
        printNumbers(190, 277, 2343, 5456, 689);
        System.out.println();
        // масив от списъци
        printLists(List.of("1", "2", "3"), List.of("Zlati", "Tanya", "Pavel"));

        ////////////////////////////////////// ITERATORS //////////////////////////////////////

        // interface - дава поведение на нашият клас, когато моят клас имплементира някакъв интерфейс, моят клас получава поведението на интерфейса

        // повече в Пакет - DemoIterator


        ////////////////////////////////////// COMPARATORS & COMPARABLE //////////////////////////////////////

        // чрез Comparable можем да сортираме обекти по дадени критерии

        // повече в пакет - DemoComparable

        // чрез класа Comparator можем да сортираме обекти от даден клас, но без да се налага да променяме неговата логика

        // повече в пакет - DemoComparator



        ////////////////////////////////////// SUMMARY //////////////////////////////////////

        // 1. Iterable - прави един клас обходим, да мога да обхождам един клас! Library implements Iterable<Book>

        // 2. Iterator - вътрешен private клас, който знае как се обхождат елементите на обходимият обект! BookIterator implements<Book> (hasNext и next)

        // 3. Comparable - прави един клас да бъде сравним (два обекта от този клас се сравняват с метода cat1.compareTo(cat2),
        // сравнението на двата обекта е по даден критерий и резултата е стойност от следните:
        // ако метода върне ПОЛОЖИТЕЛНО ЧИСЛО първият обект е по-голям от вторият, по даден критерий
        // ако метода върне ОТРИЦАТЕЛНО ЧИСЛО вторият обект е по-голям от първият, по даден критерий
        // ако метода върне НУЛА първият обект е равен на вторият, по даден критерий

        // 4. Comparator - външен клас, който знае как да сравнява два обекта по даден критерий,
        // BookComparator implements Comparator<Book>
        // има метод compare(Book book1, Book book2)


    }

    private static void print(String... names) { // String... - varargs
        // този метод varargs параметър ще работи като масив

        System.out.println();
        System.out.println(names.length);
        System.out.println(names[0]);

        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void printInfo(String country, String... names) {
        System.out.println(country + ":");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    private static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printLists(List<String>... lists) {
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }



}