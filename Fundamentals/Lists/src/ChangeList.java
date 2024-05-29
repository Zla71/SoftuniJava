import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {

            String[] command = scanner.nextLine().split(" ");
            String currentCommand = command[0];

            if (currentCommand.equals("end")) {
                break;
            }

            switch (currentCommand){
                case "Delete":
                    int currentNumber = Integer.parseInt(command[1]);

                    while (inputList.contains(currentNumber)) {
                        inputList.remove(Integer.valueOf(currentNumber));
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(command[1]);
                    int position = Integer.parseInt(command[2]);
                    inputList.add(position, element);
                    break;
                }
            }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
        }

    }

