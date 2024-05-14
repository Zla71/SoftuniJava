import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String currentSymbol = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - i - 1];
            inputArr[inputArr.length - i - 1] = currentSymbol;

        }
        System.out.println(String.join(" ", inputArr));
    }
}
