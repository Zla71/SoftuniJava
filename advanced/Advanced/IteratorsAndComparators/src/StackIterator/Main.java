package StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        CustomStack stack = new CustomStack();

        while (!command.equals("END")) {

            if (command.equals("Pop")) {

                stack.pop();

            } else {
                int[] numbers = Arrays.stream(command.replace("Push ", "")
                                .split(", "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

                for (int number : numbers) {
                    stack.push(number);
                }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < 2; i++) {
            for (Integer number : stack) {
                System.out.println(number);
            }
        }
    }
}
