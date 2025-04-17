import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class FuncProgramExamples {
    public static void main(String[] args) {

        // Function<приема, връща> | .apply(аргумент)  --> връща резултат
        // Consumer<приема>        | .accept(аргумент) --> не връща резултат
        // Supplier<връща>         | .get()            --> връща резултат
        // Predicate<приема>       | .test(аргумент)   --> връща BOOLEAN

        // BiFunction<приема1, приема2, връща> | .apply(аргумент1, аргумент2)   --> връща резултат
        // BiConsumer<приема1, приема2>        | .accept(аргумент1, аргумент2)  --> не връща резултат
        // BiPredicate<приема1, приема2>       | .test(аргумент1, аргумент2)    --> връща BOOLEAN


        Scanner scanner = new Scanner(System.in);

        // lambda syntax: (parameters) -> {body}

        System.out.println("напиши на конзолата -> 1 5 9");
        // "5 6 7"
        // .split("\\s+") -> ["5", "6", "7"]
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(text -> Integer.parseInt(text)) // lambda
                .toList();


        System.out.println("Lambda examples -----------------------------");
        // функция в Java - ламбда израз, функцията приема 1 аргумент и връща 1 резултат
        Function<Integer, Integer> func = x -> x * x; // приема Integer и връща Integer

        // извикване на ламбда функцията
        int result = func.apply(5);

        System.out.println("резултат от ламбда фунцкията на 35 ред -->> " + result);
        System.out.println();


        // Фунционален код - използване на ламбда изрази
        // ламбда функция, която приема лист от числа и връща Integer
        System.out.println("Function examples -----------------------------");
        Function<List<Integer>, Integer> sumNumbers = list -> {
          int sum = 0;
          for (Integer num : list) {
              sum += num;
          }
          return sum;
        };

        List<Integer> numbersList = List.of(5, 8, 10);
        System.out.println("резултат от ламбда фунцкията на 47 ред -->> " + sumNumbers.apply(numbersList));

        // извикаване на метода, който е тип Императивен код
        int sumList = sumListNumbers(numbersList);
        System.out.println("резултат от Императивния начин на писане: " + sumList);


        System.out.println();
        System.out.println("Consumer examples -----------------------------");
        // Consumer<T> - не произвежда резултат, ще е код, който ще се изпълни, но не връща int, String и др, има VOID действие
        // имаме ламбда израз, който приема 1 аргумент, но НЕ ВРЪЩА резултат(просто извършва действие)
        Consumer<String> print = message -> System.out.println(message);

        print.accept("Peter");

        System.out.println();
        List<String> namesList = List.of("Pesho", "Stancho", "Gancho");
//        Consumer<String> sayHello = text -> System.out.printf("Hi, my name is %s%n", text);

        namesList.forEach(text -> System.out.printf("Hi, my name is %s%n", text));


        System.out.println();
        System.out.println("Supplier examples -----------------------------");
        // ламбда израз, който НЕ ПРИЕМА аргумент, но връща резултат
        // .get() - извиквам дейтвието на supplier-a
        Supplier<Integer> genRandomInt = () -> new Random().nextInt(51); // произволно число до 51

        int rnd = genRandomInt.get();
        System.out.println("Supplier  --->>> " + rnd);

        Supplier<LocalDateTime> getTimeNow = () -> LocalDateTime.now();
        System.out.println("Now is " + getTimeNow.get());


        System.out.println();
        System.out.println("Predicate examples -----------------------------");
        // получава тип данни и проверява дали по дадения аргументг отговаря на условие
        // .test() - извиква израза
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Predicate --->> " + isEven.test(6));


        System.out.println();
        System.out.println("BI Functions examples -----------------------------");

        // приемат 2 аргумента и връщат резултат
        BiFunction<Integer, Integer, String> sum = (x, y) -> "Sum is " + (x + y);
        String currentSumResult = sum.apply(15, 5);
        System.out.println("BI Function --->> " + currentSumResult);

        BiFunction<String, String, String> greeting = (firstName, secondName) -> "Hi, my name is " + firstName + secondName;
        System.out.println(greeting.apply("Zlati", "Rachev"));

        System.out.println();
        System.out.println("BI Consumer examples -----------------------------");
        // приемат 2 аргумента и не връщат резултат
        BiConsumer<String, String> printGreeting = (firstName, secondName) -> System.out.printf("Hi, my name is %s %s%n", firstName, secondName);
        printGreeting.accept("Zlati", "Rachev");

        System.out.println();
        System.out.println("BI Predicate examples -----------------------------");
        // приема 2 аргумента и връща булева стойност
        BiPredicate<String, String> sameLength = (firstText, secondText) -> firstText.length() == secondText.length();
        System.out.println(sameLength.test("what's up", "кво ста"));



        // създаване на списък с имена
        List<String> names = Arrays.asList("Zlati", "Pesho", "Kosta", "Mityo", "Tosho", "Zoya", "Zdravko");
        System.out.println();

        // създаване на стрийм с ламбда функция, която итерира през списъка names
        // и взима всяко име, което започва с "Z" и го принтира с главни букви
        names.stream()
                .filter(name -> name.startsWith("Z"))
                .map(String::toUpperCase)
                .forEach(System.out::println);





    }

    // Императивен код
    public static int sumListNumbers(List<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }
}
