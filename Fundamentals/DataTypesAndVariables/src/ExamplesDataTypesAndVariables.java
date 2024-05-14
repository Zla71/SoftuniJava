import java.util.Scanner;

public class ExamplesDataTypesAndVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // chars ASCII table position
        char letter = 's';
        System.out.printf("%c - %d", letter, (int) letter);

        // print char from number from ASCII table
        int number = 97;
        char c = (char) number;
        System.out.println(c);

        // chars input
        char firstChar = scanner.nextLine().charAt(0);

        // chars lower - upper case
        char currentChart = 'k';
        if (Character.isUpperCase(currentChart)) {
            System.out.println("upper");
        } else if (Character.isLowerCase(currentChart)) {   // нарочно използвам else if, за да напиша и isLowerCase
            System.out.println("lower");
        }

        // loop through string
        String name = "Johny";
        int lenName = name.length();
        for (int i = 0; i < lenName; i++) {
            char symbol = name.charAt(i);
            System.out.println(symbol);
        }

    }
}