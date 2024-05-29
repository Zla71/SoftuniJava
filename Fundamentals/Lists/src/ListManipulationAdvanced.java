import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {

            String[] command = scanner.nextLine().split(" ");
            String currentCommand = command[0];

            if (currentCommand.equals("end")) {
                break;
            }

            switch (currentCommand) {
                case "Contains":
                    int currentCommandNumber = Integer.parseInt(command[1]);
                    if (numbers.contains(currentCommandNumber)){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String typeNumber = command[1];
                    List<Integer> resultType = new ArrayList<>();

                    switch (typeNumber) {
                        case "even":
                            for (Integer number : numbers) {
                                if (number % 2 == 0) {
                                    resultType.add(number);
                                }
                            }
                            break;
                        case "odd":
                            for (Integer number : numbers) {
                                if (number % 2 != 0) {
                                    resultType.add(number);
                                }
                            }
                            break;
                    }
                    System.out.println(resultType.toString().replaceAll("[\\[\\],]", ""));
                    break;
                case "Get":
                    int resultSum = 0;
                    for (Integer number : numbers) {
                        resultSum += number;
                    }
                    System.out.println(resultSum);
                    break;
                case "Filter":
                    List<Integer> resultFilter = new ArrayList<>();
                    String condition = command[1];
                    int number = Integer.parseInt(command[2]);

                    switch (condition) {
                        case "<":
                            for (Integer currentNumber : numbers) {
                                if (currentNumber < number) {
                                    resultFilter.add(currentNumber);
                                }
                            }
                            break;
                        case ">":
                            for (Integer currentNumber : numbers) {
                                if (currentNumber > number) {
                                    resultFilter.add(currentNumber);
                                }
                            }
                            break;
                        case ">=":
                            for (Integer currentNumber : numbers) {
                                if (currentNumber >= number) {
                                    resultFilter.add(currentNumber);
                                }
                            }
                            break;
                        case "<=":
                            for (Integer currentNumber : numbers) {
                                if (currentNumber <= number) {
                                    resultFilter.add(currentNumber);
                                }
                            }
                            break;
                    }

                    System.out.println(resultFilter.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }
        }
    }
}
