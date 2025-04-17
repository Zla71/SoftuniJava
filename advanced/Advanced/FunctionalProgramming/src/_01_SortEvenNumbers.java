import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(text -> Integer.parseInt(text))// преобразувам всеки текст към число
                .filter(number -> number % 2 == 0) // проверявам всяко число от поредицата с числа дали е четно
                .collect(Collectors.toList()); // правим този вариант, за да можем да сортираме с Collections.sort(evenNumbers)

        System.out.println(evenNumbers.toString().replaceAll("\\[", "").replaceAll("]", ""));
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString().replaceAll("\\[", "").replaceAll("]", ""));



    }
}
