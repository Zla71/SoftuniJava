import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        boolean checker = false;
        String evenOdd = null;

        switch (operator) {
            case "+":
                result = numOne + numTwo;
                checker = true;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                  evenOdd = "odd";
                }
                break;
            case "-":
                result = numOne - numTwo;
                checker = true;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                break;
            case "*":
                result = numOne * numTwo;
                checker = true;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                break;
            case "/":
                if (numTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numOne);
                }
                else {
                    result = numOne / (double) numTwo;
                }
                break;

            case "%":
                if (numTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numOne);
                }
                else {
                    result = numOne % numTwo;
                }
                break;
        }
        if (numTwo != 0) {
            if (checker) {
                System.out.printf("%d %s %d = %d - %s", numOne, operator, numTwo, (int) result, evenOdd);
            }
            if (operator.equals("/")) {
                System.out.printf("%d %s %d = %.2f", numOne, operator, numTwo, result);
            }
            else if (operator.equals("%")) {
                System.out.printf("%d %s %d = %d", numOne, operator, numTwo, (int) result);
            }
        }


    }
}
