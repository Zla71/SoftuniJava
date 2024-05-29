import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] command = scanner.nextLine().split(" ");
            String currentCommand = command[0];

            if (currentCommand.equals("End")) {
                break;
            }

            switch (currentCommand) {
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[1]);
                    int indexToInsert = Integer.parseInt(command[2]);
                    if (indexToInsert >= 0 && indexToInsert < numbers.size()) {
                        numbers.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command[1]);
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = command[1];
                    int count = Integer.parseInt(command[2]);
                    switch (direction) {
                        case "left":
                            for (int i = 0; i < count; i++) {
                                int firstNumber = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(firstNumber);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                int lastNumber = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, lastNumber);
                            }
                            break;
                    }
                    break;
            }

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
