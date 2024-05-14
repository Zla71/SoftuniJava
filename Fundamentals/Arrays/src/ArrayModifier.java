import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] initialArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (true) {
            String[] commandArr = scanner.nextLine().split(" ");
            if (commandArr[0].equals("end")) {
                break;
            }

            if (commandArr[0].equals("swap") || commandArr[0].equals("multiply")) {
                String currentCommand = commandArr[0];
                int firstIndex = Integer.parseInt(commandArr[1]);
                int secondIndex = Integer.parseInt(commandArr[2]);
                int firstNum = initialArr[firstIndex];
                int secondNum = initialArr[secondIndex];

                if (currentCommand.equals("swap")) {
                    initialArr[firstIndex] = secondNum;
                    initialArr[secondIndex] = firstNum;
                } else {
                    int result = firstNum * secondNum;
                    initialArr[firstIndex] = result;
                }

            } else if (commandArr[0].equals("decrease")) {
                for (int i = 0; i < initialArr.length; i++) {
                    initialArr[i] -= 1;
                }
            }
        }

        String stringArr = Arrays.toString(initialArr);
        String output = stringArr.substring(1, stringArr.length() - 1);
        System.out.println(output);

    }
}
