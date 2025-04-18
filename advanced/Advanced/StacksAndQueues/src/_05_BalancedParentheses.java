import java.util.*;

public class _05_BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // balanced {([])}
        // non balanced {[(]}
        List<String> brackets = Arrays.stream(scanner.nextLine().split(""))
                .toList();

        String result = isBalanced(brackets) ? "YES" : "NO";

        System.out.println(result);
    }

    private static boolean isBalanced(List<String> brackets) {

        Deque<String> openBracketsStack = new ArrayDeque<>();

        for (String bracket : brackets) {

            // check for close brackets
            switch (bracket) {
                case "}":
                    if (openBracketsStack.isEmpty()) {
                        return false;
                    }
                    String openBracket = openBracketsStack.pop();
                    if (!openBracket.equals("{")) {
                        return false;
                    }
                    break;
                case "]":
                    if (openBracketsStack.isEmpty()) {
                        return false;
                    }
                    openBracket = openBracketsStack.pop();
                    if (!openBracket.equals("[")) {
                        return false;
                    }
                    break;
                case ")":
                    if (openBracketsStack.isEmpty()) {
                        return false;
                    }
                    openBracket = openBracketsStack.pop();
                    if (!openBracket.equals("(")) {
                        return false;
                    }
                    break;
                default:
                    openBracketsStack.push(bracket);
                    break;
            }
        }

        return openBracketsStack.isEmpty();
    }
}
