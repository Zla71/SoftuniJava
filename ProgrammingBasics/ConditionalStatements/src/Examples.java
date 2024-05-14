import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // една променлива равна ли е на друга
        String stringA = "Examplе";
        String stringB = stringA;
        System.out.println(stringB == stringA);

        // booleans - true, false
        int a = 5;
        boolean isPositive = a > 0;
        System.out.println(isPositive);

        int b = -5;
        boolean isPositiveOne = b > 0;
        System.out.println(isPositiveOne);

        System.out.println();

        // примерни проверки
        String color = "red";
        if (color.equals("red"))
            System.out.println("tomato");
        else
            System.out.println("banana");
        System.out.println("bye");

        System.out.println();

        // ако добавим {} се изпълнява съответният блок
        String colorLine = "red";
        if (colorLine.equals("red")) {
            System.out.println("tomato");
        } else {
            System.out.println("banana");
            System.out.println("bye");
        }

        // закръгляне
        double up = Math.ceil(23.45);       // 24.0
        double down = Math.floor(45.67);    // 45.0

        // абсолютна стойност
        int example1 = Math.abs(-50);       // 50
        int example2 = Math.abs(50);        // 50

        // Форматиране до 2 знака след десетичната запетая:
        System.out.printf("%.2f", 123.456);     // 123.46

        // живот на променливата
        String currentDay = "Monday";
        if (currentDay.equals("Monday")) {
            double salary = Double.parseDouble(scanner.nextLine());
        }
        //System.out.println(salary); // error


    }
    }
